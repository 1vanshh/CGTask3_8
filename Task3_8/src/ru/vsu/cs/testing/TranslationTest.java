package ru.vsu.cs.testing;

import Vectors.Vector4f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.affineTransormation.Translation;

public class TranslationTest {

    @Test
    void testTranslateX() {
        Vector4f vec = new Vector4f(0, 0, 0, 1);
        Vector4f expected = new Vector4f(1, 0, 0, 1);
        Translation translation = new Translation(1, 0, 0);

        Vector4f result = translation.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testTranslateY() {
        Vector4f vec = new Vector4f(0, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 1, 0, 1);
        Translation translation = new Translation(0, 1, 0);

        Vector4f result = translation.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testTranslateZ() {
        Vector4f vec = new Vector4f(0, 0, 0, 1);
        Vector4f expected = new Vector4f(0, 0, 1, 1);
        Translation translation = new Translation(0, 0, 1);

        Vector4f result = translation.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testTranslateXYZ() {
        Vector4f vec = new Vector4f(0, 0, 0, 1);
        Vector4f expected = new Vector4f(1, 1, 1, 1);
        Translation translation = new Translation(1, 1, 1);

        Vector4f result = translation.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }

    @Test
    void testZero() {
        Vector4f vec = new Vector4f(123, 431, 1234, 1);
        Vector4f expected = new Vector4f(123, 431, 1234, 1);
        Translation translation = new Translation();

        Vector4f result = translation.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }
}
