
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.EmptyCoroutineContext


fun main(){




    // lunch in
    val scope = CoroutineScope(EmptyCoroutineContext)
    val flow3 = flow {
        emit(10)
        emit(35)
        emit(140)
    }
    flow3
        .onEach { it -> println(it) }
        .launchIn(scope)

    Thread.sleep(2000)
}






