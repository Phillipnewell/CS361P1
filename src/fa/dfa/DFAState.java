package fa.dfa;

import java.util.LinkedHashMap;

import fa.State;
/**
 * October 13, 2021
 * This class represents the object orientation of a DFAState object. As such,
 * this class gives DFAStates the characteristics of being final, not final, and
 * what list of states that any character intakes will transfer the user to.
 * @author Phillip Newell
 * @author Chinwendum Njoku
 */
public class DFAState extends State {
	private Boolean isFinal;
	LinkedHashMap<Character, DFAState> transitionTo;

	//constructor
	public DFAState(String nextToken) {
		super.name = nextToken;
		this.transitionTo = new LinkedHashMap<Character, DFAState>();
	}


	public Boolean getIsFinal() {
		return isFinal;
	}
	
	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	public void addTransition(Character myChar, DFAState toState) {
		transitionTo.put(myChar, toState);
	}

}
