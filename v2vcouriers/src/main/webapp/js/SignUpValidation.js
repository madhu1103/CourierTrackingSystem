function FirstNameValidation() {
	var FirstName = document.getElementById("FirstNametxt").value;
	var status = false;
	var FirstNamereq = /^[A-Za-z]+$/
	if (FirstName != "") {
		if (!FirstName.match(FirstNamereq)) {

			document.getElementById("FirstNameError").innerHTML = "Only Alphabets"
			status = false;
		} else {
			document.getElementById("FirstNameError").innerHTML = ""
			status = true;
		}
	} else {
		document.getElementById("FirstNameError").innerHTML = "*"
		status = false;
	}
	return status;

}
function LastNameValidation() {
	var status = false;
	var LastName = document.getElementById("LastNametxt").value;
	var LastNamereq = /^[A-Za-z]+$/
	if (LastName != "") {
		if (!LastName.match(LastNamereq)) {

			document.getElementById("LastNameError").innerHTML = "Only Alphabets"
			status = false;
		} else {
			document.getElementById("LastNameError").innerHTML = ""
			status = true;
		}
	} else {
		document.getElementById("LastNameError").innerHTML = "*"
		status = false;
	}
	return status;

}

function GenderValidation() {
	var status=false;
	var gen = document.getElementById("Gender").value;
	if (gen.equals("select")) {
		document.getElementById("GenderError").innerHTML = "Select Gender"
			status=false;
	} else {
		document.getElementById("GenderError").innerHTML = ""
			status=true;
	}

}

function EmailValidation() {
	var status=false;
	var Emailname = document.getElementById("Emailtxt").value;

	if (Emailname != "") {

		document.getElementById("EmailError").innerHTML = ""
			status=true;

	} else {
		document.getElementById("EmailError").innerHTML = "*"
			status=false;
	}
	return status;

}

function ContactNumberValidation() {
	var ContactNumber = document.getElementById("ContactNumbertxt").value;
	var ContactNumberreq = /^[0-9]+$/

	if (ContactNumber != "") {
		if (!ContactNumber.match(ContactNumberreq)) {

			document.getElementById("ContactNumberError").innerHTML = "Only Numbers"
		} else {
			document.getElementById("ContactNumberError").innerHTML = ""
		}
	} else {
		document.getElementById("ContactNumberError").innerHTML = "*"
	}

}

function UserIdValidation() {
	var UserId = document.getElementById("UserIdtxt").value;
	var UserIdreq = /^[A-Za-z0-9]+$/
	if (UserId != "") {
		if (!UserId.match(UserIdreq)) {

			document.getElementById("UserIdError").innerHTML = "Special Characters Not Allowed"
		} else {
			document.getElementById("UserIdError").innerHTML = ""
		}
	} else {
		document.getElementById("UserIdError").innerHTML = "*"
	}

}

function PasswordValidation() {
	var PasswordName = document.getElementById("Passwordtxt").value;

	if (PasswordName != "") {
		document.getElementById("PasswordError").innerHTML = ""

	} else {
		document.getElementById("PasswordError").innerHTML = "*"
	}

}

function SubmitValidation() {
	var status=false;
	var a = document.getElementById("FirstNametxt").value;
	var b = document.getElementById("LastNametxt").value;
	var c = document.getElementById("Gender").value;
	var d = document.getElementById("Emailtxt").value;
	var e = document.getElementById("ContactNumbertxt").value;
	var f = document.getElementById("UserIdtxt").value;
	var g = document.getElementById("Passwordtxt").value;
	if ((a != "") && (b != "") && (c != "") && (d != "") && (e != "")
			&& (f != "") && (g != "")) {
		document.getElementById("SubmitError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("SubmitError").innerHTML = "All Fields are Mandatory"
			status=false;
	}
	return status;

}
