package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pdh extends mjf implements btc {
    public static final ConcurrentHashMap c = new ConcurrentHashMap();
    public final String b;

    public pdh() {
        StringBuilder sb = new StringBuilder();
        sb.append(sb.getClass().getName());
        sb.append('#');
        sb.append(getId());
        this.b = sb.toString();
    }

    @Override // defpackage.mjf
    public final void B() {
        int i = 19;
        vo8 vo8Var = (vo8) c.compute(Long.valueOf(getId()), new mw1(i, new s81(25, this)));
        if (vo8Var != null) {
            vo8Var.Y(new bad(this, i, vo8Var));
        }
    }

    public abstract Object C(gu4 gu4Var, lq4 lq4Var);

    @Override // defpackage.mjf, defpackage.btc
    public final boolean a() {
        return false;
    }

    public atc j() {
        je9 je9Var = je9.d;
        vo8 vo8Var = (vo8) c.get(Long.valueOf(getId()));
        if (vo8Var == null || !vo8Var.isActive()) {
            String str = this.b;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "no active job: ready to run", null);
            }
            return atc.a;
        }
        String str2 = this.b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "has active job: skip", null);
        }
        return atc.b;
    }
}
