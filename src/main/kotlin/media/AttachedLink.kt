package media

data class AttachedLink(
    val url: String = "",
    val title: String = "",
    val caption: String = "",
    val description: String = "",
    val photo: Photo? = null,
    val product: Any? = null,
    val button: Any? = null,
    val previewPage: String = "",
    val previewUrl: String = ""
)