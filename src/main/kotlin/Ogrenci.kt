class Ogrenci {
    // Özel bir özellik (property) tanımlama
     var ad: String = ""
        get() {
            println("Ad özelliği çağrıldı.")
            return field
        }
        set(value) {
            println("Ad özelliği güncellendi.")
            field=value
        }

    var yas: Int = 0
        get() {
            println("Yaş özelliği çağrıldı.")
            return field
        }
        set(value) {
            println("Yaş özelliği güncellendi.")
            field = value
        }
}

fun main() {
    val ogrenci = Ogrenci()
    ogrenci.ad = "Ahmet" // Ad özelliği güncellendi.
    println("Öğrenci Adı: ${ogrenci.ad}") // Ad özelliği çağrıldı.

    ogrenci.yas = 20 // Yaş özelliği güncellendi.
    println("Öğrenci Yaşı: ${ogrenci.yas}") // Yaş özelliği çağrıldı.
}
