import exception.PostNotFoundException

object WallService{
    private val posts = mutableListOf<Post>()
    private val comments = mutableListOf<Comment>()
    private var id = 0

    fun add(post: Post): Post {
        post.id = ++id
        posts.add(post)
        return post
    }

    fun update(post: Post): Boolean {

        val postForUpdate = findPost(post.id)
        if (postForUpdate != null){
            post.ownerId = postForUpdate.replyOwnerId
            post.createdBy = postForUpdate.createdBy
            posts.replaceAll {postInList -> if (postInList == post) post else postInList}
            return true
        }

        return false
    }

    fun createComment(comment: Comment) {
        val postId = comment.postId
        if (findPost(postId) != null) {
            comments.add(comment)
        } else{
            throw PostNotFoundException("Поста к этоме коменту нет")
        }
    }

    fun findPost(postId: Int): Post? {
        return posts.find { postInList -> postInList.id == postId }
    }

    override fun toString(): String {
        return posts.toString()
    }
}