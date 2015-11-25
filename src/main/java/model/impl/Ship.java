package main.java.model.impl;

import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.List;

import main.java.model.IShip;

public class Ship implements IShip {
	
	private List<Field> fields = new ArrayList<Field>();
//	private Rectangle2D shape;

	public boolean isDestroyed() {
		for(Field each : fields) {
			if (!each.isBombed()) {
				return false;
			}
		}
		return true;
	}

	public void create(List<Field> destination) {
//		shape = new Rectangle2D.Double();
		for(Field each : destination) {
			each.setShip(this);
//			shape.add(each.getArea());
		}
		fields = new ArrayList<Field>(destination);
	}
}