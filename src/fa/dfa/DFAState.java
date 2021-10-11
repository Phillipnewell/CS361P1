package fa.dfa;

import java.util.LinkedHashMap;

import fa.State;

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
