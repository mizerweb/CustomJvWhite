package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chats.list.ChatsListWidget;

/* JADX INFO: loaded from: classes.dex */
public final class obf extends tee implements eph {
    public final u50 a;
    public final Rect b = new Rect();
    public final TextPaint c;
    public final v56 d;

    public obf(u50 u50Var) {
        this.a = u50Var;
        TextPaint textPaint = new TextPaint();
        u50Var.k(textPaint);
        this.c = textPaint;
        this.d = new v56(9, (byte) 0);
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        ChatsListWidget chatsListWidget = (ChatsListWidget) this.a.a;
        if (iP == chatsListWidget.u.l() && chatsListWidget.x.l() > 0) {
            int i = rect.top;
            int iD = c0a.d(6.0f, yl5.d().getDisplayMetrics().density, 2);
            TextPaint textPaint = this.c;
            rect.top = iD + ((int) (textPaint.descent() - textPaint.ascent())) + i;
        }
        this.d.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
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
            if (iP != -1) {
                u50 u50Var = this.a;
                ChatsListWidget chatsListWidget = (ChatsListWidget) u50Var.a;
                if (iP == chatsListWidget.u.l() && chatsListWidget.x.l() > 0) {
                    String str = (String) u50Var.c;
                    v56 v56Var = this.d;
                    Rect rect = this.b;
                    v56Var.E(rect, childAt, iP);
                    float fK = rect.left + gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                    float fCenterY = rect.centerY();
                    TextPaint textPaint = this.c;
                    canvas.drawText(str, fK, textPaint.descent() + fCenterY, textPaint);
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.k(this.c);
    }
}
