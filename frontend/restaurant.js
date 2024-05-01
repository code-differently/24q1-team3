
(() => {
    document.addEventListener('DOMContentLoaded', async () => {
       const restuarants = await fetchRestaurants();
       renderRestaurants(restuarants);
    });

    async function fetchRestaurants() {
        return Promise.resolve([
            {
                name: 'McDonalds',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.mcdonalds.com',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'Wendy\'s',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.wendys.com',
                image: "images/burger.jpeg"
            },
            {
                name: 'Red Lobster',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.redlobster.com/',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'Chiptole',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.chipotle.com/',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'Chik-fil-a',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.chick-fil-a.com/',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'HoneyGrow',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.honeygrow.com/',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'Mikimotos',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://mikimotos.com/',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'Olive Garden',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://www.olivegarden.com/home',
                image: "images/shrimp-soup.jpeg"
            },
            {
                name: 'The Simple Greek',
                description: 'Fast food',
                delivery: '$0 delivery fee',
                url: 'https://thesimplegreek.com/concordpike-de/',
                image: "images/shrimp-soup.jpeg"
            }
        ]);
    }

    async function renderRestaurants(restaurants) {
        // Get the wrapper so I can add new cards to it.
        const restaurantContainer = document.querySelector('.detail-wrapper');

        // Add a card for each restaurant.
        restaurants.forEach(restaurant => {
            const restaurantElement = document.createElement('div');
            restaurantElement.classList.add('detail-card');

            restaurantElement.innerHTML = `
                <img class="detail-img" src="${restaurant.image}">
                <div class="detail-desc">
                    <div class="detail-name">
                        <a href="${restaurant.url}"><h4>${restaurant.name}</h4></a>
                        <p class="detail-sub">${restaurant.description}</p>
                        <p class="delivery">${restaurant.delivery}</p>
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