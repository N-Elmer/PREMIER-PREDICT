package com.premierpredict.bettapplication.ui.dal.dao_issabel_foreigntoday;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.premierpredict.bettapplication.R;
import com.premierpredict.bettapplication.WebViewController;

public class ForeignTodayFragment extends Fragment {

    private ForeignTodayViewModel foreignTodayViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foreignTodayViewModel = new ViewModelProvider(this).get(ForeignTodayViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foreign_today, container, false);
        WebView webView = root.findViewById(R.id.foreignTodayFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/foreigntodayfixtures");
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewController());
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

}