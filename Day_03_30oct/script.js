const outerdiv = document.getElementById("outerdiv");
const addProduct = document.getElementById("addProduct");
const costlyProd = document.getElementById("costlyProd");
const prices = [];

// ✅ Show costliest product price
function displayCostlyProd(value) {
  costlyProd.textContent = `Price of costliest product is: ₹${value}`;
}

// ✅ Find and display max price
function maxPrice(...values) {
  if (values.length === 0) {
    displayCostlyProd("Enter product first");
    return;
  }
  const max = Math.max(...values);
  displayCostlyProd(max);
}

// ✅ Product constructor
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

  // ✅ Hover effect
  card.addEventListener("mouseenter", () => {
    card.classList.add("hovered");
  });
  card.addEventListener("mouseleave", () => {
    card.classList.remove("hovered");
  });

  // ✅ Update global price array
  prices.push(discountedPrice);
  maxPrice(...prices);

  outerdiv.appendChild(card);
}

// ✅ Prototype method for discount
Product.prototype.getDiscountedPrice = function (percent) {
  return (this.mrp * (100 - percent)) / 100;
};

// ✅ Input collection with validation
function getInput() {
  let name = prompt("Enter the name of product:");
  if (!name || name.trim() === "") {
    alert("Product name cannot be empty!");
    return null;
  }

  let mrp = prompt("Enter the MRP of product (must be a number > 0):");
  while (mrp === null || isNaN(mrp) || mrp <= 0) {
    alert("Invalid MRP! Please enter a valid positive number.");
    mrp = prompt("Enter the MRP of product (must be a number > 0):");
  }

  let category = prompt("Enter the category of product:");
  if (!category || category.trim() === "") {
    alert("Product category cannot be empty!");
    return null;
  }

  return { name, mrp, category };
}

// ✅ Initialize with one product
(function initProduct() {
  const input = getInput();
  if (input) new Product(input.name, input.mrp, input.category);
})();

// ✅ Add new product on button click
addProduct.addEventListener("click", () => {
  const input = getInput();
  if (input) new Product(input.name, input.mrp, input.category);
});
