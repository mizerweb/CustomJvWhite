package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class ocf extends exe {
    public final /* synthetic */ k71 h;
    public final /* synthetic */ a35 i;
    public final /* synthetic */ tcf j;

    public ocf(tcf tcfVar, k71 k71Var, a35 a35Var) {
        this.j = tcfVar;
        this.h = k71Var;
        this.i = a35Var;
    }

    @Override // defpackage.exe
    public final Object e() {
        qmc qmcVar = this.j.d;
        k71 k71Var = this.h;
        lkg lkgVar = new lkg(k71Var);
        t99.g.getAndIncrement();
        lkgVar.b = 0L;
        x25 x25Var = new x25(lkgVar, this.i);
        try {
            x25Var.l();
            Uri uri = k71Var.i;
            uri.getClass();
            Object objN = qmcVar.n(uri, x25Var);
            vqi.h(x25Var);
            objN.getClass();
            return (ou6) objN;
        } catch (Throwable th) {
            vqi.h(x25Var);
            throw th;
        }
    }
}
