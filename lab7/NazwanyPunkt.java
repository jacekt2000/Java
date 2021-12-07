package pl.imiajd.tarzanowski;

public class NazwanyPunkt extends Punkt
{
    private String name;

    NazwanyPunkt(int jeden, int drugi, String trzeci)
    {
        super(jeden, drugi);
        this.name = trzeci;
    }

    public void show()
    {
        System.out.println(this.name + ":<" + this.x() + "," + this.y() + ">");
    }
}