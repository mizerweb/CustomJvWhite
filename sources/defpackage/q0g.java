package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class q0g extends FrameLayout {
    public final Paint a;
    public final p0g b;
    public boolean c;

    public q0g(Context context) {
        super(context, null, 0);
        this.a = new Paint();
        p0g p0gVar = new p0g();
        this.b = p0gVar;
        this.c = true;
        setWillNotDraw(false);
        p0gVar.setCallback(this);
        ex8 ex8Var = new ex8(28);
        m0g m0gVar = (m0g) ex8Var.b;
        m0gVar.j = false;
        a8g a8gVar = pq3.j;
        ex8Var.M(a8gVar.h(this).getText().b);
        m0gVar.d = a8gVar.h(this).h().d;
        ex8Var.L(1.0f);
        ex8Var.O(gm0.K(360.0f * yl5.d().getDisplayMetrics().density));
        a(ex8Var.s());
    }

    public final void a(m0g m0gVar) {
        this.b.b(m0gVar);
        if (m0gVar.i) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, null);
        }
    }

    public final void b() {
        this.b.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
