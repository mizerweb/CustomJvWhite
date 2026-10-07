package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class jah {
    public final pvb a;
    public rt2 b;
    public final daf c;
    public final zed d;
    public final onf e;
    public final ny8 f;
    public final xhh g;
    public final b11 h;
    public final ny8 i;
    public final ks9 j;
    public final cmf k;
    public final l9h l;
    public final String m;
    public volatile List n;
    public final l9b o;
    public volatile sgg p;
    public sgg q;

    public jah(pvb pvbVar, xn3 xn3Var, ny8 ny8Var, rt2 rt2Var, daf dafVar, p4c p4cVar, zed zedVar, onf onfVar, ny8 ny8Var2, dq4 dq4Var, xhh xhhVar, b11 b11Var) {
        this.a = pvbVar;
        this.b = rt2Var;
        this.c = dafVar;
        this.d = zedVar;
        this.e = onfVar;
        this.f = ny8Var2;
        this.g = xhhVar;
        this.h = b11Var;
        this.i = ny8Var;
        this.j = new ks9(4, this.b.b.b);
        this.k = new cmf(dafVar, p4cVar, false, 4);
        this.l = new l9h(this.b.b.b);
        String name = jah.class.getName();
        this.m = name;
        this.n = r66.a;
        this.o = new l9b();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, this + " init", null);
            }
        }
        n0c n0cVar = (n0c) xhhVar;
        yab.i0(dq4Var, n0cVar.a(), 0, new fpf(this, null, 6), 2);
        r8e r8eVarK = xn3Var.k(this.b.a);
        ghb ghbVar = ew5.b;
        this.q = tre.m0(new j3(e9i.p(e9i.T(new fz6(new jz(tre.G0(r8eVarK, qe7.O(1, lw5.SECONDS)), 13), new rea(2, this, jah.class, "handleChatUpdate", "handleChatUpdate(Lru/ok/tamtam/chats/Chat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 19), 3), n0cVar.a())), 14, new cah(this, null, 0)), dq4Var);
        tre.m0(new j3(e9i.p(e9i.T(new fz6(new hde(b11Var.d, 10), new ryf(this, null, 14), 3), n0cVar.a())), 14, new cah(this, null, 1)), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public static final Object a(jah jahVar, rt2 rt2Var, lq4 lq4Var) {
        eah eahVar;
        sfa sfaVar;
        jahVar.getClass();
        sbi sbiVar = sbi.a;
        if (lq4Var instanceof eah) {
            eahVar = (eah) lq4Var;
            int i = eahVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                eahVar.f = i - Integer.MIN_VALUE;
            } else {
                eahVar = new eah(jahVar, lq4Var);
            }
        } else {
            eahVar = new eah(jahVar, lq4Var);
        }
        Object obj = eahVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = eahVar.f;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            String str = jahVar.m;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.j(rt2Var.a, "handleChatUpdate "), null);
                }
            }
            jahVar.b = rt2Var;
            fda fdaVar = rt2Var.c;
            if (fdaVar != null && (sfaVar = fdaVar.a) != null && jahVar.d.a.f() - sfaVar.c <= 60000) {
                h60 h60VarQ = sfaVar.q();
                int i3 = h60VarQ != null ? h60VarQ.a : 0;
                int i4 = i3 == 0 ? -1 : dah.$EnumSwitchMapping$0[qt4.D(i3)];
                if (i4 == 1 || i4 == 2 || i4 == 3) {
                    eahVar.f = 1;
                    Object objK = cqk.k(new xra(jahVar, null, 21), eahVar);
                    if (objK != hu4Var) {
                        objK = sbiVar;
                    }
                    if (objK == hu4Var) {
                        return hu4Var;
                    }
                }
            }
            return sbiVar;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(jahVar.m, "Got error during handling event", th);
            return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(jah jahVar, List list, Map map, nq4 nq4Var) {
        hah hahVar;
        List list2;
        r01 r01Var;
        if (nq4Var instanceof hah) {
            hahVar = (hah) nq4Var;
            int i = hahVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                hahVar.h = i - Integer.MIN_VALUE;
            } else {
                hahVar = new hah(jahVar, nq4Var);
            }
        } else {
            hahVar = new hah(jahVar, nq4Var);
        }
        Object obj = hahVar.f;
        hu4 hu4Var = hu4.a;
        int i2 = hahVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            m01 m01Var = new m01(list, map);
            l01 l01Var = (l01) jahVar.i.getValue();
            long j = jahVar.b.a;
            hahVar.d = list;
            hahVar.e = map;
            hahVar.h = 1;
            if (l01Var.e(j, m01Var, hahVar) == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            map = hahVar.e;
            list = hahVar.d;
            ch3.d0(obj);
        }
        ks9 ks9Var = jahVar.j;
        ks9Var.getClass();
        if (list == null) {
            list2 = Collections.EMPTY_LIST;
        } else {
            List<d01> list3 = list;
            ArrayList arrayList = new ArrayList(list3.size());
            for (d01 d01Var : list3) {
                try {
                    pj4 pj4Var = (pj4) map.get(Long.valueOf(d01Var.a));
                    long j2 = d01Var.a;
                    if (pj4Var == null) {
                        gm0.m("ks9", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(j2));
                        r01Var = new r01(d01Var.a, null, ks9Var.x(d01Var, null), d01Var.c);
                    } else {
                        r01Var = new r01(j2, xoh.b(pj4Var.l), ks9Var.x(d01Var, pj4Var), d01Var.c);
                    }
                    arrayList.add(r01Var);
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
            list2 = arrayList;
        }
        jahVar.n = list2;
        return sbi.a;
    }

    public static boolean f(rt2 rt2Var) {
        return rt2Var.b.a != 0 && rt2Var.C0() && rt2Var.W() && rt2Var.M0();
    }

    public final d9h c() {
        return (((rnf) this.e).q == 3 && this.b.b.e.size() < this.b.b.b()) ? new c9h(this.b.b.a, this.a, this.k) : new xde(this.c, this.k, this.d, new b1k(29, this), 9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(nq4 nq4Var) {
        fah fahVar;
        List list;
        r01 r01Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof fah) {
            fahVar = (fah) nq4Var;
            int i = fahVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fahVar.f = i - Integer.MIN_VALUE;
            } else {
                fahVar = new fah(this, nq4Var);
            }
        } else {
            fahVar = new fah(this, nq4Var);
        }
        Object objD = fahVar.d;
        Object obj = hu4.a;
        int i2 = fahVar.f;
        if (i2 == 0) {
            ch3.d0(objD);
            l01 l01Var = (l01) this.i.getValue();
            long j = this.b.a;
            fahVar.f = 1;
            objD = l01Var.d(j, fahVar);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        m01 m01Var = (m01) objD;
        if (m01Var == null) {
            gm0.Y(jah.class.getName(), "Early return in loadBotCommandsFromCache cuz of botCommandsCache.load(chat.id) is null");
            return sbiVar;
        }
        ks9 ks9Var = this.j;
        List list2 = m01Var.a;
        Map map = m01Var.b;
        ks9Var.getClass();
        if (list2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            List<d01> list3 = list2;
            ArrayList arrayList = new ArrayList(list3.size());
            for (d01 d01Var : list3) {
                try {
                    pj4 pj4Var = (pj4) map.get(Long.valueOf(d01Var.a));
                    long j2 = d01Var.a;
                    if (pj4Var == null) {
                        gm0.m("ks9", "prepareBotCommandItems, contactInfo is null, botId: %d", Long.valueOf(j2));
                        r01Var = new r01(d01Var.a, null, ks9Var.x(d01Var, null), d01Var.c);
                    } else {
                        r01Var = new r01(j2, xoh.b(pj4Var.l), ks9Var.x(d01Var, pj4Var), d01Var.c);
                    }
                    arrayList.add(r01Var);
                } catch (Throwable th) {
                    qr7.o(th);
                    return null;
                }
            }
            list = arrayList;
        }
        this.n = list;
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
    
        if (r10 == r0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(int r9, defpackage.lq4 r10, java.lang.String r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.gah
            if (r0 == 0) goto L14
            r0 = r10
            gah r0 = (defpackage.gah) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.h = r1
        L12:
            r7 = r0
            goto L1c
        L14:
            gah r0 = new gah
            nq4 r10 = (defpackage.nq4) r10
            r0.<init>(r8, r10)
            goto L12
        L1c:
            java.lang.Object r10 = r7.f
            hu4 r0 = defpackage.hu4.a
            int r1 = r7.h
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3d
            if (r1 == r4) goto L35
            if (r1 != r3) goto L2f
            defpackage.ch3.d0(r10)
            goto L80
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r8)
            return r2
        L35:
            int r9 = r7.e
            java.lang.String r11 = r7.d
            defpackage.ch3.d0(r10)
            goto L5d
        L3d:
            defpackage.ch3.d0(r10)
            java.util.List r10 = r8.n
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L5d
            rt2 r10 = r8.b
            boolean r10 = f(r10)
            if (r10 == 0) goto L5d
            r7.d = r11
            r7.e = r9
            r7.h = r4
            java.lang.Object r10 = r8.d(r7)
            if (r10 != r0) goto L5d
            goto L7f
        L5d:
            r4 = r9
            l9h r1 = r8.l
            java.util.List r9 = r8.n
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r5 = defpackage.ww3.T1(r9)
            d9h r6 = r8.c()
            r7.d = r2
            r7.e = r4
            r7.h = r3
            lx2 r8 = r1.a
            o9h r2 = defpackage.ttl.a(r11, r4, r8)
            r3 = r11
            java.lang.Object r10 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r10 != r0) goto L80
        L7f:
            return r0
        L80:
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r8 = defpackage.ww3.T1(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jah.e(int, lq4, java.lang.String):java.lang.Object");
    }
}
