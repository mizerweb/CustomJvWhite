package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class pm0 extends g6g {
    public final int f;
    public om0 g;

    public pm0(Executor executor) {
        super(executor);
        this.f = gm0.K(48.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        gx3 gx3Var = new gx3(viewGroup.getContext());
        int i2 = this.f;
        gx3Var.setLayoutParams(new wee(i2, i2));
        int iK = gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
        gx3Var.setPadding(iK, iK, iK, iK);
        return new am0(0, gx3Var, new m(16, this));
    }
}
