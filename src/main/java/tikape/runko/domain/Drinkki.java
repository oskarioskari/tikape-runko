package tikape.runko.domain;

public class Drinkki {

    private Integer id;
    private String nimi;

    public Drinkki(Integer id, String nimi) {
        this.id = id;
        this.nimi = nimi;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
    
    @Override
    public String toString(){
        return this.nimi;
    }

}
