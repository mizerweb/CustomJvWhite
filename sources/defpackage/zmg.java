package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class zmg extends LinearLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmg(Context context) {
        super(context, null);
        lq4 lq4Var = null;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setGravity(17);
        int iK = gm0.K(21.0f * yl5.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        int iK2 = gm0.K(188.0f * yl5.d().getDisplayMetrics().density);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(iK2, iK2));
        addView(imageView);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
        layoutParams.leftMargin = iK;
        layoutParams.rightMargin = iK;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        q9i.d.b(textView, bx5.b);
        int i = 3;
        n1g.N(new dk6(i, lq4Var, 7), textView);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        layoutParams2.leftMargin = iK;
        layoutParams2.rightMargin = iK;
        textView2.setLayoutParams(layoutParams2);
        textView2.setGravity(17);
        q9i.i.b(textView2, bx5.b);
        n1g.N(new dk6(i, lq4Var, 8), textView2);
        addView(textView2);
        this.c = textView2;
    }

    public final void setIcon(int i) {
        this.a.setImageResource(i);
    }

    public final void setSubtitle(Integer num) {
        TextView textView = this.c;
        if (num == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(num.intValue());
        }
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }
}
