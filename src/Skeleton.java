public class Skeleton extends Boss {
    private int NumberOfArrows;

    public int getNumberOfArrows() {
        return NumberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        NumberOfArrows = numberOfArrows;
    }

    public String printInfo(){
        return  super.printInfo() +  " " + getNumberOfArrows() ;
    }
}


