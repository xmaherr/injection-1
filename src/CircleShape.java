public class CircleShape implements Shape{
    Draw2D draw2D ;
    Draw3D draw3D;

    CircleShape(Draw3D draw3D,Draw2D draw2D){

        this.draw2D=draw2D;
        this.draw3D=draw3D;
    }

    void setDraw2D(Draw2D draw2D){
        this.draw2D= draw2D;
    }
    @Override
    public String getShapeName() {
        return "CircleShape";
    }

    @Override
    public void drawShape() {
        this.draw2D.draw2D(getShapeName());
        this.draw3D.draw3D(getShapeName());
    }
}
