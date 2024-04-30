document.addEventListener("DOMContentLoaded", function() {
    // Get the signup form element
    const signupForm = document.querySelector(".signup_form");

    // Add event listener for form submission
    signupForm.addEventListener("submit", function(event) {
        // Prevent the default form submission behavior
        event.preventDefault();

        // Perform form validation here (e.g., check if email and passwords are valid)
        // If validation fails, you can display error messages and prevent further processing

        // If validation passes, you can submit the form data to the server using AJAX or fetch API
        // Here's a basic example using fetch API:
        const formData = new FormData(signupForm);
        fetch(signupForm.action, {
            method: 'POST',
            body: formData
        })
        .then(response => {
            if (response.ok) {
                // If form submission is successful, you can redirect the user to a success page or perform any other action
                window.location.href = "signup-success.html";
            } else {
                // If there's an error with form submission, handle it accordingly
                console.error('Form submission failed:', response.statusText);
            }
        })
        .catch(error => {
            console.error('Error:', error);
        });
    });
});
