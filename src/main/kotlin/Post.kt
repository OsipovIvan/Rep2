import attachment.AbstractAttachment

data class Post(
    var id: Int = -1,
    var ownerId: Int = 0,
    val fromId: Int = 0,
    var createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 1,
    val friendsOnly: Boolean = false,
    val comments: Any? = null,
    val copyright: Any = Any(),
    val likes: Any = Any(),
    val reposts: Any = Any(),
    val views: Any? = null,
    val postType: String = "",
    val postSource: Any? = null,
    val attachments: Array<AbstractAttachment>? = null,
    val geo: Any? = null,
    val signerId: Int = 0,
    val copyHistory: Array<Any>? = null,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Boolean = false,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Any = Any(),
    val postponedId: Int = 0
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Post

        if (id != other.id) return false

        return true
    }

    override fun hashCode(): Int {
        return id
    }
}