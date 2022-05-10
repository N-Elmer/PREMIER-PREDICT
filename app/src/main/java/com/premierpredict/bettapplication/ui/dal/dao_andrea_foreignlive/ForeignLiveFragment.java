package com.premierpredict.bettapplication.ui.dal.dao_andrea_foreignlive;

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

public class ForeignLiveFragment extends Fragment {

    private ForeignLiveViewModel foreignLiveViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        foreignLiveViewModel = new ViewModelProvider(this).get(ForeignLiveViewModel.class);
        View root = inflater.inflate(R.layout.fragment_foreign_live, container, false);
        WebView webView = root.findViewById(R.id.foreignLiveFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/foreignlivefixtures");
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