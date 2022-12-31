package com.abjt.recyclerviewdemo.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.abjt.recyclerviewdemo.databinding.ItemWallpaperBinding
import com.abjt.recyclerviewdemo.home.model.AnimeWallpaper
import com.bumptech.glide.Glide

class AnimeWallpaperAdapter : RecyclerView.Adapter<AnimeWallpaperAdapter.ItemAnimeWallpaperViewHolder>() {

    private var dataset: MutableList<AnimeWallpaper> = mutableListOf()

    var onItemClick: ((item: AnimeWallpaper) -> Unit)? = null

    fun updateDataset(dataset: List<AnimeWallpaper>) {
        this.dataset = (dataset as MutableList<AnimeWallpaper>)
        notifyItemRangeChanged(0, itemCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAnimeWallpaperViewHolder =
        ItemAnimeWallpaperViewHolder(ItemWallpaperBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: ItemAnimeWallpaperViewHolder, position: Int) {
        holder.bind(dataset[position])
    }

    override fun getItemCount(): Int = dataset.size

    inner class ItemAnimeWallpaperViewHolder(private val viewBinding: ItemWallpaperBinding) : RecyclerView.ViewHolder(viewBinding.root) {

        init {
            viewBinding.root.setOnClickListener {
                onItemClick?.invoke(dataset[adapterPosition])
            }
        }

        fun bind(item: AnimeWallpaper) {
            Glide.with(itemView.context)
                .load(item.link)
                .into(viewBinding.rivItemWallpaper)
        }
    }
}