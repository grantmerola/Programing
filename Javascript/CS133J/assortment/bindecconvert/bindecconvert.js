function action1() {
	var decin = document.getElementById('input').value;
	var bin = parseInt(decin,10).toString(2);
	document.getElementById('output').value = bin;	
}
function action2() {
	var binin = document.getElementById('input2').value;
	var dec = parseInt(binin,2).toString();
	document.getElementById('output2').value = dec;	
}