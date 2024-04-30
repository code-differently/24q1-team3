import firebase from './firebaseConfig';

document.addEventListener("DOMContentLoaded", function() {
    const loginForm = document.getElementById("loginForm");
    const signupForm = document.getElementById("signupForm");
    const toggleSignup = document.getElementById("toggleSignup");
    const toggleLogin = document.getElementById("toggleLogin");

    toggleSignup.addEventListener("click", function(event) {
        event.preventDefault();
        loginForm.style.display = "none";
        signupForm.style.display = "block";
    });

    toggleLogin.addEventListener("click", function(event) {
        event.preventDefault();
        loginForm.style.display = "block";
        signupForm.style.display = "none";
    });
});
