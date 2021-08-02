package be.jcrafters.thibos.katas.marsrover;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Rover {

    private int x;
    private int y;
    private char direction;


    public Rover(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public List<String> whereRoverLocate() {
        List<String> roverLocate = new ArrayList<>();
        roverLocate.add(String.valueOf(this.getX()+","+this.getY()+",")+getDirection());
        return roverLocate;
    }

    public void newDirection(String direction) {
        if(direction.equals("f")) {
            this.setDirection('E');
            this.x = 1;
        }
        else {
            this.setDirection('W');
            this.x = 5;
        }
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getDirection() {
        return direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
        return x == rover.x && y == rover.y && direction == rover.direction;
    }
    @Override
    public int hashCode() {
        return Objects.hash(x, y, direction);
    }

    @Override
    public String toString() {
        return "Rover{" +
                "x=" + x +
                ", y=" + y +
                ", direction=" + direction +
                '}';
    }

}
