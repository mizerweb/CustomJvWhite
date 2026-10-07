package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class g1f implements po9 {
    public final float a;
    public final Matrix b;
    public Matrix c;

    public g1f(float f) {
        this.a = f;
        Matrix matrix = new Matrix();
        this.b = matrix;
        matrix.postScale(1.0f, 1.0f);
        matrix.postRotate(f);
    }

    @Override // defpackage.po9
    public final Matrix b() {
        Matrix matrix = this.c;
        lvb.W(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.po9
    public final lag d(int i, int i2) {
        lvb.O("inputWidth must be positive", i > 0);
        lvb.O("inputHeight must be positive", i2 > 0);
        Matrix matrix = this.b;
        this.c = new Matrix(matrix);
        if (matrix.isIdentity()) {
            return new lag(i, i2);
        }
        float f = i;
        float f2 = i2;
        float f3 = f / f2;
        this.c.preScale(f3, 1.0f);
        this.c.postScale(1.0f / f3, 1.0f);
        float[][] fArr = {new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}};
        float fMax = Float.MIN_VALUE;
        float fMin = Float.MAX_VALUE;
        float fMin2 = Float.MAX_VALUE;
        float fMax2 = Float.MIN_VALUE;
        for (int i3 = 0; i3 < 4; i3++) {
            float[] fArr2 = fArr[i3];
            this.c.mapPoints(fArr2);
            fMin = Math.min(fMin, fArr2[0]);
            fMax = Math.max(fMax, fArr2[0]);
            fMin2 = Math.min(fMin2, fArr2[1]);
            fMax2 = Math.max(fMax2, fArr2[1]);
        }
        float f4 = (fMax - fMin) / 2.0f;
        float f5 = (fMax2 - fMin2) / 2.0f;
        this.c.postScale(1.0f / f4, 1.0f / f5);
        return new lag(Math.round(f * f4), Math.round(f2 * f5));
    }

    @Override // defpackage.vm7
    public final boolean f(int i, int i2) {
        lag lagVarD = d(i, i2);
        Matrix matrix = this.c;
        matrix.getClass();
        return matrix.isIdentity() && i == lagVarD.a && i2 == lagVarD.b;
    }
}
