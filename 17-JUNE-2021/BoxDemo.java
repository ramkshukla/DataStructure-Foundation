class Box{
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth){
        System.out.println("Constructing Box");
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    double Volume(){
        return (width*height*depth);
    }

}

class BoxDemo{
    public static void main(String[] args){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3,6, 9);
    
        double vol;


        vol = mybox1.Volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.Volume();
        System.out.println("Volume is " + vol);
    }
}
