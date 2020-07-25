package com.learnings.designPatterns.behavorial.iterator;

public class IteratorDriver {

	public static void main(String[] args) {
		// used when we want to traverse the container
		// and dont expose the underlying structure
		// decouples the algorithm used on the elements
		// sequential in nature
		
		/**
		 * Design -
		 * 1. Interface based - the object which needs to be traversed will return instance of iterator. 
		 * 2. Somewhat Factory method based
		 * 3. Each iterator is independent of other iterator. which makes them fail-fast.
		 * 4. Enumerators are fail-safe.
		 * 5. UML -> Iterator, ConcreteIterator
		 * Ex. Iterator interface
		 *	an iterable in java can be target of foreach loop   
		 */
	}

}
