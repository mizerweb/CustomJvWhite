package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class u83 extends vpg implements eph {
    public final TextView d;

    public u83(TextView textView) {
        super(textView);
        this.d = textView;
        textView.setLayoutParams(new wee(-1, -2));
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 7.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(7.0f * yl5.d().getDisplayMetrics().density));
        q9i.i.b(textView, bx5.b);
        onThemeChanged(pq3.j.h(textView));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i = kbcVar.getText().e;
        TextView textView = this.d;
        textView.setTextColor(i);
        textView.setBackgroundColor(kbcVar.b().b);
    }
}
