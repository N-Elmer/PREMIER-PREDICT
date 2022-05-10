package com.premierpredict.bettapplication.ui.dal.dao_elmer_localnext;

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

public class LocalNextFragment extends Fragment {

    private LocalNextViewModel localNextViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        localNextViewModel = new ViewModelProvider(this).get(LocalNextViewModel.class);
        View root = inflater.inflate(R.layout.fragment_local_next, container, false);
        WebView webView = root.findViewById(R.id.localNextFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/cameroontomorrowfixtures");
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