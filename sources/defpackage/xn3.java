package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class xn3 implements ow2, hh9 {
    public final xhh a;
    public final p7f b;
    public final pq3 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final String h = xn3.class.getName();

    public xn3(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, xhh xhhVar, ite iteVar, p7f p7fVar, ny8 ny8Var5) {
        this.a = xhhVar;
        this.b = p7fVar;
        this.c = new pq3(ny8Var, ny8Var2, xhhVar);
        this.d = ny8Var3;
        this.e = ny8Var2;
        this.f = ny8Var4;
        this.g = ny8Var5;
        yab.i0(iteVar, ((n0c) xhhVar).b(), 0, new y73(ny8Var2, this, null, 5), 2);
    }

    @Override // defpackage.ow2
    public final void a(Collection collection) {
        this.c.a(collection);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, nq4 nq4Var, List list, boolean z) {
        mn3 mn3Var;
        if (nq4Var instanceof mn3) {
            mn3Var = (mn3) nq4Var;
            int i = mn3Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mn3Var.i = i - Integer.MIN_VALUE;
            } else {
                mn3Var = new mn3(this, nq4Var);
            }
        } else {
            mn3Var = new mn3(this, nq4Var);
        }
        Object objV = mn3Var.g;
        int i2 = mn3Var.i;
        if (i2 == 0) {
            ch3.d0(objV);
            mn3Var.e = list;
            mn3Var.d = j;
            mn3Var.f = z;
            mn3Var.i = 1;
            objV = v(j, mn3Var);
            Object obj = hu4.a;
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = mn3Var.f;
            j = mn3Var.d;
            list = mn3Var.e;
            ch3.d0(objV);
        }
        long j2 = j;
        List list2 = list;
        boolean z2 = z;
        qw2 qw2VarJ = j();
        long jA = ((rt2) objV).A();
        qw2VarJ.getClass();
        gm0.n("qw2", "addChatUsers, chatId = " + j2 + ", ids = " + list2);
        qw2VarJ.s(j2, list2);
        ((pvb) qw2VarJ.r.get()).a(j2, jA, list2, z2);
        return sbi.a;
    }

    @Override // defpackage.hh9
    public final void c() throws IllegalAccessException, InvocationTargetException {
        pq3 pq3Var = this.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) pq3Var.g;
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) pq3Var.f;
        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) pq3Var.e;
        sgg sggVar = (sgg) pq3Var.i;
        if (sggVar != null) {
            sggVar.b(null);
        }
        ((AtomicBoolean) pq3Var.h).set(false);
        pq3Var.i = null;
        Iterator it = concurrentHashMap3.values().iterator();
        while (it.hasNext()) {
            ((f9b) it.next()).setValue(null);
        }
        Iterator it2 = concurrentHashMap2.values().iterator();
        while (it2.hasNext()) {
            ((f9b) it2.next()).setValue(null);
        }
        Iterator it3 = concurrentHashMap.values().iterator();
        while (it3.hasNext()) {
            ((f9b) it3.next()).setValue(null);
        }
        concurrentHashMap3.clear();
        concurrentHashMap2.clear();
        concurrentHashMap.clear();
    }

    public final Object d(long j, qf7 qf7Var, nq4 nq4Var) {
        return j().c(j, false, qf7Var, nq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable e(q24 q24Var, qf7 qf7Var, nq4 nq4Var) {
        nn3 nn3Var;
        tw2 tw2VarH;
        if (nq4Var instanceof nn3) {
            nn3Var = (nn3) nq4Var;
            int i = nn3Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                nn3Var.h = i - Integer.MIN_VALUE;
            } else {
                nn3Var = new nn3(this, nq4Var);
            }
        } else {
            nn3Var = new nn3(this, nq4Var);
        }
        Object obj = nn3Var.f;
        int i2 = nn3Var.h;
        pq3 pq3Var = this.c;
        if (i2 == 0) {
            ch3.d0(obj);
            s04 s04Var = (s04) ((r8e) pq3Var.i(q24Var)).a.getValue();
            if (s04Var == null) {
                return null;
            }
            tw2VarH = s04Var.b.h();
            nn3Var.d = q24Var;
            nn3Var.e = tw2VarH;
            nn3Var.h = 1;
            Object objInvoke = qf7Var.invoke(tw2VarH, nn3Var);
            hu4 hu4Var = hu4.a;
            if (objInvoke == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tw2 tw2Var = nn3Var.e;
            q24 q24Var2 = nn3Var.d;
            ch3.d0(obj);
            tw2VarH = tw2Var;
            q24Var = q24Var2;
        }
        qw2 qw2VarJ = j();
        tw2VarH.getClass();
        s04 s04VarD = qw2VarJ.D(q24Var, new nx2(tw2VarH));
        pq3Var.q(s04VarD);
        return s04VarD;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object f(long j, h1c h1cVar, long j2, nq4 nq4Var) {
        on3 on3Var;
        long j3;
        long j4;
        if (nq4Var instanceof on3) {
            on3Var = (on3) nq4Var;
            int i = on3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                on3Var.g = i - Integer.MIN_VALUE;
            } else {
                on3Var = new on3(this, nq4Var);
            }
        } else {
            on3Var = new on3(this, nq4Var);
        }
        on3 on3Var2 = on3Var;
        Object objD = on3Var2.e;
        Object obj = hu4.a;
        int i2 = on3Var2.g;
        if (i2 == 0) {
            ch3.d0(objD);
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                j3 = j2;
            } else {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sb = new StringBuilder("Change draft: ");
                    sb.append(j);
                    sb.append(", draft = ");
                    sb.append(h1cVar);
                    j3 = j2;
                    a4cVar.c(je9Var, str, qt4.k(j3, " draftUpdateTime = ", sb), null);
                } else {
                    j3 = j2;
                }
            }
            qf7 sziVar = new szi(h1cVar, j3, this, (lq4) null, 2);
            on3Var2.d = j;
            on3Var2.g = 1;
            objD = d(j, sziVar, on3Var2);
            if (objD == obj) {
                return obj;
            }
            j4 = j;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j4 = on3Var2.d;
            ch3.d0(objD);
        }
        rt2 rt2Var = (rt2) objD;
        if (rt2Var != null) {
            ((gq0) this.g.getValue()).a(new qh3(Collections.singleton(new Long(j4)), true, Collections.singleton(new Long(rt2Var.A())), false));
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Comparable g(nq4 nq4Var) {
        pn3 pn3Var;
        if (nq4Var instanceof pn3) {
            pn3Var = (pn3) nq4Var;
            int i = pn3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                pn3Var.f = i - Integer.MIN_VALUE;
            } else {
                pn3Var = new pn3(this, nq4Var);
            }
        } else {
            pn3Var = new pn3(this, nq4Var);
        }
        Object objK0 = pn3Var.d;
        int i2 = pn3Var.f;
        if (i2 == 0) {
            ch3.d0(objK0);
            rt2 rt2Var = (rt2) j().b.getValue();
            if (rt2Var != null) {
                return rt2Var;
            }
            xt4 xt4VarB = ((n0c) this.a).b();
            jhc jhcVar = new jhc(this, null, 19);
            pn3Var.f = 1;
            objK0 = yab.K0(xt4VarB, jhcVar, pn3Var);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        return (rt2) objK0;
    }

    public final rt2 h(long j) {
        try {
            return (rt2) k(j).a.getValue();
        } catch (Throwable th) {
            String str = this.h;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return null;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                return null;
            }
            a4cVar.c(je9Var, str, zo5.j(j, "failed to fetch chat for #"), th);
            return null;
        }
    }

    public final Object i(long j, lq4 lq4Var) {
        return qyj.V(k66.a, new in3(this, j, 0), lq4Var);
    }

    public final qw2 j() {
        return (qw2) this.e.getValue();
    }

    public final r8e k(long j) {
        pq3 pq3Var = this.c;
        return new r8e((f9b) ((ConcurrentHashMap) pq3Var.e).computeIfAbsent(Long.valueOf(j), new mm(4, new lh3(pq3Var, j, 1))));
    }

    public final r8e l(long j) {
        pq3 pq3Var = this.c;
        return new r8e((f9b) ((ConcurrentHashMap) pq3Var.f).computeIfAbsent(Long.valueOf(j), new am(9, new en3(pq3Var, j, 0))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(m8b m8bVar, nq4 nq4Var) {
        rn3 rn3Var;
        if (nq4Var instanceof rn3) {
            rn3Var = (rn3) nq4Var;
            int i = rn3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                rn3Var.f = i - Integer.MIN_VALUE;
            } else {
                rn3Var = new rn3(this, nq4Var);
            }
        } else {
            rn3Var = new rn3(this, nq4Var);
        }
        Object obj = rn3Var.d;
        int i2 = rn3Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        za2 za2Var = new za2(this, 20, m8bVar);
        rn3Var.f = 1;
        Object objV = qyj.V(k66.a, za2Var, rn3Var);
        hu4 hu4Var = hu4.a;
        return objV == hu4Var ? hu4Var : objV;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object n(Set set, nq4 nq4Var) {
        qn3 qn3Var;
        if (nq4Var instanceof qn3) {
            qn3Var = (qn3) nq4Var;
            int i = qn3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qn3Var.f = i - Integer.MIN_VALUE;
            } else {
                qn3Var = new qn3(this, nq4Var);
            }
        } else {
            qn3Var = new qn3(this, nq4Var);
        }
        Object obj = qn3Var.d;
        int i2 = qn3Var.f;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        x5 x5Var = new x5(this, 9, set);
        qn3Var.f = 1;
        Object objV = qyj.V(k66.a, x5Var, qn3Var);
        hu4 hu4Var = hu4.a;
        return objV == hu4Var ? hu4Var : objV;
    }

    public final rt2 o(long j) {
        return j().Q(j);
    }

    public final r8e p(long j) {
        return new r8e((f9b) j().a.computeIfAbsent(Long.valueOf(j), new am(5, new xk1(21))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(long j, Set set, nq4 nq4Var) {
        sn3 sn3Var;
        if (nq4Var instanceof sn3) {
            sn3Var = (sn3) nq4Var;
            int i = sn3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                sn3Var.g = i - Integer.MIN_VALUE;
            } else {
                sn3Var = new sn3(this, nq4Var);
            }
        } else {
            sn3Var = new sn3(this, nq4Var);
        }
        Object objV = sn3Var.e;
        int i2 = sn3Var.g;
        if (i2 == 0) {
            ch3.d0(objV);
            sn3Var.d = set;
            sn3Var.g = 1;
            objV = v(j, sn3Var);
            Object obj = hu4.a;
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set = sn3Var.d;
            ch3.d0(objV);
        }
        qw2 qw2VarJ = j();
        nx2 nx2Var = ((rt2) objV).b;
        qw2VarJ.getClass();
        if (w50.u.equals(set)) {
            ww2 ww2Var = nx2Var.q;
            return ww2Var != null ? ww2Var : ww2.g;
        }
        if (w50.v.equals(set)) {
            ww2 ww2Var2 = nx2Var.r;
            return ww2Var2 != null ? ww2Var2 : ww2.g;
        }
        if (w50.w.equals(set)) {
            ww2 ww2Var3 = nx2Var.s;
            return ww2Var3 != null ? ww2Var3 : ww2.g;
        }
        if (w50.x.equals(set)) {
            ww2 ww2Var4 = nx2Var.t;
            return ww2Var4 != null ? ww2Var4 : ww2.g;
        }
        if (w50.y.equals(set)) {
            ww2 ww2Var5 = nx2Var.u;
            return ww2Var5 != null ? ww2Var5 : ww2.g;
        }
        if (w50.z.equals(set)) {
            ww2 ww2Var6 = nx2Var.v;
            return ww2Var6 != null ? ww2Var6 : ww2.g;
        }
        if (w50.A.equals(set)) {
            ww2 ww2Var7 = nx2Var.w;
            return ww2Var7 != null ? ww2Var7 : ww2.g;
        }
        if (w50.B.equals(set)) {
            ww2 ww2Var8 = nx2Var.x;
            return ww2Var8 != null ? ww2Var8 : ww2.g;
        }
        ww2 ww2Var9 = ww2.f;
        return new ww2(null, 0, 0L, 0L, Collections.EMPTY_LIST);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(long j, lq4 lq4Var) {
        tn3 tn3Var;
        if (lq4Var instanceof tn3) {
            tn3Var = (tn3) lq4Var;
            int i = tn3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn3Var.f = i - Integer.MIN_VALUE;
            } else {
                tn3Var = new tn3(this, lq4Var);
            }
        } else {
            tn3Var = new tn3(this, lq4Var);
        }
        Object objV = tn3Var.d;
        int i2 = tn3Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xt4 xt4VarB = ((n0c) this.a).b();
            ln3 ln3Var = new ln3(this, j, 0);
            tn3Var.f = 1;
            objV = qyj.V(xt4VarB, ln3Var, tn3Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return objV;
    }

    public final gjg s() {
        pq3 pq3Var = this.c;
        mjg mjgVar = pq3Var.h().b;
        if (mjgVar.getValue() != null && ((AtomicBoolean) pq3Var.h).compareAndSet(false, true)) {
            ((f9b) ((ConcurrentHashMap) pq3Var.f).computeIfAbsent(0L, new am(8, new j22(16, mjgVar)))).setValue(mjgVar.getValue());
            if (((sgg) pq3Var.i) == null) {
                pq3Var.i = tre.m0(new fz6(new jz(mjgVar, 13), new ke3(pq3Var, (lq4) null, 4), 3), (gu4) ((ifh) pq3Var.d).getValue());
            }
        }
        return mjgVar;
    }

    public final void t() {
        qw2 qw2VarJ = j();
        qw2VarJ.t();
        ConcurrentHashMap concurrentHashMap = qw2VarJ.i;
        if (concurrentHashMap.isEmpty()) {
            return;
        }
        Iterator it = concurrentHashMap.values().iterator();
        while (it.hasNext()) {
            ((rt2) it.next()).V();
        }
        qw2VarJ.o.c(new wo3(Collections.EMPTY_LIST, true));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    /* JADX WARN: Code duplicated, block: B:24:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.String, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void u(long j) {
        Object obj;
        rt2 rt2VarW;
        pvb pvbVar;
        long j2;
        long jT;
        a4c a4cVar;
        je9 je9Var;
        ?? r11;
        long j3 = j;
        qw2 qw2VarJ = j();
        kx2 kx2Var = kx2.b;
        rt2 rt2VarN = qw2VarJ.N(j3);
        if (rt2VarN != null) {
            qw2VarJ.v(j3, false, new hu(qw2VarJ, 7, rt2VarN));
        }
        rt2 rt2Var = (rt2) qw2VarJ.i.get(Long.valueOf(j3));
        if (rt2Var != null) {
            nx2 nx2Var = rt2Var.b;
            if (nx2Var.d() || nx2Var.c != kx2Var) {
                obj = null;
                rt2VarW = qw2VarJ.w(j3, kx2Var);
                if (rt2VarW == null) {
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "qw2", zo5.j(j3, "leaveChat fail: chat not found "), null);
                        }
                    }
                    rt2Var = null;
                    r11 = obj;
                } else {
                    ((hjc) qw2VarJ.w.get()).b(rt2VarW.b.a);
                    pvbVar = (pvb) qw2VarJ.r.get();
                    j2 = rt2VarW.b.a;
                    if (pvbVar.j(j3)) {
                        k03 k03Var = new k03(pvbVar.u().a.g(), j3, j2);
                        j3 = j3;
                        jT = pvb.t(pvbVar, k03Var);
                    } else {
                        jT = 0;
                    }
                    if (qw2VarJ.A.getValue() != null) {
                        sy4 sy4Var = (sy4) qw2VarJ.A.getValue();
                        long j4 = rt2VarW.b.a;
                        sy4Var.getClass();
                    }
                    qw2VarJ.o.c(new wo3(Collections.singletonList(Long.valueOf(j3)), true));
                    qw2VarJ.o.c(new l03(jT, j3));
                    rt2Var = rt2VarW;
                    r11 = obj;
                }
            } else {
                r11 = 0;
                yab.i0(qw2VarJ.D, null, 0, new i20(qw2VarJ, j3, (lq4) null, 6), 3);
            }
        } else {
            obj = null;
            rt2VarW = qw2VarJ.w(j3, kx2Var);
            if (rt2VarW == null) {
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "qw2", zo5.j(j3, "leaveChat fail: chat not found "), null);
                    }
                }
                rt2Var = null;
                r11 = obj;
            } else {
                ((hjc) qw2VarJ.w.get()).b(rt2VarW.b.a);
                pvbVar = (pvb) qw2VarJ.r.get();
                j2 = rt2VarW.b.a;
                if (pvbVar.j(j3)) {
                    jT = 0;
                } else {
                    k03 k03Var2 = new k03(pvbVar.u().a.g(), j3, j2);
                    j3 = j3;
                    jT = pvb.t(pvbVar, k03Var2);
                }
                if (qw2VarJ.A.getValue() != null) {
                    sy4 sy4Var2 = (sy4) qw2VarJ.A.getValue();
                    long j5 = rt2VarW.b.a;
                    sy4Var2.getClass();
                }
                qw2VarJ.o.c(new wo3(Collections.singletonList(Long.valueOf(j3)), true));
                qw2VarJ.o.c(new l03(jT, j3));
                rt2Var = rt2VarW;
                r11 = obj;
            }
        }
        if (rt2Var == null || rt2Var.A() == 0) {
            return;
        }
        String name = xn3.class.getName();
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != 0) {
            je9 je9Var2 = je9.d;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, name, zo5.g(rt2Var.b.m, rt2Var.A(), "cancel notifs after leave chat, sid:", ", new:"), r11);
            }
        }
        h5c h5cVar = (h5c) this.f.getValue();
        long jA = rt2Var.A();
        if (rt2Var.b.m > 0) {
            h5cVar.g(jA, r11);
        } else {
            h5cVar.b(jA);
        }
    }

    public Object v(long j, lq4 lq4Var) {
        return e9i.N(new jz(k(j), 13), lq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(List list, nq4 nq4Var) {
        un3 un3Var;
        if (nq4Var instanceof un3) {
            un3Var = (un3) nq4Var;
            int i = un3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                un3Var.f = i - Integer.MIN_VALUE;
            } else {
                un3Var = new un3(this, nq4Var);
            }
        } else {
            un3Var = new un3(this, nq4Var);
        }
        Object objV = un3Var.d;
        int i2 = un3Var.f;
        if (i2 == 0) {
            ch3.d0(objV);
            xt4 xt4VarB = ((n0c) this.a).b();
            za2 za2Var = new za2(this, 21, list);
            un3Var.f = 1;
            objV = qyj.V(xt4VarB, za2Var, un3Var);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return objV;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (d(r11, r0, r6) == r10) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(long r14, java.util.Set r16, int r17, defpackage.nq4 r18) {
        /*
            r13 = this;
            r2 = r16
            r4 = r18
            boolean r5 = r4 instanceof defpackage.vn3
            if (r5 == 0) goto L18
            r5 = r4
            vn3 r5 = (defpackage.vn3) r5
            int r6 = r5.i
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L18
            int r6 = r6 - r7
            r5.i = r6
        L16:
            r6 = r5
            goto L1e
        L18:
            vn3 r5 = new vn3
            r5.<init>(r13, r4)
            goto L16
        L1e:
            java.lang.Object r4 = r6.g
            int r5 = r6.i
            r7 = 0
            r8 = 2
            r9 = 1
            hu4 r10 = defpackage.hu4.a
            if (r5 == 0) goto L46
            if (r5 == r9) goto L37
            if (r5 != r8) goto L31
            defpackage.ch3.d0(r4)
            goto L77
        L31:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r7
        L37:
            int r0 = r6.f
            long r1 = r6.d
            java.util.Set r5 = r6.e
            defpackage.ch3.d0(r4)
            r11 = r5
            r5 = r4
            r4 = r11
            r11 = r1
            r2 = r0
            goto L5e
        L46:
            defpackage.ch3.d0(r4)
            r6.e = r2
            r6.d = r14
            r4 = r17
            r6.f = r4
            r6.i = r9
            java.lang.Object r5 = r13.q(r14, r2, r6)
            if (r5 != r10) goto L5a
            goto L76
        L5a:
            r11 = r4
            r4 = r2
            r2 = r11
            r11 = r14
        L5e:
            r1 = r5
            ww2 r1 = (defpackage.ww2) r1
            f00 r0 = new f00
            r5 = 0
            r3 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r6.e = r7
            r6.d = r11
            r6.f = r2
            r6.i = r8
            java.lang.Object r0 = r13.d(r11, r0, r6)
            if (r0 != r10) goto L77
        L76:
            return r10
        L77:
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xn3.x(long, java.util.Set, int, nq4):java.lang.Object");
    }
}
