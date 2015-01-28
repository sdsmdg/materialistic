package io.github.hidroh.materialistic;

import android.support.v7.app.ActionBarActivity;

import com.google.android.gms.analytics.GoogleAnalytics;

public class TrackableActivity extends ActionBarActivity {
    @Override
    protected void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(this).reportActivityStart(this);
    }

    @Override
    protected void onStop() {
        GoogleAnalytics.getInstance(this).reportActivityStop(this);
        super.onStop();
    }
}
