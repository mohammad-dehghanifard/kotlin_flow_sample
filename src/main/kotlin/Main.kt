import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow


fun main() = runBlocking {
    launch {
        factorial(30).collect {
            println(it)
        }
    }
   println("Main Thread is free")
}


fun factorial(number : Int) : Flow<Int> = flow {
    var result = 1
    for (i in 1..number ) {
        delay(1000)
        result *= i
        emit(result)
    }
}
