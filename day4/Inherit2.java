class Figure{
    int dimX;
    int dimY;
    Figure(int dimX,int dimY){
        this.dimX=dimX;
        this.dimY=dimY;
    }
}
class ThreeDFigure extends Figure{
    int dimZ;
    ThreeDFigure(int dimX,int dimY,int dimZ){
        super(dimX,dimY);
        this.dimZ=dimZ;
    }
}
class Inherit2{
    public static void main(String args[]){
        ThreeDFigure fig=new ThreeDFigure(5,10,7);
        System.out.println(fig.dimX+" "+fig.dimY+" "+fig.dimZ);
    }
}