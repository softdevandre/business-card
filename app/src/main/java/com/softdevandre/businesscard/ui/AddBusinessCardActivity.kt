package com.softdevandre.businesscard.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.softdevandre.businesscard.databinding.ActivityAddBusinessCardBinding

class AddBusinessCardActivity : AppCompatActivity() {

    private val binding by lazy { ActivityAddBusinessCardBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.btnClose.setOnClickListener {
            finish()
        }
        binding.btnConfirm.setOnClickListener {

        }

    }
}