package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class o7g extends vpg implements eph {
    public final TextView d;

    public o7g(TextView textView) {
        super(textView);
        this.d = textView;
        textView.setLayoutParams(new wee(-1, gm0.K(28.0f * yl5.d().getDisplayMetrics().density)));
        textView.setGravity(16);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        onThemeChanged(pq3.j.h(textView));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        noh nohVarG = q9i.k.g();
        TextView textView = this.d;
        q9i.a(nohVarG, textView);
        textView.setTextColor(kbcVar.getText().d);
        textView.setBackgroundColor(kbcVar.b().c);
    }
}
