package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class one {
    public dle a;
    public twd b;
    public String d;
    public zs7 e;
    public rne g;
    public pne h;
    public pne i;
    public pne j;
    public long k;
    public long l;
    public yf2 m;
    public int c = -1;
    public p3c f = new p3c(10);

    public static void b(pne pneVar, String str) {
        if (pneVar != null) {
            if (pneVar.g != null) {
                c.o(str.concat(".body != null"));
                return;
            }
            if (pneVar.h != null) {
                c.o(str.concat(".networkResponse != null"));
            } else if (pneVar.i != null) {
                c.o(str.concat(".cacheResponse != null"));
            } else {
                if (pneVar.j == null) {
                    return;
                }
                c.o(str.concat(".priorResponse != null"));
            }
        }
    }

    public final pne a() {
        int i = this.c;
        if (i < 0) {
            qr7.u(this.c, "code < 0: ");
            return null;
        }
        dle dleVar = this.a;
        if (dleVar == null) {
            ore.k("request == null");
            return null;
        }
        twd twdVar = this.b;
        if (twdVar == null) {
            ore.k("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new pne(dleVar, twdVar, str, i, this.e, this.f.h(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        ore.k("message == null");
        return null;
    }
}
