package ru.vsu.cs.testing;


import Vectors.Vector4f;
import org.junit.jupiter.api.*;
import ru.vsu.cs.affineTransormation.Rotate;


public class RotateTest {

    @Test
    void testRightRotateX() throws Exception {
        Vector4f vec = new Vector4f(0, 1, 0, 1);
        Vector4f expected = new Vector4f(0, 0, -1, 1);
        Rotate rotate = new Rotate(90, Rotate.Axis.X);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateX() {
        Vector4f vec = new Vector4f(0, 1, 0, 1);
        Vector4f expected = new Vector4f(0, 0, 1, 1);
        Rotate rotate = new Rotate(-90, Rotate.Axis.X);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testRightRotateY() {
        Vector4f vec = new Vector4f(1, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 0, -1, 1);
        Rotate rotate = new Rotate(90, Rotate.Axis.Y);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateY() {
        Vector4f vec = new Vector4f(5, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 0, 5, 1);
        Rotate rotate = new Rotate(-90, Rotate.Axis.Y);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testRightRotateZ() {
        Vector4f vec = new Vector4f(0, 2, 0, 1);
        Vector4f expected = new Vector4f(2, 0, 0, 1);
        Rotate rotate = new Rotate(90, Rotate.Axis.Z);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testLeftRotateZ() {
        Vector4f vec = new Vector4f(7, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 7, 0, 1);
        Rotate rotate = new Rotate(-90, Rotate.Axis.Z);

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void ZeroTest() {
        Vector4f vec = new Vector4f(7, 73, 35, 1);
        Vector4f expected = new Vector4f(7, 73, 35, 1);
        Rotate rotate = new Rotate();

        Vector4f result = rotate.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }
}
