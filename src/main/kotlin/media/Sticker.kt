package media

data class Sticker(
    val productId: Int = 0,
    val stickerId: Int = 0,
    val images: Array<Any>? = null,
    val imagesWithBackground: Array<Any>? = null,
    val animationUrl: String = "",
    val isAllowed: Boolean = false
)