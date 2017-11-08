package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by sudharti on 11/8/17.
 */

public class MasterListFragment extends Fragment {

    private GridView mGridView;
    private MasterListAdapter mAdapter;
    private List<Integer> mResources;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_master_list, container, false);

        mResources = AndroidImageAssets.getAll();
        mAdapter = new MasterListAdapter(getContext(), mResources);
        mGridView = (GridView) view.findViewById(R.id.grid_view_images);
        mGridView.setAdapter(mAdapter);

        return view;
    }
}
