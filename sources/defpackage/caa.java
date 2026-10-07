package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class caa {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;

    public caa(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var5;
        this.e = ny8Var6;
        this.f = ny8Var7;
        this.g = ny8Var;
        this.h = ny8Var8;
    }

    public final baa a(long j, p63 p63Var, int i) {
        bw0 bw0Var;
        rt2 rt2Var = (rt2) ((xn3) this.b.getValue()).k(j).a.getValue();
        if (rt2Var == null) {
            String name = caa.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, nbh.s(j, "We're trying to create members loader for chat(#", ") without the chat in cache"), null);
                }
            }
            return new aaa();
        }
        if (rt2Var.b.b() > 99 || rt2Var.d0()) {
            return new bw0(j, p63Var, (xhh) this.g.getValue(), this.b, this.a, this.c, this.f, i);
        }
        if (((Boolean) ((e5d) this.h.getValue()).z6.a(e5d.S6[391]).i()).booleanValue()) {
            bw0Var = new bw0(j, p63Var, (xhh) this.g.getValue(), this.b, this.a, this.c, this.f, i);
        } else {
            bw0Var = null;
        }
        return new gbg(j, p63Var, (et3) this.e.getValue(), this.b, this.a, this.d, (xhh) this.g.getValue(), this.f, bw0Var, i);
    }
}
