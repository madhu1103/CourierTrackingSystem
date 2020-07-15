function SubmitValidation() {
	var status=false;
	var a = document.getElementById("PackageIdtxt").value;
	
	
	if (a != "") {
		document.getElementById("SubmitError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("SubmitError").innerHTML = "Please provide PackageId..."
			status=false;
	}
	return status;

}