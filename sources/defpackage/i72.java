package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* JADX INFO: loaded from: classes2.dex */
public final class i72 {
    public boolean A;
    public tc B;
    public volatile float D;
    public final View a;
    public int c;
    public int d;
    public int e;
    public int f;
    public TextureViewRenderer g;
    public final ScaleGestureDetector j;
    public boolean k;
    public boolean l;
    public boolean m;
    public final GestureDetector n;
    public ValueAnimator u;
    public boolean v;
    public boolean x;
    public boolean z;
    public final h72 b = new h72(this);
    public final Matrix h = new Matrix();
    public final Matrix i = new Matrix();
    public final float[] o = new float[2];
    public final float[] p = new float[2];
    public final float[] q = new float[4];
    public final float[] r = new float[4];
    public final float[] s = new float[4];
    public final Matrix t = new Matrix();
    public final c72 w = new c72();
    public boolean y = true;
    public int C = 100;

    public i72(c62 c62Var) {
        this.a = c62Var;
        this.j = new ScaleGestureDetector(c62Var.getContext(), new g72(0, this));
        this.n = new GestureDetector(c62Var.getContext(), new pi9(7, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [float[], java.io.Serializable] */
    public final void a(Matrix matrix) {
        g();
        float[] fArr = new float[9];
        ?? r0 = new float[9];
        this.t.getValues(fArr);
        matrix.getValues(r0);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new d72(0, r0, fArr, this));
        valueAnimatorOfFloat.addListener(new li(4, this));
        valueAnimatorOfFloat.setInterpolator(this.w);
        valueAnimatorOfFloat.setDuration(150L);
        this.u = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void b() {
        TextureViewRenderer textureViewRenderer = this.g;
        if (textureViewRenderer != null) {
            textureViewRenderer.setTransform(this.t);
            if (textureViewRenderer.isAttachedToWindow()) {
                textureViewRenderer.invalidate();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004b  */
    public final ylc c(float[] fArr) {
        float f;
        View view = this.a;
        float width = view.getWidth();
        float height = view.getHeight();
        int i = this.c;
        float f2 = (i - width) / 2.0f;
        int i2 = this.d;
        float f3 = (i2 - height) / 2.0f;
        float f4 = (i + width) / 2.0f;
        float f5 = (i2 + height) / 2.0f;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = fArr[3];
        float f10 = f8 - f6;
        float f11 = f9 - f7;
        float f12 = 0.0f;
        if (f6 < f2 && f8 > f4) {
            f = 0.0f;
        } else if (f10 <= width) {
            f = ((i - f10) / 2.0f) - f6;
        } else if (f6 > f2) {
            f = f2 - f6;
        } else if (f8 < f4) {
            f = f4 - f8;
        } else {
            f = 0.0f;
        }
        if (f7 >= f3 || f9 <= f5) {
            if (f11 <= height) {
                f12 = ((i2 - f11) / 2.0f) - f7;
            } else if (f7 > f3) {
                f12 = f3 - f7;
            } else if (f9 < f5) {
                f12 = f5 - f9;
            }
        }
        return new ylc(Float.valueOf(f), Float.valueOf(f12));
    }

    public final void d(int i) {
        if (this.C == i) {
            return;
        }
        this.C = i;
        tc tcVar = this.B;
        if (tcVar != null) {
            tcVar.invoke(Integer.valueOf(i));
        }
    }

    public final void e(boolean z) {
        int i;
        int i2;
        int i3;
        g();
        int i4 = this.e;
        if (i4 == 0 || (i = this.f) == 0) {
            return;
        }
        this.D = i4 / i;
        if (!z || cqk.d(this.t, this.h)) {
            h();
            this.t.set(this.h);
        } else {
            Matrix matrix = this.t;
            float[] fArr = this.r;
            float[] fArr2 = this.q;
            matrix.mapPoints(fArr, fArr2);
            float f = fArr[2];
            boolean z2 = false;
            float f2 = fArr[0];
            float f3 = f - f2;
            float f4 = fArr[3];
            float f5 = fArr[1];
            float f6 = f4 - f5;
            float fMax = Math.max((f3 <= 0.0f || (i3 = this.c) <= 0) ? 1.0f : f3 / i3, (f6 <= 0.0f || (i2 = this.d) <= 0) ? 1.0f : f6 / i2);
            if (1.0f <= fMax && fMax <= 3.0f) {
                matrix.reset();
                matrix.postScale(fMax, fMax, 0.0f, 0.0f);
                matrix.mapPoints(fArr, fArr2);
                float f7 = f2 - fArr[0];
                float f8 = f5 - fArr[1];
                if (f7 != 0.0f || f8 != 0.0f) {
                    matrix.postTranslate(f7, f8);
                }
                z2 = true;
            }
            h();
            if (!z2) {
                this.t.set(this.h);
            }
        }
        b();
    }

    public final void f(TextureViewRenderer textureViewRenderer) {
        if (cqk.d(textureViewRenderer, this.g)) {
            return;
        }
        TextureViewRenderer textureViewRenderer2 = this.g;
        if (textureViewRenderer2 != null) {
            textureViewRenderer2.setSizeChangeListener(null);
        }
        if (textureViewRenderer != null) {
            textureViewRenderer.setSizeChangeListener(this.b);
        }
        this.g = textureViewRenderer;
        b();
    }

    public final void g() {
        ValueAnimator valueAnimator = this.u;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                valueAnimator.cancel();
            }
            this.u = null;
        }
    }

    public final void h() {
        float fMax;
        if (this.e == 0 || this.f == 0 || this.d == 0 || this.c == 0) {
            fMax = 1.0f;
        } else {
            float width = this.a.getWidth();
            float height = this.a.getHeight();
            if (this.y) {
                fMax = (this.D <= width / height || this.D < 1.0f) ? this.d / height : this.c / width;
            } else {
                fMax = Math.max(this.c / width, this.d / height);
            }
        }
        float f = 1.0f / fMax;
        this.h.reset();
        this.h.postScale(f, f, this.c / 2.0f, this.d / 2.0f);
    }
}
