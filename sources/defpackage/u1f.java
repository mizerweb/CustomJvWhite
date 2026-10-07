package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class u1f extends tq0 {
    public final ImageView a;
    public final TextView b;

    public u1f(Context context) {
        super(context, 0, 0, 24);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 72.0f), gm0.K(72.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        a8g a8gVar = pq3.j;
        imageView.setImageResource(a8gVar.e(context).n() ? R.drawable.ic_scheduled_empty_dark_72 : R.drawable.ic_scheduled_empty_72);
        imageView.setLayoutParams(layoutParams);
        this.a = imageView;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        q9i.a(q9i.h, textView);
        this.b = textView;
        addView(imageView);
        addView(textView);
        onThemeChanged(a8gVar.e(context).m());
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        this.b.setTextColor(kbcVar.getText().b);
        this.a.setImageResource(kbcVar.A() == ix3.b ? R.drawable.ic_scheduled_empty_dark_72 : R.drawable.ic_scheduled_empty_72);
    }

    public final void setState(g76 g76Var) {
        this.b.setText(g76Var.a.d(this));
    }
}
