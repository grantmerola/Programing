window.onload = function(){document.getElementById('input').value = '';}
function action1() {
	var instr = document.getElementById('input').value;
	instr = instr.split(" ");
	var outstr = '';
	for (var i = 0; i < instr.length; i++) {
		var strarray = instr[i].split('');
		var firstletter = strarray.splice(0,1);
		strarray.push(firstletter[0] + 'ay ');
		outstr += strarray.join('');	
	}
	document.getElementById('input').value = outstr;
}
