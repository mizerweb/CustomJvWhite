package defpackage;

import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class gij implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final pw c;
    public final p41 d;

    public gij(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        pw pwVar = new pw(0);
        y1 y1Var = new y1(0, cij.c);
        while (y1Var.hasNext()) {
            ((cij) y1Var.next()).getClass();
            pwVar.add("WebAppGetLaunchContext");
        }
        this.c = pwVar;
        this.d = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        sbi sbiVar = sbi.a;
        Iterator it = cij.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((cij) next).getClass();
        } while (!"WebAppGetLaunchContext".equals(str));
        cij cijVar = (cij) next;
        if (cijVar == null) {
            String name = gij.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Unknown method with name = " + str + " in JsDelegate: " + this, null);
                    return sbiVar;
                }
            }
        } else {
            if (dij.$EnumSwitchMapping$0[cijVar.ordinal()] != 1) {
                ore.o();
                return null;
            }
            Object objF = f(str2, (nq4) lq4Var);
            if (objF == hu4.a) {
                return objF;
            }
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
  0x004f: PHI (r1v10 jl7) = (r1v8 jl7), (r1v19 jl7) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r3v3 jij) = (r3v2 jij), (r3v6 jij) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x004f: PHI (r4v6 cij) = (r4v4 cij), (r4v9 cij) binds: [B:42:0x00ec, B:20:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0106 A[PHI: r0 r4
  0x0106: PHI (r0v18 java.lang.Object) = (r0v17 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x0103, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x0106: PHI (r4v8 ??) = (r4v11 ??), (r4v10 ??) binds: [B:45:0x0103, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [cij, jij, jl7, lq4] */
    public final Object f(String str, nq4 nq4Var) {
        eij eijVar;
        cij cijVar;
        Object objA;
        cij cijVar2;
        jij jijVar;
        jl7 jl7Var;
        p41 p41Var;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof eij) {
            eijVar = (eij) nq4Var;
            int i = eijVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                eijVar.i = i - Integer.MIN_VALUE;
            } else {
                eijVar = new eij(this, nq4Var);
            }
        } else {
            eijVar = new eij(this, nq4Var);
        }
        eij eijVar2 = eijVar;
        Object objC = eijVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = eijVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                cijVar = eijVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    jl7Var = eijVar2.f;
                    jijVar = eijVar2.e;
                    cijVar2 = eijVar2.d;
                    ch3.d0(objC);
                    jl7 jl7Var2 = jl7Var;
                    jij jijVar2 = jijVar;
                    cij cijVar3 = cijVar2;
                    lq4 lq4Var = null;
                    poi poiVar = new poi(jijVar2, this, cijVar3, lq4Var, 5);
                    eijVar2.d = null;
                    eijVar2.e = null;
                    eijVar2.f = null;
                    eijVar2.i = 3;
                    objC = jl7Var2.c(poiVar, eijVar2);
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
            fij fijVar = new fij(this, (lq4) r4, 0);
            eijVar2.d = r4;
            eijVar2.e = r4;
            eijVar2.f = r4;
            eijVar2.i = 4;
            return ((es8) objC).d(fijVar, eijVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        cij cijVar4 = cij.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.b.getValue();
        p41 p41Var2 = this.d;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(jij.Companion.serializer(), str);
            cijVar2 = cijVar4;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + cijVar4, webAppJsonException);
                }
            }
            eijVar2.d = cijVar4;
            eijVar2.e = null;
            eijVar2.f = null;
            eijVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, cijVar4, null, eijVar2) != hu4Var) {
                cijVar = cijVar4;
                cijVar2 = cijVar;
                objA = null;
            }
        }
        jijVar = (jij) objA;
        if (jijVar != null) {
            jl7Var = new jl7();
            p41Var = this.d;
            eijVar2.d = cijVar2;
            eijVar2.e = jijVar;
            eijVar2.f = jl7Var;
            eijVar2.i = 2;
            if (p41Var.a(eijVar2, jl7Var) != hu4Var) {
                jl7 jl7Var3 = jl7Var;
                jij jijVar3 = jijVar;
                cij cijVar5 = cijVar2;
                lq4 lq4Var2 = null;
                poi poiVar2 = new poi(jijVar3, this, cijVar5, lq4Var2, 5);
                eijVar2.d = null;
                eijVar2.e = null;
                eijVar2.f = null;
                eijVar2.i = 3;
                objC = jl7Var3.c(poiVar2, eijVar2);
                r4 = lq4Var2;
                if (objC != hu4Var) {
                    fij fijVar2 = new fij(this, (lq4) r4, 0);
                    eijVar2.d = r4;
                    eijVar2.e = r4;
                    eijVar2.f = r4;
                    eijVar2.i = 4;
                    if (((es8) objC).d(fijVar2, eijVar2) == hu4Var) {
                    }
                }
            }
        }
        cijVar2 = cijVar;
        objA = null;
        jijVar = (jij) objA;
        if (jijVar != null) {
            jl7Var = new jl7();
            p41Var = this.d;
            eijVar2.d = cijVar2;
            eijVar2.e = jijVar;
            eijVar2.f = jl7Var;
            eijVar2.i = 2;
            if (p41Var.a(eijVar2, jl7Var) != hu4Var) {
                jl7 jl7Var4 = jl7Var;
                jij jijVar4 = jijVar;
                cij cijVar6 = cijVar2;
                lq4 lq4Var3 = null;
                poi poiVar3 = new poi(jijVar4, this, cijVar6, lq4Var3, 5);
                eijVar2.d = null;
                eijVar2.e = null;
                eijVar2.f = null;
                eijVar2.i = 3;
                objC = jl7Var4.c(poiVar3, eijVar2);
                r4 = lq4Var3;
                if (objC != hu4Var) {
                    fij fijVar3 = new fij(this, (lq4) r4, 0);
                    eijVar2.d = r4;
                    eijVar2.e = r4;
                    eijVar2.f = r4;
                    eijVar2.i = 4;
                    if (((es8) objC).d(fijVar3, eijVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
