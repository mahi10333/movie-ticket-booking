let movie = document.getElementById("movie");
let moviePrice = document.getElementById("moviePrice");

movie.addEventListener("change", function() {

    let price = 0;

    if (movie.value === "Materialists") {
        price = 250;
    }
    else if (movie.value === "The Conjuring: Last Rites") {
        price = 290;
    }
    else if (movie.value === "28 Years Later") {
        price = 200;
    }
    else if (movie.value === "Black Bag") {
        price = 220;
    }
    else if (movie.value === "Weapons") {
        price = 290;
    }
    else if (movie.value === "Another Simple Favour") {
        price = 200;
    }
    else if (movie.value === "The Strangers: Chapter 2") {
        price = 250;
    }
    else if (movie.value === "Eternity") {
        price = 230;
    }

    moviePrice.textContent = price;

});


let category = document.getElementById("category");
let extraCharge = document.getElementById("extraCharge");

category.addEventListener("change", function() {

    let charge = 0;

    if (category.value === "Standard") {
        charge = 0;
    }
    else if (category.value === "Premium") {
        charge = 100;
    }
    else if (category.value === "VIP") {
        charge = 200;
    }

    extraCharge.textContent = charge;

});


let quantity = document.getElementById("quantity");
let subtotal = document.getElementById("subtotal");

function calculateSubtotal() {

    let movieCost = Number(moviePrice.textContent);
    let categoryCost = Number(extraCharge.textContent);
    let ticketCount = Number(quantity.value);

    if (ticketCount >= 1 && ticketCount <= 10) {

        let total = (movieCost + categoryCost) * ticketCount;

        subtotal.textContent = total.toFixed(2);

    } else {

        subtotal.textContent = "0.00";

    }
}

movie.addEventListener("change", calculateSubtotal);
category.addEventListener("change", calculateSubtotal);
quantity.addEventListener("input", calculateSubtotal);


let coupon = document.getElementById("coupon");

let discountDisplay = document.getElementById("discount");
let taxDisplay = document.getElementById("tax");
let finalAmountDisplay = document.getElementById("finalAmount");
let couponMessage = document.getElementById("couponMessage");

function calculateBill() {

    let subtotalAmount = Number(subtotal.textContent);

    let discount = 0;
    let tax = 0;
    let finalAmount = 0;

    if (coupon.value.trim().toUpperCase() === "CINE10") {

        discount = subtotalAmount * 0.10;
        couponMessage.textContent = "10% discount applied!";
        couponMessage.style.color = "#6bd68b";

    }
    else if (coupon.value.trim() === "") {

        discount = 0;
        couponMessage.textContent = "";

    }
    else {

        discount = 0;
        couponMessage.textContent = "Invalid coupon code.";
        couponMessage.style.color = "#ff6464";

    }

    let discountedPrice = subtotalAmount - discount;

    tax = discountedPrice * 0.05;

    finalAmount = discountedPrice + tax;

    discountDisplay.textContent = discount.toFixed(2);
    taxDisplay.textContent = tax.toFixed(2);
    finalAmountDisplay.textContent = finalAmount.toFixed(2);

}

coupon.addEventListener("input", calculateBill);

movie.addEventListener("change", calculateBill);
category.addEventListener("change", calculateBill);
quantity.addEventListener("input", calculateBill);
