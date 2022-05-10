package com.premierpredict.bettapplication.ui.dal.dao_stephanie_localstats;

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

public class LocalStatsFragment extends Fragment {

    private LocalStatsViewModel localStatsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        localStatsViewModel = new ViewModelProvider(this).get(LocalStatsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_local_stats, container, false);
        WebView webView = root.findViewById(R.id.localStatsFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/cameroonstats");
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