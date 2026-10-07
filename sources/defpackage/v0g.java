package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class v0g extends TextView {
    public final Paint a;
    public final p0g b;
    public boolean c;

    public v0g(Context context) {
        super(context, null);
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
        ex8Var.M(a8gVar.h(this).getText().c);
        a8gVar.h(this);
        m0gVar.d = -1;
        ex8Var.L(1.0f);
        ex8Var.O(gm0.K(360.0f * yl5.d().getDisplayMetrics().density));
        b(ex8Var.s());
    }

    public final void a(boolean z) {
        p0g p0gVar = this.b;
        if (!z) {
            p0gVar.d();
            this.c = false;
            invalidate();
        } else {
            this.c = true;
            if (z) {
                p0gVar.c();
            }
        }
    }

    public final void b(m0g m0gVar) {
        this.b.b(m0gVar);
        if (m0gVar.i) {
            setLayerType(2, this.a);
        } else {
            setLayerType(0, null);
        }
    }

    public final void c(int i, int i2) {
        p0g p0gVar = this.b;
        m0g m0gVar = p0gVar.f;
        if (m0gVar == null) {
            return;
        }
        if (m0gVar.e == i && m0gVar.d == i2) {
            return;
        }
        m0gVar.e = i;
        m0gVar.d = i2;
        int[] iArr = m0gVar.b;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = i2;
        iArr[3] = i;
        iArr[4] = i;
        p0gVar.e();
        p0gVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.c) {
            this.b.draw(canvas);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.d();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.b.setBounds(0, 0, getWidth(), getHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.b;
    }
}
