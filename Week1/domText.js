let domZone = document.querySelector(".domZone");

domZone.addEventListener("click", ()=> {
    domZone.textContent = parseInt(domZone.textContent) + 1;
})

