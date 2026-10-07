package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.exception.ChatNotFoundException;

/* JADX INFO: loaded from: classes3.dex */
public final class pja extends wed {
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ifh p;
    public final int q;
    public final ifh r;

    public pja(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ite iteVar, ny8 ny8Var5, ny8 ny8Var6) {
        super(iteVar, null, 14);
        this.j = ny8Var2;
        this.k = ny8Var;
        this.l = ny8Var3;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = ny8Var6;
        this.p = new ifh(new w40(ny8Var, 18));
        this.q = 15;
        this.r = new ifh(new w40(ny8Var, 19));
    }

    @Override // defpackage.wed
    public final Set h() {
        return (Set) this.r.getValue();
    }

    @Override // defpackage.wed
    public final int i() {
        return this.q;
    }

    @Override // defpackage.wed
    public final int j() {
        return ((Number) this.p.getValue()).intValue();
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return u(((Number) obj).longValue(), list, (w3b) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        return ((sih) this.m.getValue()).a.g(new h3b(((Number) obj).longValue(), list, (Long) null), gzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object u(long j, List list, w3b w3bVar, nq4 nq4Var) {
        nja njaVar;
        Object objC;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (nq4Var instanceof nja) {
            njaVar = (nja) nq4Var;
            int i = njaVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                njaVar.i = i - Integer.MIN_VALUE;
            } else {
                njaVar = new nja(this, nq4Var);
            }
        } else {
            njaVar = new nja(this, nq4Var);
        }
        Object objI = njaVar.g;
        int i2 = njaVar.i;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) this.o.getValue();
            njaVar.e = list;
            njaVar.f = w3bVar;
            njaVar.d = j;
            njaVar.i = 1;
            objI = xn3Var.i(j, njaVar);
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = njaVar.e;
            ch3.d0(objI);
            return sbiVar;
        }
        j = njaVar.d;
        w3bVar = njaVar.f;
        list = njaVar.e;
        ch3.d0(objI);
        rt2 rt2Var = (rt2) objI;
        if (rt2Var == null) {
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.s(j, "chat #", " is null"), null);
                }
            }
            d(new Long(j));
            throw new ChatNotFoundException(String.valueOf(j));
        }
        l8b l8bVar = w3bVar.c;
        l8b l8bVar2 = new l8b(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            l8bVar2.i(jLongValue, l8bVar.f(jLongValue));
        }
        qja qjaVar = (qja) this.n.getValue();
        long j2 = rt2Var.a;
        njaVar.e = null;
        njaVar.f = null;
        njaVar.d = j;
        njaVar.i = 2;
        rt2 rt2Var2 = (rt2) ((xn3) qjaVar.e.getValue()).k(j2).a.getValue();
        if (rt2Var2 == null || (objC = qjaVar.C(rt2Var2, l8bVar2, njaVar)) != hu4Var) {
            objC = sbiVar;
        }
        return objC == hu4Var ? hu4Var : sbiVar;
    }

    public final long v() {
        return ((s7f) ((et3) this.l.getValue())).f() - ((Number) ((e5d) this.k.getValue()).I2.a(e5d.S6[190]).i()).longValue();
    }

    public final Object w(rt2 rt2Var, List list, lq4 lq4Var) {
        boolean zIsEmpty = list.isEmpty();
        sbi sbiVar = sbi.a;
        if (!zIsEmpty && rt2Var.b.g()) {
            List listW0 = yhf.w0(new m2i(yhf.m0(new sw(1, list), new ez3(this.b, v(), 1)), new s9a(8)));
            if (listW0.isEmpty()) {
                gm0.x(this.g, "prefetch#2: all messages are actual or processing now", null);
                return sbiVar;
            }
            Object objR = r(new Long(rt2Var.A()), listW0, (nq4) lq4Var);
            if (objR == hu4.a) {
                return objR;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object x(rt2 rt2Var, Set set, nq4 nq4Var) {
        oja ojaVar;
        long j;
        long j2;
        rt2 rt2Var2 = rt2Var;
        if (nq4Var instanceof oja) {
            ojaVar = (oja) nq4Var;
            int i = ojaVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ojaVar.h = i - Integer.MIN_VALUE;
            } else {
                ojaVar = new oja(this, nq4Var);
            }
        } else {
            ojaVar = new oja(this, nq4Var);
        }
        Object objI = ojaVar.f;
        int i2 = ojaVar.h;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            if (set.isEmpty() || !rt2Var2.b.g()) {
                gm0.Y(pja.class.getName(), "Early return in execute cuz of messageServerIds.isEmpty() || !chat.syncedWithServer()");
                return sbiVar;
            }
            long jV = v();
            sua suaVar = (sua) this.j.getValue();
            long j3 = rt2Var2.a;
            List listT1 = ww3.T1(this.b);
            ojaVar.d = rt2Var2;
            ojaVar.e = jV;
            ojaVar.h = 1;
            ose oseVar = (ose) suaVar.a;
            oseVar.getClass();
            if (set.isEmpty()) {
                objI = r66.a;
                j = jV;
            } else {
                toa toaVar = (toa) oseVar.h();
                toaVar.getClass();
                StringBuilder sb = new StringBuilder();
                sb.append("SELECT server_id FROM messages WHERE chat_id = ? AND server_id in (");
                int size = set.size();
                vd7.b(sb, size);
                sb.append(") AND reactions_update_time < ");
                sb.append("?");
                sb.append(" AND server_id NOT IN (");
                vd7.b(sb, listT1.size());
                sb.append(")");
                j = jV;
                objI = ch3.I(ojaVar, toaVar.a, true, false, new kq5(sb.toString(), j3, set, size, j, listT1));
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
        j2 = ojaVar.e;
        rt2Var2 = ojaVar.d;
        ch3.d0(objI);
        List list = (List) objI;
        if (list.isEmpty()) {
            gm0.x(this.g, "prefetch#1: all messages are actual or processing now", null);
            return sbiVar;
        }
        ojaVar.d = null;
        ojaVar.e = j2;
        ojaVar.h = 2;
        return r(new Long(rt2Var2.A()), list, ojaVar) == obj ? obj : sbiVar;
    }
}
