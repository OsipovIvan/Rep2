package media

data class Document(
    val id: Int = 0,
    val ownerId: Int = 0,
    val title: String = "",
    val size: Int = 0,
    val ext: String = "",
    val url: String = "",
    val date: Int = 0,
    val type: Int = 0,
    val preview: Any? = null
)
