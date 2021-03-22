fun main(){
    val post1 = Post(text = "Post1")
    val post2 = Post(text = "Post2")
    val post3 = Post(id = 2, text = "Post3")
    val post4 = Post(id = 3, text = "Post4")

    WallService.add(post1)
    WallService.add(post2)
    WallService.update(post3)
    WallService.update(post4)

    println(WallService)
}