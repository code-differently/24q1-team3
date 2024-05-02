const path = require('path');
const express = require('express');
const cors = require('cors');
const app = express();
const port = 5501;

app.use(cors());


app.use(express.static(path.join(__dirname, 'frontend')));

import('node-fetch').then(({ default: fetch }) => {
    async function fetchRestaurantsFromYelp() {
        try {
            const response = await fetch('https://api.yelp.com/v3/businesses/search?location=New+York&categories=restaurants', {
                headers: {
                    'Authorization': 'Bearer E9aiE_f_KtvK2q2TUhA_WlZICoN-_Ba8bQ9hAhDSsc2Qf0MIewCvC8PeNOIVaVqNG5pi-yUKdIXOVWvR3VgdaEqddf-i65XLNQNL9jKPsmaaaqqeTr1N14v2v2cqZnYx'
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
}).catch(error => {
    console.error('Error importing node-fetch:', error);
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});
