class Day2_Part1 {

    companion object {

        // 2 main methods in same package forces me to wrap it into a class and JvmStatic annotation.
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                java.io.File("src/main/kotlin/Day2_Part1_Data.txt").absoluteFile.readLines()
                //"abcdef\nbababc\nabbcde\nabcccd\naabcdd\nabcdee\nababab".lines()
                    .map { it ->
                        val map = HashMap<Char, Int>()
                        it.forEach {
                            map[it] = 1 + map.computeIfAbsent(it) { 0 }
                        }
                        map
                    }
                    .map {
                        HashSet(it.values)
                    }
                    .map {
                        it.remove(1)
                        it
                    }.map { it ->
                        val map = HashMap<Int, Int>()
                        it.forEach {
                            map[it] = 1
                        }
                        map
                    }
                    .reduce { a, b ->
                        val result = HashMap<Int, Int>(a)
                        b.forEach {
                            result[it.key] = it.value + result.computeIfAbsent(it.key) { 0 }
                        }
                        result
                    }
                    .values.reduce { a, b -> a * b }
            )
        }
    }
}

