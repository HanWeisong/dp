	package com.amosli.dp.structural.flyweight;
	
	public class ConcreteFlyweight extends Flyweight {
	
		@Override
		void operation(int extrinsicstate) {
			System.out.println(this.getClass().getName() + extrinsicstate);
		}
	
	}
