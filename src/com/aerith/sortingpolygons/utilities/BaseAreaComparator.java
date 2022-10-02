package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.util.Comparator;

/**
 * Class description: This class is a Comparator for compare Shape objects by their base area.
 *
 * @author Weilong Mao
 */
public class BaseAreaComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getBaseArea() > o2.getBaseArea()) {
            return 1;
        } else if (o1.getBaseArea() < o2.getBaseArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}
