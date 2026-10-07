package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class ffa extends wed {
    public static final Set t = a.p1(new String[]{"comments.channel_not_found", "comments.permission_denied"});
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ifh q;
    public final int r;
    public final Set s;

    public ffa(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ite iteVar, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7) {
        super(iteVar, null, 14);
        this.j = ny8Var2;
        this.k = ny8Var;
        this.l = ny8Var3;
        this.m = ny8Var4;
        this.n = ny8Var5;
        this.o = ny8Var6;
        this.p = ny8Var7;
        this.q = new ifh(new w40(ny8Var, 17));
        this.r = 15;
        this.s = t;
    }

    @Override // defpackage.wed
    public final Set h() {
        return this.s;
    }

    @Override // defpackage.wed
    public final int i() {
        return this.r;
    }

    @Override // defpackage.wed
    public final int j() {
        return ((Number) this.q.getValue()).intValue();
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return v(((Number) obj).longValue(), list, (rk7) obj2, qedVar);
    }

    @Override // defpackage.wed
    public final Object o(Object obj, List list, gz gzVar) {
        long jLongValue = ((Number) obj).longValue();
        wy2 wy2Var = new wy2(kfc.R1, 27);
        if (list.isEmpty()) {
            ore.p("postIds can't be empty");
            return null;
        }
        wy2Var.f(jLongValue, ApiProtocol.PARAM_CHAT_ID);
        wy2Var.d("postIds", list);
        return ((sih) this.m.getValue()).a.g(wy2Var, gzVar);
    }

    public final boolean u(rt2 rt2Var, Set set) {
        if (!rt2Var.b.I.n) {
            if (!set.isEmpty() && ((f5d) ((wo6) this.p.getValue())).q() && rt2Var.d0() && rt2Var.b.g()) {
                return true;
            }
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    boolean zIsEmpty = set.isEmpty();
                    boolean zQ = ((f5d) ((wo6) this.p.getValue())).q();
                    boolean zD0 = rt2Var.d0();
                    boolean zG = rt2Var.b.g();
                    StringBuilder sbB = zo5.B("Empty=", zIsEmpty, ", enabled=", zQ, ", channel=");
                    sbB.append(zD0);
                    sbB.append(", synced=");
                    sbB.append(zG);
                    a4cVar.c(je9Var, str, sbB.toString(), null);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f5, code lost:
    
        if (r9.a(r12, r2, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(long r10, java.util.List r12, defpackage.rk7 r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffa.v(long, java.util.List, rk7, nq4):java.lang.Object");
    }

    public final Object w(rt2 rt2Var, List list, lq4 lq4Var) {
        Object objX;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            sfa sfaVar = (sfa) obj;
            if (sfaVar.b > 0 && !sfaVar.M() && !sfaVar.a0() && sfaVar.j != wja.DELETED) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0a.t(((sfa) it.next()).b, arrayList2);
        }
        return (arrayList2.isEmpty() || (objX = x(rt2Var, ww3.X1(arrayList2), (nq4) lq4Var)) != hu4.a) ? sbi.a : objX;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object x(rt2 rt2Var, final Set set, nq4 nq4Var) {
        dfa dfaVar;
        rt2 rt2Var2 = rt2Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof dfa) {
            dfaVar = (dfa) nq4Var;
            int i = dfaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dfaVar.g = i - Integer.MIN_VALUE;
            } else {
                dfaVar = new dfa(this, nq4Var);
            }
        } else {
            dfaVar = new dfa(this, nq4Var);
        }
        Object objI = dfaVar.e;
        Object obj = hu4.a;
        int i2 = dfaVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            if (u(rt2Var, set)) {
                sua suaVar = (sua) this.j.getValue();
                final long j = rt2Var2.a;
                e14 e14Var = (e14) ((e5d) this.k.getValue()).o5.a(e5d.S6[328]).i();
                final long jF = ((s7f) ((et3) this.l.getValue())).f() - (rt2Var2.b.b() >= e14Var.c ? e14Var.b : e14Var.a);
                final List listT1 = ww3.T1(this.b);
                dfaVar.d = rt2Var2;
                dfaVar.g = 1;
                ose oseVar = (ose) suaVar.a;
                oseVar.getClass();
                if (set.isEmpty()) {
                    objI = r66.a;
                } else {
                    yea yeaVarG = oseVar.g();
                    yeaVarG.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append("SELECT m.server_id FROM messages m LEFT JOIN message_comments mc ON m.id = mc.message_id WHERE m.chat_id = ? AND m.server_id IN (");
                    final int size = set.size();
                    vd7.b(sb, size);
                    sb.append(") AND m.server_id NOT IN (");
                    final int size2 = listT1.size();
                    vd7.b(sb, size2);
                    sb.append(") AND m.server_id > 0 AND (mc.message_id IS NULL OR mc.updated_at < ");
                    sb.append("?");
                    sb.append(")");
                    final String string = sb.toString();
                    objI = ch3.I(dfaVar, yeaVarG.a, true, false, new cf7() { // from class: xea
                        @Override // defpackage.cf7
                        public final Object invoke(Object obj2) throws Exception {
                            long j2 = j;
                            Collection collection = set;
                            int i3 = size;
                            Collection collection2 = listT1;
                            int i4 = size2;
                            long j3 = jF;
                            vxe vxeVarO0 = ((qxe) obj2).O0(string);
                            try {
                                vxeVarO0.c(1, j2);
                                Iterator it = collection.iterator();
                                int i5 = 2;
                                while (it.hasNext()) {
                                    vxeVarO0.c(i5, ((Number) it.next()).longValue());
                                    i5++;
                                }
                                int i6 = i3 + 2;
                                Iterator it2 = collection2.iterator();
                                int i7 = i6;
                                while (it2.hasNext()) {
                                    vxeVarO0.c(i7, ((Number) it2.next()).longValue());
                                    i7++;
                                }
                                vxeVarO0.c(i6 + i4, j3);
                                ArrayList arrayList = new ArrayList();
                                while (vxeVarO0.M0()) {
                                    arrayList.add(Long.valueOf(vxeVarO0.getLong(0)));
                                }
                                return arrayList;
                            } finally {
                                vxeVarO0.close();
                            }
                        }
                    });
                }
                if (objI != obj) {
                }
            }
            String str = this.g;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "couldn't prefetch " + set + " at " + rt2Var2.A(), null);
                    return sbiVar;
                }
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
        rt2Var2 = dfaVar.d;
        ch3.d0(objI);
        List list = (List) objI;
        if (list.isEmpty()) {
            gm0.x(this.g, "all posts are fresh or processing now", null);
            return sbiVar;
        }
        dfaVar.d = null;
        dfaVar.g = 2;
        return r(new Long(rt2Var2.A()), list, dfaVar) == obj ? obj : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y(q24 q24Var, nq4 nq4Var) {
        efa efaVar;
        Object objR;
        je9 je9Var = je9.f;
        Object obj = sbi.a;
        if (nq4Var instanceof efa) {
            efaVar = (efa) nq4Var;
            int i = efaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                efaVar.g = i - Integer.MIN_VALUE;
            } else {
                efaVar = new efa(this, nq4Var);
            }
        } else {
            efaVar = new efa(this, nq4Var);
        }
        Object objI = efaVar.e;
        Object obj2 = hu4.a;
        int i2 = efaVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            xn3 xn3Var = (xn3) this.o.getValue();
            long j = q24Var.a;
            efaVar.d = q24Var;
            efaVar.g = 1;
            objI = xn3Var.i(j, efaVar);
            if (objI != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        q24Var = efaVar.d;
        ch3.d0(objI);
        rt2 rt2Var = (rt2) objI;
        if (rt2Var != null) {
            long j2 = q24Var.b;
            efaVar.d = null;
            efaVar.g = 2;
            if (u(rt2Var, Collections.singleton(new Long(j2)))) {
                objR = r(new Long(rt2Var.A()), c0a.s(j2), efaVar);
                if (objR != obj2) {
                }
                if (objR == obj2) {
                    return obj2;
                }
            } else {
                String str = this.g;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    long jA = rt2Var.A();
                    StringBuilder sbS = qt4.s(j2, "couldn't refresh comments info for post#", " at ");
                    sbS.append(jA);
                    a4cVar.c(je9Var, str, sbS.toString(), null);
                }
            }
            objR = obj;
            if (objR == obj2) {
                return obj2;
            }
        } else {
            String str2 = this.g;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "couldn't refresh comments info for commentsId(" + q24Var + "): no chat found", null);
            }
        }
        return obj;
    }
}
