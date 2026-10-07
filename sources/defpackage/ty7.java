package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class ty7 extends tee implements eph {
    public final float a;
    public final qyb b;
    public final int c;
    public final int d;
    public final v56 e;
    public final Rect f;
    public final Paint g;

    public ty7(kbc kbcVar, qyb qybVar) {
        float f = yl5.d().getDisplayMetrics().density * 1.0f;
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(4.0f * yl5.d().getDisplayMetrics().density);
        this.a = f;
        this.b = qybVar;
        this.c = iK;
        this.d = iK2;
        this.e = new v56(9, (byte) 0);
        this.f = new Rect();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(f);
        this.g = paint;
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP = RecyclerView.P(view);
        if (iP == -1 || !this.b.h(iP).equals(Boolean.TRUE)) {
            return;
        }
        rect.top = this.d + ((int) this.a) + rect.top;
        this.e.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        Canvas canvas2;
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            if (this.b.h(iP).equals(Boolean.TRUE)) {
                v56 v56Var = this.e;
                Rect rect = this.f;
                v56Var.C(rect, childAt, iP);
                float f = (this.a / 2.0f) + (this.d / 2.0f) + rect.top;
                float f2 = rect.left;
                float f3 = this.c;
                canvas2 = canvas;
                canvas2.drawLine(f2 + f3, f, rect.right - f3, f, this.g);
            } else {
                canvas2 = canvas;
            }
            i++;
            canvas = canvas2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.g.setColor(kbcVar.B().c);
    }
}
