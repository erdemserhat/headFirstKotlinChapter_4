/**
 * @param title The title of the song
 * @param artist: the author of the song
 * @param size : how many MB song is.
 */
 class Song(private val title:String, val artist:String, val size:Int) {
    fun play(){
        println("$title is playing by $artist")

    }



    }