package example

val testVal = 10

fun test() = Test(testVal.toString())

data class Test(val r: String)