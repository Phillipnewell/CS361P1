package fa.dfa;

import fa.FAInterface;
import fa.State;

/**
 * October 13, 2021
 * An interface that provides a method contract of only deterministic
 * states may have but not to include any more than that i.e. methods
 * that both deterministic and nondeterministic may have in common.
 * This will mainly just be the idea that only 1 value is expected
 * for a given transition symbol.
 * @author Phillip Newell
 * @author Chinwendum Njoku
 */
public interface DFAInterface extends FAInterface{

	/**
	 * Construct the textual representation of the DFA, for example
	 * A simple two state DFA
	 * Q = { a b }
	 * Sigma = { 0 1 }
	 * delta =
	 *		0	1	
	 *	a	a	b	
	 *	b	a	b	
	 * q0 = a
	 * F = { b }
	 * 
	 * The order of the states and the alphabet is the order
	 * in which they were instantiated in the DFA.
	 * @return String representation of the DFA
	 */
	public abstract String toString();
	
	/**
	 * Simulates a DFA on input s to determine
	 * whether the DFA accepts s.
	 * @param s - the input string
	 * @return true if s in the language of the DFA and false otherwise
	 */
	public abstract boolean accepts(String s);
	
	/**
	 * Uses transition function delta of FA
	 * @param from the source state
	 * @param onSymb the label of the transition
	 * @return the sink state.
	 */
	public abstract State getToState(DFAState from, char onSymb);

}
