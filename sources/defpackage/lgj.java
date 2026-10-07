package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class lgj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final Set d;
    public final p41 e;
    public jdj f;

    public lgj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        ma6 ma6Var = igj.c;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            ((igj) y1Var.next()).getClass();
            arrayList.add("WebAppChangeScreenBrightness");
        }
        this.d = ww3.X1(arrayList);
        this.e = yab.b(0, 0, null, 7);
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        sbi sbiVar = sbi.a;
        Iterator it = igj.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ((igj) next).getClass();
        } while (!"WebAppChangeScreenBrightness".equals(str));
        igj igjVar = (igj) next;
        if (igjVar == null) {
            String name = lgj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else {
            if (jgj.$EnumSwitchMapping$0[igjVar.ordinal()] != 1) {
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
        return this.e;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[PHI: r1 r2 r4
  0x0046: PHI (r1v10 es8) = (r1v8 es8), (r1v18 es8) binds: [B:45:0x00e9, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r2v3 ogj) = (r2v2 ogj), (r2v5 ogj) binds: [B:45:0x00e9, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r4v6 igj) = (r4v4 igj), (r4v8 igj) binds: [B:45:0x00e9, B:18:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object f(String str, nq4 nq4Var) {
        kgj kgjVar;
        igj igjVar;
        Object objA;
        igj igjVar2;
        ogj ogjVar;
        es8 es8Var;
        es8 es8Var2;
        p41 p41Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof kgj) {
            kgjVar = (kgj) nq4Var;
            int i = kgjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                kgjVar.i = i - Integer.MIN_VALUE;
            } else {
                kgjVar = new kgj(this, nq4Var);
            }
        } else {
            kgjVar = new kgj(this, nq4Var);
        }
        kgj kgjVar2 = kgjVar;
        Object obj = kgjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = kgjVar2.i;
        lq4 lq4Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                igjVar = kgjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                es8Var2 = kgjVar2.f;
                ogjVar = kgjVar2.e;
                igjVar2 = kgjVar2.d;
                ch3.d0(obj);
            }
            es8 es8Var3 = es8Var2;
            ihc ihcVar = new ihc(ogjVar, igjVar2, this, lq4Var, 4);
            kgjVar2.d = null;
            kgjVar2.e = null;
            kgjVar2.f = null;
            kgjVar2.i = 3;
            return es8Var3.c(ihcVar, kgjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        igj igjVar3 = igj.a;
        qs8 qs8Var = this.a;
        l44 l44Var = (l44) this.c.getValue();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(ogj.Companion.serializer(), str);
            igjVar2 = igjVar3;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + igjVar3, webAppJsonException);
                }
            }
            kgjVar2.d = igjVar3;
            kgjVar2.e = null;
            kgjVar2.f = null;
            kgjVar2.i = 1;
            if (l44Var.a(p41Var2, ks8Var, igjVar3, null, kgjVar2) != hu4Var) {
                igjVar = igjVar3;
                igjVar2 = igjVar;
                objA = null;
            }
        }
        ogjVar = (ogj) objA;
        if (ogjVar != null) {
            if (ogjVar.b) {
                es8Var = ggj.c;
            } else {
                es8Var = hgj.c;
            }
            es8Var2 = es8Var;
            p41Var = this.e;
            kgjVar2.d = igjVar2;
            kgjVar2.e = ogjVar;
            kgjVar2.f = es8Var2;
            kgjVar2.i = 2;
            if (p41Var.a(kgjVar2, es8Var2) != hu4Var) {
                es8 es8Var4 = es8Var2;
                ihc ihcVar2 = new ihc(ogjVar, igjVar2, this, lq4Var, 4);
                kgjVar2.d = null;
                kgjVar2.e = null;
                kgjVar2.f = null;
                kgjVar2.i = 3;
                if (es8Var4.c(ihcVar2, kgjVar2) == hu4Var) {
                }
            }
        }
        igjVar2 = igjVar;
        objA = null;
        ogjVar = (ogj) objA;
        if (ogjVar != null) {
            if (ogjVar.b) {
                es8Var = ggj.c;
            } else {
                es8Var = hgj.c;
            }
            es8Var2 = es8Var;
            p41Var = this.e;
            kgjVar2.d = igjVar2;
            kgjVar2.e = ogjVar;
            kgjVar2.f = es8Var2;
            kgjVar2.i = 2;
            if (p41Var.a(kgjVar2, es8Var2) != hu4Var) {
                es8 es8Var5 = es8Var2;
                ihc ihcVar3 = new ihc(ogjVar, igjVar2, this, lq4Var, 4);
                kgjVar2.d = null;
                kgjVar2.e = null;
                kgjVar2.f = null;
                kgjVar2.i = 3;
                if (es8Var5.c(ihcVar3, kgjVar2) == hu4Var) {
                }
            }
        }
    }
}
