package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rva extends tee implements eph {
    public final int a = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    public final int b = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
    public final int c = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
    public final int d = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
    public final Paint e;
    public final Rect f;
    public final v56 g;

    public rva(kbc kbcVar) {
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
        this.e = paint;
        this.f = new Rect();
        this.g = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        int iP2 = RecyclerView.P(view);
        nee adapter = recyclerView.getAdapter();
        if (adapter == null || iP2 < 0 || iP2 >= adapter.l()) {
            return;
        }
        int i = this.d;
        rect.left = i;
        rect.right = i;
        rect.top = iP2 == 0 ? this.a : this.b;
        nee adapter2 = recyclerView.getAdapter();
        if (adapter2 != null && (iP = RecyclerView.P(view)) > 0 && adapter2.n(iP) == R.id.oneme_messages_settings_need_divider_above_vh) {
            rect.top += (int) (yl5.d().getDisplayMetrics().density * 0.5f);
            rect.bottom = this.c;
        }
        this.g.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        Canvas canvas2;
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
            nee adapter = recyclerView.getAdapter();
            if (adapter != null && (iP = RecyclerView.P(childAt)) > 0 && adapter.n(iP) == R.id.oneme_messages_settings_need_divider_above_vh) {
                v56 v56Var = this.g;
                int iP2 = RecyclerView.P(childAt);
                Rect rect = this.f;
                v56Var.E(rect, childAt, iP2);
                canvas2 = canvas;
                canvas2.drawLine(zo5.b(12.0f, yl5.d().getDisplayMetrics().density, rect.left), rect.centerY(), zo5.D(12.0f, yl5.d().getDisplayMetrics().density, rect.right), rect.centerY(), this.e);
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
