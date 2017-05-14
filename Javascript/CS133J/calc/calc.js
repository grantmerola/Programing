"use strict";


//To be added 
//point


var output = 0;
var numone =0;
var log;

function update(){

	document.getElementById('returnarea').value = output;
}



function zero(){

	console.log('0');

	//makes the pressed number replace zero only when display is zero
	if(parseInt(output) === 0){
		output = '0'
	}
	else{
		output = output + '0';
	}
	update();
}

function one(){

	console.log('1');

	if(parseInt(output) === 0){
		output = '1';
	}
	else{
		output = output + '1'; 
	}

	update();
}

function two(){

	console.log('2');

	if(parseInt(output) === 0){
		output = '2';
	}
	else{
		output = output + '2'; 
	}

	update();
}

function three(){

	console.log('3');
	if(parseInt(output) === 0){
		output = '3';
	}
	else{
		output = output + '3'; 
	}

	update();
}

function four(){

	console.log('4');
	if(parseInt(output) === 0){
		output = '4';
	}
	else{
		output = output + '4'; 
	}

	update();
}

function five(){

	console.log('5');
	if(parseInt(output) === 0){
		output = '5';
	}
	else{
		output = output + '5'; 
	}

	update();
}

function six(){

	console.log('6');
	if(parseInt(output) === 0){
		output = '6';
	}
	else{
		output = output + '6';
	}
	update();
}

function seven(){

	console.log('7');
	if(parseInt(output) === 0){
		output = '7';
	}
	else{
		output = output + '7';
	}
	update();
}

function eight(){

	console.log('8');
	if(parseInt(output) === 0){
		output = '8';
	}
	else{
		output = output + '8';
	}
	update();
}

function nine(){

	console.log('9');
	if(parseInt(output) === 0){
		output = '9';
	}
	else{
		output = output + '9';
	}
	update();
}

function add(){

	console.log('+');
	numone = output;
	log = '+' ;
	output = 0;


}

function subtract(){

	console.log('-');
	numone = output;
	log = '-' ;
	output = 0;

}

function multiply(){

	console.log('*');
	numone = output;
	log = '*' ;
	output = 0;

}

function divide(){

	console.log("/");
	numone = output;
	log = '/' ;
	output = 0;

}

function point(){

	console.log('.');
	output = output + '.';

	update();
}

function equals(){

	console.log('=');

	var decimal = function(){

		if (output.match('.') != null){
			return true;
		}
		else{
			return false;
		}
	}

	if(decimal){
		switch (log){
			case '+':
			output = parseFloat(numone) + parseFloat(output);
			break;
			case '-':
			output = parseFloat(numone) - parseFloat(output);
			break;
			case '*':
			output = parseFloat(numone) * parseFloat(output);
			break;
			case '/':
			output = parseFloat(numone) / parseFloat(output);
			break;
		}
	}
	else{
		switch (log){
			case '+':
			output = parseInt(numone) + parseInt(output);
			break;
			case '-':
			output = parseInt(numone) - parseInt(output);
			break;
			case '*':
			output = parseInt(numone) * parseInt(output);
			break;
			case '/':
			output = parseInt(numone) / parseInt(output);
			break;
		}
	}

	update();
}

function reset(){

	console.log('clear')
	output = 0;
	numone = null;
	log = null;
	update();
}

//*/