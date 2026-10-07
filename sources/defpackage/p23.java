package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class p23 extends LinearLayout {
    public final ImageView a;
    public final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p23(Context context) {
        super(context, null);
        lq4 lq4Var = null;
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 188.0f), gm0.K(188.0f * yl5.d().getDisplayMetrics().density)));
        setGravity(1);
        int i = 3;
        n1g.N(new o23(i, lq4Var, 0), imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        q9i.a(q9i.d, textView);
        n1g.N(new f7(i, lq4Var, 6), textView);
        this.b = textView;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(17);
        setOrientation(1);
        addView(imageView);
        addView(textView);
    }

    public final void setIcon(int i) {
        this.a.setImageDrawable(getContext().getDrawable(i).mutate());
    }

    public final void setTitle(int i) {
        this.b.setText(np4.q(getContext(), i));
    }
}
