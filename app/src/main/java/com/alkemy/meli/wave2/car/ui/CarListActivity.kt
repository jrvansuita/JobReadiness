package com.alkemy.meli.wave2.car.ui

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alkemy.meli.wave2.car.adapter.CarListAdapter
import com.alkemy.meli.wave2.car.viewmodel.CarListViewModel
import com.alkemy.meli.wave2.databinding.ActivityCarListBinding

class CarListActivity : AppCompatActivity() {

    private val binding by lazy { ActivityCarListBinding.inflate(layoutInflater) }


    private val viewModel by viewModels<CarListViewModel>()

//    private val viewModel: CarListViewModel by viewModels {
//        CarListViewModelFactory(
//            FindAllCarsUseCase(
//                CarRepositoryImpl(
//                    CarLocalDataSource()
//                )
//            )
//        )
//    }

    private lateinit var adapter: CarListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setupViewModel()
        startScope()
    }

    private fun startScope() {
        viewModel.load()
    }

    private fun setupViewModel() {
        viewModel.list.observe(this) {
            adapter = CarListAdapter(it) {
                dispatchNext()
            }

            setupRecyclerView()
        }
    }

    private fun setupRecyclerView() {
        binding.recyclerCar.let {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = adapter
        }
    }

    private fun dispatchNext() {
        startActivity(Intent(this, CarDetailActivity::class.java))
    }
}