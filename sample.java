javascript
// backend.js

function fetchData() {
    // Simulating a backend API call
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("Data fetched successfully!");
        }, 2000);
    });
}

fetchData().then((message) => {
    console.log(message);
});