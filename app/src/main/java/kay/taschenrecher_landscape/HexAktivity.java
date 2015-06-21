package kay.taschenrecher_landscape;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class HexAktivity extends AppCompatActivity {


    //OrientationEventListener listener;
    public TextView ausgabeTextfeld;
    String Zahl1 = "";
    String Zahl2 = "";
    String operator = "";
    float result = 0;
    int i = 0;
    String hex_string = "";
    String hex_num ="";
    int dec_num = 0;
    int Basis =2;

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

    public void onClickBA(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "A");
    }

    public void onClickBB(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "B");
    }

    public void onClickBC(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "C");
    }

    public void onClickBD(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "D");
    }

    public void onClickBE(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "E");
    }

    public void onClickBF(final View cmd) {
        ausgabeTextfeld.setText(ausgabeTextfeld.getText() + "F");
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
        operator = "x²";
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

        if ((Zahl1 != null) && (Zahl2 != null)) {

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
    }
      public void onClickListener_Hex (final View cmd) {
/*
          if ((Zahl1!=null) && (Zahl1.length() > 0 ))
              Zahl1 = Integer.valueOf(Zahl1);


            hex_num = Integer.toHexString(Zahl1);
*/




 for (i = 0; i < Zahl1.length(); i++) {
            if (Zahl1.charAt(i) == '.') {
                break;
            } else {
               hex_string = hex_string + Zahl1.charAt(i);
            }
        }
        dec_num = Integer.parseInt(hex_string);


        //String hex_num_string = Integer.valueOf(hex_num).toString();
        hex_num = Integer.toHexString(dec_num);

        ausgabeTextfeld.setText(hex_num);
          //Log.d("dec_num=", dec_num.toString());
            }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_hex);
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
                    }
        if (id == R.id.dez) {
            setContentView(R.layout.layout_basic);
        }
      /*  if (id == R.id.okt) {
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
