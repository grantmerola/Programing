"use strict"
//Note i do not own a rabbit or even know anything about rabbits
function rabbit(inName) {
	var name = inName;
	var color = "brown";
	var size = "medium";
	var cutenessfactor = "extreme";
	var speed = "slow";
	var Caerbannog = false;
	return {
		getColor: function(){
			return color;
		},
		getSize: function(){
			return size;
		},
		getCutenessFactor: function(){
			return cutenessfactor;
		},
		getSpeed: function(){
			return speed;
		},
		getCaerbannog: function(){
			return Caerbannog;
		},
		getName: function(){
			return name;
		},
		setColor: function(inColor){
			color = inColor;
		},
		setSize: function(inSize){
			size = inSize;
		},
		setCutenessFactor: function(inCutenessFactor){
			cutenessfactor = inCutenessFactor;
		},
		setSpeed: function(inSpeed){
			speed = inSpeed;
		},
		setCaerbannog: function(inCaerbannog){
			Caerbannog = inCaerbannog;
		},
		setName: function(inName){
			name = inName;
		}
	}
};
console.log("Making rabbit named fluffy")
var myrabbit = new rabbit("fluffy");

console.log(myrabbit.getName() + " is my rabbit's Name");
console.log(myrabbit.getColor() + " is my rabbit's Color");
console.log(myrabbit.getSize() + " is my rabbit's Size");
console.log(myrabbit.getCutenessFactor() + " is my rabbit's cuteness factor");
console.log("Is my rabbit Caerbannog? " + myrabbit.getCaerbannog());
console.log("oh thank goodness.");
console.log(myrabbit.getSpeed() + " is my rabbit's Speed");


myrabbit.setName("Caerbannog");
myrabbit.setColor("white and splattered with patches of blood");
myrabbit.setSize("large");
myrabbit.setCutenessFactor("still pretty high");
myrabbit.setCaerbannog(true);
myrabbit.setSpeed("Mach 2");

console.log("Whats that terible beast with lots of teeth over there? I think it's a rabbit")
console.log(myrabbit.getName() + " is the rabbit's Name");
console.log(myrabbit.getColor() + " is the rabbit's Color");
console.log(myrabbit.getSize() + " is the rabbit's Size");
console.log(myrabbit.getCutenessFactor() + " is the rabbit's cuteness factor");
console.log("Is my rabbit Caerbannog? " + myrabbit.getCaerbannog());
console.log("oh Nooos.");
console.log(myrabbit.getSpeed() + " is my rabbit's Speed");
console.log("Great Scot's thats fast");
console.log("Aaaaarrrrrrggghhh");

