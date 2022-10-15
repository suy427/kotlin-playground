import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

fun now() = LocalDateTime.now().truncatedTo(ChronoUnit.MILLIS)
fun log(msg: String) = println("${now()}:${Thread.currentThread()}:$msg")

fun main(args: Array<String>) {
    log("initial")

    GlobalScope.launch {
        repeat(10) {
            delay(1000L)
            log("I'm working in coroutine")
        }
    }

    Thread.sleep(5 * 1000L)
    log("last")
}

fun a(stringEx: String.() -> String) {

}