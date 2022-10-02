package com.alkemy.meli.wave2.moto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.meli.wave2.databinding.ItemAdapterMotorcycleBinding
import com.alkemy.meli.wave2.mock.ItemModel
import com.squareup.picasso.Picasso

class MotorcycleListAdapter(
    private val data: List<ItemModel>,
    val onSelect: (ItemModel) -> Unit
) : RecyclerView.Adapter<MotorcycleListAdapter.MotorcycleViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MotorcycleViewHolder {
        val motorcycleBinding = ItemAdapterMotorcycleBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MotorcycleViewHolder(motorcycleBinding)
    }

    override fun onBindViewHolder(holder: MotorcycleViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class MotorcycleViewHolder(
        private val binding: ItemAdapterMotorcycleBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(motorcycle: ItemModel) {
            binding.textItemMotorcycleName.text = motorcycle.name
            binding.textItemMotorcyclePrice.text = motorcycle.price
            binding.textItemMotorcycleDescriptionOne.text = motorcycle.descriptionOne
            binding.textItemMotorcycleDescriptionTwo.text = motorcycle.descriptionTwo
            Picasso.get().load(motorcycle.image).into(binding.imageItemMotorcycleImage)
            itemView.setOnClickListener {
                onSelect(motorcycle)
            }
        }
    }
}