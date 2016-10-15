package univalleapi.tutorial.com.univalleapi;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

/**
 * Created by ADMIN on 28/09/2016.
 */

public class MenuOpciones extends Activity{

    private TabHost tabsContainer;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getPropiedadesTab();
    }

    public void getPropiedadesTab(){

        final Resources res = getResources();

        tabsContainer = (TabHost) findViewById(android.R.id.tabhost);
        tabsContainer.setup();

        TabHost.TabSpec spec = tabsContainer.newTabSpec("mitab1");
        spec.setContent(R.id.tab1);
        //spec.setIndicator("CAMPUS", res.getDrawable(android.R.drawable.ic_btn_speak_now));
        spec.setIndicator("", res.getDrawable(R.drawable.ic_campus));
        tabsContainer.addTab(spec);

        spec = tabsContainer.newTabSpec("mitab2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("", res.getDrawable(R.drawable.ic_eventos));
        tabsContainer.addTab(spec);

        tabsContainer.setCurrentTab(0);

        tabsContainer.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Log.i("AndroidTabsDemo", "Pulsada pestaña: " + tabId);
            }

        });

    }

}
