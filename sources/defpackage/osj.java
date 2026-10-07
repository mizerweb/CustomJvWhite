package defpackage;

import java.util.ArrayList;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class osj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final Set c;
    public final p41 d;

    public osj(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        ma6 ma6Var = msj.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            ((msj) y1Var.next()).getClass();
            arrayList.add("WebAppGetViewportSize");
        }
        this.c = ww3.X1(arrayList);
        this.d = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objF;
        sbi sbiVar = sbi.a;
        if (!this.c.contains(str)) {
            String name = osj.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Unknown method with name = " + str + " in JsDelegate: " + this, null);
                    return sbiVar;
                }
            }
        } else if (str.equals("WebAppGetViewportSize") && (objF = f(str2, (nq4) lq4Var)) == hu4.a) {
            return objF;
        }
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

    /* JADX WARN: Code duplicated, block: B:21:0x004f A[PHI: r1 r3 r4
  0x004f: PHI (r1v10 lm7) = (r1v8 lm7), (r1v19 lm7) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r3v3 pij) = (r3v2 pij), (r3v6 pij) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r4v6 msj) = (r4v4 msj), (r4v9 msj) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107 A[PHI: r0 r4
  0x0107: PHI (r0v18 java.lang.Object) = (r0v17 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x0104, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x0107: PHI (r4v8 ??) = (r4v11 ??), (r4v10 ??) binds: [B:45:0x0104, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [lm7, lq4, msj, pij] */
    public final Object f(String str, nq4 nq4Var) {
        nsj nsjVar;
        msj msjVar;
        Object objA;
        msj msjVar2;
        pij pijVar;
        lm7 lm7Var;
        p41 p41Var;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof nsj) {
            nsjVar = (nsj) nq4Var;
            int i = nsjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsjVar.i = i - Integer.MIN_VALUE;
            } else {
                nsjVar = new nsj(this, nq4Var);
            }
        } else {
            nsjVar = new nsj(this, nq4Var);
        }
        nsj nsjVar2 = nsjVar;
        Object objC = nsjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = nsjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                msjVar = nsjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    lm7Var = nsjVar2.f;
                    pijVar = nsjVar2.e;
                    msjVar2 = nsjVar2.d;
                    ch3.d0(objC);
                    lm7 lm7Var2 = lm7Var;
                    pij pijVar2 = pijVar;
                    msj msjVar3 = msjVar2;
                    lq4 lq4Var = null;
                    poi poiVar = new poi(pijVar2, this, msjVar3, lq4Var, 17);
                    nsjVar2.d = null;
                    nsjVar2.e = null;
                    nsjVar2.f = null;
                    nsjVar2.i = 3;
                    objC = lm7Var2.c(poiVar, nsjVar2);
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
                ch3.d0(objC);
                r4 = 0;
            }
            fij fijVar = new fij(this, (lq4) r4, 4);
            nsjVar2.d = r4;
            nsjVar2.e = r4;
            nsjVar2.f = r4;
            nsjVar2.i = 4;
            return ((es8) objC).d(fijVar, nsjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        msj msjVar4 = msj.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.b.getValue();
        p41 p41Var2 = this.d;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(pij.Companion.serializer(), str);
            msjVar2 = msjVar4;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + msjVar4, webAppJsonException);
                }
            }
            nsjVar2.d = msjVar4;
            nsjVar2.e = null;
            nsjVar2.f = null;
            nsjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, msjVar4, null, nsjVar2) != hu4Var) {
                msjVar = msjVar4;
                msjVar2 = msjVar;
                objA = null;
            }
        }
        pijVar = (pij) objA;
        if (pijVar != null) {
            lm7Var = new lm7();
            p41Var = this.d;
            nsjVar2.d = msjVar2;
            nsjVar2.e = pijVar;
            nsjVar2.f = lm7Var;
            nsjVar2.i = 2;
            if (p41Var.a(nsjVar2, lm7Var) != hu4Var) {
                lm7 lm7Var3 = lm7Var;
                pij pijVar3 = pijVar;
                msj msjVar5 = msjVar2;
                lq4 lq4Var2 = null;
                poi poiVar2 = new poi(pijVar3, this, msjVar5, lq4Var2, 17);
                nsjVar2.d = null;
                nsjVar2.e = null;
                nsjVar2.f = null;
                nsjVar2.i = 3;
                objC = lm7Var3.c(poiVar2, nsjVar2);
                r4 = lq4Var2;
                if (objC != hu4Var) {
                    fij fijVar2 = new fij(this, (lq4) r4, 4);
                    nsjVar2.d = r4;
                    nsjVar2.e = r4;
                    nsjVar2.f = r4;
                    nsjVar2.i = 4;
                    if (((es8) objC).d(fijVar2, nsjVar2) == hu4Var) {
                    }
                }
            }
        }
        msjVar2 = msjVar;
        objA = null;
        pijVar = (pij) objA;
        if (pijVar != null) {
            lm7Var = new lm7();
            p41Var = this.d;
            nsjVar2.d = msjVar2;
            nsjVar2.e = pijVar;
            nsjVar2.f = lm7Var;
            nsjVar2.i = 2;
            if (p41Var.a(nsjVar2, lm7Var) != hu4Var) {
                lm7 lm7Var4 = lm7Var;
                pij pijVar4 = pijVar;
                msj msjVar6 = msjVar2;
                lq4 lq4Var3 = null;
                poi poiVar3 = new poi(pijVar4, this, msjVar6, lq4Var3, 17);
                nsjVar2.d = null;
                nsjVar2.e = null;
                nsjVar2.f = null;
                nsjVar2.i = 3;
                objC = lm7Var4.c(poiVar3, nsjVar2);
                r4 = lq4Var3;
                if (objC != hu4Var) {
                    fij fijVar3 = new fij(this, (lq4) r4, 4);
                    nsjVar2.d = r4;
                    nsjVar2.e = r4;
                    nsjVar2.f = r4;
                    nsjVar2.i = 4;
                    if (((es8) objC).d(fijVar3, nsjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
