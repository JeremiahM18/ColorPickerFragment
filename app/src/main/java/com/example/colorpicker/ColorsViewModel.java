package com.example.colorpicker;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.colorpicker.Receivers.SMSReceiver;

import java.util.LinkedList;

public class ColorsViewModel extends ViewModel {

    private MutableLiveData<LinkedList<String>> colorsLL;
    //private SMSReceiver
    public ColorsViewModel() {
        colorsLL = new MutableLiveData<>();
        LinkedList<String> l = new LinkedList<>();
        colorsLL.setValue(l);
    }


    public void setColors(LinkedList<String> li) {

        colorsLL.setValue(li);
    }

    public MutableLiveData<LinkedList<String>> getColors(){
        return colorsLL;
    }

    public void addColor(String c){
        LinkedList<String> l = getColors().getValue();
        l.add(c);
        Log.i("Colors", l.toString());
        colorsLL.setValue(l);
    }
}
