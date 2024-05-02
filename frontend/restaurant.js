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
                <img class="detail-img" src="${restaurant.image_url}">
                <div class="detail-desc">
                    <div class="detail-name">
                        <a href="${restaurant.url}"><h4>${restaurant.name}</h4></a>
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
})();
