package ru.vsu.cs.testing;

import Vectors.Vector4f;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.vsu.cs.affineTransormation.Rotate;
import ru.vsu.cs.affineTransormation.Scale;
import ru.vsu.cs.affineTransormation.SubAffine;
import ru.vsu.cs.affineTransormation.Translation;

public class SubAffineTest {

    @Test
    void testZeroScale() {
        Vector4f vec = new Vector4f(7, 7, 7, 1);
        Vector4f expected = new Vector4f(14, -14, 16, 1);
        Scale scale = new Scale(2, 2, 2);
        Rotate rotate = new Rotate(90, Rotate.Axis.Z);
        Translation translation = new Translation(0, 0, 1);

        SubAffine subAffine = new SubAffine();
        subAffine.add(scale);
        subAffine.add(rotate);
        subAffine.add(translation);

        Vector4f result = subAffine.getMatrix().multiplyByVector(vec);

        Assertions.assertTrue(expected.isEqual(result));
    }
}
