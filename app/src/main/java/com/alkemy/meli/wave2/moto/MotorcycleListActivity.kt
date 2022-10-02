package com.alkemy.meli.wave2.moto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.databinding.ActivityMotorcycleListBinding
import com.alkemy.meli.wave2.mock.ItemList

class MotorcycleListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMotorcycleListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMotorcycleListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerMotorcycle()
    }

    private fun initRecyclerMotorcycle() {
        binding.recyclerMotorcycle.layoutManager = LinearLayoutManager(this)
        binding.recyclerMotorcycle.setHasFixedSize(true)
        binding.recyclerMotorcycle.adapter =
            MotorcycleListAdapter(ItemList.getMotorcycleList()) { item ->
                val intent = Intent(this, MotorcycleDetailActivity::class.java)
                intent.putExtra("key", item.name)
                startActivity(intent)
            }
    }
}