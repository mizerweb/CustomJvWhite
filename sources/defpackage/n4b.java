package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import one.me.sdk.tasks.MsgSendNotFoundException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes.dex */
public final class n4b extends aq implements qih, btc {
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;
    public final String k;
    public final String l;

    public n4b(long j, long j2, long j3, long j4, long j5, boolean z, String str) {
        super(j);
        this.f = j2;
        this.g = j3;
        this.h = j4;
        this.i = j5;
        this.j = z;
        this.k = str;
        StringBuilder sbS = qt4.s(j3, "MsgSendApiTask:", "|");
        sbS.append(j4);
        this.l = qt4.k(j2, "|", sbS);
    }

    public final boolean A(sfa sfaVar) {
        String str;
        long jI;
        long j;
        String str2;
        c46 c46Var = sfaVar.n;
        boolean z = false;
        if (c46Var == null) {
            return false;
        }
        for (e70 e70Var : (List) c46Var.a) {
            y60 y60Var = e70Var.a;
            int i = y60Var == null ? -1 : m4b.$EnumSwitchMapping$0[y60Var.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    d70 d70Var = e70Var.d;
                    j = d70Var.a;
                    str2 = d70Var.o;
                } else if (i != 3) {
                    jI = i != 4 ? 0L : e70Var.f.i();
                    str = null;
                } else {
                    j60 j60Var = e70Var.j;
                    j = j60Var.a;
                    str2 = j60Var.e;
                }
                long j2 = j;
                str = str2;
                jI = j2;
            } else {
                str = e70Var.b.h;
                jI = 0;
            }
            if (jI != 0 || (str != null && str.length() != 0)) {
                if (jI != 0) {
                    try {
                        bq bqVar = this.e;
                        ((qki) (bqVar != null ? bqVar : null).H.getValue()).b(jI);
                    } catch (Throwable th) {
                        gm0.V(this.l, "onAttachNotFound: failed", th);
                    }
                } else if (str != null && str.length() != 0) {
                    bq bqVar2 = this.e;
                    ((qki) (bqVar2 != null ? bqVar2 : null).H.getValue()).c(str);
                }
                z = true;
            }
        }
        return z;
    }

    public final sfa B() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        return bqVar.i().l(this.f);
    }

    public final void C(long j, long j2) {
        if (j != 0) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            ((hjc) bqVar.G.getValue()).c(j, j2);
        }
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) throws Exception {
        h60 h60VarQ;
        s4b s4bVar = (s4b) kihVar;
        String str = this.l;
        bq bqVar = null;
        gm0.x(str, "onSuccess", null);
        sfa sfaVarB = B();
        gda gdaVarK = s4bVar.k();
        if (gdaVarK != null && sfaVarB != null && gdaVarK.q == null && sfaVarB.D()) {
            qv1.u("receive message without delayed attrs but send as delayed", str, "look's like delayed attrs is not supported!");
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            qfa qfaVarI = bqVar2.i();
            long j = sfaVarB.a;
            qfaVarI.getClass();
            gm0.m("qfa", "clearDelayedAttrs %d", Long.valueOf(j));
            ch3.G(((toa) ((ose) qfaVarI.b.c()).h()).a, false, true, new t14(bqVar, bqVar, j, 4));
            qfaVarI.f.g.remove(Long.valueOf(j));
            bq bqVar3 = this.e;
            ((u4b) (bqVar3 != null ? bqVar3 : null).I.getValue()).a(this.g, s4bVar.h(), gdaVarK, s4bVar.m(), s4bVar.i());
            return;
        }
        if (sfaVarB != null && !sfaVarB.D()) {
            C(s4bVar.h(), this.f);
        }
        String str2 = this.k;
        if (sfaVarB != null) {
            wja wjaVar = sfaVarB.j;
            wja wjaVar2 = wja.DELETED;
            if (wjaVar == wjaVar2 && sfaVarB.b == 0) {
                bq bqVar4 = this.e;
                if (bqVar4 == null) {
                    bqVar4 = null;
                }
                qfa qfaVarI2 = bqVar4.i();
                List list = xfa.b;
                qfaVarI2.getClass();
                uoa uoaVarC = qfaVarI2.b.c();
                long jT = qfaVarI2.d.a.t();
                ose oseVar = (ose) uoaVarC;
                oseVar.getClass();
                oseVar.D(gdaVarK, this.g, false, wjaVar2, jT, dnl.a(null));
                mg5 mg5Var = sfaVarB.D() ? mg5.DELAYED : mg5.REGULAR;
                bq bqVar5 = this.e;
                if (bqVar5 == null) {
                    bqVar5 = null;
                }
                bqVar5.a().w(this.g, this.h, Collections.singletonList(Long.valueOf(sfaVarB.a)), Collections.singletonList(Long.valueOf(gdaVarK.a)), false, mg5Var);
                gm0.n(str, "onSuccess: sent api request for deletion locally deleted message");
                bq bqVar6 = this.e;
                if (bqVar6 == null) {
                    bqVar6 = null;
                }
                qrc.m(bqVar6.j(), f4b.MSG_DELETED_DURING_SEND, str2, null, 28);
                return;
            }
            gdaVarK = gdaVarK;
        }
        if (sfaVarB != null) {
            try {
                h60VarQ = sfaVarB.q();
            } catch (Exception e) {
                bq bqVar7 = this.e;
                if (bqVar7 == null) {
                    bqVar7 = null;
                }
                qrc.m(bqVar7.j(), f4b.UNKNOWN_ERROR_HANDLE_SUCCESS, str2, null, 28);
                throw e;
            }
        } else {
            h60VarQ = null;
        }
        if (sfaVarB != null && h60VarQ != null) {
            z(h60VarQ, s4bVar);
        } else if (gdaVarK != null) {
            bq bqVar8 = this.e;
            if (bqVar8 == null) {
                bqVar8 = null;
            }
            ((u4b) bqVar8.I.getValue()).a(this.g, s4bVar.h(), gdaVarK, s4bVar.m(), s4bVar.i());
        }
        bq bqVar9 = this.e;
        (bqVar9 != null ? bqVar9 : null).j().H(bwk.b(gdaVarK), str2);
    }

    @Override // defpackage.btc
    public final void d() {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        sfa sfaVarL = bqVar.i().l(this.f);
        if (sfaVarL != null) {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            bqVar2.i().p(sfaVarL, xfa.ERROR);
            bq bqVar3 = this.e;
            (bqVar3 != null ? bqVar3 : null).b().c(new kfi(sfaVarL.h, sfaVarL.a, false));
        }
    }

    /* JADX WARN: Code duplicated, block: B:182:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:184:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:187:0x0400  */
    /* JADX WARN: Code duplicated, block: B:189:0x040b  */
    /* JADX WARN: Code duplicated, block: B:198:0x0428  */
    /* JADX WARN: Code duplicated, block: B:202:0x0439  */
    /* JADX WARN: Code duplicated, block: B:205:0x0444  */
    /* JADX WARN: Code duplicated, block: B:206:0x0449  */
    /* JADX WARN: Code duplicated, block: B:210:0x0462 A[LOOP:0: B:208:0x045c->B:210:0x0462, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0473  */
    /* JADX WARN: Code duplicated, block: B:221:0x0493  */
    /* JADX WARN: Code duplicated, block: B:225:0x04be  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:233:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:235:0x0500  */
    /* JADX WARN: Code duplicated, block: B:238:0x0508  */
    /* JADX WARN: Code duplicated, block: B:291:0x047d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        w50 w50Var;
        w50 w50Var2;
        c46 c46Var;
        c46 c46Var2;
        bq bqVar;
        bq bqVar2;
        bq bqVar3;
        bq bqVar4;
        bq bqVar5;
        String str;
        a4c a4cVar;
        bq bqVar6;
        bq bqVar7;
        c46 c46Var3;
        List list;
        ArrayList arrayList;
        Iterator it;
        bq bqVar8;
        vg4 vg4VarW;
        je9 je9Var = je9.f;
        gm0.Y(this.l, "onFail");
        sfa sfaVarB = B();
        bq bqVar9 = this.e;
        if (sfaVarB == null) {
            if (bqVar9 == null) {
                bqVar9 = null;
            }
            qrc.m(bqVar9.j(), f4b.NON_EXISTED_MESSAGE_ON_FAIL, this.k, null, 28);
            return;
        }
        if (bqVar9 == null) {
            bqVar9 = null;
        }
        rt2 rt2Var = (rt2) bqVar9.d().k(this.g).a.getValue();
        long jA = rt2Var != null ? rt2Var.A() : 0L;
        bq bqVar10 = this.e;
        if (bqVar10 == null) {
            bqVar10 = null;
        }
        qfa qfaVarI = bqVar10.i();
        long j = this.f;
        String str2 = yhhVar.b;
        String str3 = str2 == null ? "" : str2;
        String str4 = yhhVar.d;
        ch3.G(((toa) ((ose) qfaVarI.b.c()).h()).a, false, true, new br2(1, j, str3, str4 == null ? "" : str4));
        if (!p90.C(yhhVar.b)) {
            boolean zM = sfaVarB.M();
            String str5 = yhhVar.b;
            if (zM) {
                if ("error.phone.binding.required".equals(str5)) {
                    y(sfaVarB, yhhVar);
                } else {
                    String str6 = this.l;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        h60 h60VarQ = sfaVarB.q();
                        a4cVar2.c(je9Var, str6, "onFailControlMessage, in event = ".concat(p.o(h60VarQ != null ? h60VarQ.a : 0)), null);
                    }
                    bq bqVar11 = this.e;
                    if (bqVar11 == null) {
                        bqVar11 = null;
                    }
                    qw2 qw2VarC = bqVar11.c();
                    long j2 = this.g;
                    qw2VarC.getClass();
                    gm0.n("qw2", "deleteAndUpdateLastMessage, chatId = " + j2);
                    dp5 dp5Var = qw2VarC.u;
                    qfa qfaVar = (qfa) dp5Var.get();
                    long j3 = sfaVarB.a;
                    qfaVar.getClass();
                    qfaVar.c(j2, Collections.singletonList(Long.valueOf(j3)));
                    t51 t51Var = qw2VarC.o;
                    List listSingletonList = Collections.singletonList(Long.valueOf(sfaVarB.a));
                    mg5 mg5Var = sfaVarB.H;
                    t51Var.c(new j3b(j2, listSingletonList, mg5Var));
                    qw2VarC.g0(j2, ((qfa) dp5Var.get()).k(j2, mg5Var), true, null);
                    if (this.h != 0) {
                        bq bqVar12 = this.e;
                        if (bqVar12 == null) {
                            bqVar12 = null;
                        }
                        bqVar12.a().f(this.h);
                    }
                    bq bqVar13 = this.e;
                    if (bqVar13 == null) {
                        bqVar13 = null;
                    }
                    bqVar13.b().c(new wo3((Collection) Collections.singletonList(Long.valueOf(this.g)), false, false, (mg5) null, (cid) null, (Set) null, 124));
                    String str7 = yhhVar.b;
                    String str8 = str7 != null ? str7 : "";
                    bq bqVar14 = this.e;
                    if (bqVar14 == null) {
                        bqVar14 = null;
                    }
                    bqVar14.j().C(this.k, str8, yvk.c(str8));
                }
            } else if ("error.user.restricted.send".equals(str5)) {
                long j4 = this.g;
                gm0.Y(this.l, "onRestrictedSendMessageForUser, message send to dialog");
                w(sfaVarB, yhhVar);
                bq bqVar15 = this.e;
                if (bqVar15 == null) {
                    bqVar15 = null;
                }
                bqVar15.b().c(new joe(j4));
                bq bqVar16 = this.e;
                if (bqVar16 == null) {
                    bqVar16 = null;
                }
                bqVar16.b().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j4)), true, false, (mg5) null, (cid) null, (Set) null, 124));
                C(jA, this.f);
            } else if ("user.not.found".equals(yhhVar.b)) {
                long j5 = this.g;
                w(sfaVarB, yhhVar);
                bq bqVar17 = this.e;
                if (bqVar17 == null) {
                    bqVar17 = null;
                }
                rt2 rt2Var2 = (rt2) bqVar17.d().k(j5).a.getValue();
                if (rt2Var2 != null && (vg4VarW = rt2Var2.w()) != null) {
                    bq bqVar18 = this.e;
                    if (bqVar18 == null) {
                        bqVar18 = null;
                    }
                    ((an9) bqVar18.m0.getValue()).b(vg4VarW.v());
                    bq bqVar19 = this.e;
                    if (bqVar19 == null) {
                        bqVar19 = null;
                    }
                    bqVar19.b().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j5)), true, false, (mg5) null, (cid) null, (Set) null, 124));
                }
                C(jA, this.f);
            } else if ("not.found".equals(yhhVar.b)) {
                w(sfaVarB, yhhVar);
                String strK = qv1.k("got \"not.found\" error on send message, with causeMessage=", yhhVar.c);
                MsgSendNotFoundException msgSendNotFoundException = new MsgSendNotFoundException(strK);
                bq bqVar20 = this.e;
                if (bqVar20 == null) {
                    bqVar20 = null;
                }
                ((t1c) ((ed6) bqVar20.v.getValue())).a(new jfc(strK, msgSendNotFoundException));
                C(jA, this.f);
            } else if ("privacy.restricted".equals(yhhVar.b)) {
                long j6 = this.h;
                gm0.Y(this.l, "onFailPrivacyRestricted, message send to dialog");
                w(sfaVarB, yhhVar);
                long j7 = this.g;
                cid cidVar = new cid(j7, this.i);
                bq bqVar21 = this.e;
                if (bqVar21 == null) {
                    bqVar21 = null;
                }
                bqVar21.b().c(cidVar);
                if (j6 != 0) {
                    bq bqVar22 = this.e;
                    if (bqVar22 == null) {
                        bqVar22 = null;
                    }
                    bqVar22.a().f(j6);
                }
                bq bqVar23 = this.e;
                if (bqVar23 == null) {
                    bqVar23 = null;
                }
                bqVar23.b().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j7)), true, false, mg5.REGULAR, cidVar, (Set) null, 96));
                C(jA, this.f);
            } else if ("error.phone.binding.required".equals(yhhVar.b)) {
                y(sfaVarB, yhhVar);
                C(jA, this.f);
            } else {
                String str9 = yhhVar.b;
                if (("video.not.found".equalsIgnoreCase(str9) || "photo.not.found".equalsIgnoreCase(str9) || "file.not.found".equalsIgnoreCase(str9) || "sticker.not.found".equalsIgnoreCase(str9)) && (c46Var = sfaVarB.n) != null && c46Var.i() > 0 && (c46Var2 = sfaVarB.n) != null && c46Var2.i() != 0) {
                    Iterator it2 = ((List) sfaVarB.n.a).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            e70 e70Var = (e70) it2.next();
                            String str10 = e70Var != null ? e70Var.u : null;
                            if (str10 == null || str10.length() == 0) {
                                if ("attachment.not.ready".equals(yhhVar.b)) {
                                    if (sfaVarB.b == 0) {
                                        bqVar8 = this.e;
                                        if (bqVar8 == null) {
                                            bqVar8 = null;
                                        }
                                        bqVar8.i().p(sfaVarB, xfa.SENDING);
                                    } else {
                                        str = this.l;
                                        a4cVar = gm0.f;
                                        if (a4cVar != null && a4cVar.b(je9Var)) {
                                            a4cVar.c(je9Var, str, zo5.j(sfaVarB.b, "setSendingStatus called for already sent message sid = "), null);
                                        }
                                    }
                                    bqVar6 = this.e;
                                    if (bqVar6 == null) {
                                        bqVar6 = null;
                                    }
                                    ((l70) bqVar6.J.getValue()).b(sfaVarB);
                                    bqVar7 = this.e;
                                    if (bqVar7 == null) {
                                        bqVar7 = null;
                                    }
                                    h4b h4bVarJ = bqVar7.j();
                                    String str11 = this.k;
                                    c46Var3 = sfaVarB.n;
                                    if (c46Var3 != null) {
                                        list = (List) c46Var3.a;
                                    } else {
                                        list = Collections.EMPTY_LIST;
                                    }
                                    List list2 = list;
                                    arrayList = new ArrayList(yw3.W0(list2, 10));
                                    it = list2.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((e70) it.next()).t);
                                    }
                                    h4bVarJ.F(str11, arrayList);
                                } else if ("android.empty.message.and.attach".equals(yhhVar.b)) {
                                    try {
                                        A(sfaVarB);
                                    } catch (Exception e) {
                                        gm0.V(this.l, "Errors.ANDROID_EMPTY_MESSAGE_AND_ATTACH: fail to remove upload", e);
                                    }
                                    C(jA, this.f);
                                    bqVar = this.e;
                                    if (bqVar == null) {
                                        bqVar = null;
                                    }
                                    ((toa) ((ose) bqVar.i().b.c()).h()).h(this.g, Collections.singletonList(Long.valueOf(this.f)), wja.DELETED, false);
                                    bqVar2 = this.e;
                                    if (bqVar2 == null) {
                                        bqVar2 = null;
                                    }
                                    t51 t51VarB = bqVar2.b();
                                    c92 c92Var = new c92();
                                    c92Var.c(this.g);
                                    c92Var.e(sfaVarB.a);
                                    c92Var.d(sfaVarB.H);
                                    t51VarB.c(c92Var.a());
                                    bqVar3 = this.e;
                                    if (bqVar3 == null) {
                                        bqVar3 = null;
                                    }
                                    bqVar3.k().d(this.a);
                                    bqVar4 = this.e;
                                    if (bqVar4 == null) {
                                        bqVar4 = null;
                                    }
                                    qrc.m(bqVar4.j(), f4b.MSG_AUTO_DELETED_EMPTY, this.k, null, 28);
                                } else {
                                    w(sfaVarB, yhhVar);
                                    bqVar5 = this.e;
                                    if (bqVar5 == null) {
                                        bqVar5 = null;
                                    }
                                    bqVar5.b().c(new t4b(this.a, this.g, yhhVar));
                                    C(jA, this.f);
                                }
                            }
                        } else {
                            long j8 = this.f;
                            boolean zA = A(sfaVarB);
                            c46 c46Var4 = sfaVarB.n;
                            if (c46Var4 == null || !zA) {
                                w(sfaVarB, yhhVar);
                                bq bqVar24 = this.e;
                                if (bqVar24 == null) {
                                    bqVar24 = null;
                                }
                                bqVar24.b().c(new t4b(this.a, this.g, yhhVar));
                                C(this.h, j8);
                            } else {
                                for (e70 e70Var2 : (List) c46Var4.a) {
                                    bq bqVar25 = this.e;
                                    if (bqVar25 == null) {
                                        bqVar25 = null;
                                    }
                                    bqVar25.i().n(sfaVarB.a, e70Var2.t, new oo6(27, e70Var2));
                                }
                                wkf wkfVarC = rpl.c(this.g, j8).c();
                                bq bqVar26 = this.e;
                                if (bqVar26 == null) {
                                    bqVar26 = null;
                                }
                                wkfVarC.F((wzj) bqVar26.g.getValue());
                                bq bqVar27 = this.e;
                                if (bqVar27 == null) {
                                    bqVar27 = null;
                                }
                                bqVar27.k().d(this.a);
                            }
                        }
                    }
                } else if ("attachment.not.ready".equals(yhhVar.b)) {
                    if (sfaVarB.b == 0) {
                        bqVar8 = this.e;
                        if (bqVar8 == null) {
                            bqVar8 = null;
                        }
                        bqVar8.i().p(sfaVarB, xfa.SENDING);
                    } else {
                        str = this.l;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, str, zo5.j(sfaVarB.b, "setSendingStatus called for already sent message sid = "), null);
                        }
                    }
                    bqVar6 = this.e;
                    if (bqVar6 == null) {
                        bqVar6 = null;
                    }
                    ((l70) bqVar6.J.getValue()).b(sfaVarB);
                    bqVar7 = this.e;
                    if (bqVar7 == null) {
                        bqVar7 = null;
                    }
                    h4b h4bVarJ2 = bqVar7.j();
                    String str12 = this.k;
                    c46Var3 = sfaVarB.n;
                    if (c46Var3 != null) {
                        list = (List) c46Var3.a;
                    } else {
                        list = Collections.EMPTY_LIST;
                    }
                    List list3 = list;
                    arrayList = new ArrayList(yw3.W0(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((e70) it.next()).t);
                    }
                    h4bVarJ2.F(str12, arrayList);
                } else if ("android.empty.message.and.attach".equals(yhhVar.b)) {
                    A(sfaVarB);
                    C(jA, this.f);
                    bqVar = this.e;
                    if (bqVar == null) {
                        bqVar = null;
                    }
                    ((toa) ((ose) bqVar.i().b.c()).h()).h(this.g, Collections.singletonList(Long.valueOf(this.f)), wja.DELETED, false);
                    bqVar2 = this.e;
                    if (bqVar2 == null) {
                        bqVar2 = null;
                    }
                    t51 t51VarB2 = bqVar2.b();
                    c92 c92Var2 = new c92();
                    c92Var2.c(this.g);
                    c92Var2.e(sfaVarB.a);
                    c92Var2.d(sfaVarB.H);
                    t51VarB2.c(c92Var2.a());
                    bqVar3 = this.e;
                    if (bqVar3 == null) {
                        bqVar3 = null;
                    }
                    bqVar3.k().d(this.a);
                    bqVar4 = this.e;
                    if (bqVar4 == null) {
                        bqVar4 = null;
                    }
                    qrc.m(bqVar4.j(), f4b.MSG_AUTO_DELETED_EMPTY, this.k, null, 28);
                } else {
                    w(sfaVarB, yhhVar);
                    bqVar5 = this.e;
                    if (bqVar5 == null) {
                        bqVar5 = null;
                    }
                    bqVar5.b().c(new t4b(this.a, this.g, yhhVar));
                    C(jA, this.f);
                }
            }
        } else if (sfaVarB.b == 0) {
            bq bqVar28 = this.e;
            if (bqVar28 == null) {
                bqVar28 = null;
            }
            bqVar28.i().p(sfaVarB, xfa.SENDING);
            if (jA != 0) {
                bq bqVar29 = this.e;
                if (bqVar29 == null) {
                    bqVar29 = null;
                }
                hjc hjcVar = (hjc) bqVar29.G.getValue();
                hjcVar.getClass();
                if (jA != 0) {
                    if (sfaVarB.R()) {
                        w50Var2 = w50.PHOTO;
                    } else if (sfaVarB.J()) {
                        w50Var2 = w50.AUDIO;
                    } else if (sfaVarB.B(y60.d)) {
                        w50Var2 = w50.VIDEO;
                    } else if (sfaVarB.I()) {
                        w50Var2 = w50.VIDEO_MSG;
                    } else if (sfaVarB.B(y60.j)) {
                        w50Var2 = w50.FILE;
                    } else {
                        if (sfaVarB.W()) {
                            w50Var2 = w50.STICKER;
                        } else {
                            w50Var = null;
                        }
                        hjcVar.g(jA, w50Var, sfaVarB.a);
                    }
                    w50Var = w50Var2;
                    hjcVar.g(jA, w50Var, sfaVarB.a);
                }
            }
        } else {
            String str13 = this.l;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str13, zo5.j(sfaVarB.b, "onFail called for already sent message sid = "), null);
            }
        }
        bq bqVar30 = this.e;
        if (bqVar30 == null) {
            bqVar30 = null;
        }
        bqVar30.b().c(new kfi(this.g, sfaVarB.a, false));
        bq bqVar31 = this.e;
        (bqVar31 != null ? bqVar31 : null).b().c(new yq0(this.a, yhhVar));
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.f;
        msgSend.chatId = this.g;
        long j = this.h;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.i;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.j;
        msgSend.traceId = this.k;
        return sia.toByteArray(msgSend);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_MSG_SEND;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:103:0x019c  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160  */
    /* JADX WARN: Code duplicated, block: B:85:0x0166  */
    /* JADX WARN: Code duplicated, block: B:87:0x016e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0176  */
    /* JADX WARN: Code duplicated, block: B:91:0x017e  */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0182, code lost:
    
        if (r3.a() == false) goto L126;
     */
    @Override // defpackage.btc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.atc j() {
        /*
            Method dump skipped, instruction units count: 507
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4b.j():atc");
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    @Override // defpackage.aq
    public final Object m() {
        long j;
        Object poeVar;
        String str;
        String str2 = this.l;
        gm0.n(str2, "createRequest");
        sfa sfaVarB = B();
        String str3 = this.k;
        if (sfaVarB == null) {
            gm0.Y(str2, "messageDb is null");
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            qrc.m(bqVar.j(), f4b.NON_EXISTED_MESSAGE_IN_API_TASK, str3, null, 28);
            return null;
        }
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        rt2 rt2Var = (rt2) bqVar2.d().k(sfaVarB.h).a.getValue();
        long j2 = this.h;
        if (j2 != 0 || rt2Var == null || rt2Var.h0()) {
            j = j2;
        } else {
            long j3 = rt2Var.b.a;
            if (j3 != 0) {
                j = j3;
            } else {
                j = j2;
            }
        }
        Boolean boolValueOf = (rt2Var == null || !rt2Var.d0()) ? null : Boolean.valueOf(this.j);
        try {
            poeVar = x(sfaVarB);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (roe.a(poeVar) != null) {
            bq bqVar3 = this.e;
            if (bqVar3 == null) {
                bqVar3 = null;
            }
            qrc.m(bqVar3.j(), f4b.UNKNOWN_ERROR_GET_OUTGOING, str3, null, 28);
        }
        ch3.d0(poeVar);
        zic zicVar = (zic) poeVar;
        b50 b50Var = zicVar.c;
        if ((b50Var != null && !b50Var.isEmpty()) || (((str = zicVar.b) != null && str.length() != 0) || zicVar.d != null)) {
            return new h3b(j, this.i, zicVar, boolValueOf);
        }
        gm0.Y(str2, "createRequest: empty outgoing message");
        f(new yhh("android.empty.message.and.attach", "MsgSend with empty text and attaches", null));
        bq bqVar4 = this.e;
        if (bqVar4 == null) {
            bqVar4 = null;
        }
        qrc.m(bqVar4.j(), f4b.EMPTY_OUTGOING_MESSAGE, str3, null, 28);
        ore.k("MsgSend with empty text and attaches");
        return null;
    }

    public final void w(sfa sfaVar, yhh yhhVar) {
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.i().p(sfaVar, xfa.ERROR);
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        bqVar2.c().g0(this.g, sfaVar, false, null);
        bq bqVar3 = this.e;
        if (bqVar3 == null) {
            bqVar3 = null;
        }
        bqVar3.k().d(this.a);
        String str = yhhVar.b;
        if (str == null) {
            str = "";
        }
        bq bqVar4 = this.e;
        (bqVar4 != null ? bqVar4 : null).j().C(this.k, str, yvk.c(str));
    }

    public final zic x(sfa sfaVar) {
        b50 b50VarD;
        bjc bjcVar = null;
        if (sfaVar.E()) {
            b50VarD = null;
        } else {
            c46 c46Var = sfaVar.n;
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            b50VarD = pm9.d(c46Var, (wo6) bqVar.V.getValue());
        }
        if (sfaVar.q != null) {
            int i = sfaVar.o;
            int i2 = 2;
            if (i != 1) {
                i2 = i != 2 ? 1 : 3;
            }
            bjcVar = new bjc(i2, sfaVar.y, Long.valueOf(sfaVar.x));
        }
        ArrayList arrayListS = pm9.s(sfaVar.D);
        s60 s60Var = new s60();
        s60Var.d(sfaVar.f);
        s60Var.q(sfaVar.g);
        s60Var.c(b50VarD);
        s60Var.m(bjcVar);
        s60Var.i(sfaVar.u);
        s60Var.j(arrayListS);
        s60Var.f(sfaVar.G);
        return s60Var.b();
    }

    public final void y(sfa sfaVar, yhh yhhVar) {
        gm0.Y(this.l, "onFailPhoneBindingRequired, message send to dialog");
        w(sfaVar, yhhVar);
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        bqVar.b().c(new otc());
        bq bqVar2 = this.e;
        if (bqVar2 == null) {
            bqVar2 = null;
        }
        bqVar2.a().f(this.h);
        bq bqVar3 = this.e;
        (bqVar3 != null ? bqVar3 : null).b().c(new wo3((Collection) Collections.singletonList(Long.valueOf(this.g)), true, false, (mg5) null, (cid) null, (Set) null, 124));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void z(h60 h60Var, s4b s4bVar) {
        String str = this.l;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.c;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "onSuccessControlMessage, messageDb.event = ".concat(p.o(h60Var.a)), null);
            }
        }
        if (h60Var.a == 2) {
            gda gdaVarK = s4bVar.k();
            l40 l40Var = gdaVarK != null ? (l40) gdaVarK.h.get(0) : null;
            ArrayList arrayList = h60Var.c;
            List list = ((oq4) l40Var).f;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(list);
            if (!arrayList2.isEmpty()) {
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                bqVar.b().c(new cid(this.g, arrayList2));
            }
        }
        gda gdaVarK2 = s4bVar.k();
        if (gdaVarK2 != null) {
            bq bqVar2 = this.e;
            if (bqVar2 == null) {
                bqVar2 = null;
            }
            ((u4b) bqVar2.I.getValue()).a(this.g, s4bVar.h(), gdaVarK2, s4bVar.m(), s4bVar.i());
        }
        bq bqVar3 = this.e;
        (bqVar3 != null ? bqVar3 : null).a().f(s4bVar.h());
    }
}
