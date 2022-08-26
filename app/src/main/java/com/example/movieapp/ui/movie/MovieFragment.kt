package com.example.movieapp.ui.movie

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import com.example.movieapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MovieFragment : Fragment() {
    lateinit var binding:MovieFragmentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //need init.this line of code
       // binding=MovieFragmentBinding.inflate(inflater, container, false)
        // return binding.root
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }


}

annotation class MovieFragmentBinding
