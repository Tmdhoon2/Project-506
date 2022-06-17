package com.tmdhoon.new506project

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ToiletFragment : Fragment(){

    companion object{
        fun newInstance() : ToiletFragment{
            return ToiletFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_toilet, container, false)
        return view
    }
}