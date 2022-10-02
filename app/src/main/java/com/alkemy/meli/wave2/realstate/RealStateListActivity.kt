package com.alkemy.meli.wave2.realstate

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.databinding.ActivityRealstateListBinding
import com.alkemy.meli.wave2.mock.ItemList

class RealStateListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRealstateListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRealstateListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerProperty()

    }

    private fun initRecyclerProperty() {
        binding.recyclerProperty.layoutManager = LinearLayoutManager(this)
        binding.recyclerProperty.setHasFixedSize(true)
        binding.recyclerProperty.adapter =
            RealStateListAdapter(ItemList.getPropertyList()) { item ->
                val intent = Intent(this, RealStateDetailActivity::class.java)
                intent.putExtra("key", item.name)
                startActivity(intent)
            }

    }
}
