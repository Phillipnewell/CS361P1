package fa.dfa;

import java.util.Set;

import fa.State;

public class DFA implements DFAInterface{
	Set <DFAState> finalStates;
	Set <DFAState> startStates;
	Set <DFAState> states;
	DFAState start;

	public void addFinalState(String nextToken) {
		// TODO Auto-generated method stub
		DFAState _final = new DFAState (nextToken, true); 
		finalStates.add(_final);
		
	}

	public void addStartState(String startStateName) {
		// TODO Auto-generated method stub
		DFAState start = new DFAState (startStateName, true); 
		finalStates.add(start);
	}

	public void addState(String nextToken) {
		DFAState state = new DFAState (nextToken, true); 
		finalStates.add(state);
		
	}

	public void addTransition(String valueOf, char c, String valueOf2) {
		// TODO Auto-generated method stub
		
		
	}

	public boolean accepts(String nextLine) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<? extends State> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<? extends State> getFinalStates() {
		// TODO Auto-generated method stub
		return finalStates;
	}

	@Override
	public State getStartState() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Character> getABC() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		// TODO Auto-generated method stub
		return null;
	}

}
