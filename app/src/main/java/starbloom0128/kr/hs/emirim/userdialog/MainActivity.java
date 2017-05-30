package starbloom0128.kr.hs.emirim.userdialog;

import android.app.Dialog;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button) findViewById(R.id.but);
        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        View dlgV=View.inflate(this, R.layout.dialog, null);
        AlertDialog.Builder dialog = new AlertDialog.Builder(this); //현재 클래스이므로 this로 써도 됨.
        dialog.setTitle("Input User Information");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setView(dlgV);
        dialog.setPositiveButton("OK", null);
        dialog.setNegativeButton("CANCLE", null);
        dialog.show();

    }
}
