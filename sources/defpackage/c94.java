package defpackage;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class c94 extends ush {
    public final ry9 e;
    public final c98 f;
    public final c98 g;
    public final c98 h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final long l;
    public final Object m;

    public c94(ry9 ry9Var, ghe gheVar, ghe gheVar2, ghe gheVar3, boolean z, boolean z2, long j, long j2, Object obj) {
        this.e = ry9Var;
        this.f = gheVar;
        this.g = gheVar2;
        this.h = gheVar3;
        this.i = z;
        this.j = z2;
        this.k = j;
        this.l = j2;
        this.m = obj;
    }

    @Override // defpackage.ush
    public final int b(Object obj) {
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            if (obj2 instanceof Integer) {
                int iIntValue = ((Integer) obj2).intValue();
                int iB = ((ush) this.f.get(iIntValue)).b(pair.second);
                if (iB != -1) {
                    return ((Integer) this.g.get(iIntValue)).intValue() + iB;
                }
            }
        }
        return -1;
    }

    @Override // defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        Integer numValueOf = Integer.valueOf(i + 1);
        c98 c98Var = this.g;
        int iD = vqi.d(c98Var, numValueOf, false, false);
        ((ush) this.f.get(iD)).f(i - ((Integer) c98Var.get(iD)).intValue(), rshVar, z);
        rshVar.c = 0;
        rshVar.e = ((Long) this.h.get(i)).longValue();
        rshVar.d = q(rshVar, i);
        if (z) {
            Object obj = rshVar.b;
            obj.getClass();
            rshVar.b = Pair.create(Integer.valueOf(iD), obj);
        }
        return rshVar;
    }

    @Override // defpackage.ush
    public final rsh g(Object obj, rsh rshVar) {
        Pair pair = (Pair) obj;
        int iIntValue = ((Integer) pair.first).intValue();
        Object obj2 = pair.second;
        ush ushVar = (ush) this.f.get(iIntValue);
        int iB = ushVar.b(obj2) + ((Integer) this.g.get(iIntValue)).intValue();
        ushVar.g(obj2, rshVar);
        rshVar.c = 0;
        rshVar.e = ((Long) this.h.get(iB)).longValue();
        rshVar.d = q(rshVar, iB);
        rshVar.b = obj;
        return rshVar;
    }

    @Override // defpackage.ush
    public final int h() {
        return this.h.size();
    }

    @Override // defpackage.ush
    public final Object l(int i) {
        Integer numValueOf = Integer.valueOf(i + 1);
        c98 c98Var = this.g;
        int iD = vqi.d(c98Var, numValueOf, false, false);
        return Pair.create(Integer.valueOf(iD), ((ush) this.f.get(iD)).l(i - ((Integer) c98Var.get(iD)).intValue()));
    }

    @Override // defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        Object obj = tsh.p;
        c98 c98Var = this.h;
        tshVar.b(obj, this.e, this.m, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.i, this.j, null, this.l, this.k, 0, c98Var.size() - 1, -((Long) c98Var.get(0)).longValue());
        return tshVar;
    }

    @Override // defpackage.ush
    public final int o() {
        return 1;
    }

    public final long q(rsh rshVar, int i) {
        if (rshVar.d == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        c98 c98Var = this.h;
        return (i == c98Var.size() + (-1) ? this.k : ((Long) c98Var.get(i + 1)).longValue()) - ((Long) c98Var.get(i)).longValue();
    }
}
