package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class k0d extends tee implements eph {
    public final Paint a;
    public final RectF b;
    public final Rect c;

    public k0d(kbc kbcVar) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.a = paint;
        this.b = new RectF();
        this.c = new Rect();
        onThemeChanged(kbcVar);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP;
        lfe lfeVarS = recyclerView.S(view);
        if (lfeVarS == null || !(lfeVarS instanceof tg3) || (iP = RecyclerView.P(view)) == -1) {
            return;
        }
        Boolean boolValueOf = Boolean.valueOf(((tg3) lfeVarS).f == R.id.chat_item_view_type_pinned);
        if (hfeVar.b == null) {
            hfeVar.b = new SparseArray();
        }
        hfeVar.b.put(iP, boolValueOf);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int iP = RecyclerView.P(childAt);
            if (recyclerView.S(childAt) instanceof tg3) {
                SparseArray sparseArray = hfeVar.b;
                boolean zD = cqk.d(sparseArray == null ? null : sparseArray.get(iP), Boolean.TRUE);
                if (zD) {
                    Rect rect = this.c;
                    RecyclerView.U(rect, childAt);
                    if (rectF.height() == 0.0f) {
                        rectF.set(rect);
                    } else {
                        rectF.left = Math.min(rectF.left, rect.left);
                        rectF.top = Math.min(rectF.top, rect.top);
                        rectF.right = Math.max(rectF.right, rect.right);
                        rectF.bottom = Math.max(rectF.bottom, rect.bottom);
                    }
                }
                if ((!zD || i == recyclerView.getChildCount() - 1) && rectF.height() != 0.0f) {
                    canvas.drawRect(rectF, this.a);
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.setColor(kbcVar.b().d);
    }
}
