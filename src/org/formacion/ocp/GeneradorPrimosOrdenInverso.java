package org.formacion.ocp;

import java.util.Comparator;

public class GeneradorPrimosOrdenInverso extends GeneradorPrimos  {
	protected Comparator<Integer> getOrdenacion () {
		return ( a, b ) ->  b>a? 1: -1;
	}
}
