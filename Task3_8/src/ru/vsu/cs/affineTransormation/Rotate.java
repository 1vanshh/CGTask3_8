package ru.vsu.cs.affineTransormation;

import Matrixes.Matrix4f;
import ru.vsu.cs.iAffine.IAffine;

public class Rotate implements IAffine {

    public enum Axis {
        X, Y, Z
    }

    private float angle;
    private Axis axisOfRotation;
    private Matrix4f matrix;

    public Rotate(float angle, Axis axisOfRotation) {
        this.angle = angle;
        this.axisOfRotation = axisOfRotation;

        switch (axisOfRotation) {
            case X:
                getRotateXMatrix(Math.toRadians(angle));
                break;
            case Y:
                getRotateYMatrix(Math.toRadians(angle));
                break;
            case Z:
                getRotateZMatrix(Math.toRadians(angle));
                break;
        }
    }

    public Rotate() {
        matrix = Matrix4f.setIdentity();
    }

    @Override
    public Matrix4f getMatrix() {
        return matrix;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }

    public float getAngle() {
        return angle;
    }

    private void getRotateXMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        matrix = new Matrix4f(
                1, 0, 0, 0,
                0, cos, sin, 0,
                0, -sin, cos, 0,
                0, 0, 0, 1
        );
    }

    private void getRotateYMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        matrix = new Matrix4f(
                cos, 0, sin, 0,
                0, 1, 0, 0,
                -sin, 0, cos, 0,
                0, 0, 0, 1
        );
    }

    private void getRotateZMatrix(double angleRad) {
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);

        matrix = new Matrix4f(
                cos, sin, 0, 0,
                -sin, cos, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        );
    }
}
