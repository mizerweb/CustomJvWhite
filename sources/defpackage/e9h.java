package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class e9h extends tee implements eph {
    public final Context a;
    public final Rect b = new Rect();
    public final TextPaint c = new TextPaint();
    public final v56 d = new v56(9, (byte) 0);
    public final int e = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);

    public e9h(Context context) {
        this.a = context;
        onThemeChanged(pq3.j.e(context).m());
    }

    public static boolean i(RecyclerView recyclerView, int i) {
        nee adapter = recyclerView.getAdapter();
        return (adapter == null || i == -1 || i == 0 || adapter.n(i) != R.id.chat_suggest_item_view_type || adapter.n(i - 1) == R.id.chat_suggest_item_view_type) ? false : true;
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        if (i(recyclerView, RecyclerView.P(view))) {
            rect.top = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
        }
        this.d.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
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
            if (i(recyclerView, iP)) {
                String upperCase = this.a.getString(R.string.chat_list_chat_suggest_decoration_title).toUpperCase(Locale.ROOT);
                v56 v56Var = this.d;
                Rect rect = this.b;
                v56Var.E(rect, childAt, iP);
                canvas.drawText(upperCase, rect.left + this.e, rect.bottom - c0a.d(4.0f, yl5.d().getDisplayMetrics().density, 2), this.c);
            }
            i = i2;
        }
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        noh nohVarG = q9i.k.g();
        Context context = this.a;
        TextPaint textPaint = this.c;
        noh.d(nohVarG, context, textPaint, null, null, 12);
        textPaint.setColor(kbcVar.getText().d);
    }
}
