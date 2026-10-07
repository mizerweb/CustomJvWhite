package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class m15 implements s25 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ m15(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.s25
    public final u25 a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new l15((byte[]) obj);
            default:
                h5 h5Var = (h5) obj;
                return new aw6(new q95(((Context) h5Var.c(7)).getApplicationContext(), new eb5().a()), h5Var.d(153));
        }
    }
}
