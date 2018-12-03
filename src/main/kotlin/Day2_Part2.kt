class Day2_Part2 {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val lines =
                java.io.File("src/main/kotlin/Day2_Part1_Data.txt").absoluteFile.readLines()
            //    "abcde\nfghij\nklmno\npqrst\nfguij\naxcye\nwvxyz".lines()
            println(find(list = lines))
        }

        private tailrec fun find(line: String = "", list: List<String>): String {
            return list.map {
                removeMismatchingChars(line, it)
            }.find { reduced -> reduced.length == line.length - 1 } ?: find(list[0], list.subList(1, list.size))
        }

        private fun removeMismatchingChars(a: String, b: String): String {
            val buf = StringBuilder(a.length)
            (0 until a.length).forEach { index -> if (a[index] == b[index]) buf.append(a[index]) }
            return buf.toString()
        }
    }
}

