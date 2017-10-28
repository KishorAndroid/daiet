package com.appdevelopkar.daiet.home

import android.support.v4.app.FragmentManager
import android.view.View

/**
 * Created by kishorandroid on 27/09/17.
 */

class HomeViewModel(fragmentManager: FragmentManager) {

    var fragmentManager = fragmentManager

    public fun showAddEntryDialog(view: View) {
        var addEntryDialogFragment = AddEntryDialogFragment()
        addEntryDialogFragment.show(fragmentManager, addEntryDialogFragment.tag)
    }
}
