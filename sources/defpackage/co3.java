package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class co3 extends vpg implements eph {
    public final TextView d;

    public co3(TextView textView) {
        super(textView);
        this.d = textView;
        textView.setLayoutParams(new wee(-1, gm0.K(40.0f * yl5.d().getDisplayMetrics().density)));
        textView.setGravity(16);
        textView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        onThemeChanged(pq3.j.h(textView));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        noh nohVarG = q9i.i.g();
        TextView textView = this.d;
        nohVarG.b(textView, bx5.b);
        textView.setTextColor(kbcVar.getText().e);
        textView.setBackgroundColor(kbcVar.b().c);
    }
}
