package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;

    public ShapeCollector(Shape shape){
        this.shape = shape;
    }
    private List<Shape> shapes = new ArrayList<>();


    public int checkSize(){
        return shapes.size();
    }

    public void addFigure(Shape shape){
        shapes.add(shape);
    }

    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }


    public Shape getFigure(int shapeNumber){
        if(shapeNumber >=0 && shapeNumber < shapes.size()){
            return shapes.get(shapeNumber);
        }
        return null;
    }

    public String showFigures(){
        for(int i = 0; i<shapes.size(); i++){
            return shapes.get(i).getShapeName();
        }
        return null;
    }


}
