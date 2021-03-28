package attachment

import media.Photo

class PhotoAttachment(
    type: String,
    val photo: Photo
) : AbstractAttachment(type) {
}