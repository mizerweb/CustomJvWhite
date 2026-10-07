package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class uia {
    public final dp5 a;

    public uia(dp5 dp5Var) {
        this.a = dp5Var;
    }

    public static boolean a(sfa sfaVar) {
        return !(sfaVar.W() || sfaVar.K() || sfaVar.L() || sfaVar.U() || ch3.r(sfaVar.g)) || sfaVar.V();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x0131  */
    /* JADX WARN: Code duplicated, block: B:98:0x0160 A[RETURN] */
    public final boolean b(rt2 rt2Var, fda fdaVar) {
        boolean z;
        boolean z2;
        int i;
        sfa sfaVar = fdaVar.a;
        if (!sfaVar.K()) {
            boolean zL = sfaVar.L();
            long j = sfaVar.e;
            c46 c46Var = sfaVar.n;
            if (!zL && !sfaVar.W() && !sfaVar.P() && !sfaVar.J() && ((!sfaVar.C() || c46Var.l(y60.i) == null) && !sfaVar.E() && !sfaVar.U() && !sfaVar.I() && !sfaVar.S() && !sfaVar.Q() && (sfaVar.B & 32) != 32)) {
                long j2 = sfaVar.b;
                dp5 dp5Var = this.a;
                if (j2 != 0) {
                    zed zedVar = (zed) dp5Var.get();
                    if ((zedVar.a.f() - sfaVar.c) / 1000 < (sfaVar instanceof ky3 ? ((Integer) zedVar.b.A.a(e5d.S6[18]).i()).intValue() : ((Integer) zedVar.b.z.a(e5d.S6[17]).i()).intValue())) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                if (rt2Var != null && rt2Var.d0()) {
                    boolean z3 = rt2Var.R() && fdaVar.b.f;
                    boolean zM = rt2Var.M();
                    if (z && (rt2Var.Q() || z3 || zM)) {
                        return true;
                    }
                } else if (rt2Var == null || rt2Var.r0()) {
                    if (sfaVar.C()) {
                        List list = (List) c46Var.a;
                        if ((list instanceof Collection) && list.isEmpty()) {
                            i = 0;
                        } else {
                            Iterator it = list.iterator();
                            i = 0;
                            while (it.hasNext()) {
                                try {
                                    y60 y60Var = ((e70) it.next()).a;
                                    if (y60Var == y60.c || y60Var == y60.d) {
                                        i++;
                                    }
                                } catch (Throwable th) {
                                    qr7.o(th);
                                    return false;
                                }
                            }
                        }
                        if (i == c46Var.i()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    if ((!ch3.r(sfaVar.g) || z2) && (sfaVar.D() || (z && (j == ((zed) dp5Var.get()).a.t() || (rt2Var.Z() && j == 0))))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
