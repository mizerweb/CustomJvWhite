package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class v7d extends tee implements eph {
    public final Context a;
    public final Rect b = new Rect();
    public final TextPaint c = new TextPaint();
    public final ifh d = new ifh(new gvc(18));
    public final ifh e = new ifh(new gvc(19));
    public final ifh f = new ifh(new gvc(20));
    public final ifh g = new ifh(new gvc(21));
    public final ifh h;
    public final ifh i;
    public final v56 j;

    public v7d(Context context) {
        this.a = context;
        final int i = 0;
        this.h = new ifh(new af7(this) { // from class: u7d
            public final /* synthetic */ v7d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                v7d v7dVar = this.b;
                switch (i2) {
                    case 0:
                        return v7dVar.a.getString(R.string.oneme_poll_create__answers_section_title).toUpperCase(Locale.ROOT);
                    default:
                        return v7dVar.a.getString(R.string.oneme_poll_create__settings_section_title).toUpperCase(Locale.ROOT);
                }
            }
        });
        final int i2 = 1;
        this.i = new ifh(new af7(this) { // from class: u7d
            public final /* synthetic */ v7d b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                v7d v7dVar = this.b;
                switch (i3) {
                    case 0:
                        return v7dVar.a.getString(R.string.oneme_poll_create__answers_section_title).toUpperCase(Locale.ROOT);
                    default:
                        return v7dVar.a.getString(R.string.oneme_poll_create__settings_section_title).toUpperCase(Locale.ROOT);
                }
            }
        });
        onThemeChanged(pq3.j.e(context).m());
        this.j = new v56(9, (byte) 0);
    }

    public static Integer i(RecyclerView recyclerView, int i) {
        nee adapter = recyclerView.getAdapter();
        if (adapter == null || i == 0 || i == -1 || i >= adapter.l()) {
            return null;
        }
        return Integer.valueOf(adapter.n(i));
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        super.f(rect, view, recyclerView, hfeVar);
        int iP = RecyclerView.P(view);
        Integer numI = i(recyclerView, iP);
        if (numI != null) {
            int iIntValue = numI.intValue();
            Integer numI2 = i(recyclerView, iP - 1);
            if (iIntValue == R.id.oneme_poll_create__answer_item_viewtype && (numI2 == null || numI2.intValue() != R.id.oneme_poll_create__answer_item_viewtype)) {
                rect.top = ((Number) this.d.getValue()).intValue();
            } else if (iIntValue == R.id.oneme_poll_create__setting_item_viewtype && (numI2 == null || numI2.intValue() != R.id.oneme_poll_create__setting_item_viewtype)) {
                rect.top = ((Number) this.e.getValue()).intValue();
            }
        }
        this.j.J(rect, view, recyclerView);
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
            Integer numI = i(recyclerView, iP);
            String str = null;
            if (numI != null) {
                int iIntValue = numI.intValue();
                Integer numI2 = i(recyclerView, iP - 1);
                if (iIntValue == R.id.oneme_poll_create__answer_item_viewtype && (numI2 == null || numI2.intValue() != R.id.oneme_poll_create__answer_item_viewtype)) {
                    str = (String) this.h.getValue();
                } else if (iIntValue == R.id.oneme_poll_create__setting_item_viewtype && (numI2 == null || numI2.intValue() != R.id.oneme_poll_create__setting_item_viewtype)) {
                    str = (String) this.i.getValue();
                }
            }
            if (str != null) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                v56 v56Var = this.j;
                Rect rect = this.b;
                v56Var.E(rect, childAt, iP);
                canvas.drawText(upperCase, rect.left + ((Number) this.f.getValue()).intValue(), rect.bottom - ((Number) this.g.getValue()).intValue(), this.c);
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
