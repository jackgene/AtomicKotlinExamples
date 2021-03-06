// Varargs/TwoFunctionsWithVarargs.kt
import atomictest.eq

fun first(vararg numbers: Int) {
  for (i in numbers) {
    print("[$i]")
  }
}

fun second(vararg numbers: Int) =
  first(*numbers)

fun main(args: Array<String>) {
  second(7, 9, 32)
}
/* Output:
[7][9][32]
*/
