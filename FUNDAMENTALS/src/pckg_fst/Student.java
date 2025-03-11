package pckg_fst;

public class Student {

    private String imeStudenta;
    private int godinaStudija;
    private String nazivStudija;
    private String nazivSveucilista;

    public Student(String imeStudenta, int gdStudija) {
        this.imeStudenta = imeStudenta;
        this.godinaStudija = gdStudija;
    }
    public String getImeStudenta() {
        return imeStudenta;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public int getGodinaStudija() {
        return godinaStudija;
    }

    public void setGodinaStudija(int godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imeStudenta='" + imeStudenta + '\'' +
                ", godinaStudija=" + godinaStudija +
                ", nazivStudija='" + nazivStudija + '\'' +
                ", nazivSveucilista='" + nazivSveucilista + '\'' +
                '}';
    }
}
