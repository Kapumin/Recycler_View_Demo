package com.abjt.recyclerviewdemo.home.activity

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.abjt.recyclerviewdemo.databinding.ActivityHomeBinding
import com.abjt.recyclerviewdemo.home.adapter.AnimeWallpaperAdapter
import com.abjt.recyclerviewdemo.home.model.AnimeWallpaper
import com.abjt.recyclerviewdemo.utils.AnimeWallpaperGenerator

class HomeActivity : AppCompatActivity() {

    private val viewBinding: ActivityHomeBinding by lazy(LazyThreadSafetyMode.NONE) {
        ActivityHomeBinding.inflate(layoutInflater)
    }

    private lateinit var animeWallpaperAdapter: AnimeWallpaperAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
        initialiseAdapter()
        setupViews()
        updateDataset()

    }

    private fun initialiseAdapter() {
        animeWallpaperAdapter = AnimeWallpaperAdapter()
        animeWallpaperAdapter.onItemClick = { animeWallpaper: AnimeWallpaper ->
            Toast.makeText(this, animeWallpaper.name, Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupViews() {
        viewBinding.rvWallpaper.adapter = animeWallpaperAdapter
    }

    private fun updateDataset() {
        val dataset = AnimeWallpaperGenerator.getAnimeWallpapers()
        dataset.forEach { animeWallpaper ->
            Log.d("Anime_Wallpaper => ", "name = ${animeWallpaper.name} | link = ${animeWallpaper.link}")

        }
        animeWallpaperAdapter.updateDataset(dataset)
    }
}
