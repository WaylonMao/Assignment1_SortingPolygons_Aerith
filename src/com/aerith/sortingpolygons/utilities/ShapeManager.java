package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;


/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class ShapeManager {

    /**
     * This arrays stores the Shape objects that need to be managed.
     * @Fields shapes
     */
    private Shape[] shapes;

    /**
     * Default constructor for ShapeManager.
     */
    public ShapeManager() {
    }

    /**
     * This method use reflection to get Shape objects from a txt file.
     *
     * @param filePath
     */
    public void fillShapeList(String filePath) {
        try {
            BufferedReader fin = new BufferedReader(new FileReader(filePath));
            String line = fin.readLine();
            StringTokenizer st = new StringTokenizer(line, " ");
            int size = Integer.parseInt(st.nextToken());
            int index = 0;
            this.shapes = new Shape[size];

            while (st.hasMoreTokens()) {
                Object o;
                String className = st.nextToken();
                Class<?> cls = Class.forName("com.aerith.sortingpolygons.modules." + className);

                Class<?>[] paramTypes = new Class[2];
                paramTypes[0] = Double.TYPE;
                paramTypes[1] = Double.TYPE;

                Constructor<?> ct = cls.getConstructor(paramTypes);

                Object[] argList = new Object[2];
                argList[0] = Double.parseDouble(st.nextToken());
                argList[1] = Double.parseDouble(st.nextToken());
                o = ct.newInstance(argList);
                shapes[index] = (Shape) o;
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * Get Shape arrays.
     *
     * @return Shape arrays
     */
    public Shape[] getShapes() {
        return shapes;
    }
}
