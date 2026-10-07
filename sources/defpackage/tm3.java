package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class tm3 {
    public static final /* synthetic */ zv8[] n;
    public final gu4 a;
    public final xhh b;
    public final mjg c;
    public final String d;
    public final uk3 e;
    public final z00 f;
    public final mjg g;
    public final r8e h;
    public final p3c i;
    public final l9b j;
    public final List k;
    public final List l;
    public final List m;

    static {
        z8b z8bVar = new z8b(tm3.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        n = new zv8[]{z8bVar};
    }

    public tm3(dq4 dq4Var, xhh xhhVar, mjg mjgVar, String str, uk3 uk3Var, z00 z00Var) {
        this.a = dq4Var;
        this.b = xhhVar;
        this.c = mjgVar;
        this.d = str;
        this.e = uk3Var;
        this.f = z00Var;
        mjg mjgVarA = p90.a(new nm3());
        this.g = mjgVarA;
        this.h = new r8e(mjgVarA);
        this.i = qyj.S();
        this.j = new l9b();
        this.k = xw3.P0(ut2.n, ut2.m, ut2.i, ut2.j, ut2.k, ut2.v);
        ut2 ut2Var = ut2.b;
        ut2 ut2Var2 = ut2.o;
        ut2 ut2Var3 = ut2.g;
        ut2 ut2Var4 = ut2.h;
        ut2 ut2Var5 = ut2.c;
        ut2 ut2Var6 = ut2.d;
        ut2 ut2Var7 = ut2.f;
        ut2 ut2Var8 = ut2.e;
        this.l = xw3.P0(ut2Var3, ut2Var4, ut2Var5, ut2Var6, ut2Var7, ut2Var8, ut2.a, ut2Var, ut2Var2);
        this.m = xw3.P0(new ylc(ut2Var3, ut2Var4), new ylc(ut2Var6, ut2Var5), new ylc(ut2Var8, ut2Var7));
        int i = 10;
        e9i.j0(new fz6(e9i.I(new tz(4, new j3(mjgVar, i, this))), new qn6(this, (lq4) null, i), 3), dq4Var);
    }

    public final void a() {
        nm3 nm3Var = new nm3();
        mjg mjgVar = this.g;
        mjgVar.getClass();
        mjgVar.j(null, nm3Var);
    }

    public final boolean b() {
        return !((nm3) this.h.a.getValue()).a.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0144 A[EDGE_INSN: B:141:0x0144->B:46:0x0144 BREAK  A[LOOP:0: B:39:0x0122->B:45:0x013c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x012a  */
    /* JADX WARN: Code duplicated, block: B:44:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010b -> B:38:0x010e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:39:0x0122
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(java.util.Set r21, defpackage.nq4 r22) {
        /*
            Method dump skipped, instruction units count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tm3.c(java.util.Set, nq4):java.lang.Object");
    }

    public final void d(long j) {
        if (j == -1) {
            gm0.Y(tm3.class.getName(), "early return because of chatId == -1L");
            return;
        }
        sgg sggVarH0 = yab.h0(this.a, ((n0c) this.b).a(), 2, new vq(this, j, (lq4) null, 17));
        this.i.B(this, n[0], sggVarH0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(nq4 nq4Var) throws Throwable {
        pm3 pm3Var;
        j9b j9bVar;
        int i;
        Throwable th;
        j9b j9bVar2;
        if (nq4Var instanceof pm3) {
            pm3Var = (pm3) nq4Var;
            int i2 = pm3Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pm3Var.h = i2 - Integer.MIN_VALUE;
            } else {
                pm3Var = new pm3(this, nq4Var);
            }
        } else {
            pm3Var = new pm3(this, nq4Var);
        }
        Object obj = pm3Var.f;
        int i3 = pm3Var.h;
        Object obj2 = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                j9bVar = this.j;
                pm3Var.d = j9bVar;
                i = 0;
                pm3Var.e = 0;
                pm3Var.h = 1;
                if (j9bVar.b(pm3Var) != obj2) {
                }
                return obj2;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j9bVar2 = pm3Var.d;
                try {
                    ch3.d0(obj);
                    j9bVar2.g(null);
                    return sbi.a;
                } catch (Throwable th2) {
                    th = th2;
                    j9bVar2.g(null);
                    throw th;
                }
            }
            i = pm3Var.e;
            j9b j9bVar3 = pm3Var.d;
            ch3.d0(obj);
            j9bVar = j9bVar3;
            j22 j22Var = new j22(15, (wh3) this.c.getValue());
            pm3Var.d = j9bVar;
            pm3Var.e = i;
            pm3Var.h = 2;
            if (f(j22Var, pm3Var) != obj2) {
                j9bVar2 = j9bVar;
                j9bVar2.g(null);
                return sbi.a;
            }
            return obj2;
        } catch (Throwable th3) {
            j9b j9bVar4 = j9bVar;
            th = th3;
            j9bVar2 = j9bVar4;
            j9bVar2.g(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(j22 j22Var, nq4 nq4Var) {
        qm3 qm3Var;
        mjg mjgVar;
        if (nq4Var instanceof qm3) {
            qm3Var = (qm3) nq4Var;
            int i = qm3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm3Var.g = i - Integer.MIN_VALUE;
            } else {
                qm3Var = new qm3(this, nq4Var);
            }
        } else {
            qm3Var = new qm3(this, nq4Var);
        }
        Object obj = qm3Var.e;
        int i2 = qm3Var.g;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            mjg mjgVar2 = this.g;
            Set set = ((nm3) mjgVar2.getValue()).a;
            Set setW1 = ww3.W1(set);
            Iterator it = set.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Number) it.next()).longValue();
                if (((Boolean) j22Var.invoke(new Long(jLongValue))).booleanValue()) {
                    setW1.remove(new Long(jLongValue));
                }
            }
            if (set.equals(setW1)) {
                return sbiVar;
            }
            if (setW1.isEmpty()) {
                nm3 nm3Var = new nm3();
                mjgVar2.getClass();
                mjgVar2.j(null, nm3Var);
                return sbiVar;
            }
            qm3Var.d = mjgVar2;
            qm3Var.g = 1;
            Object nm3Var2 = setW1.isEmpty() ? new nm3() : c(setW1, qm3Var);
            Object obj2 = hu4.a;
            if (nm3Var2 == obj2) {
                return obj2;
            }
            obj = nm3Var2;
            mjgVar = mjgVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mjgVar = qm3Var.d;
            ch3.d0(obj);
        }
        mjgVar.setValue(obj);
        return sbiVar;
    }
}
