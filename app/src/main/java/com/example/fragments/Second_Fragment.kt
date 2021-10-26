package com.example.fragments

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
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
        val view =  inflater.inflate(R.layout.fragment_second, container, false)
        val button = view!!.findViewById<Button>(R.id.btn_sendData)
        button.setOnClickListener {
            val result = Bundle()
            val input = et_input.text.toString()
            result.putString("data",input)
            parentFragmentManager.setFragmentResult("DataKey", result)
    }
        return view
    }
}
