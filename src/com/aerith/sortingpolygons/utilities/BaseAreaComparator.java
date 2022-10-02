package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.util.Comparator;

/**
 * Class description: This class is used to compare base area between two shape. it extends from Comparator interface.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
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
