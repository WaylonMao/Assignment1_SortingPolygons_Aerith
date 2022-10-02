package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.StringTokenizer;


/**
 * Class clarification: This class is used for managing all shapes. It uses reflection to generate all shapes object
 * 						and stores it on array.
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 *
 */
public class ShapeManager {

    /**
     * This array stores the Shape objects that need to be managed.
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
     * @param filePath the variable sore txt file
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
        } catch (FileNotFoundException e) {
            System.out.println("File is not found");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Class is not found");
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            System.out.println(" Method is not found");
        } catch (InvocationTargetException e) {
            System.out.println(" Something wrong with wraps an exception");
        } catch (InstantiationException e) {
            System.out.println(" Class object can not instantiated");
        } catch (IllegalAccessException e) {
            System.out.println ("Does not have access to the definition of the specified class, field, method or constructor.");
        }
    }

    /**
     * Get Shape array.
     *
     * @return Shape array
     */
    public Shape[] getShapes() {
        return shapes;
    }
}
