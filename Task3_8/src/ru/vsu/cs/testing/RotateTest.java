package ru.vsu.cs.testing;


import Vectors.Vector4f;
import org.junit.jupiter.api.*;
import ru.vsu.cs.affineTransormation.Rotate;


public class RotateTest {

    @Test
    void testRightRotateX() {
        Vector4f vec = new Vector4f(0, 1, 0, 1);
        Vector4f expected = new Vector4f(0, 0, -1, 1);
        Rotate rotate = new Rotate(90, true, false, false, false);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateX() {
        Vector4f vec = new Vector4f(0, 1, 0, 1);
        Vector4f expected = new Vector4f(0, 0, 1, 1);
        Rotate rotate = new Rotate(90, true, false, false, true);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testRightRotateY() {
        Vector4f vec = new Vector4f(1, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 0, -1, 1);
        Rotate rotate = new Rotate(90, false, true, false, false);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateY() {
        Vector4f vec = new Vector4f(5, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 0, 5, 1);
        Rotate rotate = new Rotate(90, false, true, false, true);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testRightRotateZ() {
        Vector4f vec = new Vector4f(0, 2, 0, 1);
        Vector4f expected = new Vector4f(2, 0, 0, 1);
        Rotate rotate = new Rotate(90, false, false, true, false);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateZ() {
        Vector4f vec = new Vector4f(7, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 7, 0, 1);
        Rotate rotate = new Rotate(90, false, false, true, true);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }
}
