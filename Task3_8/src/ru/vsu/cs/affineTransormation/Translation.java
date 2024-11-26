package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

public class Translation implements IAffine {

    @Override
    public float[][] transformation(Vec3f conversionVector) {
        return new float[0][];
    }
}
