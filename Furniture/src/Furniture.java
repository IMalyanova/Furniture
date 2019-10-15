abstract class Furniture implements Wooden, Comparable<Furniture> {

    public int legs = 4;
    protected int topSize;
    protected int height;


    @Override
    public int compareTo(Furniture furniture) {
        return (int)(furniture.height - this.height);
    }

    public Furniture(){

    }

    public void info(){
        System.out.println(this.getClass() + "  " + this.height + " см. высота, " + this.topSize + " кв.см. площадь крышки");
    }

}
