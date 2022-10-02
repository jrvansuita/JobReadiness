package com.alkemy.meli.wave2.car

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.meli.wave2.databinding.ItemAdapterCarBinding
import com.alkemy.meli.wave2.mock.ItemModel
import com.squareup.picasso.Picasso

class CarListAdapter(
    private val data: List<ItemModel>,
    val onSelect: (ItemModel) -> Unit
) : RecyclerView.Adapter<CarListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemAdapterCarBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class ViewHolder(
        private val binding: ItemAdapterCarBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(car: ItemModel) {
            binding.textItemCarName.text = car.name
            binding.textItemCarPrice.text = car.price
            binding.textItemCarDescriptionOne.text = car.descriptionOne
            binding.textItemCarDescriptionTwo.text = car.descriptionTwo

            Picasso.get().load(car.image).into(binding.imageItemCarImage)

            itemView.setOnClickListener {
                onSelect(car)
            }
        }
    }
}
