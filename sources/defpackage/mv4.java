package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class mv4 extends s7g {
    public static final int w = View.generateViewId();
    public static final int x = View.generateViewId();
    public final ImageView u;
    public final TextView v;

    public mv4(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
        linearLayout.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 18.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
        View imageView = new ImageView(context);
        int i = w;
        imageView.setId(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginEnd(gm0.K(18.0f * yl5.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        linearLayout.setGravity(16);
        linearLayout.addView(imageView);
        TextView textView = new TextView(context);
        int i2 = x;
        textView.setId(i2);
        q9i.a(q9i.f, textView);
        textView.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 19;
        textView.setLayoutParams(layoutParams2);
        linearLayout.addView(textView);
        n1g.N(new vc3(imageView, textView, (lq4) null, 1), linearLayout);
        super(linearLayout);
        this.u = (ImageView) linearLayout.findViewById(i);
        this.v = (TextView) linearLayout.findViewById(i2);
    }

    @Override // defpackage.s7g
    public final void G() {
        ((LinearLayout) this.a).setOnClickListener(null);
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(lv4 lv4Var) {
        this.u.setImageResource(lv4Var.b);
        v0h.i(this.v, lv4Var.c);
        ((LinearLayout) this.a).setOnClickListener(null);
    }
}
