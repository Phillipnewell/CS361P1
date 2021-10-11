package fa.dfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import fa.State;

public class DFA implements DFAInterface{
	Set<Character> sigma = new HashSet<Character>();//My abc's of the language
	Set<DFAState> allStates = new HashSet<DFAState>();
	Set<DFAState> finalStates = new HashSet<DFAState>();
	HashMap<String, DFAState> lookup = new HashMap<String, DFAState>();
	DFAState startState;

	public void addFinalState(String nextToken) {
		DFAState finalState = new DFAState(nextToken);
		finalState.setIsFinal(true);//flag final as true
		allStates.add(finalState);//Q
		finalStates.add(finalState);//F
		lookup.put(nextToken, finalState);
	}

	public void addStartState(String startStateName) {
		if (lookup.get(startStateName) != null){
			//start state is already in there
			DFAState startState = lookup.get(startStateName);
			this.startState = startState;
		} else {
			//start state is new and isFinal=false
			DFAState startState = new DFAState(startStateName);
			startState.setIsFinal(false);
			lookup.put(startStateName, startState);
			this.startState = startState;
			allStates.add(startState);
		}	
	}

	public void addTransition(String valueOf1, char c, String valueOf2) {
		sigma.add(c);//list of abc's of language
		DFAState fromState = lookup.get(valueOf1);
		DFAState toState = lookup.get(valueOf1);
		fromState.addTransition(c,toState);
	}

	public void addState(String nextToken) {
		DFAState transitionState = new DFAState(nextToken);
		transitionState.setIsFinal(false);
		allStates.add(transitionState);
		lookup.put(nextToken, transitionState);
		}

	public boolean accepts(String nextLine) {
		System.out.println("here" + nextLine);
		DFAState nextState = lookup.get(nextLine);
		return nextState.getIsFinal();
	}

	@Override
	public Set<? extends State> getStates() {
		return allStates;
	}

	@Override
	public Set<? extends State> getFinalStates() {
		return finalStates;
	}

	@Override
	public State getStartState() {
		return startState;
	}

	@Override
	public Set<Character> getABC() {
		return sigma;
	}

	@Override
	public State getToState(DFAState from, char onSymb) {
		DFAState toState = from.transitionTo.get(onSymb);
		return toState;
	}
	
	public String toString() {
		System.out.println("Q= {" + allStates + "}");
		System.out.println("Sigma = {" + getABC() + "}");
		System.out.println("Delta");
		
		//rubbish code
		String cheese = "cheese";
		return cheese;
		
	}

}
