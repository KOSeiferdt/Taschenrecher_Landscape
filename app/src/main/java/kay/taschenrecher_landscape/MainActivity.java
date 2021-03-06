package kay.taschenrecher_landscape;


        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    //OrientationEventListener listener;
    public TextView ausgabeTextfeld;
    String Zahl1 = "";
    String Zahl2 = "";
    String operator = "";
    float result = 0;

    public void onClickB0(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "0");
    }

    public void onClickB1(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "1");
    }

    public void onClickB2(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "2");
    }

    public void onClickB3(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "3");
    }

    public void onClickB4(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "4");
    }

    public void onClickB5(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "5");
    }

    public void onClickB6(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "6");
    }

    public void onClickB7(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "7");
    }

    public void onClickB8(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "8");
    }

    public void onClickB9(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "9");
    }

    public void onClickB10(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "10");
    }

    public void onClickB11(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "11");
    }

    public void onClickB12(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "12");
    }

    public void onClickB13(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "13");
    }

    public void onClickB14(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "14");
    }

    public void onClickB15(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "15");
    }



    public void onClickClear(final View cmd) {
        ausgabeTextfeld.setText("");
    }

    public void onClickAdd(final View cmd) {
        operator = "add";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText("");
    }

    public void onClickSubstract(final View cmd) {
        operator = "substract";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText("");
    }

    public void onClickDivide(final View cmd) {
        operator = "divide";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText("");
    }

    public void onClickMultiply(final View cmd) {
        operator = "multiply";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText("");
    }

    public void onClickQuadX(final View cmd) {
        operator = "x�";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText(String.valueOf(Float.valueOf(Zahl1)*Float.valueOf(Zahl1)));
    }

    public void onClickDivX(final View cmd) {
        operator = "1/X";
        ausgabeTextfeld.setText(ausgabeTextfeld.getText());
        Zahl1 = String.valueOf(ausgabeTextfeld.getText());
        ausgabeTextfeld.setText(String.valueOf(1 / Float.valueOf(Zahl1)));
    }


    public void onClickResult(final View cmd) {
        Zahl2 = String.valueOf(ausgabeTextfeld.getText());

        if (operator.equals("add")) {
            result = Float.valueOf(Zahl1) + Float.valueOf(Zahl2);
        } else if (operator.equals("substract")) {
            result = Float.valueOf(Zahl1) - Float.valueOf(Zahl2);
        } else if (operator.equals("multiply")) {
            result = Float.valueOf(Zahl1) * Float.valueOf(Zahl2);
        } else if (operator.equals("divide")) {
            result = Float.valueOf(Zahl1) / Float.valueOf(Zahl2);
        }
        ausgabeTextfeld.setText(String.valueOf(result));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main_landscape);
        setContentView(R.layout.layout_basic);
        if(ausgabeTextfeld == null) ausgabeTextfeld = (TextView)findViewById(R.id.txtausgabe2);

//        listener = new OrientationEventListener(this, SensorManager.SENSOR_DELAY_FASTEST) {
//           @Override
//            public void onOrientationChanged(int orientation) {
//                if ((orientation >= 345  && orientation <= 15) /*|| (orientation >= 165 && orientation <= 195)*/)
//                    changeOrientation();
//
//            }
//        };
//
//        if (listener.canDetectOrientation()) {
//            listener.enable();
//        }
//
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify Zahl1 parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.hex) {
            setContentView(R.layout.layout_hex);
            Intent k = new Intent(this, HexAktivity.class);
            startActivity(k);
        }

        if (id == R.id.dez) {
            setContentView(R.layout.layout_basic);
        }
      /*
        if (id == R.id.okt) {
            setContentView(R.layout.layout_okt);
        }
        if (id == R.id.dual) {
            setContentView(R.layout.layout_dual);
        }*/
        return super.onOptionsItemSelected(item);
    }

   /*private void changeOrientation() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }*/
}