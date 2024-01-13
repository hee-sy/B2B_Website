function validateNumberInput(number) {
	const numberVal = /^[0-9.]+$/;
	return numberVal.test(number);
}

let prodName = document.getElementById("prodName");
let prodQuantity = document.getElementById("prodQuantity");
let prodUnit = document.getElementById("prodUnit");
let prodUnitPrice = document.querySelector("prodUnitPrice");
let prodDesc = document.querySelector("prodDesc");

form.addEventListener("submit", (e) => {
	const errors = [];

	if (prodName.value.trim() === "") {
		errors.push("Name required.");
	} 

	if (prodQuantity.value.trim() === "") {
		errors.push("Email required.");
	} else if (!validateNumberInput(prodQuantity.value.trim())) {
		errors.push("Invalid number format. Please use only numbers");
	}

	if (prodUnit.value.trim() === "") {
		errors.push("Please write a message.");
	}else if (!validateNumberInput(prodUnit.value.trim())) {
		errors.push("Invalid number format. Please use only numbers");
	}
	
	if (prodUnitPrice.value.trim() === "") {
		errors.push("Please write a message.");
	}else if (!validateNumberInput(prodUnitPrice.value.trim())) {
		errors.push("Invalid number format. Please use only numbers");
	}
	
	if (prodDesc.value.trim() === "") {
		errors.push("Please write a description.");
	}

	if (errors.length > 0) {
		e.preventDefault();
		alert(errors.join('\n'))
	}
})
//<script src="ValidateAddProduct.js"></script>