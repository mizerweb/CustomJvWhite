package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class a6a extends a2i {
    public final View g;
    public final float h;
    public float j;
    public float k;
    public float m;
    public boolean n;
    public final long i = Long.MIN_VALUE;
    public float l = 1.0f;

    public a6a(View view, float f) {
        this.g = view;
        this.h = f;
        new RectF();
    }

    @Override // defpackage.a2i
    public final long a() {
        return this.i;
    }

    @Override // defpackage.a2i
    public final float b() {
        return this.g.getWidth() / 2.0f;
    }

    @Override // defpackage.a2i
    public final float c() {
        return this.g.getHeight() / 2.0f;
    }

    @Override // defpackage.a2i
    public final float d() {
        return this.m;
    }

    @Override // defpackage.a2i
    public final float e() {
        return this.l;
    }

    @Override // defpackage.a2i
    public final float g() {
        t();
        return this.j;
    }

    @Override // defpackage.a2i
    public final float h() {
        t();
        return this.k;
    }

    @Override // defpackage.a2i
    public final boolean i(float f, float f2) {
        return false;
    }

    @Override // defpackage.a2i
    public final boolean j(float f, float f2) {
        return false;
    }

    @Override // defpackage.a2i
    public final void l(Canvas canvas, float f) {
    }

    @Override // defpackage.a2i
    public final void n(float f) {
        this.m = f;
        s();
    }

    @Override // defpackage.a2i
    public final void o(float f) {
        View view = this.g;
        int width = view.getWidth();
        if (width < 1) {
            width = 1;
        }
        int height = view.getHeight();
        int i = height >= 1 ? height : 1;
        float f2 = width;
        float f3 = this.h;
        float fMax = Math.max(f3 / f2, f3 / i);
        if (f < fMax) {
            f = fMax;
        }
        this.l = f;
        s();
    }

    @Override // defpackage.a2i
    public final void p(float f) {
        t();
        this.j = f;
        s();
    }

    @Override // defpackage.a2i
    public final void q(float f) {
        t();
        this.k = f;
        s();
    }

    public final void s() {
        float fB = b();
        float fC = c();
        View view = this.g;
        view.setPivotX(fB);
        view.setPivotY(fC);
        view.setScaleX(this.l);
        view.setScaleY(this.l);
        view.setRotation(this.m);
        view.setTranslationX((this.j - view.getLeft()) - fB);
        view.setTranslationY((this.k - view.getTop()) - fC);
    }

    public final void t() {
        if (this.n) {
            return;
        }
        View view = this.g;
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            return;
        }
        this.n = true;
        this.j = b() + view.getLeft();
        this.k = c() + view.getTop();
    }
}
