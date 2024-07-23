package com.example.coursera

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


class loginpage : Fragment() {
    fun fragmentloader(K:Fragment,f:Int){
        val fm: FragmentManager = (activity as AppCompatActivity).supportFragmentManager
        val ft: FragmentTransaction =fm.beginTransaction()
        if(f==0)ft.add(R.id.container,K)
        else ft.replace(R.id.container,K)
        ft.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View= inflater.inflate(R.layout.fragment_loginpage, container, false)

        return  view

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn=view.findViewById<Button>(R.id.emailloginbtn)
        btn.setOnClickListener{view->
            Snackbar.make(view,"Enter valid Email id",Snackbar.LENGTH_LONG)
                .setAction("Actionbutton",null)
                .setAnchorView(R.id.emailloginbtn).show()
            fragmentloader(emailLoginfragment,1)

        }


    }


}