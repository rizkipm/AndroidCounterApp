package imastudio.id.co.aplikasipertama;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //deklarasi widget
    Button nSubmit;
    TextView txtLabelCounter;

    //deklarasi count
    int nCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //memangil id button

        nSubmit = (Button)findViewById(R.id.btnSubmit);
        txtLabelCounter = (TextView)findViewById(R.id.txtCounter);
        //cara agar method bisa d klik
        nSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //menampilkan nilai counter
                nCount++;
                //mengecek ketika nilai nya tidak null atau kosong
                if (txtLabelCounter != null){
                    //integer to string : mengubah nilai dari integer ke string
                    txtLabelCounter.setText(Integer.toString(nCount));

                }


//                Toast.makeText(getApplicationContext(), "Anda pencet button submit", Toast.LENGTH_LONG).show();
            }
        });
    }
}
