package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import Vectors.Vector4f;
import ru.vsu.cs.iAffine.IAffine;

public class Rotate implements IAffine {

    private float angle;
    private boolean xRotate;
    private boolean yRotate;
    private boolean zRotate;
    private boolean leftRotate;

    public Rotate(float angle, boolean xRotate, boolean yRotate, boolean zRotate, boolean leftRotate) {
        this.angle = angle;
        this.xRotate = xRotate;
        this.yRotate = yRotate;
        this.zRotate = zRotate;
        this.leftRotate = leftRotate;
    }

    @Override
    public Vector4f transformation(Vector4f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public Matrix4f getMatrix() {
        double angleRad = Math.toRadians(angle);
        Matrix4f matrix = Matrix4f.setIdentity();

        if (xRotate) matrix = matrix.matrixProduct(getRotateXMatrix(angleRad));
        if (yRotate) matrix = matrix.matrixProduct(getRotateYMatrix(angleRad));
        if (zRotate) matrix = matrix.matrixProduct(getRotateZMatrix(angleRad));

        return matrix;
    }

    private Matrix4f getRotateXMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        if (leftRotate) {
            return new Matrix4f(
                    1, 0, 0, 0,
                    0, cos, -sin, 0,
                    0, sin, cos, 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f(
                1, 0, 0, 0,
                0, cos, sin, 0,
                0, -sin, cos, 0,
                0, 0, 0, 1
        );
    }

    private Matrix4f getRotateYMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        if (leftRotate) {
            return new Matrix4f(
                    cos, 0, sin, 0,
                    0, 1, 0, 0,
                    -sin, 0, cos, 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f(
                cos, 0, -sin, 0,
                0, 1, 0, 0,
                sin, 0, cos, 0,
                0, 0, 0, 1
        );
    }

    private Matrix4f getRotateZMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        if (leftRotate) {
            return new Matrix4f(
                    cos, -sin, 0, 0,
                    sin, cos, 0, 0,
                    0, 0, 1, 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f(
                cos, sin, 0, 0,
                -sin, cos, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        );
    }
}
