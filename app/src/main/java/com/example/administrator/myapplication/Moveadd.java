package com.example.administrator.myapplication;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/16.
 */
public class Moveadd {
    private String cityname;
    private static int left = 30;
    private static int top = 100;
    private static int i = 0;
    Moveadd(String cityname){
        this.cityname = cityname;
    }
 public  static void CreateButton(final Context context, final String cn,RelativeLayout mainLayout){
     Button button = new Button(context);
     button.setText(cn);
     RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(300,300);
     lp.leftMargin = left;
     lp.topMargin = top;
     mainLayout.addView(button,lp);
     i++;
     if(i<3){
         left = left + 300;
     }
     else {
         left = 30;
         top = top + 300;
         i = 0;
     }
button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(context,cn,Toast.LENGTH_SHORT).show();
    }
});

}


}
