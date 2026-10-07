package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class gz3 extends wed {
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ifh o;
    public final int p;
    public final ifh q;

    public gz3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ite iteVar) {
        super(iteVar, null, 14);
        this.j = ny8Var2;
        this.k = ny8Var;
        this.l = ny8Var3;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = new ifh(new w40(ny8Var, 12));
        this.p = 15;
        this.q = new ifh(new w40(ny8Var, 13));
    }

    @Override // defpackage.wed
    public final Set h() {
        return (Set) this.q.getValue();
    }

    @Override // defpackage.wed
    public final int i() {
        return this.p;
    }

    @Override // defpackage.wed
    public final int j() {
        return ((Number) this.o.getValue()).intValue();
    }

    @Override // defpackage.wed
    public final Object n(Object obj, List list, Object obj2, qed qedVar) {
        Object objC;
        q24 q24Var = (q24) obj;
        l8b l8bVar = ((w3b) obj2).c;
        l8b l8bVar2 = new l8b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            l8bVar2.i(jLongValue, l8bVar.f(jLongValue));
        }
        hz3 hz3Var = (hz3) this.n.getValue();
        s04 s04Var = (s04) ((r8e) ((xn3) hz3Var.e.getValue()).c.i(q24Var)).a.getValue();
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (s04Var == null || (objC = hz3Var.C(s04Var, l8bVar2, qedVar)) != hu4Var) {
            objC = sbiVar;
        }
        return objC == hu4Var ? objC : sbiVar;
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        q24 q24Var = (q24) obj;
        return ((sih) this.m.getValue()).a.g(new h3b(q24Var.a, list, new Long(q24Var.b)), gzVar);
    }

    public final long u() {
        return ((s7f) ((et3) this.l.getValue())).f() - ((Number) ((e5d) this.k.getValue()).I2.a(e5d.S6[190]).i()).longValue();
    }

    public final Object v(q24 q24Var, List list, dn0 dn0Var) {
        boolean zBooleanValue = ((Boolean) ((e5d) this.k.getValue()).q5.a(e5d.S6[330]).i()).booleanValue();
        String str = this.g;
        sbi sbiVar = sbi.a;
        if (!zBooleanValue) {
            gm0.n(str, "comments reactions disabled");
            return sbiVar;
        }
        if (!list.isEmpty()) {
            List listW0 = yhf.w0(new m2i(yhf.m0(new sw(1, list), new ez3(this.b, u(), 0)), new w83(8)));
            if (listW0.isEmpty()) {
                gm0.x(str, "prefetch#2: all messages are actual or processing now", null);
                return sbiVar;
            }
            Object objR = r(q24Var, listW0, dn0Var);
            if (objR == hu4.a) {
                return objR;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object w(q24 q24Var, Set set, nq4 nq4Var) {
        fz3 fz3Var;
        long j;
        long j2;
        q24 q24Var2 = q24Var;
        if (nq4Var instanceof fz3) {
            fz3Var = (fz3) nq4Var;
            int i = fz3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                fz3Var.h = i - Integer.MIN_VALUE;
            } else {
                fz3Var = new fz3(this, nq4Var);
            }
        } else {
            fz3Var = new fz3(this, nq4Var);
        }
        Object objI = fz3Var.f;
        int i2 = fz3Var.h;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            if (set.isEmpty()) {
                gm0.Y(gz3.class.getName(), "Early return in execute cuz of messageServerIds.isEmpty() || !chat.syncedWithServer()");
                return sbiVar;
            }
            long jU = u();
            l34 l34Var = (l34) this.j.getValue();
            List listT1 = ww3.T1(this.b);
            fz3Var.d = q24Var2;
            fz3Var.e = jU;
            fz3Var.h = 1;
            l34Var.getClass();
            if (set.isEmpty()) {
                objI = r66.a;
                j = jU;
            } else {
                g24 g24VarM = l34Var.m();
                long j3 = q24Var2.a;
                long j4 = q24Var2.b;
                g24VarM.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT server_id FROM comments WHERE parent_chat_server_id = ? AND parent_message_server_id = ?  AND server_id in (");
                int size = set.size();
                vd7.b(sb, size);
                sb.append(") AND reactions_update_time < ");
                sb.append("?");
                sb.append(" AND server_id NOT IN (");
                vd7.b(sb, listT1.size());
                sb.append(")");
                j = jU;
                objI = ch3.I(fz3Var, g24VarM.a, true, false, new a24(sb.toString(), j3, j4, set, size, j, listT1));
            }
            if (objI != obj) {
                j2 = j;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = fz3Var.e;
        q24Var2 = fz3Var.d;
        ch3.d0(objI);
        List list = (List) objI;
        if (list.isEmpty()) {
            gm0.x(this.g, "prefetch#1: all messages are actual or processing now", null);
            return sbiVar;
        }
        fz3Var.d = null;
        fz3Var.e = j2;
        fz3Var.h = 2;
        return r(q24Var2, list, fz3Var) == obj ? obj : sbiVar;
    }
}
