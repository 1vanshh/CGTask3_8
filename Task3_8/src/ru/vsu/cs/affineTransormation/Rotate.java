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
        if (xRotate) return getRotateXMatrix();
        if (yRotate) return getRotateYMatrix();
        return getRotateZMatrix();
    }

    private Matrix4f getRotateXMatrix() {
        if (!leftRotate) {
            return new Matrix4f(
                    1, 0, 0, 0,
                    0, (float) Math.cos(Math.toRadians(angle)), (float) Math.sin(Math.toRadians(angle)), 0,
                    0, (float) -Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f(
                1, 0, 0, 0,
                0, (float) Math.cos(Math.toRadians(angle)), (float) -Math.sin(Math.toRadians(angle)), 0,
                0, (float) Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0,
                0, 0, 0, 1
        );
    }

    private Matrix4f getRotateYMatrix() {
        if (!leftRotate) {
            return new Matrix4f (
                    (float) Math.cos(Math.toRadians(angle)), 0, (float) Math.sin(Math.toRadians(angle)), 0,
                    0, 1, 0, 0,
                    (float) -Math.sin(Math.toRadians(angle)), 0, (float) Math.cos(Math.toRadians(angle)), 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f (
                (float) Math.cos(Math.toRadians(angle)), 0, (float) -Math.sin(Math.toRadians(angle)), 0,
                0, 1, 0, 0,
                (float) Math.sin(Math.toRadians(angle)), 0, (float) Math.cos(Math.toRadians(angle)), 0,
                0, 0, 0, 1
        );
    }

    private Matrix4f getRotateZMatrix() {
        if (!leftRotate) {
            return new Matrix4f (
                    (float) Math.cos(Math.toRadians(angle)), (float) Math.sin(Math.toRadians(angle)), 0, 0,
                    (float) -Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0, 0,
                    0, 0, 1, 0,
                    0, 0, 0, 1
            );
        } else return new Matrix4f (
                (float) Math.cos(Math.toRadians(angle)), (float) -Math.sin(Math.toRadians(angle)), 0, 0,
                (float) Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        );
    }
}
