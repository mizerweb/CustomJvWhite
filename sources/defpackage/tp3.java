package defpackage;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class tp3 extends tee implements eph {
    public final af7 a;
    public final cf7 b;
    public final cf7 c;
    public final cf7 d;
    public Drawable h;
    public float e = 1.0f;
    public float f = 1.0f;
    public float g = 1.0f;
    public final Rect i = new Rect();
    public final Rect j = new Rect();
    public final int[] k = {R.attr.state_checked};
    public final int[] l = {-16842912};

    public tp3(af7 af7Var, cf7 cf7Var, cf7 cf7Var2, cf7 cf7Var3) {
        this.a = af7Var;
        this.b = cf7Var;
        this.c = cf7Var2;
        this.d = cf7Var3;
        this.h = (Drawable) af7Var.invoke();
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.P(view)))).booleanValue()) {
            rect.left = gm0.K(oc9.u(this.e, 0.0f, 1.0f) * gm0.K(36.0f * yl5.d().getDisplayMetrics().density)) + rect.left;
        }
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int iK = gm0.K(oc9.u(this.e, 0.0f, 1.0f) * (-gm0.K(36.0f * yl5.d().getDisplayMetrics().density)));
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.P(childAt)))).booleanValue()) {
                Drawable background = childAt.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    ch3.g0(rippleDrawable, iK, 0, 0, 14);
                }
            }
        }
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density) / 2;
        canvas.save();
        Rect rect = this.i;
        recyclerView.getDrawingRect(rect);
        canvas.clipRect(rect);
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                canvas.restore();
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            if (((Boolean) this.d.invoke(Integer.valueOf(iP))).booleanValue()) {
                RecyclerView.U(rect, childAt);
                Rect rect2 = this.j;
                childAt.getDrawingRect(rect2);
                int iHeight = (rect.height() - rect2.height()) / 2;
                float fU = (oc9.u(this.f, 0.0f, 1.0f) * 0.5f) + 0.5f;
                float fU2 = oc9.u(this.g, 0.0f, 1.0f);
                if (fU2 > 0.01f) {
                    this.h.setAlpha(oc9.v(gm0.K(childAt.getAlpha() * 255.0f * fU2), 0, 255));
                    int i3 = rect.left + iK + iK2;
                    int iCenterY = rect.centerY() + iHeight;
                    canvas.save();
                    float f = iCenterY;
                    canvas.translate(i3, f);
                    canvas.scale(fU, fU);
                    canvas.translate(-(rect.left + iK + iK2), -f);
                    boolean zBooleanValue = ((Boolean) this.b.invoke(Integer.valueOf(iP))).booleanValue();
                    Drawable drawable = this.h;
                    if (zBooleanValue) {
                        drawable.setState(this.k);
                        drawable.setBounds(rect.left + iK, (rect.centerY() - iK2) + iHeight, (iK2 * 2) + rect.left + iK, rect.centerY() + iK2 + iHeight);
                        drawable.draw(canvas);
                    } else {
                        drawable.setState(this.l);
                        drawable.setBounds(rect.left + iK, (rect.centerY() - iK2) + iHeight, (iK2 * 2) + rect.left + iK, rect.centerY() + iK2 + iHeight);
                        drawable.draw(canvas);
                    }
                    canvas.restore();
                }
            }
            i = i2;
        }
    }

    public final float i() {
        return this.g;
    }

    public final float j() {
        return this.f;
    }

    public final float k() {
        return this.e;
    }

    public final void l(float f) {
        this.g = f;
    }

    public final void m(float f) {
        this.f = f;
    }

    public final void n(float f) {
        this.e = f;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.h = (Drawable) this.a.invoke();
    }
}
