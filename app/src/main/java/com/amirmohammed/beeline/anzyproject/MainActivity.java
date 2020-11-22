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
                        , "https://gulf.edu.sa/ar/diploma-programs/high-diploma/")));

        binding.midDiploma.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/diploma-programs/academic-diploma/")));

        binding.support.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/support-system/")));

        binding.learningSystem.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://lms.gulf.edu.sa/")));

        binding.academicGate.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/academic-gate/")));

        binding.scientificSearch.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/scientific-research-platform/")));

        binding.register.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/admissions/")));

        binding.about.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/about/")));

        binding.cardCs.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/academic-departments/computer-science-information/")));

        binding.cardEnglish.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/academic-departments/english/")));

        binding.cardLaw.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/academic-departments/law/")));

        binding.cardManagement.setOnClickListener(v ->
                startActivity(new Intent(this, WebViewActivity.class).putExtra("url"
                        , "https://gulf.edu.sa/ar/academic-departments/business-administration/")));

    }
}