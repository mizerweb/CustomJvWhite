package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class yc8 extends xt5 {
    public final hu5 l;
    public f2 m;
    public dsi n;

    public yc8(Context context, js0 js0Var, hu5 hu5Var, f2 f2Var) {
        super(context, js0Var);
        this.l = hu5Var;
        this.m = f2Var;
        f2Var.a = this;
    }

    @Override // defpackage.xt5
    public final boolean d(boolean z, boolean z2, boolean z3) {
        dsi dsiVar;
        boolean zD = super.d(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (dsiVar = this.n) != null) {
            return dsiVar.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.m.c();
        }
        if (z && z3) {
            this.m.k();
        }
        return zD;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        dsi dsiVar;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            zk zkVar = this.c;
            js0 js0Var = this.b;
            if (zkVar != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (dsiVar = this.n) != null) {
                dsiVar.setBounds(getBounds());
                this.n.setTint(js0Var.c[0]);
                this.n.draw(canvas);
                return;
            }
            canvas.save();
            Rect bounds = getBounds();
            float fB = b();
            ObjectAnimator objectAnimator = this.d;
            boolean z = objectAnimator != null && objectAnimator.isRunning();
            ObjectAnimator objectAnimator2 = this.e;
            boolean z2 = objectAnimator2 != null && objectAnimator2.isRunning();
            hu5 hu5Var = this.l;
            hu5Var.a.a();
            hu5Var.a(canvas, bounds, fB, z, z2);
            int i2 = js0Var.g;
            int i3 = this.j;
            Paint paint = this.i;
            if (i2 == 0) {
                this.l.d(canvas, paint, 0.0f, 1.0f, js0Var.d, i3, 0);
                i = i2;
            } else {
                gu5 gu5Var = (gu5) ((ArrayList) this.m.b).get(0);
                gu5 gu5Var2 = (gu5) qv1.f(1, (ArrayList) this.m.b);
                hu5 hu5Var2 = this.l;
                if (hu5Var2 instanceof o19) {
                    i = i2;
                    hu5Var2.d(canvas, paint, 0.0f, gu5Var.a, js0Var.d, i3, i);
                    this.l.d(canvas, paint, gu5Var2.b, 1.0f, js0Var.d, i3, i);
                } else {
                    i = i2;
                    i3 = 0;
                    hu5Var2.d(canvas, paint, gu5Var2.b, gu5Var.a + 1.0f, js0Var.d, 0, i);
                }
            }
            for (int i4 = 0; i4 < ((ArrayList) this.m.b).size(); i4++) {
                gu5 gu5Var3 = (gu5) ((ArrayList) this.m.b).get(i4);
                this.l.c(canvas, paint, gu5Var3, this.j);
                if (i4 > 0 && i > 0) {
                    this.l.d(canvas, paint, ((gu5) ((ArrayList) this.m.b).get(i4 - 1)).b, gu5Var3.a, js0Var.d, i3, i);
                }
            }
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.l.e();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.l.f();
    }
}
