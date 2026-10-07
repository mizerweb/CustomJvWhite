package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class d09 extends LinearLayout {
    public boolean a;
    public final jn7 b;
    public final ImageView c;

    public d09(Context context) {
        super(context, null);
        this.a = true;
        jn7 jn7Var = new jn7(context);
        jn7Var.setAnimConfig(new in7(0, 0L, 1500L, 0.0f, 16));
        this.b = jn7Var;
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        setOrientation(0);
        jn7Var.setImageResource(R.drawable.max_image_logo);
        jn7Var.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(yl5.d().getDisplayMetrics().density * 32.0f)));
        imageView.setImageResource(R.drawable.max_text_logo);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(58.0f * yl5.d().getDisplayMetrics().density), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.setMarginStart(gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        imageView.setLayoutParams(layoutParams);
        addView(jn7Var);
        addView(imageView);
        setGravity(17);
        post(new e6(18, this));
        n1g.N(new adh(3, (lq4) null, 11), this);
    }
}
