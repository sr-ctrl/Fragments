package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import kotlinx.android.synthetic.main.fragment_first_.*
import kotlinx.android.synthetic.main.fragment_second.*

class Second_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
        btn_sendData.setOnClickListener {
            val result = Bundle()
            val input = et_input.text.toString()
            result.putString("data",input)
            // Use the Kotlin extension in the fragment-ktx artifact
            // setFragmentResult("requestKey", bundleOf("bundleKey" to result))
            setFragmentResult("requestKey",result = result)

    }
    }
}
