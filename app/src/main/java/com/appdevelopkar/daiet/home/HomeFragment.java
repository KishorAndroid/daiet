package com.appdevelopkar.daiet.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appdevelopkar.daiet.R;
import com.appdevelopkar.daiet.databinding.FragmentHomeBinding;

/**
 * Created by kishorandroid on 24/09/17.
 */

public class HomeFragment extends Fragment {

    private FragmentHomeBinding mBinding;
    private HomeViewModel mVieModel;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mVieModel = new HomeViewModel();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        mBinding.setVm(mVieModel);
        return mBinding.getRoot();
    }
}
