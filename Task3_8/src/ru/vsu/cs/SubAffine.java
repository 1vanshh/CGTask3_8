package ru.vsu.cs;

import ru.vsu.cs.simpleMath.Vec3f;

public interface SubAffine {

    public Vec3f vec3f();


    public void multiply(SubAffine affine);
}
