package fa.dfa;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import fa.State;
/**
 * October 13, 2021
 * This class is directly responsible of mapping DFAStates, keeping records
 * necessary for a toString print method of the 5-tuple
 * @author Phillip Newell
 * @author Chinwendum Njoku
 */
public class DFA implements DFAInterface{
	Set<Character> sigma = new HashSet<Character>();//My abc's of the language
	Set<DFAState> allStates = new HashSet<DFAState>();
	Set<DFAState> finalStates = new HashSet<DFAState>();
	HashMap<String, DFAState> lookup = new HashMap<String, DFAState>();//I can refer to my states by their names
	DFAState startState;//only 1 startState; does not need set

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
		DFAState toState = lookup.get(valueOf2);
		fromState.addTransition(c,toState);
	}

	public void addState(String nextToken) {
		DFAState transitionState = new DFAState(nextToken);
		transitionState.setIsFinal(false);
		allStates.add(transitionState);
		lookup.put(nextToken, transitionState);
		}

	public boolean accepts(String nextLine) {
		char[] arrayOfChar = nextLine.toCharArray();
		DFAState currentState = startState;
		for(int i=0; i < arrayOfChar.length; i++) {
			if(arrayOfChar[i] != 'e') {
				currentState = currentState.transitionTo.get(arrayOfChar[i]);
			} else {
				//do nothing
			}
		}
		return currentState.getIsFinal();
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
		Object[] alphabet = sigma.toArray();
		Object[] arrayOfAllStates = allStates.toArray();
		Object[] arrayOfFinalStates = allStates.toArray();
		String tab = ("          ");
		//print set of states
		System.out.print("Q= {");
		for(int i=0; i<allStates.size(); i++) {
					System.out.print(arrayOfAllStates[i]);
				}
		System.out.println("}");
		//print alphabet
		System.out.print("Sigma = {");
		for(int j=0; j<sigma.size(); j++) {
			System.out.print(alphabet[j]);
		}
		System.out.println("}");
		//print delta set
		System.out.println("Delta =");
		java.util.Iterator<Character> sigmaIter = sigma.iterator();
		System.out.print(tab);
		for(int i=0; i<sigma.size(); i++) {
			System.out.print(tab);
			System.out.print(sigmaIter.next());
		}
		java.util.Iterator<DFAState> stateIter = allStates.iterator();
		System.out.println();
		for(int i=0; i<allStates.size(); i++) {
			DFAState stateRow = stateIter.next();
			System.out.print(tab + stateRow);
			System.out.print("         ");
			for(int j=0; j<sigma.size(); j++) {
				System.out.print(stateRow.transitionTo.get(alphabet[j]));
				System.out.print("          ");
			}
			System.out.println();
		}
		//print the start state
		System.out.println("q0: " + getStartState());
		//print final States
		System.out.print("F {");
		for(int i=0; i<finalStates.size(); i++) {
			System.out.print(arrayOfFinalStates[i]);
			}
		String returnString = ("}\n");
		return returnString;
	}

}
