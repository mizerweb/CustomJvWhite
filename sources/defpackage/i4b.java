package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class i4b extends aq implements qih {
    public final long f;
    public final String g;
    public final int h;
    public final long i;
    public final String j;

    public i4b(long j, long j2, long j3, String str) {
        super(j);
        this.f = j2;
        this.g = str;
        this.h = 100;
        this.i = j3;
        this.j = i4b.class.getName();
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        j4b j4bVar = (j4b) kihVar;
        o().c(new r73(this.a, this.g, j4bVar.c, j4bVar.d, j4bVar.e, j4bVar.f));
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        o().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.aq
    public final Object m() {
        rt2 rt2VarN = p().N(this.f);
        kfc kfcVar = null;
        if (rt2VarN == null || (rt2VarN.b.a == 0 && !p().V(rt2VarN))) {
            String str = this.j;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, str, "createRequest: No chat or serverId == 0. return null", null, null, 8);
            }
            return null;
        }
        long j = rt2VarN.b.a;
        String str2 = this.g;
        int i = this.h;
        long j2 = this.i;
        h3b h3bVar = new h3b(kfcVar, 9);
        h3bVar.f(j, ApiProtocol.PARAM_CHAT_ID);
        h3bVar.h("query", str2);
        h3bVar.c(i, "count");
        if (j2 != 0) {
            h3bVar.f(j2, "marker");
        }
        return h3bVar;
    }
}
