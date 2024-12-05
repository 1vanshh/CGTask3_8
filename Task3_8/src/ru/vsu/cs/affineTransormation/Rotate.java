package ru.vsu.cs.affineTransormation;

import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.simpleMath.Vec3f;

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
    public Vec3f transformation(Vec3f vec) {
        return IAffine.super.transformation(vec);
    }

    @Override
    public float[][] getMatrix() {
        if (xRotate) return getRotateXMatrix();
        if (yRotate) return getRotateYMatrix();
        return getRotateZMatrix();
    }

    public float[][] getRotateXMatrix() {
        if (!leftRotate) {
            return new float[][] {
                    {1, 0, 0, 0},
                    {0, (float) Math.cos(Math.toRadians(angle)), (float) Math.sin(Math.toRadians(angle)), 0},
                    {0, (float) -Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0},
                    {0, 0, 0, 1}
            };
        } else return new float[][] {
                {1, 0, 0, 0},
                {0, (float) Math.cos(Math.toRadians(angle)), (float) -Math.sin(Math.toRadians(angle)), 0},
                {0, (float) Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0},
                {0, 0, 0, 1}
        };
    }

    public float[][] getRotateYMatrix() {
        if (!leftRotate) {
            return new float[][] {
                    {(float) Math.cos(Math.toRadians(angle)), 0, (float) Math.sin(Math.toRadians(angle)), 0},
                    {0, 1, 0, 0},
                    {(float) -Math.sin(Math.toRadians(angle)), 0, (float) Math.cos(Math.toRadians(angle)), 0},
                    {0, 0, 0, 1}
            };
        } else return new float[][] {
                {(float) Math.cos(Math.toRadians(angle)), 0, (float) -Math.sin(Math.toRadians(angle)), 0},
                {0, 1, 0, 0},
                {(float) Math.sin(Math.toRadians(angle)), 0, (float) Math.cos(Math.toRadians(angle)), 0},
                {0, 0, 0, 1}
        };
    }

    public float[][] getRotateZMatrix() {
        if (!leftRotate) {
            return new float[][] {
                    {(float) Math.cos(Math.toRadians(angle)), (float) Math.sin(Math.toRadians(angle)), 0, 0},
                    {(float) -Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0, 0},
                    {0, 0, 1, 0},
                    {0, 0, 0, 1}
            };
        } else return new float[][] {
                {(float) Math.cos(Math.toRadians(angle)), (float) -Math.sin(Math.toRadians(angle)), 0, 0},
                {(float) Math.sin(Math.toRadians(angle)), (float) Math.cos(Math.toRadians(angle)), 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
    }
}
