package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class xuf extends tee implements eph {
    public final Rect a = new Rect();
    public final Paint b;

    public xuf(Context context) {
        Paint paint = new Paint();
        paint.setColor(pq3.j.e(context).m().B().b);
        this.b = paint;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        long jQ = recyclerView.Q(view);
        if (jQ == -1) {
            return;
        }
        if (jQ == x7c.g) {
            rect.bottom = zo5.b(0.5f, yl5.d().getDisplayMetrics().density, rect.bottom);
        } else if (jQ == x7c.m) {
            rect.top = zo5.b(0.5f, yl5.d().getDisplayMetrics().density, rect.top);
        }
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                long jQ = recyclerView.Q(childAt);
                long j = x7c.g;
                Paint paint = this.b;
                Rect rect = this.a;
                if (jQ == j) {
                    rect.left = childAt.getLeft();
                    rect.top = childAt.getBottom();
                    rect.bottom = zo5.b(0.5f, yl5.d().getDisplayMetrics().density, childAt.getBottom());
                    rect.right = childAt.getRight();
                    canvas.drawRect(rect, paint);
                    return;
                }
                if (jQ == x7c.m) {
                    rect.left = childAt.getLeft();
                    rect.top = zo5.b(0.5f, yl5.d().getDisplayMetrics().density, childAt.getTop());
                    rect.bottom = childAt.getTop();
                    rect.right = childAt.getRight();
                    canvas.drawRect(rect, paint);
                    return;
                }
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColor(kbcVar.B().b);
    }
}
