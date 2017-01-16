package com.king.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.king.widget.SuperSlidingPaneLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private SuperSlidingPaneLayout superSlidingPaneLayout;

    private View menu;
    private TextView tvMode;


    private void initUI(){
        superSlidingPaneLayout = (SuperSlidingPaneLayout)findViewById(R.id.superSlidingPaneLayout);
        tvMode = (TextView)findViewById(R.id.tvMode);
        superSlidingPaneLayout.setSliderFadeColor(0);
        menu =findViewById(R.id.menu);
        ViewGroup.LayoutParams params = menu.getLayoutParams();
        params.width = (int)(getResources().getDisplayMetrics().widthPixels * 0.85f);
        menu.setLayoutParams(params);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
    }



    @Override
    public void onClick(View view) {
        if(view.getId()!=R.id.btnLeft && !superSlidingPaneLayout.isOpen()){
            return;
        }
        switch (view.getId()){
            case R.id.btnLeft:
                superSlidingPaneLayout.openPane();
                break;
            case R.id.btnDefault:
                tvMode.setText("Default");
                superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.DEFAULT);
                superSlidingPaneLayout.closePane();
                break;
            case R.id.btnTranslation:
                tvMode.setText("Translation");
                superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.TRANSLATION);
                superSlidingPaneLayout.closePane();
                break;
            case R.id.btnScaleMenu:
                tvMode.setText("Scale Menu");
                superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.SCALE_MENU);
                superSlidingPaneLayout.closePane();
                break;
            case R.id.btnScalePanel:
                tvMode.setText("Scale Panel");
                superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.SCALE_PANEL);
                superSlidingPaneLayout.closePane();
                break;
            case R.id.btnTranslationScale:
                tvMode.setText("Translation Scale");
                superSlidingPaneLayout.setMode(SuperSlidingPaneLayout.Mode.TRANSLATION_SCALE);
                superSlidingPaneLayout.closePane();
                break;
        }
    }
}
