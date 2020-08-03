package businessLogic.sourseDate;

public class Coordinates {
    private Double x; //Значение поля должно быть больше -81, Поле не может быть null
    private Integer y; //Поле не может быть null
    public Coordinates(Double x , Integer y){
        this.x = x;
        this.y =y;
    }


    @Override
    public String toString() {
        return
                " x=" + x +
                ", y=" + y ;
    }

    public double getX(){
        return this.x;
    }

    public Integer getY(){
        return this.y;
    }

}
