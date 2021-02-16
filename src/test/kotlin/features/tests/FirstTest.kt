package features.tests

import model.EmailDesign
import org.apache.logging.log4j.LogManager
import org.jsoup.Jsoup
import org.junit.After
import org.junit.Before
import org.junit.Test


open class FirstTest {

    private val LOGGER = LogManager.getLogger(FirstTest::class)
    private fun getResourceFileContent(path: String): String = object {}.javaClass.getResource(path).readText()
    private val htmlExamplePath = "/htmlExample.html"

    @Before
    fun initTest() {
        LOGGER.info("Starting the test")
    }

    @Test
    fun performTest() {
        // Test here
        val exampleDesign = EmailDesign("subject", "postmaster@splio.com", Jsoup.parse(getResourceFileContent(htmlExamplePath)), "1", "BestCategory")
    }

    @After
    fun cleanup() {
        LOGGER.info("Test is done")
    }
}

