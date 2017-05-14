var wakeup =0;
var timer;
function action1() {
	var hours =0, min =0, mill = 0;
	hours = parseInt(document.getElementById('hours').value);
	min = parseInt(document.getElementById('min').value);
	//console.log(hours +' h '+ min + ' m ' + wakeup + ' w ' + mill + ' mill ' );
	if(hours == NaN){
		mill = (min * 60000) + (hours * 3600000);
	}
	else{
		mill = (min * 60000);	
	}
	wakeup = Date.now() + mill;
	console.log( mill + ' mill ' + wakeup + ' w '+ new Date(wakeup).toString() + ' t ' );
	document.getElementById('wakeup').innerHTML = 'You will be woken at: ' + new Date(wakeup).toString();
	timer = setInterval(timetowakeup(), 10000);
	

}
function timetowakeup(){
	if(Date.now() >= new Date(wakeup)){
		clearInterval(timer);
		console.log('play alarm')
		var sound = new Audio('beep.mp3');
			sound.play();
	}
	return timetowakeup
}
