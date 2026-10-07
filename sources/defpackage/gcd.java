package defpackage;

import android.content.Context;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class gcd extends LinearLayout {
    public final boolean a;

    public gcd(Context context, boolean z) {
        super(context);
        this.a = z;
        setElevation(yl5.d().getDisplayMetrics().density * 12.0f);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        setOrientation(1);
        setPadding(getPaddingLeft(), gm0.K(yl5.d().getDisplayMetrics().density * 4.0f), getPaddingRight(), gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
        n1g.N(new vqa(context, (lq4) null, 13), this);
    }

    public final kbc getCurrentTheme() {
        boolean z = this.a;
        a8g a8gVar = pq3.j;
        return z ? a8gVar.l(this).b : a8gVar.h(this);
    }
}
