package tcube.eclabcompanion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Toast;
import java.io.File;

public class Experiment_eda extends AppCompatActivity {
    int screen_flag;
    Toolbar s3eda_toolbar;
    MenuItem menuItem;//Flag to determine current view.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.s3eda);
        setTitle("Electronics Design & Automation");
        s3eda_toolbar= (Toolbar) findViewById(R.id.s3eda_toolbar);
        setSupportActionBar(s3eda_toolbar);
        getSupportActionBar().setTitle("Electronics Design & Automation");
        s3eda_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
    }

    @Override
    public void onBackPressed() {  // It is the Exit button Question
        if (screen_flag == 1) {
            setContentView(R.layout.s3eda);
            setTitle("Electronics Design & Automation");
            s3eda_toolbar= (Toolbar) findViewById(R.id.s3eda_toolbar);
            setSupportActionBar(s3eda_toolbar);
            getSupportActionBar().setTitle("Electronics Design & Automation");
            s3eda_toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));
            screen_flag = 0;
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    public void s3eda_choose(View view) {
        File Obb = getFilesDir();
        File file;
        setTitle("Experiment Details");
        WebView webview;
        setContentView(R.layout.webview);
        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setBuiltInZoomControls(true); //Enable zoom
        screen_flag = 1; //We have entered HTML view.
        switch (view.getId()) {
            /*case R.id.s3edaexpA:
                file = new File(Obb, "s3eda/A/exp0/exp0.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;*/
            case R.id.s3edaexp1:
                file = new File(Obb, "s3eda/A/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp2:
                file = new File(Obb, "s3eda/A/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s3edaexp3:
                file = new File(Obb, "s3eda/A/exp3/exp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;*/
            /*case R.id.s3edaexp4:
                file = new File(Obb, "s3eda/A/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;*/
            case R.id.s3edaexp5:
                file = new File(Obb, "s3eda/A/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp6:
                file = new File(Obb, "s3eda/A/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp7:
                file = new File(Obb, "s3eda/A/exp7/exp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s3edaexp8:
                file = new File(Obb, "s3eda/A/exp8/exp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;
            case R.id.s3edaexp9:
                file = new File(Obb, "s3eda/A/exp9/exp9.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;
            case R.id.s3edaexp10:
                file = new File(Obb, "s3eda/A/exp10/exp10.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;
            case R.id.s3edaexp11:
                file = new File(Obb, "s3eda/A/exp11/exp11.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;
            case R.id.s3edaexp12:
                file = new File(Obb, "s3eda/A/exp12/exp12.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;
            case R.id.s3edaexpB:
                file = new File(Obb, "s3eda/B/exp0/exp0.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;*/
            case R.id.s3edaexp13:
                file = new File(Obb, "s3eda/B/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp14:
                file = new File(Obb, "s3eda/B/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp15:
                file = new File(Obb, "s3eda/B/exp3/exp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp16:
                file = new File(Obb, "s3eda/B/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp17:
                file = new File(Obb, "s3eda/B/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp18:
                file = new File(Obb, "s3eda/B/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp19:
                file = new File(Obb, "s3eda/B/exp7/exp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp20:
                file = new File(Obb, "s3eda/B/exp8/exp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            /*case R.id.s3edaexpC:
                file = new File(Obb, "s3eda/C/exp0/exp0.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                android:onClick="s3eda_choose"
                break;*/
            case R.id.s3edaexp21:
                file = new File(Obb, "s3eda/C/exp1/exp1.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp22:
                file = new File(Obb, "s3eda/C/exp2/exp2.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp23:
                file = new File(Obb, "s3eda/C/exp3/exp3.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp24:
                file = new File(Obb, "s3eda/C/exp4/exp4.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp25:
                file = new File(Obb, "s3eda/C/exp5/exp5.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp26:
                file = new File(Obb, "s3eda/C/exp6/exp6.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp27:
                file = new File(Obb, "s3eda/C/exp7/exp7.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp28:
                file = new File(Obb, "s3eda/C/exp8/exp8.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
            case R.id.s3edaexp29:
                file = new File(Obb, "s3eda/C/exp9/exp9.html");
                webview.loadUrl("file:///" + file.getAbsolutePath());
                break;
        }
    }

    public void restartApp(){
        Intent intent=new Intent(getApplicationContext(),Experiment_eda.class);
        startActivity(intent);

    }
}