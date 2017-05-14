window.onload = function(){document.getElementById('input').value = '';}
function action1() {
	var str = document.getElementById('input').value;
	var newstr = str.split('').reverse().join('');

	if(str == newstr){
	document.getElementById('output').innerHTML = 'true';
	}
	else{
	document.getElementById('output').innerHTML = 'false';	
	}

}
