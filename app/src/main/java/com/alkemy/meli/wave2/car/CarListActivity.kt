package com.alkemy.meli.wave2.car

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.databinding.ActivityCarListBinding
import com.alkemy.meli.wave2.mock.ItemList
import com.alkemy.meli.wave2.mock.ItemModel

class CarListActivity : AppCompatActivity() {

    private val binding by lazy { ActivityCarListBinding.inflate(layoutInflater) }
    private val adapter by lazy { CarListAdapter(ItemList.getCarList(), dispatcher) }
    private val dispatcher: (ItemModel) -> Unit = { dispatchNext() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        binding.recyclerCar.let {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = adapter
        }
    }

    private fun dispatchNext() {
        startActivity(Intent(this, CarDetailActivity::class.java))
    }
}