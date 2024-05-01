import { initializeApp } from "firebase/app";
import "firebase/database";


const firebaseConfig = {
    apiKey: "AIzaSyCimKz_vvgw4mvX99hy18fvLayTPjlULJw",
    authDomain: "fooddifferentlyfd.firebaseapp.com",
    projectId: "fooddifferentlyfd",
    storageBucket: "fooddifferentlyfd.appspot.com",
    messagingSenderId: "62549339345",
    appId: "1:62549339345:web:9fe38b84588733d53969f0",
    measurementId: "G-SLLTWL31YZ"
      };
      
const firebaseApp = initializeApp(firebaseConfig);

export default firebaseApp;