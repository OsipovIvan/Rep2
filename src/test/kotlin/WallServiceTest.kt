import exception.PostNotFoundException
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val addPost = WallService.add(Post())
        assertNotEquals(0, addPost.id)
    }

    @Test
    fun updateExisting() {

        WallService.clearPosts()
        WallService.add(Post(text = "TestPost1"))
        WallService.add(Post(text = "TestPost2"))
        WallService.add(Post(text = "TestPost3"))

        val update = Post(id = 3)
        val result = WallService.update(update)

        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {

        WallService.clearPosts()
        WallService.add(Post(text = "TestPost1"))
        WallService.add(Post(text = "TestPost2"))
        WallService.add(Post(text = "TestPost3"))

        val update = Post(id = 70)
        val result = WallService.update(update)

        assertFalse(result)
    }

    @Test(expected = PostNotFoundException::class)
    fun createCommentShouldThrow() {
        val comment = Comment(postId = 10, message = "Комент1")

        WallService.clearPosts()
        WallService.add(Post(text = "TestPost1"))
        WallService.createComment(comment)
    }

    @Test
    fun createCommentAddComment(){
        val comment = Comment(postId = 1, message = "Комент1")

        WallService.clearPosts()
        WallService.add(Post(text = "TestPost1"))
        WallService.createComment(comment)
    }
}