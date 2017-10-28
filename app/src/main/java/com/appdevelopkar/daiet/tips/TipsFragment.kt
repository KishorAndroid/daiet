package com.appdevelopkar.daiet.tips

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.appdevelopkar.daiet.R
import com.appdevelopkar.daiet.databinding.FragmentTipsBinding

/**
 * Created by kishorandroid on 24/09/17.
 */

class TipsFragment : Fragment() {

    private var mBinding: FragmentTipsBinding? = null
    private var mViewModel: TipsViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = TipsViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater!!, R.layout.fragment_tips, container, false)
        mBinding!!.vm = mViewModel
        return mBinding!!.root
    }
}
