package defpackage;

import androidx.work.impl.WorkerStoppedException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class jl3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jl3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00f8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        List list;
        List list2;
        Long l;
        Iterator it;
        boolean z = false;
        switch (this.a) {
            case 0:
                ek4 ek4Var = (ek4) obj;
                if (ek4Var.k) {
                    z = true;
                } else {
                    List list3 = ((wh3) ((rl3) this.b).z1.a.getValue()).a;
                    if ((list3 instanceof Collection) && list3.isEmpty()) {
                        list = ek4Var.d;
                        if (list != null) {
                            list2 = list;
                            l = (Long) this.c;
                            if (list2 instanceof Collection) {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    long jLongValue = ((Number) it.next()).longValue();
                                    if (l == null) {
                                        z = true;
                                    }
                                }
                            } else {
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    long jLongValue2 = ((Number) it.next()).longValue();
                                    if (l == null) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    } else {
                        Iterator it2 = list3.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Long l2 = ((w73) it2.next()).r;
                                long j = ek4Var.a;
                                if (l2 != null && l2.longValue() == j) {
                                }
                            } else {
                                list = ek4Var.d;
                                if (list != null) {
                                    list2 = list;
                                    l = (Long) this.c;
                                    if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                        it = list2.iterator();
                                        while (it.hasNext()) {
                                            long jLongValue3 = ((Number) it.next()).longValue();
                                            if (l == null && jLongValue3 == l.longValue()) {
                                            }
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ((dme) this.b).j().d((hih) this.c);
                return sbi.a;
            case 2:
                String str = ((owh) obj).a;
                lbj lbjVar = new lbj(((mbj) this.b).a, (wd4) this.c);
                if (lbjVar.b.c()) {
                    lbjVar.c = true;
                } else {
                    lbjVar.d = tre.m0(new fz6(new jz(new dab(new qg9(e9i.o(new qob(lbjVar.b, (lq4) null, 17)), 1), lbjVar, 17), 11), new wyj(lbjVar, null, 17), 3), new krc(lbjVar.a));
                }
                return lbjVar;
            default:
                Throwable th = (Throwable) obj;
                if (th instanceof WorkerStoppedException) {
                    m89 m89Var = (m89) this.b;
                    if (m89Var.c.compareAndSet(-256, ((WorkerStoppedException) th).a)) {
                        m89Var.b();
                    }
                }
                ((e89) this.c).cancel(false);
                return sbi.a;
        }
    }
}
