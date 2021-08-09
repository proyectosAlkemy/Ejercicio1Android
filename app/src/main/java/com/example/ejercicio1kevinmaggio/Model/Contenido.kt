package com.example.ejercicio1kevinmaggio.Model

data class Contenido(val imagen:String){
companion object {
    private val listaContenido = mutableListOf<String>(
        "https://i.ibb.co/LDKhBhT/League-of-Legends-Warriors-Gold-Gangplank-520167-1280x700.jpg",
        "https://i.ibb.co/BNYm738/maxresdefault.jpg",
        "https://i.ibb.co/MD0GtrL/thumb-1920-681587.png",
        "https://i.ibb.co/vskczM2/lol-league-of-legends-arcade-hecarim-hecarim-hd-wallpaper-preview.jpg",
        "https://i.ibb.co/r6q3tL0/thumb-1920-682621.jpg",
        "https://i.ibb.co/s6m8Jjy/video-game-league-of-legends-annie-league-of-legends-poro-league-of-legends-teemo-league-of-legends.jpg",
        "https://i.ibb.co/mqZLmbn/thumb-1920-529362.jpg",
        "https://i.ibb.co/7SHGgCT/450-1000.jpg",
        "https://i.ibb.co/809K0mk/dragonslayer-diana-league-of-legends-olaf-fire-dragon-hd-wallpaper-preview.jpg",
        "https://i.ibb.co/gR2hX9p/riven-league-of-legends-riven-spirit-blossom-league-of-legends-purple-background-hd-wallpaper-previe.jpg",
        "https://i.ibb.co/xMBvr2M/spirit-blossom-thresh-league-of-legends-thresh-league-of-legends-riot-games-hd-wallpaper-preview.jpg",
        "https://i.ibb.co/C13qMML/1366-521.jpg"
    )

    fun devulverLista(): MutableList<String> {
        return listaContenido
    }

    fun setList(imagen: String) {
        listaContenido.add(imagen)
    }
}
}