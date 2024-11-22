public class SquareShape implements Shape{
    Draw2D draw2D;
    Draw3D draw3D;
    public void setDraw2D(Draw2D draw2D) {
        this.draw2D = draw2D;
    }

    public void setDraw3D(Draw3D draw3D) {
        this.draw3D = draw3D;
    }

    @Override
    public String getShapeName() {
        return "SquareShape";
    }

    @Override
    public void drawShape() {
        this.draw2D.draw2D(getShapeName());
        this.draw3D.draw3D(getShapeName());
    }
}
