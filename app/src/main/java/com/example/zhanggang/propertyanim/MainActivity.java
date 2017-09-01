package com.example.zhanggang.propertyanim;

import android.animation.ObjectAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;
    @BindView(R.id.imageview)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                pingyi();
                break;
            case R.id.button2:
                xuanzhuan();
                break;
            case R.id.button3:
                suofang();
                break;
            case R.id.button4:
                jianbian();
                break;
            case R.id.button5:
                zuhe();
                break;
        }
    }

    private void zuhe() {
        imageView.animate().translationY(200).rotationX(360).alpha(0.5f).scaleY(2).setDuration(5000); //这种方式只能执行一次
    }

    private void jianbian() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView, "alpha", 1f, 0f, 0.5f, 0, 1);
        objectAnimator.setDuration(3000).start();
    }

    public void pingyi() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView, "translationY", 0f, 150f, 56f);
        objectAnimator.setDuration(2000).start();
    }

    public void xuanzhuan() {
        imageView.animate().rotationX(360).setDuration(2000);
    }

    public void suofang() {
        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(imageView, "scaleX", 1F, 2F, 1F);
        objectAnimator.setDuration(2000).start();
    }


}
