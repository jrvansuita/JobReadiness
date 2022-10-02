package com.alkemy.meli.wave2.realstate

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.meli.wave2.databinding.ItemAdapterRealstateBinding
import com.alkemy.meli.wave2.mock.ItemModel
import com.squareup.picasso.Picasso

class RealStateListAdapter(
    private val data: List<ItemModel>,
    val onSelect: (ItemModel) -> Unit
) : RecyclerView.Adapter<RealStateListAdapter.PropertyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertyViewHolder {
        val propertyBinding = ItemAdapterRealstateBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PropertyViewHolder(propertyBinding)
    }

    override fun onBindViewHolder(holder: PropertyViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class PropertyViewHolder(
        private val binding: ItemAdapterRealstateBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(property: ItemModel) {
            binding.textItemPropertyName.text = property.name
            binding.textItemPropertyPrice.text = property.price
            binding.textItemPropertyDescriptionOne.text = property.descriptionOne
            binding.textItemPropertyDescriptionTwo.text = property.descriptionTwo
            Picasso.get().load(property.image).into(binding.imageItemPropertyImage)
            itemView.setOnClickListener {
                onSelect(property)
            }
        }
    }
}