
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main(): Unit = runBlocking {

    launch {
        factorial(30).collect {

        }
        // Builders
        val flow1 = flowOf<Int>(20,25,60,70,80,85).collect {  }
        listOf("ali","mohammad","reza","ayda").asFlow().collect {  }

        flow {
         emit("hello")
            delay(1000)
            emit("how are you?")
            delay(1000)
            emit("im fine thank you.")
        }.collect {
            println(it)
        }
    }



}



