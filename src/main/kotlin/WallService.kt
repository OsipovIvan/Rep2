object WallService{
    private var posts = mutableListOf<Post>()
    private var id = 0

    fun add(post: Post): Post {
        post.id = ++id
        posts.add(post)
        return post
    }

    fun update(post: Post): Boolean {

        val postForUpdate = posts.find {postInList -> postInList.id == post.id  }
        if (postForUpdate != null){
            post.ownerId = postForUpdate.replyOwnerId
            post.createdBy = postForUpdate.createdBy
            posts.replaceAll {postInList -> if (postInList == post) post else postInList}
            return true
        }

        return false
    }

    override fun toString(): String {
        return posts.toString()
    }
}