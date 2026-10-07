package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vnf {
    public final tih a;

    public vnf(uih uihVar) {
        tih tihVar = uihVar instanceof tih ? (tih) uihVar : null;
        this.a = tihVar == null ? new tih(uihVar) : tihVar;
    }

    public final Thread a(Runnable runnable, String str) {
        return this.a.a(str).newThread(runnable);
    }
}
