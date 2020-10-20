package com.example.fragmentexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void setFrag1(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment1(), "one");
        fragmentTransaction.commitAllowingStateLoss();
    }
    public void setFrag2(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment2(), "two");
        fragmentTransaction.commitAllowingStateLoss();
    }
    public void setFrag3(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment3(), "three");
        fragmentTransaction.commitAllowingStateLoss();
    }
    public void setFrag4(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment4(), "four");
        fragmentTransaction.commitAllowingStateLoss();
    }
    public void setFrag5(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment5(), "five");
        fragmentTransaction.commitAllowingStateLoss();
    }
    public void setFrag6(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        fragmentTransaction.replace(R.id.Frame_container, new Fragment6(), "six");
        fragmentTransaction.commitAllowingStateLoss();
    }
}