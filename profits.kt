import java.util.Scanner
fun profit(): Int {
    val reader = Scanner(System.`in`)
    println("Enter the selling price")
    val a: Int =reader.nextInt()
    println("Enter the cost price")
    val b: Int = reader.nextInt()
    return a-b
    
}
fun main(args: Array<String>){
    println("The profits are "+profit()+"Ugx")

}
