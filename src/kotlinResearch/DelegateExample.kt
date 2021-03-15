package kotlinResearch

import java.util.*
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "run get value"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("run set new value")
    }
}

class TrimDelegate : ReadWriteProperty<Any?, String> {

    private var trimmedValue: String = ""

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        trimmedValue = value.trim()
    }

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return trimmedValue
    }
}

fun main(args: Array<String>) {
    val example = Example()
    println(example.p)
    example.p = "new value"

    val delegate = TrimDelegate()
}