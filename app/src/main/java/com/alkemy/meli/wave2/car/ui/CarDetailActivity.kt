package com.alkemy.meli.wave2.car.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.alkemy.meli.wave2.R
import com.alkemy.meli.wave2.car.ui.viewmodel.CarDetailViewModel
import com.alkemy.meli.wave2.databinding.ActivityCarDetailBinding
import com.squareup.picasso.Picasso

class CarDetailActivity : AppCompatActivity() {

	private val binding by lazy { ActivityCarDetailBinding.inflate(layoutInflater) }
	private val viewModel by viewModels<CarDetailViewModel>()

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)

		setListeners()
		setViewModelObservables()
		startScope()
	}

	private fun startScope() {
		val carID = intent.getIntExtra("ID", -1)
		viewModel.findCar(carID)
	}

	private fun setListeners() {
		binding.buttonQuestion.setOnClickListener {
			viewModel.checkEditTextValue(binding.askTextField.text.toString())
		}
	}

	private fun setViewModelObservables() {
		viewModel.ask.observe(this) {
			when (it) {
				is CarDetailViewModel.Result.Success -> {
					//Mandar pro proximo passo
				}
				is CarDetailViewModel.Result.Error -> {
					binding.askTextField.error = getString(
						when (it.type) {
							CarDetailViewModel.ErrorTypes.Empty -> R.string.empty_question_error
							CarDetailViewModel.ErrorTypes.Email -> R.string.email_on_question_error
							CarDetailViewModel.ErrorTypes.Phone -> R.string.phone_on_question_error
						}
					)
				}
			}
		}

		viewModel.car.observe(this) {
			it?.let {
				Picasso.get().load(it.image).into(binding.imageProduct)
				binding.textTitle.text = it.name
				binding.priceText.text = it.price
			}

		}
	}


}