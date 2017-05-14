var id = 1;
window.onload = timers();

function remove(event){
	event.currentTarget.remove();
	//very difficult to remove them while in motion, but not impossible 
};
function make(id){
	
	//creating div
	var div = document.createElement("div");

	//adding attruibutes to it
	div.setAttribute("class","square");
	div.setAttribute("id",id);
	div.setAttribute("onclick","remove()");

	//adding to doc
	document.getElementsByTagName('body')[0].appendChild(div);
	//customizing the sqaure
	randomize(id);

};

function randomize(id){
	var height = rng(100);
	var width = rng(100);
	var top = rng(600);
	var left = rng(100);

	//adding a style attribute with comstom css
	document.getElementById(id).setAttribute("style", 
											  "height:" + height + 'px; ' 
											+ "width:" + width + 'px; ' 
											+ "top:" + top + 'px; ' 
											+ "left:" + left + 'px; ' 
											+ "background-color:"+ randomColor());
};
function rng(num){
	//just a quick random number generator 
	return parseInt(Math.random()*num)
}
function timers(){
	var randtime = rng(10000000);
	
	//wait random amount of time then make square and change id
	setTimeout(function(){
		make(id);
		id = id +1;
	}, randtime);
	
	//recursively call timers to contiunuisly add squares 
	timers();
}