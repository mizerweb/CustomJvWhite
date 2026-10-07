package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class t8a extends tee implements eph {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Object c;
    public final Object d;

    public t8a(Context context, wu wuVar) {
        this.a = 1;
        this.c = wuVar;
        this.d = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.b = paint;
        onThemeChanged(pq3.j.e(context).m());
    }

    public static boolean i(RecyclerView recyclerView, View view) {
        nee adapter = recyclerView.getAdapter();
        g6g g6gVar = adapter instanceof g6g ? (g6g) adapter : null;
        if (g6gVar == null) {
            return false;
        }
        d20 d20Var = g6gVar.d;
        int iP = RecyclerView.P(view);
        int i = iP - 1;
        if (iP <= 0) {
            return false;
        }
        int iN = g6gVar.n(iP);
        int iN2 = g6gVar.n(i);
        ww3.u1(iP, d20Var.f);
        ww3.u1(i, d20Var.f);
        return iN == R.id.messages_list_context_member_view_type && iN2 == R.id.messages_list_context_actions_view_type;
    }

    @Override // defpackage.tee
    public void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, hfeVar);
                if (i(recyclerView, view)) {
                    rect.top = (int) (c0a.d(10.0f, yl5.d().getDisplayMetrics().density, 2) + 0.5f);
                }
                ((v56) this.d).J(rect, view, recyclerView);
                break;
            default:
                super.f(rect, view, recyclerView, hfeVar);
                break;
        }
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                Rect rect = (Rect) obj;
                int i2 = 0;
                while (true) {
                    if (i2 < recyclerView.getChildCount()) {
                        int i3 = i2 + 1;
                        View childAt = recyclerView.getChildAt(i2);
                        if (childAt == null) {
                            ore.i();
                        } else {
                            if (i(recyclerView, childAt)) {
                                ((v56) obj2).E(rect, childAt, RecyclerView.P(childAt));
                                canvas2 = canvas;
                                canvas2.drawLine(rect.left, rect.centerY(), rect.right, rect.centerY(), this.b);
                            } else {
                                canvas2 = canvas;
                            }
                            i2 = i3;
                            canvas = canvas2;
                        }
                    }
                    break;
                }
                break;
            default:
                RectF rectF = (RectF) obj2;
                int childCount = recyclerView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = recyclerView.getChildAt(i4);
                    int iP = RecyclerView.P(childAt2);
                    if (iP != -1 && ((Boolean) ((wu) obj).invoke(Integer.valueOf(iP))).booleanValue()) {
                        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
                        rectF.set(childAt2.getLeft() - iK, childAt2.getTop() - iK, childAt2.getRight() + iK, childAt2.getBottom() + iK);
                        canvas.drawRoundRect(rectF, yl5.d().getDisplayMetrics().density * 12.0f, yl5.d().getDisplayMetrics().density * 12.0f, this.b);
                    }
                }
                break;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = this.a;
        Paint paint = this.b;
        switch (i) {
            case 0:
                paint.setColor(kbcVar.B().b);
                break;
            default:
                paint.setColor(kbcVar.l().a);
                break;
        }
    }

    public t8a(kbc kbcVar) {
        this.a = 0;
        Paint paint = new Paint();
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 0.5f);
        this.b = paint;
        this.c = new Rect();
        this.d = new v56(9, (byte) 0);
        onThemeChanged(kbcVar);
    }
}
