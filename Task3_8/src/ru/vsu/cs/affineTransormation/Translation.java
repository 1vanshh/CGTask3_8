package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

public class Translation implements IAffine {

    private float x;
    private float y;
    private float z;

    public Translation(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Translation(Vec3f vec) {
        this.x = vec.x;
        this.y = vec.y;
        this.z = vec.z;
    }
    // TODO: Неправильно считает, нужно складывать, а он только умножает
    @Override
    public Vec3f transformation(Vec3f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public float[][] getMatrix() {
        return new float[][] {
                {1, 0, 0, x},
                {0, 1, 0, y},
                {0, 0, 0, z},
                {0, 0, 0, 1}
        };
    }
}
