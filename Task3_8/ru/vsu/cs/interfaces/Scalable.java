package ru.vsu.cs.interfaces;


public interface Scalable {

    /**
     * Масштабирует модель по заданным коэффициентам вдоль осей x, y и z.
     *
     * @param scaleVector вектор масштабирования, где
     *                    scaleVector.x - коэффициент для оси x,
     *                    scaleVector.y - коэффициент для оси y,
     *                    scaleVector.z - коэффициент для оси z.
     */
    void scale(Vector3f scaleVector);

    void applyScaling();

    void resetScaling();


}
