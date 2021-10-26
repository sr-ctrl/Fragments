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

class First_Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first_, container, false)
        parentFragmentManager.setFragmentResultListener("DataKey",this) { requestKey, bundle ->
            val result = bundle.getString("data")
            tv_reciever.text = result
        }
        parentFragmentManager.setFragmentResultListener("Request_Key",this){ requestKey,bundle ->
            val result_text = bundle.getString("retriveKey")
            tv_dialog_recieve.text = result_text
        }
        return view
    }
    }
