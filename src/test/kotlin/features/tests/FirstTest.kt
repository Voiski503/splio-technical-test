package features.tests

import org.apache.logging.log4j.LogManager
import org.junit.After
import org.junit.Before
import org.junit.Test


open class FirstTest {

    private val LOGGER = LogManager.getLogger(FirstTest::class)

    @Before
    fun initTest() {
        LOGGER.info("Starting the test")
    }
    @Test
    fun performTest() {
    }

    @After
    fun cleanup() {
        LOGGER.info("Test is done")
    }
}

