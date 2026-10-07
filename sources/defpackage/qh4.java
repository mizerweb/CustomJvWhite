package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import one.me.contactlist.ContactListWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class qh4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh4(lq4 lq4Var, cf7 cf7Var, rre rreVar) {
        super(2, lq4Var);
        this.e = 9;
        this.g = rreVar;
        this.h = cf7Var;
    }

    private final Object l(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        zib zibVar = (zib) this.h;
        this.f = 1;
        ajb ajbVar = (ajb) djfVarB.l.getValue();
        ajbVar.getClass();
        gm0.n(ajb.d, "onNotifCallbackAnswer: " + zibVar);
        dp5 dp5Var = ajbVar.b;
        zv8 zv8Var = ajb.c[0];
        rt2 rt2VarK = ((qw2) dp5Var.get()).K(zibVar.d);
        ajbVar.a.c(new n72(rt2VarK != null ? rt2VarK.a : -1L, zibVar.c));
        hu4 hu4Var = hu4.a;
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:41:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x010d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0118  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ae  */
    private final Object n(Object obj) throws Throwable {
        boolean z;
        m8b m8bVarC0;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        bjb bjbVar = (bjb) this.h;
        this.f = 1;
        cjb cjbVar = (cjb) djfVarB.f.getValue();
        t51 t51Var = cjbVar.c;
        dp5 dp5Var = cjbVar.a;
        st2 st2Var = bjbVar.c;
        StringBuilder sb = new StringBuilder("onNotifChat, chat = ");
        sb.append(st2Var);
        sb.append(" created  = ");
        long j = st2Var.e;
        int i2 = st2Var.l;
        sb.append(vd7.K(Long.valueOf(j)));
        gm0.n("cjb", sb.toString());
        try {
            ((a0b) cjbVar.e.get()).j(st2Var);
        } catch (TamErrorException unused) {
        }
        rt2 rt2VarK = ((qw2) dp5Var.get()).K(st2Var.a);
        boolean z2 = rt2VarK != null;
        if (rt2VarK != null) {
            nx2 nx2Var = rt2VarK.b;
            if (j > 0) {
                if (j < nx2Var.f) {
                    StringBuilder sbS = qt4.s(j, "New chat created ", " < old chat created ");
                    sbS.append(nx2Var.f);
                    sbS.append(". Ignore this notif chat");
                    gm0.q("cjb", sbS.toString());
                }
            }
            if (rt2VarK != null && bjbVar.c.b.equals("REMOVED")) {
                ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
            }
            if (rt2VarK != null || rt2VarK.b.f + 1 > j || st2Var.i != null || i2 != 0 || bjbVar.c.b.equals("LEFT") || bjbVar.c.b.equals("CLOSED") || bjbVar.c.b.equals("REMOVED")) {
                if (rt2VarK != null || j == rt2VarK.b.f) {
                    z = false;
                } else {
                    z = true;
                }
                m8bVarC0 = ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
                if (!m8bVarC0.i() && z && j > 0) {
                    ((js3) cjbVar.d.get()).a(m8bVarC0.g(), st2Var.e, true);
                }
                if (!z2) {
                    ((wzj) cjbVar.g.get()).c(new ulf(((s7f) ((et3) cjbVar.f.get())).g(), bjbVar.c.a, 0, mg5.REGULAR));
                    ((lz2) cjbVar.h.get()).a(7, Float.NaN);
                }
                if (i2 > 0 && !m8bVarC0.i()) {
                    ((h5c) cjbVar.b.get()).f(m8bVarC0.g());
                }
                t51Var.c(new wo3((Collection) rx8.f0(m8bVarC0), true, false, (mg5) null, (cid) null, (Set) null, 124));
                if (rt2VarK != null && bjbVar.c.b.equals("REMOVED")) {
                    t51Var.c(new pie(rt2VarK.a));
                }
            } else {
                ((qw2) dp5Var.get()).A(rt2VarK.a, bjbVar.c.k, false);
            }
        } else {
            if (rt2VarK != null) {
                ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
            }
            if (rt2VarK != null) {
                if (rt2VarK != null) {
                    z = false;
                } else {
                    z = false;
                }
                m8bVarC0 = ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
                if (!m8bVarC0.i()) {
                    ((js3) cjbVar.d.get()).a(m8bVarC0.g(), st2Var.e, true);
                }
                if (!z2) {
                    ((wzj) cjbVar.g.get()).c(new ulf(((s7f) ((et3) cjbVar.f.get())).g(), bjbVar.c.a, 0, mg5.REGULAR));
                    ((lz2) cjbVar.h.get()).a(7, Float.NaN);
                }
                if (i2 > 0) {
                    ((h5c) cjbVar.b.get()).f(m8bVarC0.g());
                }
                t51Var.c(new wo3((Collection) rx8.f0(m8bVarC0), true, false, (mg5) null, (cid) null, (Set) null, 124));
                if (rt2VarK != null) {
                    t51Var.c(new pie(rt2VarK.a));
                }
            } else {
                if (rt2VarK != null) {
                    z = false;
                } else {
                    z = false;
                }
                m8bVarC0 = ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
                if (!m8bVarC0.i()) {
                    ((js3) cjbVar.d.get()).a(m8bVarC0.g(), st2Var.e, true);
                }
                if (!z2) {
                    ((wzj) cjbVar.g.get()).c(new ulf(((s7f) ((et3) cjbVar.f.get())).g(), bjbVar.c.a, 0, mg5.REGULAR));
                    ((lz2) cjbVar.h.get()).a(7, Float.NaN);
                }
                if (i2 > 0) {
                    ((h5c) cjbVar.b.get()).f(m8bVarC0.g());
                }
                t51Var.c(new wo3((Collection) rx8.f0(m8bVarC0), true, false, (mg5) null, (cid) null, (Set) null, 124));
                if (rt2VarK != null) {
                    t51Var.c(new pie(rt2VarK.a));
                }
            }
        }
        hu4 hu4Var = hu4.a;
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    private final Object o(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        ia4 ia4Var = ((njb) this.h).c;
        this.f = 1;
        pjb.b((pjb) djfVarB.e.getValue(), ia4Var, false, 4);
        hu4 hu4Var = hu4.a;
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    private final Object p(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        ujb ujbVar = (ujb) this.h;
        this.f = 1;
        sy4 sy4Var = (sy4) djfVarB.q.getValue();
        yab.i0(sy4Var.j, null, 0, new iy4(sy4Var, ujbVar.c, ujbVar.e, ujbVar.d, null), 3);
        hu4 hu4Var = hu4.a;
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    private final Object q(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i == 0) {
            ch3.d0(obj);
            djf djfVarB = ((rc5) this.g).b();
            xjb xjbVar = (xjb) this.h;
            this.f = 1;
            Object objA = ((zjb) djfVarB.b.getValue()).a(xjbVar, this);
            hu4 hu4Var = hu4.a;
            if (objA != hu4Var) {
                objA = sbiVar;
            }
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbiVar;
    }

    private final Object r(Object obj) throws Throwable {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            rc5 rc5Var = (rc5) this.g;
            akb akbVar = (akb) this.h;
            this.f = 1;
            Object objA = rc5.a(rc5Var, akbVar, this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object s(Object obj) {
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        dkb dkbVar = (dkb) this.h;
        this.f = 1;
        gkb gkbVar = (gkb) djfVarB.o.getValue();
        gkbVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        gm0.n("gkb", "got " + dkbVar);
        yab.i0(gkbVar.g, null, 0, new f1j(jCurrentTimeMillis, dkbVar, gkbVar, (lq4) null), 3);
        hu4 hu4Var = hu4.a;
        return sbiVar == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x0086 A[RETURN] */
    private final Object t(Object obj) {
        Object objA;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        hkb hkbVar = (hkb) this.h;
        this.f = 1;
        djfVarB.getClass();
        long j = hkbVar.d;
        hu4 hu4Var = hu4.a;
        if (j != 0) {
            objA = ((ejb) djfVarB.k.getValue()).a(hkbVar, this);
            if (objA != hu4Var) {
            }
            if (objA == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        ikb ikbVar = (ikb) djfVarB.j.getValue();
        dp5 dp5Var = ikbVar.c;
        gm0.n("ikb", "onNotifMsgDelete: " + hkbVar);
        st2 st2Var = hkbVar.c;
        ((qw2) dp5Var.get()).c0(Collections.singletonList(st2Var));
        ikbVar.b(((qw2) dp5Var.get()).K(st2Var.a), hkbVar.e, mg5.REGULAR);
        objA = sbiVar;
        if (objA == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[RETURN] */
    private final Object u(Object obj) {
        Object objA;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        jkb jkbVar = (jkb) this.h;
        this.f = 1;
        djfVarB.getClass();
        long j = jkbVar.d;
        hu4 hu4Var = hu4.a;
        if (j != 0) {
            objA = ((gjb) djfVarB.i.getValue()).a(jkbVar, this);
            if (objA != hu4Var) {
            }
            if (objA == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        kkb kkbVar = (kkb) djfVarB.h.getValue();
        kkbVar.getClass();
        dp5 dp5Var = kkbVar.a;
        gm0.m(kkb.d, "onNotifMsgDeleteRange: %s", jkbVar);
        zv8[] zv8VarArr = kkb.c;
        zv8 zv8Var = zv8VarArr[0];
        ((qw2) dp5Var.get()).c0(Collections.singletonList(jkbVar.c));
        zv8 zv8Var2 = zv8VarArr[0];
        rt2 rt2VarK = ((qw2) dp5Var.get()).K(jkbVar.c.a);
        if (rt2VarK != null) {
            dp5 dp5Var2 = kkbVar.b;
            zv8 zv8Var3 = zv8VarArr[1];
            ((qfa) dp5Var2.get()).b(rt2VarK.a, jkbVar.e, jkbVar.f);
            zv8 zv8Var4 = zv8VarArr[0];
            ((qw2) dp5Var.get()).I(rt2VarK.a);
        }
        objA = sbiVar;
        if (objA == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    private final Object v(Object obj) {
        Object objV;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        djf djfVarB = ((rc5) this.g).b();
        lkb lkbVar = (lkb) this.h;
        this.f = 1;
        mkb mkbVar = (mkb) djfVarB.n.getValue();
        mkbVar.getClass();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "mkb", zo5.j(lkbVar.e, "onReactionsChanged: #"), null);
            }
        }
        List<eja> list = lkbVar.g;
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        for (eja ejaVar : list) {
            arrayList.add(new jja(((lja) mkbVar.c.getValue()).e(ejaVar.a), ejaVar.b));
        }
        long j = lkbVar.d;
        if (j != 0) {
            if (((Boolean) ((e5d) mkbVar.d.getValue()).u5.a(e5d.S6[334]).i()).booleanValue()) {
                hz3 hz3Var = (hz3) mkbVar.b.getValue();
                q24 q24Var = new q24(lkbVar.c, j);
                long j2 = lkbVar.e;
                int i2 = lkbVar.f;
                s04 s04Var = (s04) ((r8e) ((xn3) hz3Var.e.getValue()).c.i(q24Var)).a.getValue();
                if (s04Var == null || (objV = hz3Var.v(s04Var, j2, i2, arrayList, this)) != hu4Var) {
                    objV = sbiVar;
                }
                if (objV != hu4Var) {
                }
            } else {
                gm0.n("mkb", "comments react notifs disabled");
            }
            objV = sbiVar;
        } else {
            qja qjaVar = (qja) mkbVar.a.getValue();
            long j3 = lkbVar.c;
            long j4 = lkbVar.e;
            int i3 = lkbVar.f;
            rt2 rt2Var = (rt2) ((xn3) qjaVar.e.getValue()).l(j3).a.getValue();
            if (rt2Var == null || (objV = qjaVar.v(rt2Var, j4, i3, arrayList, this)) != hu4Var) {
                objV = sbiVar;
            }
            if (objV != hu4Var) {
                objV = sbiVar;
            }
        }
        if (objV != hu4Var) {
            objV = sbiVar;
        }
        return objV == hu4Var ? hu4Var : sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                qh4 qh4Var = new qh4((xh4) obj2, lq4Var, 0);
                qh4Var.g = obj;
                return qh4Var;
            case 1:
                return new qh4((yk4) this.g, (pj4) obj2, lq4Var, 1);
            case 2:
                return new qh4((ContactListWidget) this.g, (qn7) obj2, lq4Var, 2);
            case 3:
                return new qh4((mm4) this.g, (ArrayList) obj2, lq4Var, 3);
            case 4:
                return new qh4((yhh) this.g, (pm4) obj2, lq4Var, 4);
            case 5:
                return new qh4((qo4) this.g, (String) obj2, lq4Var, 5);
            case 6:
                return new qh4((jt4) this.g, (String) obj2, lq4Var, 6);
            case 7:
                return new qh4((rv4) this.g, (kr2) obj2, lq4Var, 7);
            case 8:
                return new qh4((rv4) this.g, (yq0) obj2, lq4Var, 8);
            case 9:
                return new qh4(lq4Var, (cf7) obj2, (rre) this.g);
            case 10:
                qh4 qh4Var2 = new qh4(lq4Var, (cf7) obj2);
                qh4Var2.g = obj;
                return qh4Var2;
            case 11:
                qh4 qh4Var3 = new qh4((o35) obj2, lq4Var, 11);
                qh4Var3.g = obj;
                return qh4Var3;
            case 12:
                return new qh4((y85) this.g, (sv1) obj2, lq4Var, 12);
            case 13:
                return new qh4((rc5) this.g, (x45) obj2, lq4Var, 13);
            case 14:
                return new qh4((rc5) this.g, (pib) obj2, lq4Var, 14);
            case 15:
                return new qh4((rc5) this.g, (qib) obj2, lq4Var, 15);
            case 16:
                return new qh4((rc5) this.g, (tib) obj2, lq4Var, 16);
            case 17:
                return new qh4((rc5) this.g, (xib) obj2, lq4Var, 17);
            case 18:
                return new qh4((rc5) this.g, (zib) obj2, lq4Var, 18);
            case 19:
                return new qh4((rc5) this.g, (bjb) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new qh4((rc5) this.g, (njb) obj2, lq4Var, 20);
            case 21:
                return new qh4((rc5) this.g, (ujb) obj2, lq4Var, 21);
            case 22:
                return new qh4((rc5) this.g, (wjb) obj2, lq4Var, 22);
            case 23:
                return new qh4((rc5) this.g, (xjb) obj2, lq4Var, 23);
            case 24:
                return new qh4((rc5) this.g, (akb) obj2, lq4Var, 24);
            case 25:
                return new qh4((rc5) this.g, (dkb) obj2, lq4Var, 25);
            case 26:
                return new qh4((rc5) this.g, (hkb) obj2, lq4Var, 26);
            case 27:
                return new qh4((rc5) this.g, (jkb) obj2, lq4Var, 27);
            case 28:
                return new qh4((rc5) this.g, (lkb) obj2, lq4Var, 28);
            default:
                return new qh4((rc5) this.g, (nkb) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qh4) create((tnd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((qh4) create((nzh) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 21:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qh4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:218:0x0434  */
    /* JADX WARN: Code duplicated, block: B:472:0x0a90  */
    /* JADX WARN: Code duplicated, block: B:474:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:476:0x0a9e  */
    /* JADX WARN: Code duplicated, block: B:477:0x0aa0  */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0aaf, code lost:
    
        if (r0.a(r9, r46) == r12) goto L480;
     */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh4(lq4 lq4Var, cf7 cf7Var) {
        super(2, lq4Var);
        this.e = 10;
        this.h = cf7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh4(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh4(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }
}
