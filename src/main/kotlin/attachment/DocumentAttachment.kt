package attachment

import media.Document

class DocumentAttachment(
    type: String,
    val document: Document
) : AbstractAttachment(type) {
}