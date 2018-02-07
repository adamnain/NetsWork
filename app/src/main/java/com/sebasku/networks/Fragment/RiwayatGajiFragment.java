package com.sebasku.networks.Fragment;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.sebasku.networks.DetailGajiActivity;
import com.sebasku.networks.R;

public class RiwayatGajiFragment extends Fragment {
    View viewRiwayatGaji;
    Button btnDetail;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        viewRiwayatGaji = inflater.inflate(R.layout.fragment_riwayat_gaji, container, false);
        btnDetail = viewRiwayatGaji.findViewById(R.id.btn_detail);
        btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), DetailGajiActivity.class);
                startActivity(i);
            }
        });
        return viewRiwayatGaji;
    }
}