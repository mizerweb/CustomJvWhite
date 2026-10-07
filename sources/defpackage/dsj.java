package defpackage;

import java.util.ArrayList;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class dsj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final Set c;
    public final p41 d;

    public dsj(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        ma6 ma6Var = rsi.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            ((rsi) y1Var.next()).getClass();
            arrayList.add("WebAppVerifyMobileId");
        }
        this.c = ww3.X1(arrayList);
        this.d = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final boolean a(String str) {
        if (str.equals("WebAppVerifyMobileId")) {
            return true;
        }
        gm0.Y(dsj.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this);
        return false;
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objF;
        boolean zContains = this.c.contains(str);
        sbi sbiVar = sbi.a;
        if (zContains) {
            return (str.equals("WebAppVerifyMobileId") && (objF = f(str2, (nq4) lq4Var)) == hu4.a) ? objF : sbiVar;
        }
        gm0.Y(dsj.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this);
        return sbiVar;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.d;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[PHI: r1 r3 r4
  0x0051: PHI (r1v10 bsj) = (r1v8 bsj), (r1v19 bsj) binds: [B:42:0x00f0, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r3v3 gsj) = (r3v2 gsj), (r3v7 gsj) binds: [B:42:0x00f0, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r4v6 rsi) = (r4v4 rsi), (r4v9 rsi) binds: [B:42:0x00f0, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b A[PHI: r0 r1 r4
  0x010b: PHI (r0v19 java.lang.Object) = (r0v18 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x0108, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r1v12 gsj) = (r1v11 gsj), (r1v20 gsj) binds: [B:45:0x0108, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x010b: PHI (r4v8 ??) = (r4v11 ??), (r4v10 ??) binds: [B:45:0x0108, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [bsj, gsj, lq4, rsi] */
    public final Object f(String str, nq4 nq4Var) {
        csj csjVar;
        rsi rsiVar;
        Object objA;
        rsi rsiVar2;
        gsj gsjVar;
        bsj bsjVar;
        p41 p41Var;
        gsj gsjVar2;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof csj) {
            csjVar = (csj) nq4Var;
            int i = csjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                csjVar.i = i - Integer.MIN_VALUE;
            } else {
                csjVar = new csj(this, nq4Var);
            }
        } else {
            csjVar = new csj(this, nq4Var);
        }
        csj csjVar2 = csjVar;
        Object objC = csjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = csjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                rsiVar = csjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    bsjVar = csjVar2.f;
                    gsjVar = csjVar2.e;
                    rsiVar2 = csjVar2.d;
                    ch3.d0(objC);
                    bsj bsjVar2 = bsjVar;
                    gsjVar2 = gsjVar;
                    rsi rsiVar3 = rsiVar2;
                    lq4 lq4Var = null;
                    poi poiVar = new poi(gsjVar2, this, rsiVar3, lq4Var, 16);
                    csjVar2.d = null;
                    csjVar2.e = gsjVar2;
                    csjVar2.f = null;
                    csjVar2.i = 3;
                    objC = bsjVar2.c(poiVar, csjVar2);
                    r4 = lq4Var;
                    if (objC != hu4Var) {
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
                gsjVar2 = csjVar2.e;
                ch3.d0(objC);
                r4 = 0;
            }
            rjj rjjVar = new rjj(this, gsjVar2, r4, 9);
            csjVar2.d = r4;
            csjVar2.e = r4;
            csjVar2.f = r4;
            csjVar2.i = 4;
            return ((es8) objC).d(rjjVar, csjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        rsi rsiVar4 = rsi.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.b.getValue();
        p41 p41Var2 = this.d;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(gsj.Companion.serializer(), str);
            rsiVar2 = rsiVar4;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + rsiVar4, webAppJsonException);
                }
            }
            csjVar2.d = rsiVar4;
            csjVar2.e = null;
            csjVar2.f = null;
            csjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, rsiVar4, null, csjVar2) != hu4Var) {
                rsiVar = rsiVar4;
                rsiVar2 = rsiVar;
                objA = null;
            }
        }
        gsjVar = (gsj) objA;
        if (gsjVar != null) {
            bsjVar = new bsj(gsjVar.b);
            p41Var = this.d;
            csjVar2.d = rsiVar2;
            csjVar2.e = gsjVar;
            csjVar2.f = bsjVar;
            csjVar2.i = 2;
            if (p41Var.a(csjVar2, bsjVar) != hu4Var) {
                bsj bsjVar3 = bsjVar;
                gsjVar2 = gsjVar;
                rsi rsiVar5 = rsiVar2;
                lq4 lq4Var2 = null;
                poi poiVar2 = new poi(gsjVar2, this, rsiVar5, lq4Var2, 16);
                csjVar2.d = null;
                csjVar2.e = gsjVar2;
                csjVar2.f = null;
                csjVar2.i = 3;
                objC = bsjVar3.c(poiVar2, csjVar2);
                r4 = lq4Var2;
                if (objC != hu4Var) {
                    rjj rjjVar2 = new rjj(this, gsjVar2, r4, 9);
                    csjVar2.d = r4;
                    csjVar2.e = r4;
                    csjVar2.f = r4;
                    csjVar2.i = 4;
                    if (((es8) objC).d(rjjVar2, csjVar2) == hu4Var) {
                    }
                }
            }
        }
        rsiVar2 = rsiVar;
        objA = null;
        gsjVar = (gsj) objA;
        if (gsjVar != null) {
            bsjVar = new bsj(gsjVar.b);
            p41Var = this.d;
            csjVar2.d = rsiVar2;
            csjVar2.e = gsjVar;
            csjVar2.f = bsjVar;
            csjVar2.i = 2;
            if (p41Var.a(csjVar2, bsjVar) != hu4Var) {
                bsj bsjVar4 = bsjVar;
                gsjVar2 = gsjVar;
                rsi rsiVar6 = rsiVar2;
                lq4 lq4Var3 = null;
                poi poiVar3 = new poi(gsjVar2, this, rsiVar6, lq4Var3, 16);
                csjVar2.d = null;
                csjVar2.e = gsjVar2;
                csjVar2.f = null;
                csjVar2.i = 3;
                objC = bsjVar4.c(poiVar3, csjVar2);
                r4 = lq4Var3;
                if (objC != hu4Var) {
                    rjj rjjVar3 = new rjj(this, gsjVar2, r4, 9);
                    csjVar2.d = r4;
                    csjVar2.e = r4;
                    csjVar2.f = r4;
                    csjVar2.i = 4;
                    if (((es8) objC).d(rjjVar3, csjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
