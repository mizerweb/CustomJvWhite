package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ac extends TextView {
    public static final /* synthetic */ zv8[] d;
    public final b25 a;
    public final zb b;
    public yb c;

    static {
        z8b z8bVar = new z8b(ac.class, "theme", "getTheme()Lone/me/sdk/design/theme/OneMeTheme;");
        zfe.a.getClass();
        d = new zv8[]{z8bVar};
    }

    public ac(Context context) {
        super(context);
        b25 b25Var = new b25(yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 2.5f, yl5.d().getDisplayMetrics().density * 6.0f, yl5.d().getDisplayMetrics().density * 7.0f);
        this.a = b25Var;
        this.b = new zb(pq3.j.k(context).b, 0, this);
        setId(R.id.story_editor_add_text_placeholder_id);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        setBackground(b25Var);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        setText(R.string.oneme_stories_add_text_placeholder);
        q9i.a(q9i.a, this);
        qe7.H(this, 300L, new t8(4, this));
    }

    public final yb getListener() {
        return this.c;
    }

    public final kbc getTheme() {
        zv8 zv8Var = d[0];
        return (kbc) this.b.b;
    }

    public final void setListener(yb ybVar) {
        this.c = ybVar;
    }

    public final void setTheme(kbc kbcVar) {
        this.b.B(this, d[0], kbcVar);
    }
}
