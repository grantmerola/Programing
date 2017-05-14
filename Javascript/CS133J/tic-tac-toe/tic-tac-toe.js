var turn = true
//these should not be global varablies thats just lazy
var xwins = 0
var owins = 0
var draw = 0

function endturn(){
	if( testwin( fetchtable() ) != -1 ){
		turn = true;
	}
	else{
	oplay();
	}
}

// this js project like most of mine does not seperate on mvc feels less relevent in js
function oplay(){
	if(turn == false){
		var num = rng(10);
		if( 10 > num > 0){
			if(fetchtable()[num] == 0 ){
				placeo(num)
			}
			else{
				oplay()
			}
		}
		else{
			oplay();
		}
	}
}
function rng(num){
	//just a quick random number generator 
	return parseInt(Math.random()*num)
}
function placeo(squaretoplace){
	document.getElementById('box' + squaretoplace).innerHTML = '<div class=\"o\" id=\"o\"><h1 class=\"otext\">O</h1></div>'
	turn = true;
}

function testwin(arrayofboard){

	board = arrayofboard;
	for (var i = 0; i < 3; i++) {
	var wintype = 3;
	if(i == 1){wintype = -3}
	if(i == 2){wintype = 9}

		switch(wintype){
		//rows
		case board[1] + board[2] + board[3]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		case board[4] + board[5] + board[6]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		case board[7] + board[8] + board[9]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		//coloms 
		case board[1] + board[4] + board[7]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		case board[2] + board[5] + board[8]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		case board[3] + board[6] + board[9]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		//diagagonals 
		case board[1] + board[5] + board[9]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		case board[3] + board[5] + board[7]:
			reset();
			var winner = function() {
				if(wintype == 3){return 1}
				else if(wintype == -3){return -1}
				}
			incrementscore(winner());
			return 1;
			break;
		//tie caset
		case board[1] + board[2] + board[3] + board[4] + board[5] + board[6] + board[7] + board[8] + board[9]:
			reset();
			incrementscore(0);
			return 0;
		}
	}
	return -1;
}
function fetchtable(){
	//this first zero is here so we can direcctly map board postions to array indexs not nessisary just for ease of use 
	//may wish to remove because may cause unexpected behavior  
	boxstatus =[0,
				0,0,0,
				0,0,0,
				0,0,0]
	for (var i = 1; i < 10; i++) {
		//find the box
		var box = document.getElementById('box' + i).firstChild;
		// if it exists
		if( box != null){
			// is it x
			if(box.id[0] == 'x'){
				boxstatus[i] = 1;
			}
			if(box.id[0] == 'o'){
				boxstatus[i] = -1;
			}
		}
	}
	return boxstatus;
}
function incrementscore(num){
	if(num == 1){
		xwins = xwins + 1;
		document.getElementById('xwins').innerHTML = "X Wins: " + xwins;
	}
	else if(num == -1){
		owins = owins + 1;
		document.getElementById('owins').innerHTML = "O Wins: " + owins;
	}
	else if(num == 0){
		draw = draw + 1;
		document.getElementById('draws').innerHTML = "Draws: " + draw;
	}
}
function reset(){
	var selctiondiv = document.getElementById("deletable");
	selctiondiv.innerHTML = '';
	// this is a pottentialy inelegant solution 
	selctiondiv.innerHTML = '<div id=\"the x\'s\"><div class=\"x\" id=\"x1\" draggable=\"true\" ondragstart=\"letsdrag(event)\"><h1 class=\"xtext\">X</h1></div><div class=\"x\" id=\"x2\" draggable=\"true\" ondragstart=\"letsdrag(event)\"><h1 class=\"xtext\">X</h1></div><div class=\"x\" id=\"x3\" draggable=\"true\" ondragstart=\"letsdrag(event)\"><h1 class=\"xtext\">X</h1></div><div class=\"x\" id=\"x4\" draggable=\"true\" ondragstart=\"letsdrag(event)\"><h1 class=\"xtext\">X</h1></div><div class=\"x\" id=\"x5\" draggable=\"true\" ondragstart=\"letsdrag(event)\"><h1 class=\"xtext\">X</h1></div></div><div id=\"theboard\"><table><tbody><tr><td class=\"box\" id=\"box1\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box2\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box3\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td></tr><tr><td class=\"box\" id=\"box4\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box5\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box6\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td></tr><tr><td class=\"box\" id=\"box7\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box8\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td><td class=\"box\" id=\"box9\" ondragover=\"candrop(event)\" ondrop=\"beendroped(event)\"></td></tr></tbody></table></div>'
}


//drag drop stuff
function candrop(theevent) {
    theevent.preventDefault();
}
function letsdrag(theevent){
	if(turn == true){
		theevent.dataTransfer.setData("text/plain", theevent.target.id);
	}
}
function beendroped(theevent){
	if(turn == true){
		var anx = theevent.dataTransfer.getData("text/plain");
 		theevent.target.appendChild(document.getElementById(anx));
 		turn = false;
 	}
}

/*
1-1 1 = 1 not win
x|o|x

1 1 1 = 3 win
x|x|x

1 0 0 = 1 not win
x| | 

-1 -1 1
o|o|x




*/