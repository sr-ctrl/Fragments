package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import kotlinx.android.synthetic.main.fragment_dialog.*

class Dialog_Fragment : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view = inflater.inflate(R.layout.fragment_dialog, container, false)

        val button = view.findViewById<Button>(R.id.btn_send_data_frag1)
        button.setOnClickListener {
            val bundle = Bundle()
            val input_text = et_dialog.text.toString()
            bundle.putString("retriveKey",input_text)
            parentFragmentManager.setFragmentResult("Request_Key",bundle)
        }
        return view
    }
}