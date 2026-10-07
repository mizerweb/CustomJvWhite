package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ikb {
    public final t51 a;
    public final dp5 b;
    public final dp5 c;
    public final dp5 d;
    public final dp5 e;
    public final dp5 f;
    public final dp5 g;

    public ikb(t51 t51Var, dp5 dp5Var, dp5 dp5Var2, dp5 dp5Var3, dp5 dp5Var4, dp5 dp5Var5, dp5 dp5Var6) {
        this.a = t51Var;
        this.c = dp5Var2;
        this.d = dp5Var3;
        this.b = dp5Var;
        this.e = dp5Var4;
        this.f = dp5Var5;
        this.g = dp5Var6;
    }

    public static void a(rt2 rt2Var, h5c h5cVar) {
        long jA = rt2Var.A();
        if (rt2Var.b.m > 0) {
            h5cVar.g(jA, null);
        } else {
            h5cVar.b(jA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v22, types: [ose] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    public final void b(rt2 rt2Var, long[] jArr, mg5 mg5Var) {
        ?? arrayList;
        gm0.m("ikb", "onNotifMsgDelete, %s", mg5Var.name());
        if (rt2Var == null) {
            return;
        }
        long j = rt2Var.a;
        boolean zA = mg5Var.a();
        dp5 dp5Var = this.g;
        t51 t51Var = this.a;
        dp5 dp5Var2 = this.d;
        if (zA) {
            ArrayList arrayListG = ((qfa) dp5Var2.get()).g(j, jArr);
            ArrayList arrayList2 = new ArrayList(arrayListG.size());
            Iterator it = arrayListG.iterator();
            while (it.hasNext()) {
                try {
                    arrayList2.add(Long.valueOf(((sfa) it.next()).a));
                } catch (Throwable th) {
                    qr7.o(th);
                    return;
                }
            }
            ((qfa) dp5Var2.get()).q(rt2Var.a, arrayList2, wja.DELETED, false);
            t51Var.c(new j3b(j, arrayList2, mg5Var));
            if (arrayList2.isEmpty()) {
                return;
            }
            ((tr6) dp5Var.get()).b(arrayList2);
            return;
        }
        ArrayList arrayListG2 = ((qfa) dp5Var2.get()).g(j, jArr);
        ArrayList arrayList3 = new ArrayList(arrayListG2.size());
        Iterator it2 = arrayListG2.iterator();
        while (it2.hasNext()) {
            try {
                arrayList3.add(Long.valueOf(((sfa) it2.next()).a));
            } catch (Throwable th2) {
                qr7.o(th2);
                return;
            }
        }
        toa toaVar = (toa) ((ose) ((qfa) dp5Var2.get()).b.c()).h();
        ch3.G(toaVar.a, false, true, new t14(toaVar, j, arrayList3, 2));
        t51Var.c(new j3b(j, arrayList3, mg5Var));
        if (mg5Var.h()) {
            ((qw2) this.c.get()).I(j);
        }
        if (((f5d) ((wo6) this.f.get())).s()) {
            dp5 dp5Var3 = this.b;
            ArrayList arrayListY = ((ose) ((n25) dp5Var3.get()).c()).y(j, arrayList3);
            if (!arrayListY.isEmpty()) {
                uoa uoaVarC = ((n25) dp5Var3.get()).c();
                if (arrayListY.isEmpty()) {
                    arrayList = Collections.EMPTY_LIST;
                } else {
                    arrayList = new ArrayList();
                    for (Object obj : arrayListY) {
                        try {
                            if (((sfa) obj).H()) {
                                arrayList.add(Long.valueOf(((sfa) obj).q.a));
                            }
                        } catch (Throwable th3) {
                            qr7.o(th3);
                            return;
                        }
                    }
                }
                p90.K(arrayList);
                ((ose) uoaVarC).A(j, arrayList);
                ArrayList arrayList4 = new ArrayList(arrayListY.size());
                Iterator it3 = arrayListY.iterator();
                while (it3.hasNext()) {
                    try {
                        arrayList4.add(Long.valueOf(((sfa) it3.next()).a));
                    } catch (Throwable th4) {
                        qr7.o(th4);
                        return;
                    }
                }
                ArrayList arrayList5 = new ArrayList(arrayList4);
                arrayList5.removeAll(arrayList3);
                t51Var.c(new lfi(j, arrayList5));
            }
        }
        if (mg5Var.h()) {
            a(rt2Var, (h5c) this.e.get());
        }
        if (arrayList3.isEmpty()) {
            return;
        }
        ((tr6) dp5Var.get()).b(arrayList3);
    }
}
