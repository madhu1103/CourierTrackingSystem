function SubmitValidation() {
	var status=false;
	var a = document.getElementById("PackageIdtxt").value;
	var b = document.getElementById("CurrentDatetxt").value;
	var c = document.getElementById("CurrentLocationtxt").value;
	var d = document.getElementById("PackageStatustxt").value;
	if ((a != "") && (b != "") && (c != "")) {
		document.getElementById("SubmitError").innerHTML = ""
			status=true;
	} else {
		document.getElementById("SubmitError").innerHTML = "All Fields are Mandatory"
			status=false;
	}
	return status;

}