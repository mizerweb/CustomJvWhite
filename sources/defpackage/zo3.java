package defpackage;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zo3 extends LinearLayout {
    public static final /* synthetic */ zv8[] e;
    public yo3 a;
    public final zb b;
    public final CheckBox c;
    public final TextView d;

    static {
        z8b z8bVar = new z8b(zo3.class, "text", "getText()Lone/me/sdk/textsource/TextSource;");
        zfe.a.getClass();
        e = new zv8[]{z8bVar};
    }

    public zo3(Context context) {
        super(context);
        this.b = new zb(this);
        CheckBox checkBox = new CheckBox(context);
        checkBox.setButtonDrawable(so2.F(context, 6));
        checkBox.setOnCheckedChangeListener(new xo3(this, 0));
        n1g.N(new ud9(3, (lq4) null, 14), checkBox);
        this.c = checkBox;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.rightMargin = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        q9i.a(q9i.d, textView);
        n1g.N(new f7(3, null, 9), textView);
        this.d = textView;
        setOrientation(0);
        setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams2.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        setLayoutParams(layoutParams2);
        qe7.H(this, 300L, new t8(17, this));
        addView(textView);
        addView(checkBox);
    }

    public final ynh getText() {
        zv8 zv8Var = e[0];
        return (ynh) this.b.b;
    }

    public final void setCheckBoxListener(yo3 yo3Var) {
        this.a = yo3Var;
    }

    public final void setChecked(boolean z) {
        this.c.setChecked(z);
    }

    public final void setText(ynh ynhVar) {
        this.b.B(this, e[0], ynhVar);
    }
}
