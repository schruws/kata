package be.jcrafters.thibos.katas.marsrover;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

public class RoverTest {

    @Test
    public void when_initialStartingRoverWhithparameter_ZeroZeroNord(){
         List<String> expected = new ArrayList<>();
         expected.add("0,0,N");
         Rover rover = new Rover(0,0,'N');
         List<String> result = rover.whereRoverLocate();
         assertThat(result).isEqualTo(expected);
    }
    @Test
    public void when_initialStartingRoverWhithparameter_ZeroZeroOuest(){
         List<String> expected = new ArrayList<>();
         expected.add("0,0,O");
         Rover rover = new Rover(0,0,'O');
         List<String> result = rover.whereRoverLocate();
         assertThat(result).isEqualTo(expected);
    } 
    @Test
    public void when_indicateDirectionForTheRover_right(){
        List<String> expected = new ArrayList<>();
        expected.add("1,0,E");
        Rover rover = new Rover(0,0,'N');
        rover.newDirection("f");
        List<String> result = rover.whereRoverLocate();
        assertThat(result).isEqualTo(expected);
    }
    @Test
    public void when_indicateDirectionForTheRover_left(){
        List<String> expected = new ArrayList<>();
        expected.add("5,0,W");
        Rover rover = new Rover(0,0,'N');
        rover.newDirection("l");
        List<String> result = rover.whereRoverLocate();
        assertThat(result).isEqualTo(expected);
    }
}
