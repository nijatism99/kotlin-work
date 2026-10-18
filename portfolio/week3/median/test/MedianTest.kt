// COMP2850 Portfolio: Week 3
// Tests for median()


import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    "Median of a single-element list" {
        median(listOf(5.0f)) shouldBe 5.0f
    }

    "Median of an odd-sized list" {
        median(listOf(1.0f, 3.0f, 5.0f)) shouldBe 3.0f
    }

    "Median of an even-sized list" {
        median(listOf(1.0f, 3.0f, 5.0f, 7.0f)) shouldBe 4.0f
    }

    "Median of an unsorted list" {
        median(listOf(7.0f, 1.0f, 5.0f, 3.0f)) shouldBe 4.0f
    }
})
