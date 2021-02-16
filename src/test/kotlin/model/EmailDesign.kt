package model

import org.apache.logging.log4j.LogManager
import org.jsoup.nodes.Document

private val LOGGER = LogManager.getLogger(EmailDesign::class)

class EmailDesign(val subject: String, val from: String, var content: Document, val id: String,
                  var category: String = "", var opCode: String = "") {


    fun isEqual(expectedEmailDesign: EmailDesign): Boolean {
        // Code here
        return true
    }
}
