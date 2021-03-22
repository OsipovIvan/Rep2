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

        WallService.add(Post(text = "TestPost1"))
        WallService.add(Post(text = "TestPost2"))
        WallService.add(Post(text = "TestPost3"))

        val update = Post(id = 3)
        val result = WallService.update(update)
        assertTrue(result)
    }

    @Test
    fun updateNotExisting() {

        WallService.add(Post(text = "TestPost1"))
        WallService.add(Post(text = "TestPost2"))
        WallService.add(Post(text = "TestPost3"))

        val update = Post(id = 7)
        val result = WallService.update(update)
        assertFalse(result)
    }
}