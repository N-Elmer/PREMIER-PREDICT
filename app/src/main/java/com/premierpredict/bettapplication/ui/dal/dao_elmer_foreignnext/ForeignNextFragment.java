package com.premierpredict.bettapplication.ui.dal.dao_elmer_foreignnext;

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

public class ForeignNextFragment extends Fragment {

    private ForeignNextViewModel foreignNextViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foreignNextViewModel = new ViewModelProvider(this).get(ForeignNextViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foreign_next, container, false);
        WebView webView = root.findViewById(R.id.foreignNextFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/foreigntomorrowfixtures");
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