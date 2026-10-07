package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k4b extends aq implements qih {
    public final long f;

    public k4b(long j, long j2) {
        super(j);
        this.f = j2;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
    }

    @Override // defpackage.aq
    public final Object m() {
        if (this.f == 0) {
            return new h3b(0L, 10, (byte) 0);
        }
        rt2 rt2VarN = p().N(this.f);
        if (rt2VarN != null && (rt2VarN.b.a != 0 || p().V(rt2VarN))) {
            return new h3b(rt2VarN.b.a, 10, (byte) 0);
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return null;
        }
        a4c.f(a4cVar, je9.g, "k4b", "createRequest: No chat or serverId == 0. return null", null, null, 8);
        return null;
    }
}
