function action1() {
	var str = '';
	if(document.getElementById('input').value != undefined){
		str = document.getElementById('input').value;
	}
	str = str.split('').reverse()
	
	var outstring = str.join('')

	document.getElementById('input').value = outstring;
}
