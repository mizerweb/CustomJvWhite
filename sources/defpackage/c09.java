package defpackage;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class c09 extends vpg implements eph {
    public final AppCompatTextView d;

    public c09(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.d = appCompatTextView;
        wee weeVar = new wee(-1, gm0.K(28.0f * yl5.d().getDisplayMetrics().density));
        ((ViewGroup.MarginLayoutParams) weeVar).topMargin = (int) (yl5.d().getDisplayMetrics().density * 20.5f);
        appCompatTextView.setLayoutParams(weeVar);
        appCompatTextView.setGravity(16);
        appCompatTextView.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        onThemeChanged(pq3.j.h(appCompatTextView));
    }

    public final void a(char c) {
        this.d.setText(new char[]{c}, 0, 1);
    }

    public final void b() {
        this.d.setText((CharSequence) null);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        noh nohVar = q9i.i;
        AppCompatTextView appCompatTextView = this.d;
        q9i.a(nohVar, appCompatTextView);
        appCompatTextView.setTextColor(kbcVar.getText().e);
        appCompatTextView.setBackgroundColor(kbcVar.b().c);
    }
}
