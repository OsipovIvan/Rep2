package media

data class Photo(
    val id: Int = 0,
    val albumId: Int = 0,
    val ownerId: Int = 0,
    val userId: Int = 0,
    val text: String = "",
    val date: Int = 0,
    val sizes: Array<Any>? = null,
    val width: Int = 0,
    val height: Int = 0,
)
