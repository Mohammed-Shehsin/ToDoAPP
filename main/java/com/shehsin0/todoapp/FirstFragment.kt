package com.shehsin0.todoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FirstFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_first, container, false)
        val addbTn = view.findViewById<Button>(R.id.button)
        val txtEdit = view.findViewById<EditText>(R.id.editTextText)
        val secondFragment = SecondFragment()
        addbTn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("text",txtEdit.text.toString())

            secondFragment.arguments = bundle
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.frameLayout, secondFragment)
                    .commit()
            }
            val toast = Toast.makeText(view.context,"ADDED", Toast.LENGTH_LONG)
            toast.show()

        }

        return view
    }


}