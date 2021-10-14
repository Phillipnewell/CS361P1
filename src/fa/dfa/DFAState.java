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

	/**
	 * @param args - String nextToken is the name of the DFAState
	 */
	public DFAState(String nextToken) {
		super.name = nextToken;
		this.transitionTo = new LinkedHashMap<Character, DFAState>();
	}


	public Boolean getIsFinal() {
		return isFinal;
	}
	/**
	 * @param args - Set boolean to whether this is a finalState or not
	 */
	public void setIsFinal(Boolean isFinal) {
		this.isFinal = isFinal;
	}
	
	/**
	 * @param args - Key value, character, that will call on the state to move
	 * @param args - Value of DFAState name, String, that will need to be looked up
	 */
	public void addTransition(Character myChar, DFAState toState) {
		transitionTo.put(myChar, toState);
	}

}
