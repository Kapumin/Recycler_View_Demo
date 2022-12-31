package com.abjt.recyclerviewdemo.utils

import com.abjt.recyclerviewdemo.home.model.AnimeWallpaper

sealed class AnimeWallpaperGenerator {

    companion object {

        private val wallpapers: List<AnimeWallpaper> = listOf(
            AnimeWallpaper("Dragon Ball Group Photo", "https://images7.alphacoders.com/611/611138.png"),
            AnimeWallpaper("Obito And Madara", "https://images.alphacoders.com/598/598846.jpg"),
            AnimeWallpaper("Naruto", "https://images5.alphacoders.com/532/532559.jpg"),
            AnimeWallpaper("Kimi no Nawa", "https://images7.alphacoders.com/737/737400.jpg"),
            AnimeWallpaper("Pokemon", "https://images3.alphacoders.com/733/733114.png"),
            AnimeWallpaper("Tokisaki Kurumi", "https://images8.alphacoders.com/820/820043.jpg"),
            AnimeWallpaper("Charlotte", "https://images.alphacoders.com/648/648557.jpg"),
            AnimeWallpaper("Alucard", "https://images4.alphacoders.com/165/165424.jpg"),
            AnimeWallpaper("Anime girl with umbrella", "https://images4.alphacoders.com/976/976013.jpg"),
            AnimeWallpaper("Itachi And Kakashi", "https://c4.wallpaperflare.com/wallpaper/287/515/612/naruto-itachi-uchiha-kakashi-hatake-hd-wallpaper-preview.jpg"),
            AnimeWallpaper("Uchiha Itachi", "https://c4.wallpaperflare.com/wallpaper/116/412/889/naruto-anime-uchiha-itachi-hd-wallpaper-preview.jpg")
        )

        fun getAnimeWallpapers(): List<AnimeWallpaper> = mutableListOf<AnimeWallpaper>().apply {
            addAll(wallpapers)
        }
    }
}