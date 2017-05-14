function action1() {

	var outstr = '';
	for (var i = 0; i <= 100; i++) {
		if( (i % 3 == 0 || i % 3 == 3) && (i % 5 == 0 || i % 5 == 5) ){
			outstr += i +' FizzBuzz' +'<br>';
		}
		else if(i % 3 == 0 || i % 3 == 3){
			outstr += i +' Fizz' +'<br>';
		}
		else if(i % 5 == 0 || i % 5 == 5){
			outstr += i +' Buzz' +'<br>';
		}
		outstr += i + '<br>';
	}
	document.getElementById('output').innerHTML = outstr;

}
