function idValidation() {
	var id = document.getElementById("useridtxt").value;
	if (id != "") {
		document.getElementById("idError").innerHTML = " ";
	} else {
		document.getElementById("idError").innerHTML = "UserId cannot be Empty";
	}
}

function passValidation() {
	var pass = document.getElementById("passwordtxt").value;
	if (pass != "") {
		document.getElementById("PasswordError").innerHTML = " ";
	} else {
		document.getElementById("PasswordError").innerHTML = "Password cannot be Empty";
	}
}

function validate() {
	var status = false;
	var id = document.getElementById("useridtxt").value;
	var pass = document.getElementById("passwordtxt").value;
	if (id != "" && pass != "") {
		document.getElementById("validationError").innerHTML = " ";
		status = true;
	} else {
		document.getElementById("validationError").innerHTML = "Provide UserId and Password";
		status = false;
	}
	return status;
}


