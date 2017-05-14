function action1() {
	var change = parseFloat(document.getElementById('input2').value) - parseFloat(document.getElementById('input1').value);
	var dollarsandcents = change.toFixed(2).toString().split('.');
	var outstr = dollarsandcents[0] +' Dollars ';
	console.log(dollarsandcents[0] + ' : '+dollarsandcents[1]);
	if(dollarsandcents[1] == undefined){
		dollarsandcents.push(00);
	}

	if (dollarsandcents[1] % 25 == 0 ){
		outstr += (dollarsandcents[1] / 25) + ' Quarters ';

	}
	else if(dollarsandcents[1] % 10 == 0 ){
		outstr += (dollarsandcents[1] / 10) + ' Dimes ';
	}
	else if(dollarsandcents[1] % 5 == 0 ){
		outstr += (dollarsandcents[1] / 5) + ' Nickels ';
	}
	else {
		outstr += (dollarsandcents[1] / 1) + ' Pennies ';
	}

	document.getElementById('output').value= outstr;
}
