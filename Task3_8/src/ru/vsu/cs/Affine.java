package ru.vsu.cs;

import ru.vsu.cs.simpleMath.Vec3f;

import java.util.ArrayList;
import java.util.List;

public class Affine implements SubAffine{

    private List<SubAffine> affines;

    public Affine(SubAffine ... affines) {
        this.affines = new ArrayList<>();
        for (SubAffine affine : affines) {
            this.affines.add(affine);
        }
    }

    @Override
    public Vec3f vec3f() {
        return null;
    }

    @Override
    public void multiply(SubAffine affine) {
        affines.add(affine);
    }
}
