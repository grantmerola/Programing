function addstudent(){
	var firstname = document.getElementById('firstname').value
	var lastname = document.getElementById('lastname').value
	var grade = document.getElementById('gradename').value
	var newstudent = new student(firstname, lastname, grade);
	studentdata.addstudenttotable(newstudent);
	resetentry();
	updatetable();
}
function updatetable(){
	document.getElementById('tbody').innerHTML = '';

	studentdata.data.forEach(function(elm){
		var row = document.createElement('tr')
		row.innerHTML = "<td>" + elm.namef + "</td><td>" + elm.namel + "</td><td>" + elm.grade +"% </td>"
		document.getElementById('tbody').appendChild(row);
	})
	updateother();
}
function resetentry(){
	document.getElementById('firstname').value = ''
	document.getElementById('lastname').value = ''
	document.getElementById('gradename').value = ''
}
function sortby(what){
	if(what == 'fn'){studentdata.sortbyfirstname();}
	if(what == 'ln'){studentdata.sortbylastname();}
	if(what == 'g'){studentdata.sortbygrade();}
	updatetable()
}
function updateother(){
	document.getElementById('average').innerHTML = "Average Grade: " + studentdata.average();
	document.getElementById('max').innerHTML = "Max Grade: " + studentdata.max();
	document.getElementById('min').innerHTML = "Min Grade: " + studentdata.min();
}

class studentdataobject{
	constructor(){
	this.data = [];
	}
	
	addstudenttotable(astudent){
		this.data.push(astudent);
	}

	average(){
		var worknum = 0;
		this.data.forEach(function(elm){
			worknum = worknum + (elm.grade / 100)
		});
		var averagegrade = ((worknum / this.data.length) * 100).toFixed(2);
		return averagegrade;
	}
	max(){
		var currentmax = 0;
		this.data.forEach(function(elm){
			 if(elm.grade > currentmax){
			 	currentmax =  elm.grade;
			 }
		});
		return currentmax;
	}
	min(){
		var currentmin = this.max();
		this.data.forEach(function(elm){
			 if(elm.grade < currentmin){
			 	currentmin =  elm.grade;
			 }
		});
		return currentmin;
	}
	sortbyfirstname(){
		this.data.sort(function (one, two){
			if(one.namef > two.namef){return 1}
			if(one.namef < two.namef){return -1}
			if(one.namef == two.namef){return 0}
		});
	}
	sortbylastname(){
		this.data.sort(function (one, two){
			if(one.namel > two.namel){return 1}
			if(one.namel < two.namel){return -1}
			if(one.namel == two.namel){return 0}
		});
	}
	sortbygrade(){
		this.data.sort(function (one, two){
			if(one.grade > two.grade){return 1}
			if(one.grade < two.grade){return -1}
			if(one.grade == two.grade){return 0}
		});
	}
}

class student{
	constructor(namef, namel, grade){
		this.namef = namef;
		this.namel = namel;
		this.grade = grade;
	}

}
var studentdata = new studentdataobject();
