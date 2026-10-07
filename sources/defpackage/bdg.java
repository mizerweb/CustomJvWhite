package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bdg implements cdg {
    public final float[] a;
    public float[] b;
    public float[] c;
    public float[] d;
    public double e;
    public double f;
    public double g;
    public final /* synthetic */ edg h;

    public bdg(edg edgVar) {
        this.h = edgVar;
        int i = edgVar.h;
        this.a = new float[i];
        int i2 = i * edgVar.b;
        this.b = new float[i2];
        this.c = new float[i2];
        this.d = new float[i2];
    }

    @Override // defpackage.cdg
    public final Object a() {
        return this.b;
    }

    @Override // defpackage.cdg
    public final void b(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.b;
        edg edgVar = this.h;
        floatBufferAsFloatBuffer.get(fArr, edgVar.j * edgVar.b, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }

    @Override // defpackage.cdg
    public final void c(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.c;
        int i2 = this.h.b;
        floatBufferAsFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    @Override // defpackage.cdg
    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < this.h.b * i2; i3++) {
            this.b[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.cdg
    public final void e(int i, int i2) {
        edg edgVar = this.h;
        int i3 = edgVar.h / i2;
        int i4 = edgVar.b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += (double) this.b[(i7 * i5) + i6 + i8];
            }
            this.a[i7] = (float) (d / ((double) i5));
        }
    }

    @Override // defpackage.cdg
    public final int f(int i, int i2, int i3) {
        return s(this.b, i, i2, i3);
    }

    @Override // defpackage.cdg
    public final void flush() {
        this.g = 0.0d;
        this.e = 0.0d;
        this.f = 0.0d;
    }

    @Override // defpackage.cdg
    public final void g(int i) {
        this.c = r(this.h.k, i, this.c);
    }

    @Override // defpackage.cdg
    public final boolean h() {
        double d = this.e;
        return d != 0.0d && this.h.p != 0 && this.f <= d * 3.0d && d * 2.0d > this.g * 3.0d;
    }

    @Override // defpackage.cdg
    public final void i(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.c;
        float[] fArr2 = this.b;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.cdg
    public final void j(int i) {
        this.b = r(this.h.j, i, this.b);
    }

    @Override // defpackage.cdg
    public final int k(int i, int i2) {
        return s(this.a, 0, i, i2);
    }

    @Override // defpackage.cdg
    public final void l(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            edg edgVar = this.h;
            int i3 = edgVar.b;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.c;
            int i4 = (edgVar.k * i3) + i2;
            float[] fArr2 = this.d;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = ((long) edgVar.n) * j;
            int i6 = edgVar.m;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            fArr[i4] = (((j6 - j5) * f2) + (j5 * f)) / j6;
            i2++;
        }
    }

    @Override // defpackage.cdg
    public final void m() {
        this.g = this.e;
    }

    @Override // defpackage.cdg
    public final Object n() {
        return this.c;
    }

    @Override // defpackage.cdg
    public final Object o() {
        return this.d;
    }

    @Override // defpackage.cdg
    public final void p(int i) {
        this.d = r(this.h.l, i, this.d);
    }

    @Override // defpackage.cdg
    public final int q() {
        return 4;
    }

    public final float[] r(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.h.b;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int s(float[] fArr, int i, int i2, int i3) {
        int i4 = this.h.b * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double dAbs = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                dAbs += (double) Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d3 = i7;
            if (((double) i5) * dAbs < d * d3) {
                i5 = i7;
                d = dAbs;
            }
            if (((double) i6) * dAbs > d3 * d2) {
                i6 = i7;
                d2 = dAbs;
            }
            i7++;
            i4 = i9;
        }
        this.e = d / ((double) i5);
        this.f = d2 / ((double) i6);
        return i5;
    }
}
