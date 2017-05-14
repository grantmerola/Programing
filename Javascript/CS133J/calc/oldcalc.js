"use strict";

// WIP
//To be added 
//equals 
//point
//return abiltiy to operate on numbers larger than one digit preferably with out functionaliy loss
//best guess change operation fire sequence 

var output = 0;
var numone = null;
var arrayforlog = []
function update(){

	document.getElementById('returnarea').value = output;
}

// can either store the most recent operation or call it
function log(storecallbool, operationtype){

	//log most recent operation  pass true to add
	if(operationtype != undefined){
		arrayforlog.push(operationtype);
	}
	console.log('log push fire');
	//if you want to call the most recent function pass false
	if (storecallbool == false){
		console.log('log pop fire');
		switch (arrayforlog.pop()){
			case '+':
			add();
			break;
			case '-':
			subtract();
			break;
			case '*':
			multiply();
			break;
			case '/':
			divide();
			break;
		}
	}

}

function zero(){

	console.log('0');

	//makes the pressed number replace zero only when display is zero
	if(parseInt(output) === 0){
		output = '0'
	}
	else if(numone != null){
		output = '0'
	}
	else{
		output = output + '0';
	}
	//calls last operation function when something is ready to be operated apon 
	if (numone != null){
		log(false);
	}
	update();
}

function one(){

	console.log('1');

	if(parseInt(output) === 0){
		output = '1';
	}
	else if(numone != null){
		output = '1'
	}
	else{
		output = output + '1'; 
	}

	if (numone != null){
		log(false);
	}
	update();
}

function two(){

	console.log('2');

	if(parseInt(output) === 0){
		output = '2';
	}
	else if(numone != null){
		output = '2'
	}
	else{
		output = output + '2'; 
	}

	if (numone != null){
		log(false);
	}
	update();
}

function three(){

	console.log('3');
	if(parseInt(output) === 0){
		output = '3';
	}
	else if(numone != null){
		output = '3'
	}
	else{
		output = output + '3'; 
	}

	if (numone != null){
		log(false);
	}
	update();
}

function four(){

	console.log('4');
	if(parseInt(output) === 0){
		output = '4';
	}
	else if(numone != null){
		output = '4'
	}
	else{
		output = output + '4'; 
	}

	if (numone != null){
		log(false);
	}
	update();
}

function five(){

	console.log('5');
	if(parseInt(output) === 0){
		output = '5';
	}
	else if(numone != null){
		output = '5'
	}
	else{
		output = output + '5'; 
	}

	if (numone != null){
		log(false);
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
	if(numone == null){
		numone = parseInt(output);
		update();
	}
	else{	
		var addednum = numone + parseInt(output);
		output = addednum;
		numone = null;
		update();
	}
	log(true,'+');
}

function subtract(){

	console.log('-');
	if(numone == null){
		numone = parseInt(output);
		update();
	}
	else{	
		var addednum = numone - parseInt(output);
		output = addednum;
		numone = null;
		update();
	}
	log(true,'-');
}

function multiply(){

	console.log('*');
	if(numone == null){
		numone = parseInt(output);
		update();
	}
	else{	
		var addednum = numone * parseInt(output);
		output = addednum;
		numone = null;
		update();
	}
	log(true,'*');
}

function divide(){

	console.log("/");
	if(numone == null){
		numone = parseInt(output);
		update();
	}
	else{	
		var addednum = numone / parseInt(output);
		output = addednum;
		numone = null;
		update();
	}
	log(true,'/');
}

function point(){

	console.log('.');
}

function equals(){

	console.log('=');
	log(false);
	document.getElementById('returnarea').value = output;
}

function reset(){

	console.log('clear')
	output = 0;
	numone = null;
	update();
}

//*/