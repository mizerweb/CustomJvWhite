package defpackage;

import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class qlj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final pw d;
    public final p41 e;
    public jdj f;

    public qlj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var2;
        this.c = ny8Var;
        pw pwVar = new pw(0);
        y1 y1Var = new y1(0, klj.h);
        while (y1Var.hasNext()) {
            pwVar.add(((klj) y1Var.next()).a);
        }
        this.d = pwVar;
        this.e = yab.b(0, 0, null, 7);
    }

    public static final ms8 f(qlj qljVar, Throwable th) {
        dlj dljVar = th instanceof dlj ? (dlj) th : null;
        if (dljVar instanceof zkj) {
            return new ks8(new ns8("already_enabled", 6));
        }
        int i = 2;
        int i2 = 1;
        if (dljVar instanceof blj) {
            int i3 = llj.$EnumSwitchMapping$0[((blj) dljVar).a.ordinal()];
            if (i3 == 1) {
                i2 = 4;
            } else if (i3 == 2) {
                i2 = 5;
            } else if (i3 != 3) {
                ore.o();
                return null;
            }
            return new ks8(new ns8("not_found", i2));
        }
        if (dljVar instanceof alj) {
            return new ks8(new ns8("not_enabled", 3));
        }
        if (!(dljVar instanceof clj)) {
            if (dljVar == null) {
                return ls8.d;
            }
            ore.o();
            return null;
        }
        int i4 = llj.$EnumSwitchMapping$0[((clj) dljVar).a.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                i = 3;
            } else {
                if (i4 != 3) {
                    ore.o();
                    return null;
                }
                i = -1;
            }
        }
        return new ks8(new ns8("not_supported", i));
    }

    public static final void g(qlj qljVar, String str) {
        jdj jdjVar = qljVar.f;
        if (jdjVar != null) {
            fgj.a((fgj) qljVar.c.getValue(), str, jdjVar.a, jdjVar.b, true, 0, null, null, 240);
        }
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objJ;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (!this.d.contains(str)) {
            String name = qlj.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Unknown method with name = " + str + " in JsDelegate: " + this, null);
                    return sbiVar;
                }
            }
        } else if (str.equals("WebAppNfcGetInfo")) {
            Object objI = i(str2, (nq4) lq4Var);
            if (objI == hu4Var) {
                return objI;
            }
        } else if (str.equals("WebAppNfcEmulateNfcTag")) {
            Object objK = k(str2, (nq4) lq4Var);
            if (objK == hu4Var) {
                return objK;
            }
        } else if (str.equals("WebAppNfcOpenSystemSettings") && (objJ = j(str2, (nq4) lq4Var)) == hu4Var) {
            return objJ;
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

    public final l44 h() {
        return (l44) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:47:0x0105  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object i(String str, nq4 nq4Var) {
        mlj mljVar;
        klj kljVar;
        klj kljVar2;
        Object objA;
        glj gljVar;
        mgb mgbVar;
        p41 p41Var;
        klj kljVar3;
        Object objC;
        glj gljVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof mlj) {
            mljVar = (mlj) nq4Var;
            int i = mljVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mljVar.i = i - Integer.MIN_VALUE;
            } else {
                mljVar = new mlj(this, nq4Var);
            }
        } else {
            mljVar = new mlj(this, nq4Var);
        }
        mlj mljVar2 = mljVar;
        Object obj = mljVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = mljVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                kljVar2 = mljVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    mgbVar = mljVar2.f;
                    glj gljVar3 = mljVar2.e;
                    klj kljVar4 = mljVar2.d;
                    ch3.d0(obj);
                    gljVar = gljVar3;
                    kljVar3 = kljVar4;
                    nlj nljVar = new nlj(gljVar, this, kljVar3, (lq4) null);
                    mljVar2.d = kljVar3;
                    mljVar2.e = gljVar;
                    mljVar2.f = null;
                    mljVar2.i = 3;
                    objC = mgbVar.c(nljVar, mljVar2);
                    if (objC != hu4Var) {
                        gljVar2 = gljVar;
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
                gljVar2 = mljVar2.e;
                kljVar3 = mljVar2.d;
                ch3.d0(obj);
            }
            nlj nljVar2 = new nlj(this, kljVar3, gljVar2, (lq4) null);
            mljVar2.d = null;
            mljVar2.e = null;
            mljVar2.f = null;
            mljVar2.i = 4;
            return ((es8) obj).d(nljVar2, mljVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        kljVar = klj.GET_INFO;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(glj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + kljVar, webAppJsonException);
                }
            }
            mljVar2.d = kljVar;
            mljVar2.e = null;
            mljVar2.f = null;
            mljVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, kljVar, null, mljVar2) != hu4Var) {
                kljVar2 = kljVar;
                kljVar = kljVar2;
                objA = null;
            }
        }
        gljVar = (glj) objA;
        if (gljVar != null) {
            mgbVar = new mgb(gljVar.a);
            p41Var = this.e;
            mljVar2.d = kljVar;
            mljVar2.e = gljVar;
            mljVar2.f = mgbVar;
            mljVar2.i = 2;
            if (p41Var.a(mljVar2, mgbVar) != hu4Var) {
                kljVar3 = kljVar;
                nlj nljVar3 = new nlj(gljVar, this, kljVar3, (lq4) null);
                mljVar2.d = kljVar3;
                mljVar2.e = gljVar;
                mljVar2.f = null;
                mljVar2.i = 3;
                objC = mgbVar.c(nljVar3, mljVar2);
                if (objC != hu4Var) {
                    gljVar2 = gljVar;
                    obj = objC;
                    nlj nljVar4 = new nlj(this, kljVar3, gljVar2, (lq4) null);
                    mljVar2.d = null;
                    mljVar2.e = null;
                    mljVar2.f = null;
                    mljVar2.i = 4;
                    if (((es8) obj).d(nljVar4, mljVar2) == hu4Var) {
                    }
                }
            }
        }
        kljVar = kljVar2;
        objA = null;
        gljVar = (glj) objA;
        if (gljVar != null) {
            mgbVar = new mgb(gljVar.a);
            p41Var = this.e;
            mljVar2.d = kljVar;
            mljVar2.e = gljVar;
            mljVar2.f = mgbVar;
            mljVar2.i = 2;
            if (p41Var.a(mljVar2, mgbVar) != hu4Var) {
                kljVar3 = kljVar;
                nlj nljVar5 = new nlj(gljVar, this, kljVar3, (lq4) null);
                mljVar2.d = kljVar3;
                mljVar2.e = gljVar;
                mljVar2.f = null;
                mljVar2.i = 3;
                objC = mgbVar.c(nljVar5, mljVar2);
                if (objC != hu4Var) {
                    gljVar2 = gljVar;
                    obj = objC;
                    nlj nljVar6 = new nlj(this, kljVar3, gljVar2, (lq4) null);
                    mljVar2.d = null;
                    mljVar2.e = null;
                    mljVar2.f = null;
                    mljVar2.i = 4;
                    if (((es8) obj).d(nljVar6, mljVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r2 r3 r4
  0x0056: PHI (r2v10 pgb) = (r2v8 pgb), (r2v19 pgb) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r3v3 tlj) = (r3v2 tlj), (r3v7 tlj) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v6 klj) = (r4v4 klj), (r4v9 klj) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [klj, lq4, pgb, tlj] */
    public final Object j(String str, nq4 nq4Var) {
        olj oljVar;
        klj kljVar;
        Object objA;
        klj kljVar2;
        tlj tljVar;
        pgb pgbVar;
        p41 p41Var;
        tlj tljVar2;
        klj kljVar3;
        lq4 lq4Var;
        tlj tljVar3;
        klj kljVar4;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof olj) {
            oljVar = (olj) nq4Var;
            int i = oljVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                oljVar.i = i - Integer.MIN_VALUE;
            } else {
                oljVar = new olj(this, nq4Var);
            }
        } else {
            oljVar = new olj(this, nq4Var);
        }
        olj oljVar2 = oljVar;
        Object objC = oljVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = oljVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                kljVar = oljVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    pgbVar = oljVar2.f;
                    tljVar = oljVar2.e;
                    kljVar2 = oljVar2.d;
                    ch3.d0(objC);
                    pgb pgbVar2 = pgbVar;
                    tljVar2 = tljVar;
                    kljVar3 = kljVar2;
                    lq4Var = null;
                    rjj rjjVar = new rjj(this, tljVar2, kljVar3, lq4Var, 3);
                    oljVar2.d = kljVar3;
                    oljVar2.e = tljVar2;
                    oljVar2.f = null;
                    oljVar2.i = 3;
                    objC = pgbVar2.c(rjjVar, oljVar2);
                    if (objC != hu4Var) {
                        tljVar3 = tljVar2;
                        kljVar4 = kljVar3;
                        r4 = lq4Var;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(objC);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tlj tljVar4 = oljVar2.e;
                klj kljVar5 = oljVar2.d;
                ch3.d0(objC);
                tljVar3 = tljVar4;
                kljVar4 = kljVar5;
                r4 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, kljVar4, tljVar3, r4, 9);
            oljVar2.d = r4;
            oljVar2.e = r4;
            oljVar2.f = r4;
            oljVar2.i = 4;
            return es8Var.d(poiVar, oljVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        klj kljVar6 = klj.OPEN_SYSTEM_SETTINGS;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(tlj.Companion.serializer(), str);
            kljVar2 = kljVar6;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + kljVar6, webAppJsonException);
                }
            }
            oljVar2.d = kljVar6;
            oljVar2.e = null;
            oljVar2.f = null;
            oljVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, kljVar6, null, oljVar2) != hu4Var) {
                kljVar = kljVar6;
                kljVar2 = kljVar;
                objA = null;
            }
        }
        tljVar = (tlj) objA;
        if (tljVar != null) {
            pgbVar = new pgb(tljVar.a);
            p41Var = this.e;
            oljVar2.d = kljVar2;
            oljVar2.e = tljVar;
            oljVar2.f = pgbVar;
            oljVar2.i = 2;
            if (p41Var.a(oljVar2, pgbVar) != hu4Var) {
                pgb pgbVar3 = pgbVar;
                tljVar2 = tljVar;
                kljVar3 = kljVar2;
                lq4Var = null;
                rjj rjjVar2 = new rjj(this, tljVar2, kljVar3, lq4Var, 3);
                oljVar2.d = kljVar3;
                oljVar2.e = tljVar2;
                oljVar2.f = null;
                oljVar2.i = 3;
                objC = pgbVar3.c(rjjVar2, oljVar2);
                if (objC != hu4Var) {
                    tljVar3 = tljVar2;
                    kljVar4 = kljVar3;
                    r4 = lq4Var;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, kljVar4, tljVar3, r4, 9);
                    oljVar2.d = r4;
                    oljVar2.e = r4;
                    oljVar2.f = r4;
                    oljVar2.i = 4;
                    if (es8Var2.d(poiVar2, oljVar2) == hu4Var) {
                    }
                }
            }
        }
        kljVar2 = kljVar;
        objA = null;
        tljVar = (tlj) objA;
        if (tljVar != null) {
            pgbVar = new pgb(tljVar.a);
            p41Var = this.e;
            oljVar2.d = kljVar2;
            oljVar2.e = tljVar;
            oljVar2.f = pgbVar;
            oljVar2.i = 2;
            if (p41Var.a(oljVar2, pgbVar) != hu4Var) {
                pgb pgbVar4 = pgbVar;
                tljVar2 = tljVar;
                kljVar3 = kljVar2;
                lq4Var = null;
                rjj rjjVar3 = new rjj(this, tljVar2, kljVar3, lq4Var, 3);
                oljVar2.d = kljVar3;
                oljVar2.e = tljVar2;
                oljVar2.f = null;
                oljVar2.i = 3;
                objC = pgbVar4.c(rjjVar3, oljVar2);
                if (objC != hu4Var) {
                    tljVar3 = tljVar2;
                    kljVar4 = kljVar3;
                    r4 = lq4Var;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, kljVar4, tljVar3, r4, 9);
                    oljVar2.d = r4;
                    oljVar2.e = r4;
                    oljVar2.f = r4;
                    oljVar2.i = 4;
                    if (es8Var3.d(poiVar3, oljVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r2 r3 r4
  0x0056: PHI (r2v13 es8) = (r2v10 es8), (r2v22 es8) binds: [B:46:0x00fd, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r3v3 vkj) = (r3v2 vkj), (r3v7 vkj) binds: [B:46:0x00fd, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v6 klj) = (r4v4 klj), (r4v9 klj) binds: [B:46:0x00fd, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0117  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [es8, klj, lq4, vkj] */
    public final Object k(String str, nq4 nq4Var) {
        plj pljVar;
        klj kljVar;
        Object objA;
        klj kljVar2;
        vkj vkjVar;
        String str2;
        String str3;
        es8 ngbVar;
        p41 p41Var;
        vkj vkjVar2;
        klj kljVar3;
        lq4 lq4Var;
        vkj vkjVar3;
        klj kljVar4;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof plj) {
            pljVar = (plj) nq4Var;
            int i = pljVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                pljVar.i = i - Integer.MIN_VALUE;
            } else {
                pljVar = new plj(this, nq4Var);
            }
        } else {
            pljVar = new plj(this, nq4Var);
        }
        plj pljVar2 = pljVar;
        Object objC = pljVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = pljVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                kljVar = pljVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    ngbVar = pljVar2.f;
                    vkjVar = pljVar2.e;
                    kljVar2 = pljVar2.d;
                    ch3.d0(objC);
                    es8 es8Var = ngbVar;
                    vkjVar2 = vkjVar;
                    kljVar3 = kljVar2;
                    lq4Var = null;
                    q40 q40Var = new q40(this, vkjVar2, kljVar3, lq4Var, 7);
                    pljVar2.d = kljVar3;
                    pljVar2.e = vkjVar2;
                    pljVar2.f = null;
                    pljVar2.i = 3;
                    objC = es8Var.c(q40Var, pljVar2);
                    if (objC != hu4Var) {
                        vkjVar3 = vkjVar2;
                        kljVar4 = kljVar3;
                        r4 = lq4Var;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(objC);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vkj vkjVar4 = pljVar2.e;
                klj kljVar5 = pljVar2.d;
                ch3.d0(objC);
                vkjVar3 = vkjVar4;
                kljVar4 = kljVar5;
                r4 = 0;
            }
            es8 es8Var2 = (es8) objC;
            poi poiVar = new poi(this, kljVar4, vkjVar3, r4, 10);
            pljVar2.d = r4;
            pljVar2.e = r4;
            pljVar2.f = r4;
            pljVar2.i = 4;
            return es8Var2.d(poiVar, pljVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        klj kljVar6 = klj.EMULATE_NFC_TAG;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(vkj.Companion.serializer(), str);
            kljVar2 = kljVar6;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + kljVar6, webAppJsonException);
                }
            }
            pljVar2.d = kljVar6;
            pljVar2.e = null;
            pljVar2.f = null;
            pljVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, kljVar6, null, pljVar2) != hu4Var) {
                kljVar = kljVar6;
                kljVar2 = kljVar;
                objA = null;
            }
        }
        vkjVar = (vkj) objA;
        if (vkjVar != null) {
            str2 = vkjVar.c;
            str3 = vkjVar.a;
            if (str2 == null) {
                ngbVar = new ogb(str3);
            } else {
                ngbVar = new ngb(str3, str2);
            }
            p41Var = this.e;
            pljVar2.d = kljVar2;
            pljVar2.e = vkjVar;
            pljVar2.f = ngbVar;
            pljVar2.i = 2;
            if (p41Var.a(pljVar2, ngbVar) != hu4Var) {
                es8 es8Var3 = ngbVar;
                vkjVar2 = vkjVar;
                kljVar3 = kljVar2;
                lq4Var = null;
                q40 q40Var2 = new q40(this, vkjVar2, kljVar3, lq4Var, 7);
                pljVar2.d = kljVar3;
                pljVar2.e = vkjVar2;
                pljVar2.f = null;
                pljVar2.i = 3;
                objC = es8Var3.c(q40Var2, pljVar2);
                if (objC != hu4Var) {
                    vkjVar3 = vkjVar2;
                    kljVar4 = kljVar3;
                    r4 = lq4Var;
                    es8 es8Var4 = (es8) objC;
                    poi poiVar2 = new poi(this, kljVar4, vkjVar3, r4, 10);
                    pljVar2.d = r4;
                    pljVar2.e = r4;
                    pljVar2.f = r4;
                    pljVar2.i = 4;
                    if (es8Var4.d(poiVar2, pljVar2) == hu4Var) {
                    }
                }
            }
        }
        kljVar2 = kljVar;
        objA = null;
        vkjVar = (vkj) objA;
        if (vkjVar != null) {
            str2 = vkjVar.c;
            str3 = vkjVar.a;
            if (str2 == null) {
                ngbVar = new ogb(str3);
            } else {
                ngbVar = new ngb(str3, str2);
            }
            p41Var = this.e;
            pljVar2.d = kljVar2;
            pljVar2.e = vkjVar;
            pljVar2.f = ngbVar;
            pljVar2.i = 2;
            if (p41Var.a(pljVar2, ngbVar) != hu4Var) {
                es8 es8Var5 = ngbVar;
                vkjVar2 = vkjVar;
                kljVar3 = kljVar2;
                lq4Var = null;
                q40 q40Var3 = new q40(this, vkjVar2, kljVar3, lq4Var, 7);
                pljVar2.d = kljVar3;
                pljVar2.e = vkjVar2;
                pljVar2.f = null;
                pljVar2.i = 3;
                objC = es8Var5.c(q40Var3, pljVar2);
                if (objC != hu4Var) {
                    vkjVar3 = vkjVar2;
                    kljVar4 = kljVar3;
                    r4 = lq4Var;
                    es8 es8Var6 = (es8) objC;
                    poi poiVar3 = new poi(this, kljVar4, vkjVar3, r4, 10);
                    pljVar2.d = r4;
                    pljVar2.e = r4;
                    pljVar2.f = r4;
                    pljVar2.i = 4;
                    if (es8Var6.d(poiVar3, pljVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
