function getandcalcvalues () {
	var length = document.getElementById('length').value
	var width = document.getElementById('width').value
	var percent = document.getElementById('percent').value
	console.log(width)
	console.log(length)
	console.log(percent)
	percent = percent/100
	console.log(percent)
	var sqft = (width * length) + ((width * length) * percent)
	console.log(sqft)
	return sqft
}

function calcfunc () {
	var getfeet = getandcalcvalues()
	document.getElementById('feetreturn').value = getfeet + ' ft²'
	document.getElementById('yardreturn').value = (getfeet/3) + ' yd²'
}

function clearfunc () {
	document.getElementById('width').value = ''
	document.getElementById('length').value = ''
	document.getElementById('percent').value = ''
	document.getElementById('feetreturn').value = ''
	document.getElementById('yardreturn').value = ''
}
