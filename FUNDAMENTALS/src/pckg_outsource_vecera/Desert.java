package pckg_outsource_vecera;

public class Desert {

    private String naziv;
    private double cijena;

    public Desert(String naziv, double cijena){
        this.naziv = naziv;
        this.cijena = cijena;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "naziv='" + naziv + '\'' +
                ", cijena=" + cijena +
                '}';
    }

    void pojeoSamDesert(){
        System.out.println("Desert je smazan...");

    }

    public double getPrice() {
        return this.cijena;
    }
}
