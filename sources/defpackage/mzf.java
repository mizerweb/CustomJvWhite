package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mzf implements no5 {
    public final pzf a;
    public final long b;
    public final Object c;
    public final ek2 d;

    public mzf(pzf pzfVar, long j, Object obj, ek2 ek2Var) {
        this.a = pzfVar;
        this.b = j;
        this.c = obj;
        this.d = ek2Var;
    }

    @Override // defpackage.no5
    public final void dispose() {
        pzf pzfVar = this.a;
        synchronized (pzfVar) {
            if (this.b < pzfVar.q()) {
                return;
            }
            Object[] objArr = pzfVar.h;
            if (e9i.c(objArr, this.b) != this) {
                return;
            }
            e9i.e(objArr, this.b, e9i.f);
            pzfVar.l();
        }
    }
}
