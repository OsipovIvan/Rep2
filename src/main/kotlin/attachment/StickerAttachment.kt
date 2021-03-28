package attachment

import media.Sticker

class StickerAttachment(
    type: String,
    val sticker: Sticker
) : AbstractAttachment(type) {
}