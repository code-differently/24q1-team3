(() => {
    document.addEventListener('DOMContentLoaded', async () => {
       const restaurants = await fetchRestaurantsFromYelp();
       renderRestaurants(restaurants);
    });

    async function fetchRestaurantsFromYelp() {
        try {
            const response = await fetch('http://127.0.0.1:5501/restaurants');
            if (!response.ok) {
                throw new Error(`Failed to fetch restaurants from Yelp API: ${response.status} ${response.statusText}`);
            }
            const contentType = response.headers.get('content-type');
            if (!contentType || !contentType.includes('application/json')) {
                throw new Error(`Invalid response content type: ${contentType}`);
            }
            return response.json(); 
        } catch (error) {
            console.error(error);
            return []; 
        }
    }
    

    async function renderRestaurants(restaurants) {
        const restaurantContainer = document.querySelector('.detail-wrapper');

        restaurants.forEach(restaurant => {
            const restaurantElement = document.createElement('div');
            restaurantElement.classList.add('detail-card');

            restaurantElement.innerHTML = `
            <img class="detail-img" src="images/pizza1.jpeg" alt="pizza">
            <div class="detail-desc">
                    <div class="detail-name">
                        <a href="https://www.yelp.com/biz/julianas-brooklyn-3?osq=Juliana%27s"><h4>${restaurant.name}</h4></a>
                        <p class="detail-sub">${restaurant.categories?.map(category => category.title).join(', ')}</p>
                        <p class="delivery">${restaurant.location?.address1}</p>
                    </div>
                    <ion-icon class="detail-favorites" name="bookmark-outline"></ion-icon>
                </div>
            `;

            restaurantElement.addEventListener('click', () => showMessage(restaurant.name));

            restaurantContainer.appendChild(restaurantElement);
        });
    }

    function showMessage(name) {
        alert(`You clicked on ${name}`);
    }

    // Get all filter cards
    const filterCards = document.querySelectorAll('.filter-card');

    // Add click event listener to each filter card
    filterCards.forEach(card => {
        card.addEventListener('click', () => {
            // Extract the type of food from the filter card's data-food attribute
            const foodType = card.dataset.food;

            // Construct the Yelp search URL based on the selected food type
            const yelpUrl = `https://www.yelp.com/search?find_desc=${encodeURIComponent(foodType)}`;

            // Redirect the user to the constructed Yelp URL
            window.location.href = yelpUrl;
        });
    });

})();


document.getElementById('searchButton').addEventListener('click', function() {
    // Retrieve the value entered in the input field
    const searchTerm = document.getElementById('searchInput').value;
    const location = 'New York'; // You can change this to the desired location
    
    // Construct the Yelp search URL with the entered search term and location
    const yelpUrl = `https://www.yelp.com/search?find_desc=${encodeURIComponent(searchTerm)}&find_loc=${encodeURIComponent(location)}`;
    
    // Redirect the user to the Yelp search page
    window.location.href = yelpUrl;
});