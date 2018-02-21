package com.example.a15656.test5.cjq.interfacelayer.Fragment;



import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.a15656.test5.R;


/**
 * Created by 15656 on 2017/4/26.
 */
public class QzoneFragment extends Fragment {

    private static QzoneFragment instance;

    public static QzoneFragment getInstance(){
        if(instance == null) instance = new QzoneFragment();
        return instance;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_qzone_fragment,null);
        TextView title = (TextView) view.findViewById(R.id.title_tv);
        title.setText("动态");

        Button button = (Button) view.findViewById(R.id.header_imgbtn);
        button.setBackgroundColor(Color.TRANSPARENT);
        button.setText("更多");

        return view;
    }
}
