package defpackage;

import java.util.ArrayList;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class nmj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final Set d;
    public final p41 e;
    public jdj f;

    public nmj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        ma6 ma6Var = lmj.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            ((lmj) y1Var.next()).getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = ww3.X1(arrayList);
        this.e = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        ((l44) this.c.getValue()).c = jdjVar;
        this.f = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objF;
        sbi sbiVar = sbi.a;
        if (!this.d.contains(str)) {
            String name = nmj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else if (str.equals("WebAppRequestPhone") && (objF = f(str2, (nq4) lq4Var)) == hu4.a) {
            return objF;
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

    /* JADX WARN: Code duplicated, block: B:21:0x0051 A[PHI: r1 r3 r4
  0x0051: PHI (r1v10 mme) = (r1v8 mme), (r1v18 mme) binds: [B:42:0x00ee, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r3v3 qmj) = (r3v2 qmj), (r3v7 qmj) binds: [B:42:0x00ee, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]
  0x0051: PHI (r4v6 lmj) = (r4v4 lmj), (r4v9 lmj) binds: [B:42:0x00ee, B:20:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109 A[PHI: r0 r1 r4
  0x0109: PHI (r0v18 java.lang.Object) = (r0v17 java.lang.Object), (r0v1 java.lang.Object) binds: [B:45:0x0106, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r1v12 qmj) = (r1v11 qmj), (r1v19 qmj) binds: [B:45:0x0106, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]
  0x0109: PHI (r4v8 ??) = (r4v11 ??), (r4v10 ??) binds: [B:45:0x0106, B:19:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8, types: [lmj, lq4, mme, qmj] */
    public final Object f(String str, nq4 nq4Var) {
        mmj mmjVar;
        lmj lmjVar;
        Object objA;
        lmj lmjVar2;
        qmj qmjVar;
        mme mmeVar;
        p41 p41Var;
        qmj qmjVar2;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof mmj) {
            mmjVar = (mmj) nq4Var;
            int i = mmjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mmjVar.i = i - Integer.MIN_VALUE;
            } else {
                mmjVar = new mmj(this, nq4Var);
            }
        } else {
            mmjVar = new mmj(this, nq4Var);
        }
        mmj mmjVar2 = mmjVar;
        Object objC = mmjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = mmjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                lmjVar = mmjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    mmeVar = mmjVar2.f;
                    qmjVar = mmjVar2.e;
                    lmjVar2 = mmjVar2.d;
                    ch3.d0(objC);
                    mme mmeVar2 = mmeVar;
                    qmjVar2 = qmjVar;
                    lmj lmjVar3 = lmjVar2;
                    lq4 lq4Var = null;
                    poi poiVar = new poi(qmjVar2, this, lmjVar3, lq4Var, 11);
                    mmjVar2.d = null;
                    mmjVar2.e = qmjVar2;
                    mmjVar2.f = null;
                    mmjVar2.i = 3;
                    objC = mmeVar2.c(poiVar, mmjVar2);
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
                qmjVar2 = mmjVar2.e;
                ch3.d0(objC);
                r4 = 0;
            }
            rjj rjjVar = new rjj(this, qmjVar2, r4, 4);
            mmjVar2.d = r4;
            mmjVar2.e = r4;
            mmjVar2.f = r4;
            mmjVar2.i = 4;
            return ((es8) objC).d(rjjVar, mmjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        lmj lmjVar4 = lmj.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.c.getValue();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(qmj.Companion.serializer(), str);
            lmjVar2 = lmjVar4;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + lmjVar4, webAppJsonException);
                }
            }
            mmjVar2.d = lmjVar4;
            mmjVar2.e = null;
            mmjVar2.f = null;
            mmjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, lmjVar4, null, mmjVar2) != hu4Var) {
                lmjVar = lmjVar4;
                lmjVar2 = lmjVar;
                objA = null;
            }
        }
        qmjVar = (qmj) objA;
        if (qmjVar != null) {
            mmeVar = new mme();
            p41Var = this.e;
            mmjVar2.d = lmjVar2;
            mmjVar2.e = qmjVar;
            mmjVar2.f = mmeVar;
            mmjVar2.i = 2;
            if (p41Var.a(mmjVar2, mmeVar) != hu4Var) {
                mme mmeVar3 = mmeVar;
                qmjVar2 = qmjVar;
                lmj lmjVar5 = lmjVar2;
                lq4 lq4Var2 = null;
                poi poiVar2 = new poi(qmjVar2, this, lmjVar5, lq4Var2, 11);
                mmjVar2.d = null;
                mmjVar2.e = qmjVar2;
                mmjVar2.f = null;
                mmjVar2.i = 3;
                objC = mmeVar3.c(poiVar2, mmjVar2);
                r4 = lq4Var2;
                if (objC != hu4Var) {
                    rjj rjjVar2 = new rjj(this, qmjVar2, r4, 4);
                    mmjVar2.d = r4;
                    mmjVar2.e = r4;
                    mmjVar2.f = r4;
                    mmjVar2.i = 4;
                    if (((es8) objC).d(rjjVar2, mmjVar2) == hu4Var) {
                    }
                }
            }
        }
        lmjVar2 = lmjVar;
        objA = null;
        qmjVar = (qmj) objA;
        if (qmjVar != null) {
            mmeVar = new mme();
            p41Var = this.e;
            mmjVar2.d = lmjVar2;
            mmjVar2.e = qmjVar;
            mmjVar2.f = mmeVar;
            mmjVar2.i = 2;
            if (p41Var.a(mmjVar2, mmeVar) != hu4Var) {
                mme mmeVar4 = mmeVar;
                qmjVar2 = qmjVar;
                lmj lmjVar6 = lmjVar2;
                lq4 lq4Var3 = null;
                poi poiVar3 = new poi(qmjVar2, this, lmjVar6, lq4Var3, 11);
                mmjVar2.d = null;
                mmjVar2.e = qmjVar2;
                mmjVar2.f = null;
                mmjVar2.i = 3;
                objC = mmeVar4.c(poiVar3, mmjVar2);
                r4 = lq4Var3;
                if (objC != hu4Var) {
                    rjj rjjVar3 = new rjj(this, qmjVar2, r4, 4);
                    mmjVar2.d = r4;
                    mmjVar2.e = r4;
                    mmjVar2.f = r4;
                    mmjVar2.i = 4;
                    if (((es8) objC).d(rjjVar3, mmjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
