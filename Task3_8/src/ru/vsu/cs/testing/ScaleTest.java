package ru.vsu.cs.testing;

import Vectors.Vector4f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.affineTransormation.Scale;

public class ScaleTest {

    @Test
    void testZeroScale() {
        Vector4f vec = new Vector4f(7, 7, 7, 1);
        Vector4f expected = new Vector4f(7, 7, 7, 1);
        Scale scale = new Scale(1, 1, 1);

        Vector4f result = scale.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testScale() {
        Vector4f vec = new Vector4f(-1, 2, 5, 1);
        Vector4f expected = new Vector4f(2, 4, 2.5f, 1);
        Scale scale = new Scale(-2, 2, 0.5f);

        Vector4f result = scale.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }
}
