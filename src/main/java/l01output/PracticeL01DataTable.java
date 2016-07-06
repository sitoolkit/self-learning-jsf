package l01output;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PracticeL01DataTable {

    List<PracticeL01Album> data = new ArrayList<PracticeL01Album>();

    public PracticeL01DataTable(){
        data.add(new PracticeL01Album("Some Other Time","Bill Evans","￥3,553","￥2,500"));
        data.add(new PracticeL01Album("Blues & Ballads","Brad Mehldau","￥2,052","￥1,598"));
        data.add(new PracticeL01Album("Live Under The Sky Tokyo 1984","Gil Evans / Jaco Pastorius","￥3,394","￥2,246"));
        data.add(new PracticeL01Album("Everything's Beautiful","Robert Glasper","￥2,376","￥1,500"));
        data.add(new PracticeL01Album("Y Despues...que?","German Kucich / Carlos Ibanez / Juanma Barroso","￥4,093","￥1,200"));
    }

    public List<PracticeL01Album> getValue() {
        return data;
    }
}