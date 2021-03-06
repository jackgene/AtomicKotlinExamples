// Coroutines/HelloCoroutines.kt
import kotlinx.coroutines.experimental.*

fun main(a: Array<String>) =
    runBlocking<Unit> {
      val coroutine = launch {
        delay(10)
        println("Hello,")
      }
      println("World!")
      coroutine.join()
    }
/* Output:
World!
Hello,
*/
