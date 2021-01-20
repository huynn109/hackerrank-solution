import java.util.*

// Complete the checkMagazine function below.
fun checkMagazine(magazine: Array<String>, note: Array<String>): Unit {
    val magazineMap = mutableMapOf<String, Int>()
    val noteMap = mutableMapOf<String, Int>()
    magazine.forEachIndexed { _, s ->
        if (magazineMap.containsKey(s))
            magazineMap[s] = (magazineMap[s] ?: 0) + 1
        else magazineMap[s] = 1
    }
    note.forEachIndexed { _, s ->
        if (noteMap.containsKey(s))
            noteMap[s] = (noteMap[s] ?: 0) + 1
        else noteMap[s] = 1
    }
    var flag = true
    for (i in note.indices){
        if (magazineMap.contains(note[i]).not()) {
            flag = false
            break
        } else {
            flag = (noteMap[note[i]] ?: 0) <= (magazineMap[note[i]] ?: 0)
            if (flag.not()) {
                break
            }
        }
    }
    if (flag) println("Yes") else println("No")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val mn = scan.nextLine().split(" ")

    val m = mn[0].trim().toInt()

    val n = mn[1].trim().toInt()

    val magazine = scan.nextLine().split(" ").toTypedArray()

    val note = scan.nextLine().split(" ").toTypedArray()

    checkMagazine(magazine, note)
}