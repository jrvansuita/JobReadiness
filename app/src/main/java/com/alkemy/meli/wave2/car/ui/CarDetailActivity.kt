package com.alkemy.meli.wave2.car.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.alkemy.meli.wave2.databinding.ActivityCarDetailBinding

class CarDetailActivity : AppCompatActivity() {

    private val binding by lazy { ActivityCarDetailBinding.inflate(layoutInflater) }
    private val viewModel by viewModels<CarDetailViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setListeners()
        setViewModelObservables()
    }

    private fun setListeners() {
        binding.editText.addTextChangedListener { edit ->
            viewModel.checkEditTextValue(edit.toString())
        }

        //Or

        binding.button.setOnClickListener {
            viewModel.checkEditTextValue(binding.editText.text.toString())
        }
    }

    private fun setViewModelObservables() {
        viewModel.result.observe(this) {
            when (it) {
                is CarDetailViewModel.Result.Success -> {
                    //Mandar pro proximo passo
                }
                is CarDetailViewModel.Result.Error -> {
                    binding.editText.error = it.msg
                }
            }
        }
    }


}