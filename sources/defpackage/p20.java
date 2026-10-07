package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import one.me.messages.list.loader.MessageModel;
import org.webrtc.PeerConnection;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class p20 extends y10 implements oa4 {
    public final qg7 A;
    public final voa B;
    public final ifh C;
    public final ifh D;
    public final d0c E;
    public final s00 F;
    public final pa4 G;
    public final e93 H;
    public final int I;
    public final int J;
    public final mjg K;
    public final r8e L;
    public final f20 z;

    public p20(xhh xhhVar, yt4 yt4Var, iw7 iw7Var, xhe xheVar, f20 f20Var, qg7 qg7Var, voa voaVar, ifh ifhVar, ifh ifhVar2, d0c d0cVar, s00 s00Var, pa4 pa4Var, e93 e93Var, int i, int i2, int i3, boolean z) {
        super(yt4Var, qv1.k("AsyncMessagesListLoader#", f20Var.c()), xhhVar, qg7Var, iw7Var, s00Var, xheVar, i, i2, z, np0.o);
        this.z = f20Var;
        this.A = qg7Var;
        this.B = voaVar;
        this.C = ifhVar;
        this.D = ifhVar2;
        this.E = d0cVar;
        this.F = s00Var;
        this.G = pa4Var;
        this.H = e93Var;
        this.I = i;
        this.J = i3;
        mjg mjgVarA = p90.a(opa.d);
        this.K = mjgVarA;
        this.L = new r8e(mjgVarA);
        z();
        e9i.j0(new fz6(voaVar.b(), new m20(2, this, p20.class, "handleEvent", "handleEvent(Lone/me/messages/list/loader/events/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0), 3), this.l);
        pa4Var.a(pa4.d | pa4.e, this);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.y10
    public final Object B(List list, boolean z, boolean z2, lq4 lq4Var) {
        n20 n20Var;
        boolean z3;
        List list2;
        qg7 qg7Var;
        if (lq4Var instanceof n20) {
            n20Var = (n20) lq4Var;
            int i = n20Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                n20Var.i = i - Integer.MIN_VALUE;
            } else {
                n20Var = new n20(this, (nq4) lq4Var);
            }
        } else {
            n20Var = new n20(this, (nq4) lq4Var);
        }
        Object objE = n20Var.g;
        int i2 = n20Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            n20Var.d = list;
            n20Var.e = z;
            n20Var.f = z2;
            n20Var.i = 1;
            objE = this.z.e(n20Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            z2 = n20Var.f;
            z = n20Var.e;
            list = n20Var.d;
            ch3.d0(objE);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = n20Var.d;
                ch3.d0(objE);
                return sbiVar;
            }
            z3 = n20Var.f;
            z = n20Var.e;
            List list4 = n20Var.d;
            ch3.d0(objE);
        }
        list2 = (List) objE;
        qg7Var = this.A;
        if (qg7Var != null) {
            int size = list2.size();
            StringBuilder sbB = zo5.B("Messages state, hasNext=", z3, " | hasPrev=", z, ", count:");
            sbB.append(size);
            qg7Var.r(sbB.toString());
        }
        opa opaVar = new opa(list2, z3, z);
        n20Var.d = null;
        n20Var.e = z;
        n20Var.f = z3;
        n20Var.i = 3;
        mjg mjgVar = this.K;
        mjgVar.getClass();
        mjgVar.j(null, opaVar);
        if (sbiVar != hu4Var) {
            return hu4Var;
        }
        return sbiVar;
        n20Var.d = null;
        n20Var.e = z;
        n20Var.f = z2;
        n20Var.i = 2;
        objE = L((rt2) objE, list, n20Var);
        if (objE != hu4Var) {
            z3 = z2;
            list2 = (List) objE;
            qg7Var = this.A;
            if (qg7Var != null) {
                int size2 = list2.size();
                StringBuilder sbB2 = zo5.B("Messages state, hasNext=", z3, " | hasPrev=", z, ", count:");
                sbB2.append(size2);
                qg7Var.r(sbB2.toString());
            }
            opa opaVar2 = new opa(list2, z3, z);
            n20Var.d = null;
            n20Var.e = z;
            n20Var.f = z3;
            n20Var.i = 3;
            mjg mjgVar2 = this.K;
            mjgVar2.getClass();
            mjgVar2.j(null, opaVar2);
            if (sbiVar != hu4Var) {
                return sbiVar;
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object I(iga igaVar, lq4 lq4Var) {
        g20 g20Var;
        iga igaVar2;
        ArrayList arrayList;
        boolean z;
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof g20) {
            g20Var = (g20) lq4Var;
            int i = g20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                g20Var.h = i - Integer.MIN_VALUE;
            } else {
                g20Var = new g20(this, lq4Var);
            }
        } else {
            g20Var = new g20(this, lq4Var);
        }
        Object objJ = g20Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = g20Var.h;
        if (i2 == 0) {
            ch3.d0(objJ);
            m8b m8bVar = new m8b(this.p.e().size());
            Iterator it = this.p.e().iterator();
            while (it.hasNext()) {
                m8bVar.a(((kw7) it.next()).getA());
            }
            Collection collection = igaVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collection) {
                if (!m8bVar.d(((Number) obj).longValue())) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                qg7 qg7Var = this.A;
                if (qg7Var != null) {
                    qg7Var.r("handleMessageAdd: all ids already present, skip extra loads");
                    return sbiVar;
                }
            } else {
                s00 s00Var = this.F;
                g20Var.d = igaVar;
                g20Var.e = arrayList2;
                g20Var.h = 1;
                objJ = s00Var.j(arrayList2, g20Var);
                if (objJ == hu4Var) {
                    return hu4Var;
                }
                igaVar2 = igaVar;
                arrayList = arrayList2;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = g20Var.e;
        iga igaVar3 = g20Var.d;
        ch3.d0(objJ);
        igaVar2 = igaVar3;
        List list = (List) objJ;
        if (list.isEmpty()) {
            qg7 qg7Var2 = this.A;
            if (qg7Var2 != null) {
                qg7Var2.r("handleMessageAdd: no new messages resolved locally for " + arrayList);
            }
            return sbiVar;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            qr7.d();
            return null;
        }
        long c = ((kw7) it2.next()).getC();
        while (it2.hasNext()) {
            long c2 = ((kw7) it2.next()).getC();
            if (c < c2) {
                c = c2;
            }
        }
        if (((opa) this.K.getValue()).a.isEmpty()) {
            H();
            g();
            long j = c;
            j(list, j, true, g().f(), true);
            E(j);
            A(this.s, new c10(j, false));
            return sbiVar;
        }
        long j2 = c;
        H();
        List listL = g().l();
        tq3 tq3VarT = qe7.t(j2, listL);
        tq3 tq3VarT2 = qe7.t(e(), listL);
        boolean z2 = (tq3VarT == null || tq3VarT2 == null || !tq3VarT.equals(tq3VarT2)) ? false : true;
        long jF = f();
        boolean z3 = ww3.D1(this.v.s(i(), jF, true)) instanceof jw7;
        if (z2 && j2 > jF && z3) {
            qg7 qg7Var3 = this.A;
            if (qg7Var3 != null) {
                String str = (String) qg7Var3.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbS = qt4.s(j2, "add: ignore add forward this messages because newestTime:", " higher firstAnchorSortTime:");
                        sbS.append(jF);
                        a4cVar.c(je9Var, str, sbS.toString(), null);
                    }
                }
            }
            z = false;
        } else {
            z = true;
        }
        g();
        j(list, j2, z, g().f(), true);
        if (tq3VarT == null || tq3VarT2 == null || !tq3VarT.equals(tq3VarT2)) {
            qg7 qg7Var4 = this.A;
            if (qg7Var4 != null) {
                qg7Var4.r("handleMessageAdd: switch around to " + qg7.h(j2) + " (added outside current chunk)");
            }
            A(this.s, new c10(j2, igaVar2.c));
            return sbiVar;
        }
        boolean z4 = ((kw7) ww3.B1(this.v.s(i(), f(), true))) instanceof jw7;
        qg7 qg7Var5 = this.A;
        if (z4) {
            if (qg7Var5 != null) {
                qg7Var5.r("handleMessageAdd: same chunk, gap at end -> LoadingAround " + qg7.h(j2));
            }
            A(this.s, new c10(j2, true));
            return sbiVar;
        }
        if (qg7Var5 != null) {
            qg7Var5.r("handleMessageAdd: same chunk, enqueue LoadingNext from " + qg7.h(f()));
        }
        A(this.s, new d10(f(), false, false));
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J(rga rgaVar, lq4 lq4Var) {
        h20 h20Var;
        l8b l8bVar;
        ArrayList arrayList;
        if (lq4Var instanceof h20) {
            h20Var = (h20) lq4Var;
            int i = h20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                h20Var.h = i - Integer.MIN_VALUE;
            } else {
                h20Var = new h20(this, lq4Var);
            }
        } else {
            h20Var = new h20(this, lq4Var);
        }
        Object objJ = h20Var.f;
        int i2 = h20Var.h;
        qg7 qg7Var = this.A;
        sbi sbiVar = sbi.a;
        m3 m3Var = this.p;
        if (i2 == 0) {
            ch3.d0(objJ);
            m8b m8bVar = new m8b(m3Var.e().size());
            Iterator it = m3Var.e().iterator();
            while (it.hasNext()) {
                m8bVar.a(((kw7) it.next()).getA());
            }
            Collection collection = rgaVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : collection) {
                if (m8bVar.d(((Number) obj).longValue())) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                l8b l8bVar2 = new l8b();
                h20Var.d = arrayList2;
                h20Var.e = l8bVar2;
                h20Var.h = 1;
                objJ = this.F.j(arrayList2, h20Var);
                hu4 hu4Var = hu4.a;
                if (objJ == hu4Var) {
                    return hu4Var;
                }
                l8bVar = l8bVar2;
                arrayList = arrayList2;
            } else if (qg7Var != null) {
                qg7Var.r("handleMessageUpdate: loaded messages does not intersects with updated ids");
                return sbiVar;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        l8bVar = h20Var.e;
        arrayList = h20Var.d;
        ch3.d0(objJ);
        for (kw7 kw7Var : (Iterable) objJ) {
            l8bVar.l(kw7Var.getA(), kw7Var);
        }
        if (!l8bVar.h()) {
            m3Var.g(new m(14, l8bVar));
            return sbiVar;
        }
        if (qg7Var != null) {
            qg7Var.r("handleMessageUpdate: not found messages " + arrayList + " in repository");
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r14 == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object K(long r12, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.K(long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0074 -> B:26:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.io.Serializable L(defpackage.rt2 r6, java.util.List r7, defpackage.nq4 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.o20
            if (r0 == 0) goto L13
            r0 = r8
            o20 r0 = (defpackage.o20) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            o20 r0 = new o20
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.g
            int r1 = r0.i
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            int r6 = r0.f
            java.util.ArrayList r7 = r0.e
            rt2 r1 = r0.d
            defpackage.ch3.d0(r8)
            r4 = r1
            r1 = r7
            r7 = r4
            goto L77
        L2e:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r5)
            r5 = 0
            return r5
        L35:
            defpackage.ch3.d0(r8)
            r8 = r7
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            int r7 = r7.size()
            r1.<init>(r7)
            java.util.Iterator r7 = r8.iterator()
        L48:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L5a
            java.lang.Object r8 = r7.next()
            boolean r3 = r8 instanceof one.me.messages.list.loader.MessageModel
            if (r3 == 0) goto L48
            r1.add(r8)
            goto L48
        L5a:
            r7 = 0
            r4 = r7
            r7 = r6
            r6 = r4
        L5e:
            int r8 = r1.size()
            if (r6 >= r8) goto L88
            r0.d = r7
            r0.e = r1
            r0.f = r6
            r0.i = r2
            d0c r8 = r5.E
            java.lang.Object r8 = r8.j(r7, r6, r1, r0)
            hu4 r3 = defpackage.hu4.a
            if (r8 != r3) goto L77
            return r3
        L77:
            one.me.messages.list.loader.MessageModel r8 = (one.me.messages.list.loader.MessageModel) r8
            if (r8 != 0) goto L7f
            r1.remove(r6)
            goto L5e
        L7f:
            int r8 = r6 + 1
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r6)
            r6 = r8
            goto L5e
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p20.L(rt2, java.util.List, nq4):java.io.Serializable");
    }

    @Override // defpackage.oa4
    public final void a(Context context) {
        yab.i0(this.l, null, 0, new m5(this, null, 5), 3);
    }

    @Override // defpackage.y10
    public final void c() {
        super.c();
        this.B.a();
        Set set = (Set) this.G.b.get(Integer.valueOf(pa4.d | pa4.e));
        if (set != null) {
            set.remove(this);
        }
        this.z.f();
    }

    @Override // defpackage.y10
    public final void d(boolean z) {
        if (z) {
            e93 e93Var = this.H;
            String str = e93Var.g;
            owh owhVar = str != null ? new owh(str) : null;
            String str2 = owhVar != null ? owhVar.a : null;
            if (str2 != null) {
                e93.i.h(p90.O(1, "remote_load"), str2);
                return;
            }
            String str3 = e93Var.b;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "Invoked 'markAsRemoteLoaded', but traceId is null or empty!", null);
            }
        }
    }

    @Override // defpackage.y10
    public final long f() {
        Long lValueOf;
        pu6 pu6Var = new pu6(yhf.n0(new sw(1, ((opa) this.K.getValue()).a), new e20(this, 1)));
        if (pu6Var.hasNext()) {
            lValueOf = Long.valueOf(((MessageModel) pu6Var.next()).c);
            while (pu6Var.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) pu6Var.next()).c);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    @Override // defpackage.y10
    public final long h() {
        Long lValueOf;
        pu6 pu6Var = new pu6(yhf.n0(new sw(1, ((opa) this.K.getValue()).a), new e20(this, 0)));
        if (pu6Var.hasNext()) {
            lValueOf = Long.valueOf(((MessageModel) pu6Var.next()).c);
            while (pu6Var.hasNext()) {
                Long lValueOf2 = Long.valueOf(((MessageModel) pu6Var.next()).c);
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        return lValueOf != null ? lValueOf.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    @Override // defpackage.y10
    public final int i() {
        return this.J;
    }

    @Override // defpackage.y10
    public final boolean l(kw7 kw7Var) {
        return (kw7Var instanceof MessageModel) && ((MessageModel) kw7Var).b == 0;
    }

    @Override // defpackage.y10
    public final Object u(long j, nq4 nq4Var) {
        yab.i0(this.m, null, 0, new i20(this, j, (lq4) null, 0), 3);
        Object objB = this.z.b(j, this, nq4Var);
        return objB == hu4.a ? objB : sbi.a;
    }

    public /* synthetic */ p20(xhh xhhVar, yt4 yt4Var, iw7 iw7Var, xhe xheVar, f20 f20Var, qg7 qg7Var, voa voaVar, ifh ifhVar, ifh ifhVar2, d0c d0cVar, s00 s00Var, pa4 pa4Var, e93 e93Var, int i, boolean z, int i2) {
        this(xhhVar, yt4Var, iw7Var, xheVar, f20Var, qg7Var, voaVar, ifhVar, ifhVar2, d0cVar, s00Var, pa4Var, e93Var, i, (i2 & 16384) != 0 ? i : 15, (i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? 1 : 2, z);
    }
}
