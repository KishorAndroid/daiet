package com.appdevelopkar.daiet.reports;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopkar.daiet.R;
import com.appdevelopkar.daiet.databinding.FragmentReportsBinding;

/**
 * Created by kishorandroid on 25/09/17.
 */

public class ReportsFragment extends Fragment {

    private FragmentReportsBinding mBinding;
    private ReportsViewModel mViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new ReportsViewModel();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_reports, container, false);
        mBinding.setVm(mViewModel);
        return mBinding.getRoot();
    }
}