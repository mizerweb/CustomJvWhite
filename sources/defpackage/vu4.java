package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class vu4 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu4(Context context) {
        super(context, null);
        lq4 lq4Var = null;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        q9i.a(q9i.c, textView);
        textView.setGravity(17);
        this.a = textView;
        TextView textView2 = new TextView(context);
        q9i.a(q9i.f, textView2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView2.setLayoutParams(layoutParams);
        int i = 3;
        n1g.N(new f7(i, lq4Var, 18), textView2);
        this.b = textView2;
        TextView textView3 = new TextView(context);
        q9i.a(q9i.g, textView3);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginEnd(gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        textView3.setLayoutParams(layoutParams2);
        n1g.N(new f7(i, lq4Var, 17), textView3);
        this.c = textView3;
        setMinimumHeight(gm0.K(48.0f * yl5.d().getDisplayMetrics().density));
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setOutlineProvider(new nt4(16.0f));
        setClipToOutline(true);
        addView(textView);
        addView(textView2);
        addView(textView3);
    }

    public final void setCountryInfo(x0c x0cVar) {
        this.b.setText(x0cVar.c);
        this.c.setText("+" + x0cVar.b);
        CharSequence charSequence = x0cVar.d;
        if (charSequence != null) {
            TextView textView = this.a;
            textView.setText(charSequence);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(0, 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(marginLayoutParams);
        }
    }
}
