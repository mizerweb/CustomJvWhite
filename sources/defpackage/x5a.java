package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes3.dex */
public final class x5a implements po9 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public Matrix g = new Matrix();

    public x5a(float f, float f2, float f3, float f4, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.po9
    public final Matrix b() {
        return this.g;
    }

    @Override // defpackage.po9
    public final lag d(int i, int i2) {
        float f = i / i2;
        float f2 = ((this.c * 2.0f) / this.e) - 1.0f;
        float f3 = ((this.d * 2.0f) / this.f) - 1.0f;
        Matrix matrix = new Matrix();
        matrix.preScale(f, 1.0f);
        float f4 = this.a;
        matrix.postScale(f4, f4);
        matrix.postRotate(-this.b);
        matrix.postTranslate(f2 * f, -f3);
        matrix.postScale(1.0f / f, 1.0f);
        this.g = matrix;
        return new lag(i, i2);
    }

    @Override // defpackage.vm7
    public final boolean f(int i, int i2) {
        d(i, i2);
        return this.g.isIdentity();
    }
}
