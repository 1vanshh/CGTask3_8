package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

public class Scale implements IAffine {

    @Override
    public float[][] transformation(Vec3f conversionVector) {
        return new float[][] {{conversionVector.x, 0, 0, 0},
                {0, conversionVector.y, 0, 0},
                {0, 0, conversionVector.z, 0},
                {0, 0, 0, 1}};
    }
}
