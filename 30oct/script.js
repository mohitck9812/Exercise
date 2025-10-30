const outerdiv = document.getElementById("outerdiv");
const addProduct = document.getElementById("addProduct");
const costlyProd = document.getElementById('costlyProd');
const price =[];

function displayCostlyProd(value){
    costlyProd.innerHTML = `Price of costliest product is: ${value}`;
}

function maxPrice(arr){
    if (arr.length === 0) displayCostlyProd("Enter product first");
  let max = arr[0];
  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      max = arr[i];
    }
  }
  return displayCostlyProd(max);
}

function Product(name, mrp, category) {
  this.name = name;
  this.mrp = Number(mrp);
  this.category = category;

  const card = document.createElement("div");
  card.classList.add("card");

  const discountedPrice = this.getDiscountedPrice(10);

  card.innerHTML = `
    <h1 class="pName">${this.name}</h1>
    <h3 class="pMRP">MRP: ₹${this.mrp}</h3>
    <h3 class="pPrice">Price: ₹${discountedPrice}</h3>
    <h3 class="pCategory">Category: ${this.category}</h3>
  `;

  card.addEventListener("mouseenter", () => {
    card.style.transform = "scale(1.05)";
    card.style.boxShadow = "0 8px 20px rgba(0,0,0,0.3)";
    card.style.transition = "all 0.3s ease";
  });

  card.addEventListener("mouseleave", () => {
    card.style.transform = "scale(1)";
    card.style.boxShadow = "none";
  });

  price.push(discountedPrice);
  maxPrice(price);

  outerdiv.appendChild(card);
}

Product.prototype.getDiscountedPrice = function (percent) {
  return (this.mrp * (100 - percent)) / 100;
};

function getInput() {
  const name = prompt("Enter the name of product");
  const mrp = prompt("Enter the MRP of product");
  const category = prompt("Enter the category of product");
  return { name, mrp, category };
}

(function newProduct() {
    const input = getInput();
  new Product(input.name, input.mrp, input.category);
})();

addProduct.addEventListener("click", () => {
  const input = getInput();
  new Product(input.name, input.mrp, input.category);
});
