package com.sebasku.networks.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.sebasku.networks.R;

public class RiwayatCutiFragment extends Fragment {
    View viewRiwayatCuti;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewRiwayatCuti  = inflater.inflate(R.layout.fragment_riwayat_cuti, container, false);
        return viewRiwayatCuti;
    }
}
