class animal {
	constructor(name){
		this.name = name;
	}
	move(){
		console.log('moved 1');
	}
	speak(){
		console.log('has spoken');
	}
};
class farmanimal extends animal{
	use(){
		console.log('what are you used for')
	}
	price(){
		console.log('what is your price')
	}

};
class pet extends animal{
	cuteness(){
		console.log('how cute are you')
	}
	averageincomedrain(){
		console.log('how much income do you drain')
	}
};
class bunny extends pet{

}
class cat extends pet{

}
class cow extends farmanimal{

}
class sheep extends farmanimal{

}
var bunny1 = new bunny('caerbannog');
var cat1 = new cat('mr.fun');
var cow1 = new cow('moo');
var sheep1 = new sheep('baa');

console.log(bunny1.name +': ')
bunny1.cuteness();
bunny1.averageincomedrain();
bunny1.move();
bunny1.speak();
console.log(cat1.name +': ')
cat1.cuteness();
cat1.averageincomedrain();
cat1.move();
cat1.speak();
console.log(cow1.name +': ')
cow1.use()
cow1.price()
cow1.move();
cow1.speak();
console.log(sheep1.name +': ')
sheep1.use()
sheep1.price()
sheep1.move();
sheep1.speak();