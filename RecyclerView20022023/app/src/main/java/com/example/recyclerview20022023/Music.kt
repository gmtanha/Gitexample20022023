package com.example.recyclerview20022023

data class Music(
    var image: Int,
    var song: String,
    var singer: String
) {
    companion object{
        fun getMock():MutableList<Music>{
            return mutableListOf(
                Music(R.drawable.you_are_missing_from_mejpg, "You Are Missing From Me", "Trương Đông Lương (Nicholas Teo)"),
                Music(R.drawable.trong_dem_toi, "Trong đêm tối", "HANA, fueled by boba"),
                Music(R.drawable.you_ain_got_my_soul, "You ain't got my soul", "Kimmese"),
                Music(R.drawable.one_night_storyjpg, "นิราศราตรี (One Night Story)", "Dakota"),
                Music(R.drawable.drowningjpg, "Drowning", "Bobby, SOLE"),
                Music(R.drawable.lostjpg, "Lost", "Linkin Park"),
                Music(R.drawable.memoryjpg, "Memory", "Catchellers, MiQ"),
                Music(R.drawable.kho_co_duoc_nguoi, "Khó Có Được Người", "DICKSON"),
                Music(R.drawable.moon_light, "Moonlight", "Kali Uchis"),
                Music(R.drawable.candy_necklace, "Candy Necklace", "Lana Del Rey, Jon Batiste"),
                Music(R.drawable.lights_out, "Light Out", "SunMi, BE'O"),
                Music(R.drawable.would_have, "Wouldn't Have", "Ourealgoat"),
                Music(R.drawable.bong_thien_ly, "Bông Thiên Điểu", "MTV, Hoàng Dũng"),
                Music(R.drawable.lao_kho_tam, "Lao Tâm Khổ Tứ", "Thanh Hưng")
            )
        }
    }
}