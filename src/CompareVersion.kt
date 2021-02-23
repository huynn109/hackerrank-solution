internal object GFG {
    // Method to compare two versions.
    // Returns 1 if v2 is
    // smaller, -1 if v1 is smaller, 0 if equal
    fun versionCompare(v1: String, v2: String): Int {
        // vnum stores each numeric part of version 
        var vnum1 = 0
        var vnum2 = 0

        // loop untill both String are processed 
        var i = 0
        var j = 0
        while (i < v1.length
            || j < v2.length
        ) {

            // Storing numeric part of 
            // version 1 in vnum1 
            while (i < v1.length
                && v1[i] != '.'
            ) {
                vnum1 = (vnum1 * 10
                        + (v1[i] - '0'))
                i++
            }

            // storing numeric part 
            // of version 2 in vnum2 
            while (j < v2.length
                && v2[j] != '.'
            ) {
                vnum2 = (vnum2 * 10
                        + (v2[j] - '0'))
                j++
            }
            if (vnum1 > vnum2) return 1
            if (vnum2 > vnum1) return -1

            // if equal, reset variables and 
            // go for next numeric part 
            vnum2 = 0
            vnum1 = vnum2
            i++
            j++
        }
        return 0
    }

    fun multiply(x: Double, y: Double): Double = x * y

    // Driver method to check above
    // comparison function
    @JvmStatic
    fun main(args: Array<String>) {
        val version1 = "1.19.19"
        val version2 = "1.20.0"
        if (versionCompare(version1, version2) < 0) println("$version1 is smaller") else if (versionCompare(
                version1,
                version2
            ) > 0
        ) println(
            "$version2 is smaller"
        ) else println("Both version are equal")
    }
}