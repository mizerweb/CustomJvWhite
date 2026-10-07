package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class n01 extends tq0 {
    public final r59 a;
    public final kwb b;
    public final t58 c;
    public final TextView d;
    public final TextView e;

    public n01(Context context) {
        super(context, 0, 0, 24);
        r59 r59Var = new r59(null, new qo7(23, this), 5);
        this.a = r59Var;
        kwb kwbVar = new kwb(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        layoutParams.bottomMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.gravity = 1;
        kwbVar.setLayoutParams(layoutParams);
        this.b = kwbVar;
        t58 t58Var = new t58(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        t58Var.setLayoutParams(layoutParams2);
        t58Var.setOutlineProvider(new nvh(yl5.d().getDisplayMetrics().density * 24.0f));
        this.c = t58Var;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        layoutParams3.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        textView.setLayoutParams(layoutParams3);
        textView.setGravity(1);
        textView.setTransformationMethod(r59Var);
        q9i.a(q9i.d, textView);
        np4.C(textView, false);
        this.d = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        layoutParams4.topMargin = gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
        layoutParams4.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 24.0f);
        layoutParams4.bottomMargin = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams4);
        textView2.setGravity(1);
        textView2.setTransformationMethod(r59Var);
        if (h59.a == null) {
            h59.a = new h59();
        }
        textView2.setMovementMethod(h59.a);
        q9i.a(q9i.i, textView2);
        np4.C(textView2, false);
        this.e = textView2;
        addView(kwbVar);
        addView(t58Var);
        addView(textView);
        addView(textView2);
        setMinimumWidth(gm0.K(272.0f * yl5.d().getDisplayMetrics().density));
        int iK = gm0.K(0.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
        onThemeChanged(pq3.j.e(context).m());
    }

    private final void setupWithAvatar(d76 d76Var) {
        this.c.setVisibility(8);
        kwb kwbVar = this.b;
        kwbVar.setVisibility(0);
        String str = d76Var.a;
        Long lValueOf = Long.valueOf(d76Var.c);
        CharSequence charSequence = d76Var.b;
        if (charSequence == null) {
            charSequence = "";
        }
        kwb.v(kwbVar, str, lValueOf, charSequence);
    }

    private final void setupWithCustomImage(g58 g58Var) {
        this.b.setVisibility(8);
        t58 t58Var = this.c;
        t58Var.setVisibility(0);
        t58Var.setImageAttach(g58Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a = null;
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        this.d.setTextColor(kbcVar.getText().b);
        this.e.setTextColor(kbcVar.getText().d);
    }

    public final void setLinkListener(o59 o59Var) {
        this.a.a = o59Var;
    }

    public final void setState(d76 d76Var) {
        g58 g58Var = d76Var.d;
        if (g58Var != null) {
            setupWithCustomImage(g58Var);
        } else {
            setupWithAvatar(d76Var);
        }
        CharSequence charSequenceD = d76Var.e.d(this);
        if (charSequenceD == null) {
            charSequenceD = "";
        }
        r59 r59Var = this.a;
        TextView textView = this.d;
        textView.setText(r59Var.getTransformation(charSequenceD, textView));
        CharSequence charSequenceD2 = d76Var.f.d(this);
        CharSequence charSequence = charSequenceD2 != null ? charSequenceD2 : "";
        int i = !r5h.X0(charSequence) ? 0 : 8;
        TextView textView2 = this.e;
        textView2.setVisibility(i);
        textView2.setText(r59Var.getTransformation(charSequence, textView2));
        r59Var.c(textView.getText());
        if (textView2.getVisibility() == 0) {
            r59Var.c(textView2.getText());
        }
    }
}
