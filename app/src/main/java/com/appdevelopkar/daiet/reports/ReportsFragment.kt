package com.appdevelopkar.daiet.reports

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.appdevelopkar.daiet.R
import com.appdevelopkar.daiet.databinding.FragmentReportsBinding

/**
 * Created by kishorandroid on 25/09/17.
 */

class ReportsFragment : Fragment() {

    private var mBinding: FragmentReportsBinding? = null
    private var mViewModel: ReportsViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ReportsViewModel()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mBinding = DataBindingUtil.inflate(inflater!!, R.layout.fragment_reports, container, false)
        mBinding!!.vm = mViewModel
        return mBinding!!.root
    }
}