package com.appdevelopkar.daiet.home

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appdevelopkar.daiet.R
import com.appdevelopkar.daiet.databinding.FragmentHomeBinding

/**
 * Created by kishorandroid on 24/09/17.
 */

class HomeFragment : Fragment() {

    private lateinit var mBinding: FragmentHomeBinding
    private lateinit var mVieModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mVieModel = HomeViewModel(fragmentManager)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater!!, R.layout.fragment_home, container, false)
        mBinding.vm = mVieModel
        return mBinding.root
    }
}