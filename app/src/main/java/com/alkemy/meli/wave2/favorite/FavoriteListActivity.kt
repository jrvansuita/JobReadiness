package com.alkemy.meli.wave2.favorite

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.databinding.ActivityFavoriteListBinding
import com.alkemy.meli.wave2.mock.ItemList
import com.alkemy.meli.wave2.mock.ItemModel

class FavoriteListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavoriteListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFavoriteListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataSet = ItemList.getFavoriteList()
        initRecyclerView(myDataSet)
    }

    private fun initRecyclerView(list: List<ItemModel>) {
        val recyclerViewFavorite = binding.recyclerFavorite
        recyclerViewFavorite.layoutManager = LinearLayoutManager(this)
        recyclerViewFavorite.adapter = FavoriteListAdapter(list) {
            val intent = Intent(this, FavoriteDetailsActivity::class.java)
            startActivity(intent)
        }
        recyclerViewFavorite.setHasFixedSize(true)
    }
}