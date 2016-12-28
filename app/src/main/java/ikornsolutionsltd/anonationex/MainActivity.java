package ikornsolutionsltd.anonationex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.lang.reflect.Method;

import ikornsolutionsltd.anonationex.anonation.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            showLoger();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    @Logger(logger = "This is annonation")
    public void showLoger() throws NoSuchMethodException {
        Method[] methods = getClass().getMethods();
        for (Method m : methods) {
            Log.d("AS", m.getName());
            if (!"showLoger".equals(m.getName())) {
                continue;
            }
            if (m.isAnnotationPresent(Logger.class)) {
                Toast.makeText(getApplicationContext(),m.getAnnotation(Logger.class).logger(), Toast.LENGTH_LONG).show();
                break;
            }
        }

    }
}
