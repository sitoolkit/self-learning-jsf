package l01output;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class L01DataTable {

    List<L01Book> data = new ArrayList<L01Book>();

    public L01DataTable() {
        data.add(new L01Book("七つの習慣","スティーブン・R・コヴィー","2,376"));
        data.add(new L01Book("仕事と人生について知っておいてほしいこと","松下幸之助","1,028"));
        data.add(new L01Book("人を動かす","カーネギー","702"));
    }

    public List<L01Book> getValue() {
        return data;
    }
}