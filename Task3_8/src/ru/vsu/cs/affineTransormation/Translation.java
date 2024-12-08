package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Translation implements IAffine {

    private float x;
    private float y;
    private float z;

    public Translation(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Translation(Vector4f vec) {
        this.x = vec.getX();
        this.y = vec.getY();
        this.z = vec.getZ();
    }
    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        return new Matrix4f (
                1, 0, 0, x,
                0, 1, 0, y,
                0, 0, 0, z,
                0, 0, 0, 1
        );
    }
}
