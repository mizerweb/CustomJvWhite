package defpackage;

import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class phj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final pw d;
    public final p41 e;
    public jdj f;

    public phj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        pw pwVar = new pw(0);
        y1 y1Var = new y1(0, jhj.c);
        while (y1Var.hasNext()) {
            ((jhj) y1Var.next()).getClass();
            pwVar.add("WebAppDownloadFile");
        }
        this.d = pwVar;
        this.e = yab.b(0, 0, null, 7);
    }

    public static final ms8 f(phj phjVar, Throwable th) {
        ihj ihjVar = th instanceof ihj ? (ihj) th : null;
        if (ihjVar instanceof ghj) {
            return new ks8(new ns8("download_failed", 1));
        }
        if (ihjVar instanceof hhj) {
            return new ks8(new ns8("invalid_params", 2));
        }
        if (ihjVar instanceof fhj) {
            return new ks8(new ns8("denied_download_request", 3));
        }
        if (ihjVar == null) {
            return ls8.d;
        }
        ore.o();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[PHI: r10 r11
  0x0091: PHI (r10v5 shj) = (r10v4 shj), (r10v8 shj) binds: [B:29:0x008e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r11v8 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:29:0x008e, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (((defpackage.es8) r11).d(r1, r0) == r7) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.phj r9, defpackage.shj r10, defpackage.nq4 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.lhj
            if (r0 == 0) goto L13
            r0 = r11
            lhj r0 = (defpackage.lhj) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            lhj r0 = new lhj
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f
            int r1 = r0.h
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            hu4 r7 = defpackage.hu4.a
            if (r1 == 0) goto L4c
            if (r1 == r5) goto L44
            if (r1 == r4) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.ch3.d0(r11)
            goto La7
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r6
        L38:
            shj r10 = r0.d
            defpackage.ch3.d0(r11)
            goto L91
        L3e:
            shj r10 = r0.d
            defpackage.ch3.d0(r11)
            goto L7d
        L44:
            dhj r10 = r0.e
            shj r1 = r0.d
            defpackage.ch3.d0(r11)
            goto L69
        L4c:
            defpackage.ch3.d0(r11)
            dhj r11 = new dhj
            java.lang.String r1 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r1, r8)
            p41 r1 = r9.e
            r0.d = r10
            r0.e = r11
            r0.h = r5
            java.lang.Object r1 = r1.a(r0, r11)
            if (r1 != r7) goto L67
            goto La6
        L67:
            r1 = r10
            r10 = r11
        L69:
            nhj r11 = new nhj
            r8 = 0
            r11.<init>(r1, r9, r6, r8)
            r0.d = r1
            r0.e = r6
            r0.h = r4
            java.lang.Object r11 = r10.e(r11, r0)
            if (r11 != r7) goto L7c
            goto La6
        L7c:
            r10 = r1
        L7d:
            es8 r11 = (defpackage.es8) r11
            nhj r1 = new nhj
            r1.<init>(r10, r9, r6, r5)
            r0.d = r10
            r0.e = r6
            r0.h = r3
            java.lang.Object r11 = r11.c(r1, r0)
            if (r11 != r7) goto L91
            goto La6
        L91:
            es8 r11 = (defpackage.es8) r11
            p7g r1 = new p7g
            r3 = 29
            r1.<init>(r9, r10, r6, r3)
            r0.d = r6
            r0.e = r6
            r0.h = r2
            java.lang.Object r9 = r11.d(r1, r0)
            if (r9 != r7) goto La7
        La6:
            return r7
        La7:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phj.g(phj, shj, nq4):java.lang.Object");
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        sbi sbiVar = sbi.a;
        Iterator it = jhj.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((jhj) next).getClass();
        } while (!"WebAppDownloadFile".equals(str));
        jhj jhjVar = (jhj) next;
        if (jhjVar == null) {
            String name = phj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else {
            if (khj.$EnumSwitchMapping$0[jhjVar.ordinal()] != 1) {
                ore.o();
                return null;
            }
            Object objH = h(str2, (nq4) lq4Var);
            if (objH == hu4.a) {
                return objH;
            }
        }
        return sbiVar;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.e;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:48:0x0117  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object h(String str, nq4 nq4Var) {
        ohj ohjVar;
        jhj jhjVar;
        jhj jhjVar2;
        Object objA;
        shj shjVar;
        ehj ehjVar;
        p41 p41Var;
        jhj jhjVar3;
        Object objC;
        jhj jhjVar4;
        shj shjVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ohj) {
            ohjVar = (ohj) nq4Var;
            int i = ohjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ohjVar.i = i - Integer.MIN_VALUE;
            } else {
                ohjVar = new ohj(this, nq4Var);
            }
        } else {
            ohjVar = new ohj(this, nq4Var);
        }
        ohj ohjVar2 = ohjVar;
        Object obj = ohjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = ohjVar2.i;
        lq4 lq4Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                jhjVar2 = ohjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    ehjVar = ohjVar2.f;
                    shj shjVar3 = ohjVar2.e;
                    jhj jhjVar5 = ohjVar2.d;
                    ch3.d0(obj);
                    shjVar = shjVar3;
                    jhjVar3 = jhjVar5;
                    oli oliVar = new oli(this, shjVar, lq4Var, 13);
                    ohjVar2.d = jhjVar3;
                    ohjVar2.e = shjVar;
                    ohjVar2.f = null;
                    ohjVar2.i = 3;
                    objC = ehjVar.c(oliVar, ohjVar2);
                    if (objC != hu4Var) {
                        jhjVar4 = jhjVar3;
                        shjVar2 = shjVar;
                        obj = objC;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                shj shjVar4 = ohjVar2.e;
                jhj jhjVar6 = ohjVar2.d;
                ch3.d0(obj);
                jhjVar4 = jhjVar6;
                shjVar2 = shjVar4;
            }
            es8 es8Var = (es8) obj;
            poi poiVar = new poi(this, jhjVar4, shjVar2, lq4Var, 4);
            ohjVar2.d = null;
            ohjVar2.e = null;
            ohjVar2.f = null;
            ohjVar2.i = 4;
            return es8Var.d(poiVar, ohjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        jhjVar = jhj.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.c.getValue();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(shj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + jhjVar, webAppJsonException);
                }
            }
            ohjVar2.d = jhjVar;
            ohjVar2.e = null;
            ohjVar2.f = null;
            ohjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, jhjVar, null, ohjVar2) != hu4Var) {
                jhjVar2 = jhjVar;
                jhjVar = jhjVar2;
                objA = null;
            }
        }
        shjVar = (shj) objA;
        if (shjVar != null) {
            ehjVar = new ehj(shjVar.c, z5h.K0(shjVar.b, "data:", false));
            p41Var = this.e;
            ohjVar2.d = jhjVar;
            ohjVar2.e = shjVar;
            ohjVar2.f = ehjVar;
            ohjVar2.i = 2;
            if (p41Var.a(ohjVar2, ehjVar) != hu4Var) {
                jhjVar3 = jhjVar;
                oli oliVar2 = new oli(this, shjVar, lq4Var, 13);
                ohjVar2.d = jhjVar3;
                ohjVar2.e = shjVar;
                ohjVar2.f = null;
                ohjVar2.i = 3;
                objC = ehjVar.c(oliVar2, ohjVar2);
                if (objC != hu4Var) {
                    jhjVar4 = jhjVar3;
                    shjVar2 = shjVar;
                    obj = objC;
                    es8 es8Var2 = (es8) obj;
                    poi poiVar2 = new poi(this, jhjVar4, shjVar2, lq4Var, 4);
                    ohjVar2.d = null;
                    ohjVar2.e = null;
                    ohjVar2.f = null;
                    ohjVar2.i = 4;
                    if (es8Var2.d(poiVar2, ohjVar2) == hu4Var) {
                    }
                }
            }
        }
        jhjVar = jhjVar2;
        objA = null;
        shjVar = (shj) objA;
        if (shjVar != null) {
            ehjVar = new ehj(shjVar.c, z5h.K0(shjVar.b, "data:", false));
            p41Var = this.e;
            ohjVar2.d = jhjVar;
            ohjVar2.e = shjVar;
            ohjVar2.f = ehjVar;
            ohjVar2.i = 2;
            if (p41Var.a(ohjVar2, ehjVar) != hu4Var) {
                jhjVar3 = jhjVar;
                oli oliVar3 = new oli(this, shjVar, lq4Var, 13);
                ohjVar2.d = jhjVar3;
                ohjVar2.e = shjVar;
                ohjVar2.f = null;
                ohjVar2.i = 3;
                objC = ehjVar.c(oliVar3, ohjVar2);
                if (objC != hu4Var) {
                    jhjVar4 = jhjVar3;
                    shjVar2 = shjVar;
                    obj = objC;
                    es8 es8Var3 = (es8) obj;
                    poi poiVar3 = new poi(this, jhjVar4, shjVar2, lq4Var, 4);
                    ohjVar2.d = null;
                    ohjVar2.e = null;
                    ohjVar2.f = null;
                    ohjVar2.i = 4;
                    if (es8Var3.d(poiVar3, ohjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
