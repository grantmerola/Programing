var timer;
var countnum;
var laptimes = [];
var starttime;

function count(){
	countnum = Date.now() - starttime;
	update()
	//it doesent work if i dont return count no idea why, if made a function then frezzes browser
	//return count;
}

function update(){
	document.getElementById('timerelm').innerHTML = formatcountnum(countnum);
}

function formatcountnum(incountnum){

	var prettycountnum = new Date(incountnum);

	var hours = prettycountnum.getUTCHours().toString();
		if(hours.length == 1){
			hours = '0' + hours;
		}  
	var min = prettycountnum.getUTCMinutes().toString();
		if(min.length == 1){
			min = '0' + min;
		}
	var sec = prettycountnum.getUTCSeconds().toString();
		if(sec.length == 1){
			sec = '0' + sec;
		}
	var mill = (prettycountnum.getUTCMilliseconds() / 1000).toFixed(2).toString().substring(2);
	
	var timecount = hours + ":" + min + ":" + sec + "." +mill;
	return timecount;

}

function start(){
	timer = window.setInterval(count,1);
	if(starttime == null){ 
		starttime = Date.now();
	}
}

function stop(){
	window.clearInterval(timer);
	//clears every thing incase start is pressed multiple times
    for (var i = 1; i < 1000; i++)
        window.clearInterval(i);
}

function lap(){
	laptimes.push("<br>" + formatcountnum(countnum));
document.getElementById('lapelm').innerHTML = laptimes;
}

function reset(){
stop();
countnum = 0;
laptimes = [];
starttime = null;
update();
}