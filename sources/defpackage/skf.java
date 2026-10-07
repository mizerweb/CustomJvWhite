package defpackage;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes3.dex */
public final class skf extends mjf {
    public final long b;
    public final mg5 c;

    public skf(long j, mg5 mg5Var) {
        this.b = j;
        this.c = mg5Var;
    }

    @Override // defpackage.mjf
    public final void B() {
        long j = this.b;
        if (j > 0) {
            C(c().N(j));
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        for (rt2 rt2Var : c().P(qw2.I)) {
            if (jCurrentTimeMillis - rt2Var.b.k < 1209600000) {
                if (C(rt2Var)) {
                    i++;
                }
                if (i >= 10) {
                    return;
                }
            }
        }
    }

    public final boolean C(rt2 rt2Var) {
        long jC;
        Iterable<fda> iterableB;
        if (rt2Var != null) {
            nx2 nx2Var = rt2Var.b;
            fx2 fx2Var = nx2Var.n;
            mg5 mg5Var = this.c;
            if (fx2Var.d(mg5Var) != 0) {
                int iOrdinal = mg5Var.ordinal();
                if (iOrdinal == 0) {
                    jC = pll.c(rt2Var);
                } else {
                    if (iOrdinal != 1) {
                        c.q(mg5Var, "Unexpected value: ");
                        return false;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(1, 1);
                    jC = calendar.getTimeInMillis();
                }
                long j = jC;
                qfa qfaVarR = r();
                ArrayList arrayListE = nx2Var.n.e(mg5Var);
                dp5 dp5Var = qfaVarR.g;
                gm0.n("qfa", "loadInitialToReadMark " + vd7.K(Long.valueOf(j)) + "; chunks count = " + arrayListE.size());
                ex2 ex2Var = (ex2) sb8.w(j, arrayListE).b;
                mg5 mg5Var2 = this.c;
                if (ex2Var == null) {
                    ex2 ex2VarX = sb8.x(j, arrayListE);
                    iterableB = ex2VarX != null ? ((a) dp5Var.get()).b(qfaVarR.j(rt2Var.a, ex2VarX.a, ex2VarX.b, true, mg5Var2)) : null;
                } else {
                    ArrayList<sfa> arrayListJ = qfaVarR.j(rt2Var.a, ex2Var.a, j, true, mg5Var2);
                    ArrayList<sfa> arrayListJ2 = qfaVarR.j(rt2Var.a, j, ex2Var.b, false, mg5Var2);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList = new ArrayList();
                    for (sfa sfaVar : arrayListJ) {
                        arrayList.add(sfaVar);
                        hashSet.add(Long.valueOf(sfaVar.a));
                    }
                    for (sfa sfaVar2 : arrayListJ2) {
                        if (!hashSet.contains(Long.valueOf(sfaVar2.a))) {
                            arrayList.add(sfaVar2);
                            hashSet.add(Long.valueOf(sfaVar2.a));
                        }
                    }
                    gm0.n("qfa", "result record count = " + hashSet.size());
                    iterableB = ((a) dp5Var.get()).b(arrayList);
                }
                if (iterableB == null) {
                    iterableB = r66.a;
                }
                for (fda fdaVar : iterableB) {
                    njf njfVar = this.a;
                    if (njfVar == null) {
                        njfVar = null;
                    }
                    b bVar = (b) njfVar.M.getValue();
                    sfa sfaVar3 = fdaVar.a;
                    bVar.f(rt2Var, sfaVar3);
                    boolean zC = sfaVar3.C();
                    c46 c46Var = sfaVar3.n;
                    if (zC) {
                        int i = c46Var.i();
                        for (int i2 = 0; i2 < i; i2++) {
                            njf njfVar2 = this.a;
                            if (njfVar2 == null) {
                                njfVar2 = null;
                            }
                            c2a c2aVar = (c2a) njfVar2.H.getValue();
                            c46Var.h(i2);
                            c2aVar.getClass();
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
