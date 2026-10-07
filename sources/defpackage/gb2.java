package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gb2 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb2 b;

    public /* synthetic */ gb2(kb2 kb2Var, int i) {
        this.a = i;
        this.b = kb2Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        kb2 kb2Var = this.b;
        switch (i) {
            case 0:
                synchronized (kb2Var.p) {
                    kb2Var.r = ge2.a;
                    Log.d("CXCP", kb2Var + " is closed");
                }
                ya2 ya2Var = kb2Var.n;
                Log.d("CXCP", kb2Var + " finalized");
                synchronized (ya2Var.f) {
                    ya2Var.g.remove(kb2Var);
                }
                i64 i64Var = kb2Var.w;
                sbi sbiVar = sbi.a;
                i64Var.Q(sbiVar);
                cqk.g(kb2Var.a);
                return sbiVar;
            default:
                synchronized (kb2Var.p) {
                    z = kb2Var.q;
                }
                return Boolean.valueOf(z);
        }
    }
}
