package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class oag {
    public float A;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public boolean s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public final a8b r = new a8b(16);
    public final RectF y = new RectF();
    public final RectF z = new RectF();

    public final float a(float f) {
        int i = this.q;
        RectF rectF = this.y;
        if (i <= 1) {
            return rectF.left;
        }
        a8b a8bVar = this.r;
        int i2 = 0;
        float fB = (a8bVar.b(1) - a8bVar.b(0)) / 2.0f;
        int i3 = a8bVar.b - 1;
        float f2 = rectF.left;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            float fB2 = a8bVar.b(i4);
            float f3 = fB2 - f;
            if (Math.abs(f3) <= fB) {
                return fB2;
            }
            if (Math.abs(f3) < Math.abs(f2 - f)) {
                f2 = fB2;
            }
            if (fB2 < f) {
                i2 = i4 + 1;
            } else {
                i3 = i4 - 1;
            }
        }
        return f2;
    }

    public final void b(int i) {
        this.q = i;
        RectF rectF = this.y;
        float fK = gm0.K(rectF.width());
        int i2 = this.q - 1;
        float f = fK / (i2 >= 1 ? i2 : 1);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i3 = this.f;
        float f2 = (((this.d - i3) - this.h) / 2.0f) + i3;
        float f3 = iK / 2.0f;
        this.o = f2 - f3;
        this.p = f2 + f3;
        float f4 = rectF.left;
        int i4 = this.q;
        a8b a8bVar = this.r;
        float[] fArr = a8bVar.a;
        if (fArr.length < i4) {
            a8bVar.a = Arrays.copyOf(fArr, Math.max(i4, (fArr.length * 3) / 2));
        }
        int i5 = this.q;
        for (int i6 = 0; i6 < i5; i6++) {
            float f5 = (i6 * f) + f4;
            int i7 = a8bVar.b;
            if (i7 <= i6) {
                a8bVar.a(f5);
            } else {
                if (i6 < 0 || i6 >= i7) {
                    gol.e("Index must be between 0 and size");
                    throw null;
                }
                float[] fArr2 = a8bVar.a;
                float f6 = fArr2[i6];
                fArr2[i6] = f5;
            }
        }
    }

    public final void c(float f) {
        RectF rectF = this.y;
        this.A = oc9.u(f, rectF.left, rectF.right);
    }

    public final void d() {
        int i = this.f;
        float f = (((this.d - i) - this.h) / 2.0f) + i;
        RectF rectF = this.y;
        rectF.top = f;
        rectF.bottom = f;
        float f2 = this.u;
        float f3 = f2 > 0.0f ? f2 + this.w : this.i;
        float f4 = this.v;
        float f5 = f4 > 0.0f ? f4 + this.x : this.l;
        boolean z = this.s;
        int i2 = this.e;
        if (z) {
            float fK = i2 + f3 + gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
            rectF.left = fK >= 0.0f ? fK : 0.0f;
            float fK2 = ((this.c - this.g) - f5) - gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
            float f6 = rectF.left;
            if (fK2 < f6) {
                fK2 = f6;
            }
            rectF.right = fK2;
        } else {
            float f7 = i2 + f3;
            float f8 = f7 >= 0.0f ? f7 : 0.0f;
            rectF.left = f8;
            float f9 = (this.c - this.g) - f5;
            if (f9 >= f8) {
                f8 = f9;
            }
            rectF.right = f8;
        }
        this.A = oc9.u(this.A, rectF.left, rectF.right);
        boolean z2 = this.s;
        RectF rectF2 = this.z;
        if (z2) {
            rectF2.set(rectF.left - (gm0.K(yl5.d().getDisplayMetrics().density * 12.0f) - this.t), rectF.top, (gm0.K(12.0f * yl5.d().getDisplayMetrics().density) - this.t) + rectF.right, rectF.bottom);
        } else {
            rectF2.set(rectF);
        }
    }
}
