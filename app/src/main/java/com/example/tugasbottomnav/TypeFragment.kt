package com.example.tugasbottomnav

import android.R
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.tugasbottomnav.databinding.FragmentHomeBinding
import com.example.tugasbottomnav.databinding.FragmentTypeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TypeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class TypeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var _binding: FragmentTypeBinding? = null
    private val binding get() =_binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTypeBinding.inflate(inflater, container, false)
        return binding.root
        // Inflate the layout for this fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val type = arrayOf(
            "First Class Ticket",
            "Business Class Ticket",
            "Economy Class Ticket"
        )

        with(binding){
            val adapterType = ArrayAdapter<String>(this@TypeFragment,
                R.layout.simple_spinner_item, type)
            spinnerType.adapter = adapterType
        }
    }
}