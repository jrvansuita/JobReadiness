package com.alkemy.meli.wave2.truck

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alkemy.meli.wave2.databinding.ItemAdapterTruckBinding
import com.alkemy.meli.wave2.mock.ItemModel
import com.squareup.picasso.Picasso

class TruckListAdapter(
    private val data: List<ItemModel>,
    val onSelect: (ItemModel) -> Unit
) : RecyclerView.Adapter<TruckListAdapter.ViewHolder>() {

    inner class ViewHolder(
        private val binding: ItemAdapterTruckBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(truck: ItemModel) {
            binding.textItemTruckName.text = truck.name
            binding.textItemTruckPrice.text = truck.price
            Picasso.get().load(truck.image).into(binding.imageItemTruckImage)
            binding.textItemTruckDescriptionOne.text = truck.descriptionOne
            binding.textItemTruckDescriptionTwo.text = truck.descriptionTwo

            binding.root.setOnClickListener {
                onSelect(truck)
            }
        }
    }

    // Layout creation. It is called for each item in the RecyclerView
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val truckBinding = ItemAdapterTruckBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(truckBinding)
    }

    // Make the connection, assigning the values to the Layout
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val truck = data[position]
        holder.bind(truck)
    }

    // Returns the size of the dataset to perform the necessary memory allocation.
    override fun getItemCount(): Int {
        return data.size
    }

}