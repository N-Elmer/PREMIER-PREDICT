package com.premierpredict.bettapplication.ui.dal.dao_andrea_locallive;

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

public class LocalLiveFragment extends Fragment {

    private LocalLiveViewModel localLiveViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        localLiveViewModel = new ViewModelProvider(this).get(LocalLiveViewModel.class);
        View root = inflater.inflate(R.layout.fragment_local_live, container, false);
        WebView webView = root.findViewById(R.id.localLiveFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/cameroonlivefixtures");
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