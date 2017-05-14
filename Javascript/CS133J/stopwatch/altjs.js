var timer;
var countnum = 0;
var laptimes = [];

function count(){
	countnum = countnum + 1;
	update()
	//it doesent work if i dont return count no idea why
	return count;
}

function update(){
	document.getElementById('timerelm').innerHTML = formatcountnum(countnum);
}

function formatcountnum(incountnum){

	var hour = incountnum / (60 * 60 * 1000);
	var minute = (incountnum / (60 * 1000)) % 60;
	var second = (incountnum / 1000) % 60;

	prettycountnum = hour + ":" + minute + ":" + second //+ "." + incountnum 
	return prettycountnum
}

function start(){
	timer = window.setInterval(count(),10);
}

function stop(){
	window.clearInterval(timer);
	//clears every thing incase start is pressed multiple times
    for (var i = 1; i < 1000; i++)
        window.clearInterval(i);
}

function lap(){
	laptimes.push("<br>" + formatcountnum(countnum) )
document.getElementById('lapelm').innerHTML = laptimes;
}

function reset(){
countnum = 0;
laptimes = [];
update()
}