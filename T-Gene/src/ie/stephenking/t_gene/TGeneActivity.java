package ie.stephenking.t_gene;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TGeneActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tgene);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_tgene, menu);
        return true;
    }
}
