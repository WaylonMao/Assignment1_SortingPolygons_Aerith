package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.util.Comparator;

/**
 * Class description: This class is a Comparator for compare Shape objects by their volume.
 *
 * @author Weilong Mao
 */
public class VolumeComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape o1, Shape o2) {
        if (o1.getVolume() > o2.getVolume()) {
            return 1;
        } else if (o1.getVolume() < o2.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
