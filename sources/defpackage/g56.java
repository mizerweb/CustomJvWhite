package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class g56 extends tee implements eph {
    public final float a = yl5.d().getDisplayMetrics().density * 8.0f;
    public final Paint b;

    public g56(Context context) {
        Paint paint = new Paint();
        paint.setColor(((fn8) pq3.j.e(context).m().u().c.d).d);
        this.b = paint;
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        nee adapter = recyclerView.getAdapter();
        b46 b46Var = adapter instanceof b46 ? (b46) adapter : null;
        if (b46Var == null) {
            return;
        }
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
            k79 k79Var = (k79) b46Var.F(RecyclerView.P(childAt));
            z46 z46Var = k79Var instanceof z46 ? (z46) k79Var : null;
            if (z46Var != null && !z46Var.g) {
                float left = childAt.getLeft();
                float top = childAt.getTop();
                float right = childAt.getRight();
                float bottom = childAt.getBottom();
                float f = this.a;
                canvas.drawRoundRect(left, top, right, bottom, f, f, this.b);
            }
            i = i2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColor(((fn8) kbcVar.u().c.d).d);
    }
}
