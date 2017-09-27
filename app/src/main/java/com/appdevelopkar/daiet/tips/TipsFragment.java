package com.appdevelopkar.daiet.tips;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopkar.daiet.R;
import com.appdevelopkar.daiet.databinding.FragmentTipsBinding;

/**
 * Created by kishorandroid on 24/09/17.
 */

public class TipsFragment extends Fragment {

    private FragmentTipsBinding mBinding;
    private TipsViewModel mViewModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = new TipsViewModel();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_tips, container, false);
        mBinding.setVm(mViewModel);
        return mBinding.getRoot();
    }
}
