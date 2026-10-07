package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ak4 extends tee implements eph {
    public final p3c a;
    public final zj4 b;
    public final Rect c = new Rect();
    public final f8b d;
    public final Paint e;
    public final v56 f;

    public ak4(p3c p3cVar, kbc kbcVar, zj4 zj4Var) {
        this.a = p3cVar;
        this.b = zj4Var;
        f8b f8bVar = jj8.a;
        this.d = new f8b();
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
        this.e = paint;
        this.f = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        p3c p3cVar = this.a;
        zj4 zj4Var = this.b;
        Character chG = (zj4Var == null || !zj4Var.f(iP)) ? p3cVar.G(iP) : null;
        f8b f8bVar = this.d;
        if (chG == null) {
            f8bVar.i(iP);
            return;
        }
        if (iP <= 0) {
            rect.top = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        } else if (chG.equals(p3cVar.G(iP - 1))) {
            f8bVar.i(iP);
        } else {
            rect.top = (int) (this.e.getStrokeWidth() + c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2));
            f8bVar.a(iP);
        }
        this.f.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            if (this.d.d(iP)) {
                v56 v56Var = this.f;
                Rect rect = this.c;
                v56Var.E(rect, childAt, iP);
                canvas2 = canvas;
                canvas2.drawLine(rect.left + iK, rect.centerY(), rect.right - iK, rect.centerY(), this.e);
            } else {
                canvas2 = canvas;
            }
            i = i2;
            canvas = canvas2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.e.setColor(kbcVar.B().b);
    }
}
