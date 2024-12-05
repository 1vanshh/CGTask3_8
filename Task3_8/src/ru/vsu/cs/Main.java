package ru.vsu.cs;

import ru.vsu.cs.affineTransormation.Rotate;
import ru.vsu.cs.affineTransormation.Scale;
import ru.vsu.cs.affineTransormation.Translation;
import ru.vsu.cs.iAffine.IAffine;
import ru.vsu.cs.iAffine.SubAffine;
import ru.vsu.cs.simpleMath.Multiply;
import ru.vsu.cs.simpleMath.Vec3f;

public class Main {

    public static Vec3f transform(Vec3f f, IAffine affine) {
        Vec3f a = Multiply.multiply(f, affine.getMatrix());
        return a;
    }
    public static void main(String[] args) {

        Vec3f vec = new Vec3f(1, 3, 2);

        Rotate r = new Rotate(90, false, false, true, false);
        Translation t = new Translation(5, 2, -1);
        Scale s = new Scale(5, -1, 2);

        SubAffine sub = new SubAffine();

        sub.add(r);

        Vec3f a = transform(vec, s);

        System.out.println(a);
    }
}