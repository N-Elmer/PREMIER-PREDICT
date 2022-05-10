package com.premierpredict.bettapplication.ui.dal.dao_stephanie_foreignstats;

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

public class ForeignStatsFragment extends Fragment {

    private ForeignStatsViewModel foreignStatsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foreignStatsViewModel = new ViewModelProvider(this).get(ForeignStatsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foreign_stats, container, false);
        WebView webView = root.findViewById(R.id.foreignStatsFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/foreignstats");
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