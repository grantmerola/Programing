var fruits = [
  { fruit: "apple", color: "red" },
  { fruit: "orange", color: "orange" },
  { fruit: "cherry", color: "red" },
  { fruit: "grape", color: "green" },
  { fruit: "strawberry", color: "red" },
  { fruit: "lemon", color: "yellow" },
  { fruit: "peach", color: "yellow" },
  { fruit: "kiwi", color: "green" },
  { fruit: "lime", color: "green" }
];

fruits.sort(function (one, two){
	if(one.color > two.color){return 1};
	if(one.color < two.color){return -1}
	else{
		if(one.fruit > two.fruit){return 1}
		if(one.fruit < two.fruit){return -1}
	}
	return 0;
});
console.log(fruits);