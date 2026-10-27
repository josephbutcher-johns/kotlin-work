// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }
    // Write four more tests here

    "When size = 1"{
        median(listOf(1f)) shouldBe 1f
    }

    "When size = 2"{
        median(listOf(2f, 4f)) shouldBe 3f
    }

    "When size = 3"{
        median(listOf(4f, 2f, 6f)) shouldBe 4f
    }

    "When size = 4"{
        median(listOf(2f, 4f, 8f, 6f)) shouldBe 5f
    }
})
