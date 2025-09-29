import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.LinkedList;

public class TickerViewModel extends ViewModel {

    private MutableLiveData<LinkedList<String>> colorsLL;

    public TickerViewModel() {
        colorsLL = new MutableLiveData<>();
    }

    public void setColorsLL(LinkedList<String> li) {
        colorsLL.setValue(li);
    }

    public LinkedList<String> getColors(){
        return colorsLL.getValue();
    }

    public void addColor(String c){
        LinkedList<String> l = getColors();
        l.add(c);
        colorsLL.setValue(l);
    }
}
