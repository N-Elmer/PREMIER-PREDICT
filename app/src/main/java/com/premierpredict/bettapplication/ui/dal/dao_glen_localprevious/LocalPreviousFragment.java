package com.premierpredict.bettapplication.ui.dal.dao_glen_localprevious;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.premierpredict.bettapplication.R;
import com.premierpredict.bettapplication.WebViewController;

public class LocalPreviousFragment extends Fragment {

    private LocalPreviousViewModel localPreviousViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        localPreviousViewModel = new ViewModelProvider(this).get(LocalPreviousViewModel.class);
        View root = inflater.inflate(R.layout.fragment_local_previous, container, false);
        WebView webView = root.findViewById(R.id.localPreviousFragmentWebView);
        webView.loadUrl("https://premierpredict.terraexploration.space/cameroonpreviousfixtures");
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