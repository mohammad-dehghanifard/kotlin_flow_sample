
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.fold
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {
    launch {
        factorial(30)
        // Builders
        val flow1 = flowOf<Int>(20,25,60,70,80,85)
        listOf("ali","mohammad","reza","ayda").asFlow()

        flow {
            emit("hello")
            delay(1000)
            emit("how are you?")
            delay(1000)
            emit("im fine thank you.")
        }

        // Fold Terminal Operator
        val flow2 = flow {
            emit(30)
            println("Emit 200")
            emit(200)
        }

        val result = flow2.fold(10) { acc , value ->
            println(acc)
            println(value)
            acc + value
        }
        println(result)
    }



}



