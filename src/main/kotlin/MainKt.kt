import attachment.*
import media.*

fun main(){
    val post1 = Post(text = "Post1", attachments = arrayOf(DocumentAttachment("document", Document())))
    val post2 = Post(text = "Post2", attachments = arrayOf(PhotoAttachment("photo", Photo())))
    val post3 = Post(id = 2, text = "Post3", attachments = arrayOf(AttachedLinkAttachments("link", AttachedLink())))
    val post4 = Post(id = 3, text = "Post4", attachments = arrayOf(NoteAttachment("note", Note())))
    val post5 = Post(id = 4, text = "Post4", attachments = arrayOf(StickerAttachment("sticker", Sticker())))

    WallService.add(post1)
    WallService.add(post2)
    WallService.update(post3)
    WallService.update(post4)

    println(WallService)
}