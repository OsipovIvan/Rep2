package attachment

import media.Note

class NoteAttachment(
    type: String,
    val note: Note
) : AbstractAttachment(type) {
}
