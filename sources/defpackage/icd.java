package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class icd extends tq0 {
    public final TextView a;
    public final TextView b;
    public final TextView c;

    public icd(Context context) {
        super(context, 0, 0, 30);
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f), gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        imageView.setImageResource(R.drawable.ic_error_40);
        imageView.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        textView.setMaxWidth(gm0.K(yl5.d().getDisplayMetrics().density * 224.0f));
        textView.setMaxLines(2);
        layoutParams2.gravity = 1;
        textView.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        textView.setTextColor(getTitleColor());
        q9i.a(q9i.d, textView);
        this.a = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        textView2.setPadding(0, 0, 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams3);
        textView2.setMaxWidth(gm0.K(yl5.d().getDisplayMetrics().density * 224.0f));
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        textView2.setTextColor(getSubtitleColor());
        noh nohVar = q9i.e;
        q9i.a(nohVar, textView2);
        this.b = textView2;
        TextView textView3 = new TextView(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        textView3.setLayoutParams(layoutParams4);
        textView3.setMaxWidth(gm0.K(224.0f * yl5.d().getDisplayMetrics().density));
        textView3.setGravity(1);
        textView3.setTextAlignment(4);
        textView3.setTextColor(getSubtitleColor());
        q9i.a(nohVar, textView3);
        this.c = textView3;
        addView(imageView);
        addView(textView);
        addView(textView2);
        addView(textView3);
        int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        setPadding(iK, iK, iK, iK);
    }

    private final int getSubtitleColor() {
        return pq3.j.h(this).getText().d;
    }

    private final int getTitleColor() {
        return pq3.j.h(this).getText().b;
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        this.a.setTextColor(getTitleColor());
        this.b.setTextColor(getSubtitleColor());
    }

    public final void setState(f76 f76Var) {
        this.a.setText(f76Var.a.d(this));
        this.b.setText(f76Var.b.d(this));
        this.c.setText(f76Var.c.d(this));
        onThemeChanged(pq3.j.h(this));
    }
}
