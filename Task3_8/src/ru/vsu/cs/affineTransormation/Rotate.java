package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

public class Rotate implements IAffine {


    @Override
    public float[][] transformation(Vec3f conversionVector) {
        if (conversionVector.x == 0) {
            return new float[][]{{1, 0, 0, 0},
                                {0, (float) Math.cos(conversionVector.y), 0, 0},
                                {0, 0, conversionVector.z, 0},
                                {0, 0, 0, 1}};
        }
    }
}
