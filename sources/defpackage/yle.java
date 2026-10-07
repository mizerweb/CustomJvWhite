package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yle implements rhh {
    public final /* synthetic */ dme a;
    public final /* synthetic */ aq b;
    public final /* synthetic */ qih c;

    public yle(dme dmeVar, aq aqVar, qih qihVar) {
        this.a = dmeVar;
        this.b = aqVar;
        this.c = qihVar;
    }

    @Override // defpackage.rhh
    public final void b(kih kihVar) {
        dme dmeVar = this.a;
        yab.i0(dmeVar.k(), null, 0, new xle(this.b, null, dmeVar, kihVar, this.c), 3);
    }

    @Override // defpackage.rhh
    public final void f(yhh yhhVar) {
        if (this.c.c().a.get()) {
            String str = this.a.s;
            aq aqVar = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "onFail: task already processed " + aqVar, null);
                }
            }
        }
        boolean z = this.a.o;
        dme dmeVar = this.a;
        if (!z) {
            yab.i0(dmeVar.k(), null, 0, new l83(12, null, this.a, this.c, this.b, yhhVar), 3);
            return;
        }
        String str2 = dmeVar.s;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 == null) {
            return;
        }
        je9 je9Var2 = je9.e;
        if (a4cVar2.b(je9Var2)) {
            a4cVar2.c(je9Var2, str2, "onFail ignored, cancelled!", null);
        }
    }

    @Override // defpackage.rhh
    public final long g() {
        return this.b.a;
    }
}
