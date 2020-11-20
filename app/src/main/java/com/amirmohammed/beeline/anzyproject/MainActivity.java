package com.amirmohammed.beeline.anzyproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.amirmohammed.beeline.anzyproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.cardContactUs.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url",
                        "https://gulf.edu.sa/ar/website/contact-us/")));

        binding.highDiploma.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://gulf.edu.sa/ar/diploma-programs/high-diploma/")));

        binding.midDiploma.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://gulf.edu.sa/ar/diploma-programs/academic-diploma/")));

        binding.email.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"http://autodiscover.outlook.com/")));

        binding.learningSystem.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://lms.gulf.edu.sa/")));

        binding.managementSystem.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://sis.gulf.edu.sa/er")));

        binding.scientificSearch.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://gulf.edu.sa/ar/scientific-research-platform/")));

        binding.register.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://gulf.edu.sa/ar/admissions/")));

        binding.about.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        ,"https://gulf.edu.sa/ar/about/")));


    }
}