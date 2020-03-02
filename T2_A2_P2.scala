import scala.collection.mutable.ArrayBuffer
object Prueba{	
	def main(args: Array[String]): Unit ={
		val horasTemp = new Array[Int](48)
		llenarArreglo(horasTemp)
		val tempEx = buscarTemp(horasTemp,25)
		//imprimirArreglo(horasTemp)
		imprimirArreglo(tempEx)
		println("Promedio de las horas: "+promedio(tempEx))
	}
	def imprimirArreglo(arreglo:Array[Int]): Unit = {
		println("Hora   Temperatura")
		for(i<-0 until arreglo.length by 2){
			println(" "+arreglo(i)+"      "+arreglo(i+1))
		}
	}
	def buscarTemp(arreglo:Array[Int],temp:Int): Array[Int] = {
		val tempExactas = ArrayBuffer[Int]()
		for(i<-0 until arreglo.length){
			if(i%2!=0){
				if(arreglo(i)==25){
					tempExactas += arreglo(i-1)
					tempExactas += arreglo(i)
				}
			}
		}
		tempExactas.toArray
	}
	def llenarArreglo(arreglo:Array[Int]): Unit = {
		var cont = 0
		for(i<-0 until arreglo.length){
			if(i%2==0){
				arreglo(i) = cont
				cont+=1
			}
			else
				arreglo(i) = obtenerTempAleatoria(50)
		}
	}
	def obtenerTempAleatoria(max:Int):Int={
		val r = scala.util.Random
		r.nextInt(max+1)
	}
	def promedio(arreglo:Array[Int]): Double = {
		var sum = 0.0
		for(i<-0 until arreglo.length by 2)
			sum += arreglo(i)
		sum/(arreglo.length/2)
	}
}