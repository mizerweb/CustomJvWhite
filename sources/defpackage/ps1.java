package defpackage;

import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ps1 implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ns1 b;
    public final /* synthetic */ qs1 c;

    public /* synthetic */ ps1(ns1 ns1Var, qs1 qs1Var) {
        this.b = ns1Var;
        this.c = qs1Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        qs1 qs1Var = this.c;
        ns1 ns1Var = this.b;
        ms1 ms1Var = (ms1) obj;
        switch (i) {
            case 0:
                ms1Var.getClass();
                if (qs1Var.i.remove(ns1Var)) {
                    EGLSurface eGLSurface = ns1Var.a;
                    ns1Var.a = null;
                    ms1Var.d(eGLSurface);
                    ns1Var.c(ms1Var);
                }
                break;
            default:
                ms1Var.getClass();
                ns1Var.d(qs1Var, ms1Var);
                break;
        }
        return sbiVar;
    }

    public /* synthetic */ ps1(qs1 qs1Var, ns1 ns1Var) {
        this.c = qs1Var;
        this.b = ns1Var;
    }
}
