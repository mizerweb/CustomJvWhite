package defpackage;

import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public final class cgd implements po9 {
    public final int a;
    public final int b;
    public float c = -1.0f;
    public final int d = 9729;
    public final int e = 1;
    public float f = -1.0f;
    public float g = -1.0f;
    public Matrix h = new Matrix();

    public cgd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static cgd g(int i, int i2) {
        lvb.Q("width %s must be positive", i, i > 0);
        lvb.Q("height %s must be positive", i2, i2 > 0);
        return new cgd(i, i2);
    }

    @Override // defpackage.po9
    public final Matrix b() {
        Matrix matrix = this.h;
        lvb.W(matrix, "configure must be called first");
        return matrix;
    }

    @Override // defpackage.po9
    public final int c() {
        return this.d;
    }

    @Override // defpackage.po9
    public final lag d(int i, int i2) {
        lvb.O("inputWidth must be positive", i > 0);
        lvb.O("inputHeight must be positive", i2 > 0);
        Matrix matrix = new Matrix();
        this.h = matrix;
        float f = i;
        this.f = f;
        float f2 = i2;
        this.g = f2;
        int i3 = this.a;
        int i4 = this.b;
        if (i3 != -1 && i4 != -1) {
            this.c = i3 / i4;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            if (f3 > f4) {
                matrix.setScale(f4 / f3, 1.0f);
                this.f = this.g * this.c;
            } else {
                matrix.setScale(1.0f, f3 / f4);
                this.g = this.f / this.c;
            }
        }
        if (i4 != -1) {
            if (i3 != -1) {
                this.f = i3;
                this.g = i4;
            } else {
                float f5 = i4;
                float f6 = (this.f * f5) / this.g;
                this.f = f6;
                double d = f6;
                int i5 = this.e;
                this.f = Math.round(d / ((double) i5)) * ((long) i5);
                this.g = f5;
            }
        }
        return new lag(Math.round(this.f), Math.round(this.g));
    }

    @Override // defpackage.vm7
    public final boolean f(int i, int i2) {
        d(i, i2);
        Matrix matrix = this.h;
        matrix.getClass();
        return matrix.isIdentity() && i == Math.round(this.f) && i2 == Math.round(this.g);
    }
}
