package defpackage;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class y9c implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z9c b;

    public /* synthetic */ y9c(z9c z9cVar, int i) {
        this.a = i;
        this.b = z9cVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        z9c z9cVar = this.b;
        switch (i) {
            case 0:
                ((ViewGroup.MarginLayoutParams) obj).setMarginEnd((n7j.o(z9cVar.f) || n7j.o(z9cVar.e) || n7j.o(z9cVar.g)) ? gm0.K(4.0f * yl5.d().getDisplayMetrics().density) : gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                break;
            default:
                ((ViewGroup.MarginLayoutParams) obj).setMarginEnd(n7j.o(z9cVar.g) ? gm0.K(4.0f * yl5.d().getDisplayMetrics().density) : gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
                break;
        }
        return sbiVar;
    }
}
