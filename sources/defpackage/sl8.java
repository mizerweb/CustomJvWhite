package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class sl8 extends vpg implements eph {
    public final AppCompatTextView d;

    public sl8(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
        appCompatTextView.setLayoutParams(new wee(-1, -2));
        appCompatTextView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        onThemeChanged(pq3.j.h(appCompatTextView));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        noh nohVar = q9i.i;
        AppCompatTextView appCompatTextView = this.d;
        nohVar.b(appCompatTextView, bx5.b);
        appCompatTextView.setTextColor(kbcVar.getText().e);
        appCompatTextView.setBackgroundColor(kbcVar.b().c);
    }
}
