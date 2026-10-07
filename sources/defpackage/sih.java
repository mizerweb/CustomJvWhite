package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sih {
    public final dme a;

    public sih(dme dmeVar) {
        this.a = dmeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long a(dme dmeVar, rih rihVar) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "sih", "execute " + rihVar, null);
            }
        }
        boolean z = rihVar.b;
        aq aqVar = rihVar.a;
        if (!z) {
            return dmeVar.h(aqVar, (qih) aqVar, rihVar.c);
        }
        long j = rihVar.d;
        int i = rihVar.e;
        if (aqVar instanceof btc) {
            yab.i0(dmeVar.k(), (xt4) dmeVar.l.getValue(), 0, new hba(dmeVar, aqVar, j, i, null), 2);
            return aqVar.a;
        }
        dmeVar.getClass();
        ore.p("task must be instance of PersistableTask");
        return 0L;
    }

    public static long b(sih sihVar, aq aqVar) {
        sihVar.getClass();
        return a(sihVar.a, new rih(aqVar, false, false, 0L, 0));
    }

    public final long c(aq aqVar, boolean z, long j, int i) {
        long j2;
        int i2;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            StringBuilder sb = new StringBuilder("executeAndSave ");
            sb.append(aqVar);
            sb.append(", ");
            sb.append(z);
            sb.append(", ");
            j2 = j;
            sb.append(j2);
            sb.append(", ");
            i2 = i;
            sb.append(i2);
            a4cVar.c(je9Var, "sih", sb.toString(), null);
        } else {
            j2 = j;
            i2 = i;
        }
        rih rihVar = new rih(aqVar, true, z, j2, i2);
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, "sih", "tamService != null, execute task " + rihVar + " ", null);
        }
        return a(this.a, rihVar);
    }

    public final Object e(rd9 rd9Var, zd9 zd9Var) {
        return this.a.g(rd9Var, zd9Var);
    }

    public final Object f(aq aqVar, nq4 nq4Var) {
        dme dmeVar = this.a;
        dmeVar.getClass();
        ek2 ek2Var = new ek2(1, p90.B(nq4Var));
        ek2Var.u();
        ek2Var.w(new w62(dmeVar, 9, aqVar));
        dmeVar.h(aqVar, new ule(ek2Var, aqVar), false);
        return ek2Var.s();
    }
}
