
function action1() {
 var str = document.getElementById('input').value;
 	str = str.split('');
 	var a =0,e=0,i=0,o=0,u=0,y=0;
 	for (var w = 0; w < str.length; w++) {
 		switch (str[w]){
 			case 'a':
 			a += 1;
 			break;
 			case 'e':
 			e += 1;
 			break;
 			case 'i':
 			i += 1;
 			break;
 			case 'o':
 			o += 1;
 			break;
 			case 'u':
 			u += 1;
 			break;
 			case 'y':
 			y += 1;
 			break;
 		}
 	}
 	var outstr = ' a: ' + a + '<br>' + ' e: ' + e + '<br>' + ' i: ' + i + '<br>' + ' o: ' + o + '<br>' +' u: ' + u + '<br>' +' y: ' + y + '<br>';
 	document.getElementById('output').innerHTML = outstr;

}