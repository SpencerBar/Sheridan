function getStudent(id) {
if (document.getElementById("student"+id).innerHTML=="") {
	fetch('http://localhost:8080/getStudent/' + id) 
	.then(student => student.json()) 
	.then(function(student) { 
		var textToDisplay="";
		textToDisplay += "ID:" + student.id + "<br>";
		textToDisplay += "Grade:" + student.grade + "<br>";
		textToDisplay += "Letter Grade:" + student.letterGrade + "<br>";
		textToDisplay += "Attended:" + student.attended + "<br>";
		textToDisplay += "Participated:" + student.participated + "<br>";
		document.getElementById("student"+id).innerHTML=textToDisplay;
	});
} 
else {
document.getElementById("student"+id).innerHTML="";
}
}



