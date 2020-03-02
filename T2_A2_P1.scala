object Prueba{	
	def main(args: Array[String]): Unit ={
        val parcial1 = Array(82,94,92,65,77,77)
        val parcial2 = Array(81,90,93,78,83,54)
        val parcial3 = Array(59,53,57,66,66,62)
        val parcial4 = Array(77,85,57,98,72,69)
        println("Promedio del parcial 1: "+average(parcial1))
        println("Promedio del parcial 2: "+average(parcial2))
        println("Promedio del parcial 3: "+average(parcial3))
        println("Promedio del parcial 4: "+average(parcial4))
        println("----------------------------------------------------")
        for(p<-0 until 6)
        	println("Promedio de la materia "+(p+1)+": "+positionAverage(p,parcial1,parcial2,parcial3,parcial4))
        println("----------------------------------------------------")
        println("Promedio general: "+generalAverage(parcial1,parcial2,parcial3,parcial4))

	}
	def positionAverage(pos:Int,calif:Array[Int]*): Double = {
		var sum = 0.0
		for(par<-calif)
			sum += par(pos)
		sum/calif.length
	}
	def average(calif:Array[Int]): Double = {
		var sum = 0.0
		for(c<-calif)
			sum += c
		sum/calif.length
	}
	def generalAverage(calif:Array[Int]*): Double = {
		var sum = 0.0
		var cant = 0
		for(par<-calif){
			for(c<-par){
				cant+=1
				sum += c	
			}
		}
		sum/cant
	}
}