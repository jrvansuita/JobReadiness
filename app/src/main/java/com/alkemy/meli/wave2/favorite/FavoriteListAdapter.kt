package com.alkemy.meli.wave2.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.meli.wave2.databinding.ItemAdapterFavoriteBinding
import com.alkemy.meli.wave2.mock.ItemModel
import com.squareup.picasso.Picasso


class FavoriteListAdapter(
    private val favoriteList: List<ItemModel>,
    val favoriteSelected: (ItemModel) -> Unit
) : RecyclerView.Adapter<FavoriteListAdapter.FavoriteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val favoriteBinding = ItemAdapterFavoriteBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return FavoriteViewHolder(favoriteBinding)
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        holder.bind(favoriteList[position])
    }

    override fun getItemCount(): Int = favoriteList.size

    inner class FavoriteViewHolder(
        private val favoriteBinding: ItemAdapterFavoriteBinding
    ) : RecyclerView.ViewHolder(favoriteBinding.root) {

        fun bind(favorite: ItemModel) {
            favoriteBinding.textItemFavoriteTitle.text = favorite.name
            favoriteBinding.textItemFavoritePrice.text = favorite.price
            favoriteBinding.textItemFavoriteDescription.text = favorite.descriptionOne
            favoriteBinding.textItemFavoriteLocal.text = favorite.descriptionTwo
            Picasso.get().load(favorite.image)
                .into(favoriteBinding.imagePicture)
            itemView.setOnClickListener {
                favoriteSelected(favorite)
            }
        }
    }
}