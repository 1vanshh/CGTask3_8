package ru.vsu.cs.simpleMath;

public class Multiply {

    public static Vec3f multiply(Vec3f vec3f, float[][] matrix) {
        Vec3f answer = new Vec3f();
        float[][] tmp = new float[][] {{vec3f.x}, {vec3f.y}, {vec3f.z}};

        float[][] temp = new float[3][1];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                temp[i][0] += matrix[i][j] * tmp[j][0];
            }
        }

        answer.setX(temp[0][0]);
        answer.setY(temp[1][0]);
        answer.setZ(temp[2][0]);

        return answer;
    }

    public static float[][] mult(float[][] m1, float[][] m2) {
        float[][] answer = new float[4][4];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++){
                answer[i][j] = 0;
                for (int k = 0; k < m1[0].length; k++) {
                    answer[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return answer;
    }
}
