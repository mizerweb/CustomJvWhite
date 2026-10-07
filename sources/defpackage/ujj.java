package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class ujj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final Set c;
    public final p41 d;

    public ujj(qs8 qs8Var, ny8 ny8Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        ma6 ma6Var = pjj.h;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((pjj) y1Var.next()).a);
        }
        this.c = ww3.X1(arrayList);
        this.d = yab.b(0, 0, null, 7);
    }

    public static ms8 f(Throwable th) {
        ajj ajjVar = th instanceof ajj ? (ajj) th : null;
        return ajjVar == null ? ls8.d : new ks8(new ns8(ajjVar.a, ajjVar.b));
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        Iterator it = pjj.h.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((pjj) next).a.equals(str));
        pjj pjjVar = (pjj) next;
        if (pjjVar == null) {
            String name = ujj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else {
            int iOrdinal = pjjVar.ordinal();
            if (iOrdinal == 0) {
                Object objH = h(str2, (nq4) lq4Var);
                if (objH == hu4Var) {
                    return objH;
                }
            } else if (iOrdinal == 1) {
                Object objI = i(str2, (nq4) lq4Var);
                if (objI == hu4Var) {
                    return objI;
                }
            } else {
                if (iOrdinal != 2) {
                    ore.o();
                    return null;
                }
                Object objJ = j(str2, (nq4) lq4Var);
                if (objJ == hu4Var) {
                    return objJ;
                }
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

    public final l44 g() {
        return (l44) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[PHI: r2 r3
  0x00e3: PHI (r2v10 tij) = (r2v8 tij), (r2v18 tij) binds: [B:41:0x00e0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r3v6 pjj) = (r3v4 pjj), (r3v9 pjj) binds: [B:41:0x00e0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v4, types: [lq4, pjj, tij] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object h(String str, nq4 nq4Var) {
        qjj qjjVar;
        pjj pjjVar;
        Object objA;
        pjj pjjVar2;
        djj djjVar;
        tij tijVar;
        p41 p41Var;
        lq4 lq4Var;
        tij tijVar2;
        pjj pjjVar3;
        tij tijVar3;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof qjj) {
            qjjVar = (qjj) nq4Var;
            int i = qjjVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qjjVar.h = i - Integer.MIN_VALUE;
            } else {
                qjjVar = new qjj(this, nq4Var);
            }
        } else {
            qjjVar = new qjj(this, nq4Var);
        }
        qjj qjjVar2 = qjjVar;
        Object objC = qjjVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = qjjVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                pjjVar = qjjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    tijVar = qjjVar2.e;
                    pjjVar2 = qjjVar2.d;
                    ch3.d0(objC);
                    lq4Var = null;
                    tijVar2 = tijVar;
                    rjj rjjVar = new rjj(tijVar2, this, pjjVar2, lq4Var, 0);
                    qjjVar2.d = pjjVar2;
                    qjjVar2.e = tijVar2;
                    qjjVar2.h = 3;
                    objC = tijVar2.c(rjjVar, qjjVar2);
                    if (objC != hu4Var) {
                        pjjVar3 = pjjVar2;
                        tijVar3 = tijVar2;
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
                tij tijVar4 = qjjVar2.e;
                pjj pjjVar4 = qjjVar2.d;
                ch3.d0(objC);
                tijVar3 = tijVar4;
                pjjVar3 = pjjVar4;
                r4 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, pjjVar3, tijVar3, r4, 6);
            qjjVar2.d = r4;
            qjjVar2.e = r4;
            qjjVar2.h = 4;
            return es8Var.d(poiVar, qjjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        pjj pjjVar5 = pjj.HAPTIC_FEEDBACK_IMPACT;
        qs8 qs8Var = this.a;
        l44 l44VarG = g();
        p41 p41Var2 = this.d;
        ms8 ms8VarF = f(xij.c);
        try {
            qs8Var.getClass();
            objA = qs8Var.a(djj.Companion.serializer(), str);
            pjjVar2 = pjjVar5;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + pjjVar5, webAppJsonException);
                }
            }
            qjjVar2.d = pjjVar5;
            qjjVar2.e = null;
            qjjVar2.h = 1;
            if (l44VarG.a(p41Var2, ms8VarF, pjjVar5, null, qjjVar2) != hu4Var) {
                pjjVar = pjjVar5;
                pjjVar2 = pjjVar;
                objA = null;
            }
        }
        djjVar = (djj) objA;
        if (djjVar != null) {
            tijVar = new tij(djjVar.a, djjVar.b, djjVar.c);
            p41Var = this.d;
            qjjVar2.d = pjjVar2;
            qjjVar2.e = tijVar;
            qjjVar2.h = 2;
            if (p41Var.a(qjjVar2, tijVar) != hu4Var) {
                lq4Var = null;
                tijVar2 = tijVar;
                rjj rjjVar2 = new rjj(tijVar2, this, pjjVar2, lq4Var, 0);
                qjjVar2.d = pjjVar2;
                qjjVar2.e = tijVar2;
                qjjVar2.h = 3;
                objC = tijVar2.c(rjjVar2, qjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    tijVar3 = tijVar2;
                    r4 = lq4Var;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, pjjVar3, tijVar3, r4, 6);
                    qjjVar2.d = r4;
                    qjjVar2.e = r4;
                    qjjVar2.h = 4;
                    if (es8Var2.d(poiVar2, qjjVar2) == hu4Var) {
                    }
                }
            }
        }
        pjjVar2 = pjjVar;
        objA = null;
        djjVar = (djj) objA;
        if (djjVar != null) {
            tijVar = new tij(djjVar.a, djjVar.b, djjVar.c);
            p41Var = this.d;
            qjjVar2.d = pjjVar2;
            qjjVar2.e = tijVar;
            qjjVar2.h = 2;
            if (p41Var.a(qjjVar2, tijVar) != hu4Var) {
                lq4Var = null;
                tijVar2 = tijVar;
                rjj rjjVar3 = new rjj(tijVar2, this, pjjVar2, lq4Var, 0);
                qjjVar2.d = pjjVar2;
                qjjVar2.e = tijVar2;
                qjjVar2.h = 3;
                objC = tijVar2.c(rjjVar3, qjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    tijVar3 = tijVar2;
                    r4 = lq4Var;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, pjjVar3, tijVar3, r4, 6);
                    qjjVar2.d = r4;
                    qjjVar2.e = r4;
                    qjjVar2.h = 4;
                    if (es8Var3.d(poiVar3, qjjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3 A[PHI: r2 r3
  0x00e3: PHI (r2v10 uij) = (r2v8 uij), (r2v18 uij) binds: [B:41:0x00e0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00e3: PHI (r3v6 pjj) = (r3v4 pjj), (r3v9 pjj) binds: [B:41:0x00e0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v4, types: [lq4, pjj, uij] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object i(String str, nq4 nq4Var) {
        sjj sjjVar;
        pjj pjjVar;
        Object objA;
        pjj pjjVar2;
        gjj gjjVar;
        uij uijVar;
        p41 p41Var;
        lq4 lq4Var;
        uij uijVar2;
        pjj pjjVar3;
        uij uijVar3;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof sjj) {
            sjjVar = (sjj) nq4Var;
            int i = sjjVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                sjjVar.h = i - Integer.MIN_VALUE;
            } else {
                sjjVar = new sjj(this, nq4Var);
            }
        } else {
            sjjVar = new sjj(this, nq4Var);
        }
        sjj sjjVar2 = sjjVar;
        Object objC = sjjVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = sjjVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                pjjVar = sjjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    uijVar = sjjVar2.e;
                    pjjVar2 = sjjVar2.d;
                    ch3.d0(objC);
                    lq4Var = null;
                    uijVar2 = uijVar;
                    rjj rjjVar = new rjj(uijVar2, this, pjjVar2, lq4Var, 1);
                    sjjVar2.d = pjjVar2;
                    sjjVar2.e = uijVar2;
                    sjjVar2.h = 3;
                    objC = uijVar2.c(rjjVar, sjjVar2);
                    if (objC != hu4Var) {
                        pjjVar3 = pjjVar2;
                        uijVar3 = uijVar2;
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
                uij uijVar4 = sjjVar2.e;
                pjj pjjVar4 = sjjVar2.d;
                ch3.d0(objC);
                uijVar3 = uijVar4;
                pjjVar3 = pjjVar4;
                r4 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, pjjVar3, uijVar3, r4, 7);
            sjjVar2.d = r4;
            sjjVar2.e = r4;
            sjjVar2.h = 4;
            return es8Var.d(poiVar, sjjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        pjj pjjVar5 = pjj.HAPTIC_FEEDBACK_NOTIFICATION;
        qs8 qs8Var = this.a;
        l44 l44VarG = g();
        p41 p41Var2 = this.d;
        ms8 ms8VarF = f(yij.c);
        try {
            qs8Var.getClass();
            objA = qs8Var.a(gjj.Companion.serializer(), str);
            pjjVar2 = pjjVar5;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + pjjVar5, webAppJsonException);
                }
            }
            sjjVar2.d = pjjVar5;
            sjjVar2.e = null;
            sjjVar2.h = 1;
            if (l44VarG.a(p41Var2, ms8VarF, pjjVar5, null, sjjVar2) != hu4Var) {
                pjjVar = pjjVar5;
                pjjVar2 = pjjVar;
                objA = null;
            }
        }
        gjjVar = (gjj) objA;
        if (gjjVar != null) {
            uijVar = new uij(gjjVar.a, gjjVar.b, gjjVar.c);
            p41Var = this.d;
            sjjVar2.d = pjjVar2;
            sjjVar2.e = uijVar;
            sjjVar2.h = 2;
            if (p41Var.a(sjjVar2, uijVar) != hu4Var) {
                lq4Var = null;
                uijVar2 = uijVar;
                rjj rjjVar2 = new rjj(uijVar2, this, pjjVar2, lq4Var, 1);
                sjjVar2.d = pjjVar2;
                sjjVar2.e = uijVar2;
                sjjVar2.h = 3;
                objC = uijVar2.c(rjjVar2, sjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    uijVar3 = uijVar2;
                    r4 = lq4Var;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, pjjVar3, uijVar3, r4, 7);
                    sjjVar2.d = r4;
                    sjjVar2.e = r4;
                    sjjVar2.h = 4;
                    if (es8Var2.d(poiVar2, sjjVar2) == hu4Var) {
                    }
                }
            }
        }
        pjjVar2 = pjjVar;
        objA = null;
        gjjVar = (gjj) objA;
        if (gjjVar != null) {
            uijVar = new uij(gjjVar.a, gjjVar.b, gjjVar.c);
            p41Var = this.d;
            sjjVar2.d = pjjVar2;
            sjjVar2.e = uijVar;
            sjjVar2.h = 2;
            if (p41Var.a(sjjVar2, uijVar) != hu4Var) {
                lq4Var = null;
                uijVar2 = uijVar;
                rjj rjjVar3 = new rjj(uijVar2, this, pjjVar2, lq4Var, 1);
                sjjVar2.d = pjjVar2;
                sjjVar2.e = uijVar2;
                sjjVar2.h = 3;
                objC = uijVar2.c(rjjVar3, sjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    uijVar3 = uijVar2;
                    r4 = lq4Var;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, pjjVar3, uijVar3, r4, 7);
                    sjjVar2.d = r4;
                    sjjVar2.e = r4;
                    sjjVar2.h = 4;
                    if (es8Var3.d(poiVar3, sjjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7 A[PHI: r2 r3
  0x00e7: PHI (r2v10 vij) = (r2v8 vij), (r2v18 vij) binds: [B:41:0x00e4, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x00e7: PHI (r3v4 pjj) = (r3v2 pjj), (r3v7 pjj) binds: [B:41:0x00e4, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v6, types: [lq4, pjj, vij] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final Object j(String str, nq4 nq4Var) {
        tjj tjjVar;
        pjj pjjVar;
        Object objA;
        pjj pjjVar2;
        mjj mjjVar;
        vij vijVar;
        p41 p41Var;
        lq4 lq4Var;
        vij vijVar2;
        pjj pjjVar3;
        vij vijVar3;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof tjj) {
            tjjVar = (tjj) nq4Var;
            int i = tjjVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tjjVar.h = i - Integer.MIN_VALUE;
            } else {
                tjjVar = new tjj(this, nq4Var);
            }
        } else {
            tjjVar = new tjj(this, nq4Var);
        }
        tjj tjjVar2 = tjjVar;
        Object objC = tjjVar2.f;
        hu4 hu4Var = hu4.a;
        int i2 = tjjVar2.h;
        if (i2 != 0) {
            if (i2 == 1) {
                pjjVar = tjjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    vijVar = tjjVar2.e;
                    pjjVar2 = tjjVar2.d;
                    ch3.d0(objC);
                    lq4Var = null;
                    vijVar2 = vijVar;
                    rjj rjjVar = new rjj(vijVar2, this, pjjVar2, lq4Var, 2);
                    tjjVar2.d = pjjVar2;
                    tjjVar2.e = vijVar2;
                    tjjVar2.h = 3;
                    objC = vijVar2.c(rjjVar, tjjVar2);
                    if (objC != hu4Var) {
                        pjjVar3 = pjjVar2;
                        vijVar3 = vijVar2;
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
                vij vijVar4 = tjjVar2.e;
                pjj pjjVar4 = tjjVar2.d;
                ch3.d0(objC);
                vijVar3 = vijVar4;
                pjjVar3 = pjjVar4;
                r4 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, pjjVar3, vijVar3, r4, 8);
            tjjVar2.d = r4;
            tjjVar2.e = r4;
            tjjVar2.h = 4;
            return es8Var.d(poiVar, tjjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        pjj pjjVar5 = pjj.HAPTIC_FEEDBACK_SELECTION_CHANGE;
        qs8 qs8Var = this.a;
        l44 l44VarG = g();
        p41 p41Var2 = this.d;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(mjj.Companion.serializer(), str);
            pjjVar2 = pjjVar5;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + pjjVar5, webAppJsonException);
                }
            }
            tjjVar2.d = pjjVar5;
            tjjVar2.e = null;
            tjjVar2.h = 1;
            if (l44VarG.a(p41Var2, ks8Var, pjjVar5, null, tjjVar2) != hu4Var) {
                pjjVar = pjjVar5;
                pjjVar2 = pjjVar;
                objA = null;
            }
        }
        mjjVar = (mjj) objA;
        if (mjjVar != null) {
            vijVar = new vij(mjjVar.a, mjjVar.b);
            p41Var = this.d;
            tjjVar2.d = pjjVar2;
            tjjVar2.e = vijVar;
            tjjVar2.h = 2;
            if (p41Var.a(tjjVar2, vijVar) != hu4Var) {
                lq4Var = null;
                vijVar2 = vijVar;
                rjj rjjVar2 = new rjj(vijVar2, this, pjjVar2, lq4Var, 2);
                tjjVar2.d = pjjVar2;
                tjjVar2.e = vijVar2;
                tjjVar2.h = 3;
                objC = vijVar2.c(rjjVar2, tjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    vijVar3 = vijVar2;
                    r4 = lq4Var;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, pjjVar3, vijVar3, r4, 8);
                    tjjVar2.d = r4;
                    tjjVar2.e = r4;
                    tjjVar2.h = 4;
                    if (es8Var2.d(poiVar2, tjjVar2) == hu4Var) {
                    }
                }
            }
        }
        pjjVar2 = pjjVar;
        objA = null;
        mjjVar = (mjj) objA;
        if (mjjVar != null) {
            vijVar = new vij(mjjVar.a, mjjVar.b);
            p41Var = this.d;
            tjjVar2.d = pjjVar2;
            tjjVar2.e = vijVar;
            tjjVar2.h = 2;
            if (p41Var.a(tjjVar2, vijVar) != hu4Var) {
                lq4Var = null;
                vijVar2 = vijVar;
                rjj rjjVar3 = new rjj(vijVar2, this, pjjVar2, lq4Var, 2);
                tjjVar2.d = pjjVar2;
                tjjVar2.e = vijVar2;
                tjjVar2.h = 3;
                objC = vijVar2.c(rjjVar3, tjjVar2);
                if (objC != hu4Var) {
                    pjjVar3 = pjjVar2;
                    vijVar3 = vijVar2;
                    r4 = lq4Var;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, pjjVar3, vijVar3, r4, 8);
                    tjjVar2.d = r4;
                    tjjVar2.e = r4;
                    tjjVar2.h = 4;
                    if (es8Var3.d(poiVar3, tjjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
