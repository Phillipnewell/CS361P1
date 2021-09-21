package fa.dfa;
import java.util.HashMap;
import fa.State;

public class DFAState extends State{
    private boolean isFinal;
    private HashMap<Character, DFAState> transitions;


    //Constructor
    public DFAState (String name, booling isFinal) {
        this.name = name;
        transitions = new HashMap<Character, DFAState>();
        this.isFinal = isFinal
    }

    //This returns the final state of the machine
    public boolean isFinal(){
        return this.isFinal;
    }
    //This takes the alphabet and symbol and add it to the transition Hashmap 
    public addTransition(String symbol, DFAState toState) {
        transitions.put(symbol, toState);

    }

    //This checks what state to transition to from the HashMap
    public DFAState getToState(String symbol) {
        return DFAState;

    }



    
    
        
    }

}
