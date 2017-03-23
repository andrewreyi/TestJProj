package New;

/**
 * Created by User on 15.03.2017.
 */
public class Figure {
    private int dlinna;
    private int glubina;

    public Figure(int dlinna, int glubina){
        this.dlinna=dlinna;
        this.glubina=glubina;
    }

    public int getDlinna(){
        return dlinna;
    }
    public void setDlinna(int dlinna){
        this.dlinna=dlinna;
    }
    public int getGlubina(){
        return glubina;
    }
    public void setGlubina(int glubina) {
        this.glubina = glubina;
    }

    public static void main(String[] args) {
        Figure fig = new Figure(15, 10);
        System.out.println(fig.getDlinna()+"+"+fig.getGlubina());



    }

}
