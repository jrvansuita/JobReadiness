package com.alkemy.meli.wave2.truck

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.databinding.ActivityTruckListBinding
import com.alkemy.meli.wave2.mock.ItemList
import com.alkemy.meli.wave2.mock.ItemModel

class TruckListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTruckListBinding

    // Setting layout data with Trucks category
    private val truckList = ItemList.getTruckList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTruckListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Informing the Model data to initialize the RecyclerView
        initRecyclerView(truckList)
    }

    private fun initRecyclerView(list: List<ItemModel>) {

        val recyclerViewTruck = binding.recyclerTruck
        // ViewGroup layout (RecyclerView)
        recyclerViewTruck.layoutManager = LinearLayoutManager(this)

        // Adapter -- makes the connection between the Layout and the listing items
        recyclerViewTruck.adapter = TruckListAdapter(list) {
            // Navigation to the details page
            val intent = Intent(this, TruckDetailsActivity::class.java)
            startActivity(intent)
        }

        // It will allow RecyclerView to avoid invalidating the whole layout when its adapter contents change.
        recyclerViewTruck.setHasFixedSize(true)
    }
}