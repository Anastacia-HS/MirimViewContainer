package kr.hs.e_mirim.s2019s04.mirimviewcontainer;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivityTest extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        TabHost tabHost = getTabHost();

        TabHost.TabSpec tabSpecSa = tabHost.newTabSpec("SAKURA").setIndicator("벚꽃");
        tabSpecSa.setContent(R.id.linear_sa);
        tabHost.addTab(tabSpecSa);

        TabHost.TabSpec tabSpecBe = tabHost.newTabSpec("BEER").setIndicator("맥주");
        tabSpecBe.setContent(R.id.linear_be);
        tabHost.addTab(tabSpecBe);

        TabHost.TabSpec tabSpecJe = tabHost.newTabSpec("JELLYFISH").setIndicator("해파리");
        tabSpecJe.setContent(R.id.linear_je);
        tabHost.addTab(tabSpecJe);

        tabHost.setCurrentTab(0);
    }
}