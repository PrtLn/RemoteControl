package com.prt.remotecontrol.activity;

import android.support.v4.app.Fragment;

import com.prt.remotecontrol.fragment.RemoteControlFragment;

public class RemoteControlActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return RemoteControlFragment.newInstance();
    }
}
