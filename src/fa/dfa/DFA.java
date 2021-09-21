package fa.dfa;

public class DFA {
	Set <DFAState> finalStates;
	DFAState start;

	public void addFinalState(String nextToken) {
		// TODO Auto-generated method stub
		DFAState final = new DFAState (nextToken, true); 
		finalStates.add(final);
		
	}

	public void addStartState(String startStateName) {
		// TODO Auto-generated method stub
		
	}

	public void addState(String nextToken) {
		// TODO Auto-generated method stub
		
	}

	public void addTransition(String valueOf, char c, String valueOf2) {
		// TODO Auto-generated method stub
		
		
	}

	public boolean accepts(String nextLine) {
		// TODO Auto-generated method stub
		return false;
	}

}
