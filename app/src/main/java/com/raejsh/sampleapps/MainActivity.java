package com.raejsh.sampleapps;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by Rajesh on 1/28/2015.
 */
public class MainActivity extends ActionBarActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.main_home);


        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        if(toolbar != null)
        {
            setSupportActionBar(toolbar);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.sample_menu,menu);
        return true;
    }
}
