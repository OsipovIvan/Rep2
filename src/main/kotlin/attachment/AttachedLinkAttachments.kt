package attachment

import media.AttachedLink

class AttachedLinkAttachments(
    type: String,
    val attachmentLink: AttachedLink
) : AbstractAttachment(type) {
}