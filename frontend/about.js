let slideIndex = 0;
  showSlides(slideIndex);

  function showSlides(index) {
    const slides = document.getElementsByClassName("slide");
    if (index >= slides.length) {
      slideIndex = 0;
    }
    if (index < 0) {
      slideIndex = slides.length - 1;
    }
    for (let i = 0; i < slides.length; i++) {
      slides[i].style.display = "none";
    }
    slides[slideIndex].style.display = "block";
  }

  document.querySelector(".prev").addEventListener("click", () => {
    showSlides(--slideIndex);
  });

  document.querySelector(".next").addEventListener("click", () => {
    showSlides(++slideIndex);
  });