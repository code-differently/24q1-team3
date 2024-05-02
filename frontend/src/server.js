const path = require('path');
const express = require('express');
const cors = require('cors');
const fetch = require('node-fetch');
require('dotenv').config();


const app = express();
const port = 5501;

app.use(express.static(path.join(__dirname, 'frontend')));

const yelpApiKey = process.env.YELP_API_KEY;


app.use(cors());

async function fetchRestaurantsFromYelp() {
    try {
        const response = await fetch('https://api.yelp.com/v3/businesses/search?location=New+York&categories=restaurants', {
            headers: {
                'Authorization': 'Bearer YOUR_YELP_API_KEY' 
            }
        });
        if (!response.ok) {
            throw new Error('Failed to fetch restaurants from Yelp API');
        }
        const data = await response.json();
        return data.businesses;
    } catch (error) {
        console.error(error);
        return [];
    }
}

app.get('/restaurants', async (req, res) => {
    try {
        const restaurants = await fetchRestaurantsFromYelp();
        res.json(restaurants);
    } catch (error) {
        res.status(500).json({ error: 'Failed to fetch restaurant data' });
    }
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
