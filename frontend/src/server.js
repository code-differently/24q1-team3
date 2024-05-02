const path = require('path');
const express = require('express');
const cors = require('cors');
require('dotenv').config();


const app = express();
const port = 5501;

app.use(express.static('.'));

const yelpApiKey = process.env.YELP_API_KEY;


app.use(cors());

async function fetchRestaurantsFromYelp() {
    try {
        const response = await fetch('http://localhost:8080/api/restaurants/search?term=pizza&location=New+York');
        if (!response.ok) {
            throw new Error('Failed to fetch restaurants from Yelp API');
        }
        return response.json();
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
