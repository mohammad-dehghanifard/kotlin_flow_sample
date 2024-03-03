import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun factorial(number : Int) : Flow<Int> = flow {
    var result = 1
    for (i in 1..number ) {
        delay(1000)
        result *= i
        emit(result)
    }
}