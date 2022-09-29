package core.kotlin.backjun

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class Gugudan {
    private fun solution(n : Int): Int {

        for(i in 1 .. 9) println("$n * $i = ${n * i}")

        return n;
    }

    @Test
    fun result () {
        assertThat(solution(2)).isEqualTo(2);
    }
}

