package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y03 {
    public final rt2 a;
    public final af7 b;

    public y03(rt2 rt2Var, af7 af7Var) {
        this.a = rt2Var;
        this.b = af7Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0075  */
    public final boolean equals(Object obj) {
        boolean z;
        sfa sfaVar;
        sfa sfaVar2;
        fda fdaVar;
        if (this != obj) {
            if (obj instanceof y03) {
                rt2 rt2Var = this.a;
                fda fdaVar2 = rt2Var.c;
                fda fdaVar3 = rt2Var.c;
                if (fdaVar2 == null || (fdaVar = ((y03) obj).a.c) == null) {
                    z = true;
                } else {
                    sfa sfaVar3 = fdaVar2.a;
                    boolean zC = sfaVar3.C();
                    sfa sfaVar4 = fdaVar.a;
                    if (zC == sfaVar4.C()) {
                        if (sfaVar3.C() || sfaVar4.C()) {
                            List list = (List) sfaVar3.n.a;
                            List list2 = (List) sfaVar4.n.a;
                            if (list.size() == list2.size()) {
                                Iterator it = list.iterator();
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        if (!ch3.a(((e70) it.next()).t, ((e70) it2.next()).t)) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                        z = false;
                    } else {
                        z = true;
                    }
                }
                nx2 nx2Var = rt2Var.b;
                long j = nx2Var.l;
                rt2 rt2Var2 = ((y03) obj).a;
                nx2 nx2Var2 = rt2Var2.b;
                fda fdaVar4 = rt2Var2.c;
                if (j == nx2Var2.l && nx2Var.a == nx2Var2.a && nx2Var.k == nx2Var2.k) {
                    if (cqk.d((fdaVar3 == null || (sfaVar2 = fdaVar3.a) == null) ? null : Long.valueOf(sfaVar2.s()), (fdaVar4 == null || (sfaVar = fdaVar4.a) == null) ? null : Long.valueOf(sfaVar.s())) && z) {
                        af7 af7Var = this.b;
                        if (cqk.d(fdaVar3 != null ? fdaVar3.b.y((ts0) af7Var.invoke()) : null, fdaVar4 != null ? fdaVar4.b.y((ts0) af7Var.invoke()) : null)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode;
        sfa sfaVar;
        sfa sfaVar2;
        int iHashCode2 = y03.class.hashCode();
        rt2 rt2Var = this.a;
        int iHashCode3 = (Long.hashCode(rt2Var.b.l) * 31) + iHashCode2;
        nx2 nx2Var = rt2Var.b;
        int iHashCode4 = (Long.hashCode(nx2Var.k) * 31) + (Long.hashCode(nx2Var.a) * 31) + iHashCode3;
        fda fdaVar = rt2Var.c;
        Long lValueOf = (fdaVar == null || (sfaVar2 = fdaVar.a) == null) ? null : Long.valueOf(sfaVar2.s());
        int iHashCode5 = ((lValueOf != null ? lValueOf.hashCode() : 0) * 31) + iHashCode4;
        c46 c46Var = (fdaVar == null || (sfaVar = fdaVar.a) == null) ? null : sfaVar.n;
        if (c46Var == null || c46Var.i() == 0) {
            iHashCode = 0;
        } else {
            iHashCode = 0;
            for (int i = 0; i < c46Var.i(); i++) {
                e70 e70VarH = c46Var.h(i);
                if (e70VarH != null) {
                    iHashCode = (iHashCode * 31) + Boolean.hashCode(e70VarH.B) + nbh.n((Objects.hashCode(e70VarH.z) + qt4.g(qt4.g(qt4.g(nbh.n((Objects.hashCode(e70VarH.u) + ((Objects.hashCode(e70VarH.t) + nbh.m(qt4.g((Objects.hashCode(e70VarH.q) + ((Objects.hashCode(e70VarH.m) + ((Objects.hashCode(e70VarH.l) + ((Objects.hashCode(e70VarH.k) + ((Objects.hashCode(e70VarH.j) + ((Objects.hashCode(e70VarH.i) + ((Objects.hashCode(e70VarH.h) + ((Objects.hashCode(e70VarH.g) + ((Objects.hashCode(e70VarH.f) + ((Objects.hashCode(e70VarH.e) + ((Objects.hashCode(e70VarH.d) + ((Objects.hashCode(e70VarH.c) + ((Objects.hashCode(e70VarH.b) + (Objects.hashCode(e70VarH.a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, e70VarH.r), e70VarH.s, 31)) * 31)) * 31, 31, e70VarH.v), 31, e70VarH.w), 31, e70VarH.x), 31, e70VarH.y)) * 31, 31, e70VarH.A);
                }
            }
        }
        int i2 = (iHashCode * 31) + iHashCode5;
        String strY = fdaVar != null ? fdaVar.b.y((ts0) this.b.invoke()) : null;
        return ((strY != null ? strY.hashCode() : 0) * 31) + i2;
    }

    public final String toString() {
        sfa sfaVar;
        rt2 rt2Var = this.a;
        nx2 nx2Var = rt2Var.b;
        long j = nx2Var.l;
        long j2 = nx2Var.a;
        long j3 = nx2Var.k;
        fda fdaVar = rt2Var.c;
        long jS = (fdaVar == null || (sfaVar = fdaVar.a) == null) ? 0L : sfaVar.s();
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(":");
        sb.append(j2);
        qt4.z(j3, ":", ":", sb);
        sb.append(jS);
        return sb.toString();
    }
}
