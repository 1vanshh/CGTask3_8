package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

public class Scale implements IAffine {

    private float x;
    private float y;
    private float z;

    public Scale(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Scale(Vec3f vec) {
        this.x = vec.x;
        this.y = vec.y;
        this.z = vec.z;
    }

    @Override
    public Vec3f transformation(Vec3f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public float[][] getMatrix() {
        return new float[][] {
                {x, 0, 0, 0},
                {0, y, 0, 0},
                {0, 0, z, 0},
                {0, 0, 0, 1}
        };
    }
}
