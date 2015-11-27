package main.java.model.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public enum Orientation {
		LEFT_TO_RIGHT(0) {
			public Cell[] getAffectedCells(int length, Cell[][] matrix, Cell dest) {
				int x = dest.getX();
				int y = dest.getY();
				Cell[] res = new Cell[length];
				for(int i = 0; i < length; i++) {
					res[i] = matrix[x][y + i];
				}
				return res;
			}
		},
		RIGHT_TO_LEFT(2) {
			public Cell[] getAffectedCells(int length, Cell[][] matrix, Cell dest) {
				int x = dest.getX();
				int y = dest.getY();
				Cell[] res = new Cell[length];
				for(int i = 0; i < length; i++) {
					res[i] = matrix[x][y - i];
				}
				return res;
			}
		},
		TOP_TO_BUTTOM(1) {
			public Cell[] getAffectedCells(int length, Cell[][] matrix, Cell dest) {
				int x = dest.getX();
				int y = dest.getY();
				Cell[] res = new Cell[length];
				for(int i = 0; i < length; i++) {
					res[i] = matrix[x + i][y];
				}
				return res;
			}
		},
		BOTTOM_TO_TOP(3) {
			public Cell[] getAffectedCells(int length, Cell[][] matrix, Cell dest) {
				int x = dest.getX();
				int y = dest.getY();
				Cell[] res = new Cell[length];
				for(int i = 0; i < length; i++) {
					res[i] = matrix[x + i][y];
				}
				return res;
			}
		};
		private final int code;
		private Orientation(int code) {
			this.code = code;
		}
		private int getCode() {
			return code;
		}
		
		private static Map<Integer, Orientation> CODE_MAP;
		static {
			Map<Integer, Orientation> tmp = new HashMap<Integer, Orientation>();
			for(Orientation o : values()) {
				tmp.put(o.getCode(), o);
			}
			CODE_MAP = Collections.unmodifiableMap(tmp);
		}
		
		public static Orientation getByCode(int code) {
			return CODE_MAP.get(code);
		}
		public abstract Cell[] getAffectedCells(int length, Cell[][] matrix, Cell dest);

}
