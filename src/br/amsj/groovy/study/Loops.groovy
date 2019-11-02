package br.amsj.groovy.study

println "=========== for =============="

// for
for(i=0; i<=3; i++) {
	println i
}

println "========== for in ============"

// for in
for(i in 1..7) {
	println i
}

println "========= for array =========="

// for in
for(i in [0,1,10,20,50,100]) {
	println i
}

println "===== iterate over a map ====="

// for map
def map = ['keyOne': 1, 'keyTwo': 2, 'keyThree': 3]
for(i in map) {
	println "${i.key} - ${i.value}"
}


println "=========== upto ============="

1.upto(5) {
	println "${it}"
}

println "========== downto ============"

5.downto(0) {
	println "${it}"
}

println "========== times ============="

5.times { 
	println "${it}"
}

println "=========== step ============="

0.step(10, 2) { 
	println "${it}"
}