package com.example.searchview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SearchResultActivity extends AppCompatActivity {
    TextView mTextResult;
    String TAG  = SearchResultActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_search_result);
        mTextResult = findViewById(R.id.textResult);
        Log.d(TAG, "onCreate: ");
        if(Intent.ACTION_SEARCH.equals(getIntent().getAction())){
            handleSearch(getIntent().getStringExtra(SearchManager.QUERY));
        }


    }

    private void handleSearch(String stringExtra) {
        Log.d(TAG, "handleSearch: "+stringExtra);
        mTextResult.setText(stringExtra);
    }
}