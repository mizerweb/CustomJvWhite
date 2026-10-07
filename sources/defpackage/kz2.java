package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class kz2 {
    public final qw2 a;
    public final qfa b;
    public final zed c;
    public final wzj d;
    public final h5c e;
    public final t51 f;
    public final okh g;

    public kz2(qw2 qw2Var, qfa qfaVar, zed zedVar, wzj wzjVar, h5c h5cVar, t51 t51Var, okh okhVar) {
        this.a = qw2Var;
        this.b = qfaVar;
        this.c = zedVar;
        this.d = wzjVar;
        this.e = h5cVar;
        this.f = t51Var;
        this.g = okhVar;
    }

    public final List a(List list) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        return p90.l(list, new jz2(0, this.g.h(0L, ctc.TYPE_MSG_EDIT)));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(long j, long j2, final long j3, final int i, final long j4, final int i2, final long j5, fz2 fz2Var, final mg5 mg5Var, boolean z) {
        List<gda> list;
        List list2;
        ArrayList arrayList;
        final List list3;
        ArrayList arrayList2;
        long j6;
        Long lValueOf = Long.valueOf(j2);
        String strK = vd7.K(Long.valueOf(j3));
        Integer numValueOf = Integer.valueOf(i);
        Long lValueOf2 = Long.valueOf(j4);
        Integer numValueOf2 = Integer.valueOf(i2);
        Long lValueOf3 = Long.valueOf(j5);
        List list4 = fz2Var.c;
        gm0.m("kz2", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s, interactive=%b", lValueOf, strK, numValueOf, lValueOf2, numValueOf2, lValueOf3, Integer.valueOf(list4.size()), mg5Var.name(), Boolean.valueOf(z));
        qw2 qw2Var = this.a;
        rt2 rt2VarN = qw2Var.N(j2);
        if (rt2VarN == null) {
            return;
        }
        long j7 = rt2VarN.a;
        nx2 nx2Var = rt2VarN.b;
        long j8 = nx2Var.f;
        long j9 = nx2Var.a;
        gm0.m("kz2", "onChatHistory, chat create time = %s", vd7.K(Long.valueOf(j8)));
        zed zedVar = this.c;
        Long lValueOf4 = z ? Long.valueOf(zedVar.a.f()) : null;
        int iOrdinal = mg5Var.ordinal();
        qfa qfaVar = this.b;
        t51 t51Var = this.f;
        if (iOrdinal == 0) {
            qw2Var = qw2Var;
            list = list4;
            t51Var = t51Var;
            if (list.isEmpty()) {
                list2 = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (gda gdaVar : list) {
                    ArrayList arrayList4 = arrayList3;
                    if (gdaVar.b >= nx2Var.f) {
                        arrayList = arrayList4;
                        arrayList.add(gdaVar);
                    } else {
                        arrayList = arrayList4;
                    }
                    arrayList3 = arrayList;
                }
                list2 = arrayList3;
            }
            List listA = a(list2);
            if (!listA.isEmpty()) {
                long j10 = rt2VarN.a;
                if (!listA.isEmpty()) {
                    long jT = zedVar.a.t();
                    ose oseVar = (ose) qfaVar.b.c();
                    oseVar.e().a(new zre(listA, lValueOf4, oseVar, j10, jT, true));
                }
                vlf vlfVar = new vlf(j7);
                wzj wzjVar = this.d;
                wzjVar.c(vlfVar);
                wzjVar.c(new skf(j7, mg5Var));
                if (rt2VarN.l0(zedVar.a, zedVar.c)) {
                    gm0.m("kz2", "onChatHistory: %d is globally muted", Long.valueOf(j9));
                } else {
                    this.e.g(j9, null);
                }
            }
            list3 = listA;
        } else {
            if (iOrdinal != 1) {
                c.q(mg5Var, "Unexpected value: ");
                return;
            }
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList(list4.size());
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList6.add(Long.valueOf(((gda) it.next()).a));
            }
            if (i > 0) {
                long j11 = j4 <= 0 ? BuildConfig.MAX_TIME_TO_UPLOAD : j4;
                List list5 = xfa.b;
                arrayList2 = arrayList5;
                long j12 = j11;
                List listI = this.b.i(j2, j3, j12, arrayList6);
                arrayList6 = arrayList6;
                gm0.m("kz2", "forward: clean up outdated delayed messages [%s, %s, %s, %s]: %s", Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j12), arrayList6, listI);
                arrayList2.addAll(listI);
            } else {
                arrayList2 = arrayList5;
            }
            if (i2 > 0) {
                long j13 = j5 <= 0 ? Long.MIN_VALUE : j5;
                List list6 = xfa.b;
                j6 = j2;
                List listI2 = this.b.i(j6, j13, j3, arrayList6);
                gm0.m("kz2", "backward: clean up outdated delayed messages [%s, %s, %s, %s]: %s", Long.valueOf(j6), Long.valueOf(j13), Long.valueOf(j3), arrayList6, listI2);
                arrayList2.addAll(listI2);
            } else {
                j6 = j2;
            }
            if (arrayList2.isEmpty()) {
                gm0.n("kz2", "no outdated delayed messages to clean up");
            } else {
                qfaVar.c(j6, arrayList2);
                t51Var.c(new j3b(j6, arrayList2, mg5.DELAYED));
                gm0.m("kz2", "clean up outdated delayed messages: %s", arrayList2);
            }
            long j14 = rt2VarN.a;
            if (list4.isEmpty()) {
                list = list4;
            } else {
                long jT2 = zedVar.a.t();
                ose oseVar2 = (ose) qfaVar.b.c();
                list = list4;
                oseVar2.e().a(new zre(list4, lValueOf4, oseVar2, j14, jT2, false));
            }
            list3 = list;
        }
        t51 t51Var2 = t51Var;
        final long j15 = rt2VarN.a;
        final qw2 qw2Var2 = qw2Var;
        qw2Var2.v(j15, false, new tg4() { // from class: nw2
            @Override // defpackage.tg4
            public final void accept(Object obj) {
                int i3;
                boolean z2;
                tw2 tw2Var;
                qw2 qw2Var3;
                long j16;
                long j17;
                sfa sfaVarF;
                boolean z3;
                qw2 qw2Var4 = qw2Var2;
                List<gda> list7 = list3;
                long j18 = j3;
                int i4 = i2;
                long j19 = j5;
                int i5 = i;
                long j20 = j4;
                mg5 mg5Var2 = mg5Var;
                long j21 = j15;
                tw2 tw2Var2 = (tw2) obj;
                qw2Var4.getClass();
                sb8.t(tw2Var2.n, list7, j18, i4, j19, i5, j20, mg5Var2);
                if (mg5Var2.a()) {
                    if (j18 == 1 && i5 == 150) {
                        sb8.s(tw2Var2.n, 1L, BuildConfig.MAX_TIME_TO_UPLOAD, mg5.DELAYED);
                        return;
                    }
                    return;
                }
                if (i4 <= 0 || j19 != 0) {
                    i3 = 1;
                    z2 = false;
                    tw2Var = tw2Var2;
                    qw2Var3 = qw2Var4;
                    j16 = j21;
                    j17 = 0;
                } else {
                    Iterator it2 = list7.iterator();
                    int i6 = 0;
                    while (it2.hasNext()) {
                        if (((gda) it2.next()).b <= j18) {
                            i6++;
                        }
                    }
                    if (i6 < 2) {
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                Locale locale = Locale.ENGLISH;
                                a4cVar.c(je9Var, "qw2", nbh.s(j21, "onChatHistory, ", ", history response size is less than one page, delete message before and findAndUpdateFirstMessage"), null);
                            }
                        }
                        long j22 = j18 - 1;
                        if (list7.size() > 0) {
                            j22 = ((gda) list7.get(0)).b - 1;
                        }
                        long j23 = j22;
                        i3 = 1;
                        ((qfa) qw2Var4.u.get()).r(j21, j23, wja.DELETED);
                        qfa qfaVar2 = (qfa) qw2Var4.u.get();
                        qfaVar2.f.c(j21, j23, mg5Var2);
                        ose oseVar3 = (ose) qfaVar2.b.c();
                        oseVar3.getClass();
                        int iOrdinal2 = mg5Var2.ordinal();
                        if (iOrdinal2 == 0) {
                            ((Number) ch3.G(((toa) oseVar3.h()).a, false, true, new x14(3, j21, j23))).intValue();
                            z3 = false;
                        } else if (iOrdinal2 != 1) {
                            ore.o();
                            return;
                        } else {
                            ((Number) ch3.G(((toa) oseVar3.h()).a, false, true, new x14(1, j21, j23))).intValue();
                            z3 = false;
                        }
                        z2 = z3;
                        j17 = 0;
                        tw2Var = tw2Var2;
                        qw2Var3 = qw2Var4;
                        j16 = j21;
                        qw2Var3.G(j16, tw2Var, 0L);
                    } else {
                        i3 = 1;
                        z2 = false;
                        tw2Var = tw2Var2;
                        qw2Var3 = qw2Var4;
                        j16 = j21;
                        j17 = 0;
                    }
                }
                if (i5 > 0 && j20 == j17 && !list7.isEmpty() && list7.size() < i5) {
                    gm0.m(r3, "findAndUpdateLastMessage: chatId = %d, with builder", Long.valueOf(j16));
                    qfa qfaVar3 = (qfa) qw2Var3.u.get();
                    qfaVar3.getClass();
                    sfa sfaVarK = qfaVar3.k(j16, mg5.REGULAR);
                    if (sfaVarK == null) {
                        gm0.m("qw2", "findAndUpdateLastMessage: chatId = %d, clear last message", Long.valueOf(j16));
                        tw2Var.j = j17;
                    } else {
                        tw2Var.e(sfaVarK);
                    }
                }
                for (gda gdaVar2 : list7) {
                    int i7 = i3;
                    long j24 = j17;
                    if (gdaVar2.d == qw2Var3.p.a.t()) {
                        long j25 = gdaVar2.c;
                        long j26 = gdaVar2.b;
                        if (j25 < j26) {
                            j25 = j26;
                        }
                        if (tw2Var.b0 < j25) {
                            tw2Var.b0 = j25;
                        }
                    }
                    i3 = i7;
                    j17 = j24;
                }
                int i8 = i3;
                long j27 = j17;
                rt2 rt2VarN2 = qw2Var3.N(j16);
                if (p90.D(list7) || rt2VarN2 == null || !rt2VarN2.a0() || i5 <= 0 || j20 != j27 || (sfaVarF = ((qfa) qw2Var3.u.get()).f(j16, ((gda) list7.get(list7.size() - i8)).a)) == null) {
                    return;
                }
                tw2Var.j = sfaVarF.a;
                Map mapC = tw2Var.c();
                bi4 bi4Var = (bi4) qw2Var3.t.get();
                mapC.put(Long.valueOf(bi4Var.f(bi4Var.g.a.t(), z2).v()), Long.valueOf(sfaVarF.c));
                sb8.R(tw2Var.n, sfaVarF.c, sfaVarF.H);
            }
        });
        if (mg5Var.a()) {
            qw2Var2.v(j2, false, new ot4(29, rt2VarN));
        }
        int size = list3.size();
        long j16 = rt2VarN.a;
        if (size <= 0) {
            t51Var2.c(new gz2(j, j16, j3, j3, list.size(), mg5Var, r66.a));
            return;
        }
        long j17 = ((gda) list3.get(0)).b;
        long j18 = ((gda) list3.get(list3.size() - 1)).b;
        int size2 = list3.size();
        ArrayList arrayList7 = new ArrayList(yw3.W0(list3, 10));
        Iterator it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList7.add(Long.valueOf(((gda) it2.next()).a));
        }
        t51Var2.c(new gz2(j, j16, j17, j18, size2, mg5Var, arrayList7));
    }
}
