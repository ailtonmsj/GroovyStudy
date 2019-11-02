package br.amsj.groovy.study

class Variables {

	static void main(args) {

		def String valueOne = "valueOne"
		def valueTwo = "valueTwo"
		String valueThree = "valueThree"
//		valueFour = "valueFour" // it is not possible declare variables without def or type inside the class
		
		println valueOne
		println 'The ' + valueOne
		
		println '============================'
		
		
		println '${valueOne}  ${valueThree}' // the values inside the single cotes are literals
		println valueOne + valueTwo
		println "${valueOne} is diffente from  ${valueThree}" // It is possible
		println '$valueOne  $valueThree' // it is possible using without curl branckets but it is not a good pratice
		
		println '============================'
		
		// the same rules for variables name used in Java programming language
		def _value10 = 10
		def _value_20 = 20
		
		// it is an optionally typed language and dynamic language 
		def stringValue = 'John'
		stringValue = 10
		println stringValue
		
		println '============================'
		
		def int intType = 10
		println intType.getClass().getName()
		
		intType = 20.10
		println intType
		
		println '============================'
		
		println Integer.MAX_VALUE
		println Integer.MIN_VALUE
		
	}
}
