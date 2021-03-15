internal class SampleDemo(private val threadName: String) : Runnable {
    private var t: Thread? = null
    override fun run() {
        while (true) print(threadName)
    }

    fun start() {
        if (t == null) {
            t = Thread(this, threadName)
            t!!.start()
        }
    }
}

object TestThread {
    @JvmStatic
    fun main(args: Array<String>) {
        val A = SampleDemo("A")
        val B = SampleDemo("B")
        B.start()
        A.start()
    }
}