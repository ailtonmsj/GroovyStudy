package br.amsj.groovy.study

// switch-case

num = 100;
result = ""

switch(num) {
	case 0:
		result = "num is zero"
		break
	case {num > 0}:
		result = "x is grater than zero"
		break
	case {num < 0}:
		result = "num is less than zero"
		break
	default:
		result = "Invalid number"
	}

println result