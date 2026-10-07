package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class krj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final Set d;
    public final p41 e;
    public jdj f;

    public krj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        ma6 ma6Var = frj.k;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((frj) y1Var.next()).a);
        }
        this.d = ww3.X1(arrayList);
        this.e = yab.b(0, 0, null, 7);
    }

    public static final void f(krj krjVar, String str) {
        jdj jdjVar = krjVar.f;
        if (jdjVar != null) {
            fgj.a((fgj) krjVar.b.getValue(), str, jdjVar.a, jdjVar.b, true, 0, null, null, 240);
        }
    }

    public static ms8 g(Throwable th) {
        yqj yqjVar = th instanceof yqj ? (yqj) th : null;
        if (yqjVar instanceof xqj) {
            return new ks8(new ns8("too_many_keys", ((xqj) yqjVar).a ? 3 : 1));
        }
        if (yqjVar instanceof uqj) {
            return new ks8(new ns8("not_found", ((uqj) yqjVar).a ? 6 : 4));
        }
        if (yqjVar instanceof tqj) {
            return new ks8(new ns8("not_found", 1));
        }
        if (yqjVar == null) {
            return ls8.d;
        }
        if (yqjVar instanceof vqj) {
            return new ks8(new ns8("too_large_key", ((vqj) yqjVar).a ? 5 : 3));
        }
        if (yqjVar instanceof wqj) {
            return new ks8(new ns8("too_large_value", ((wqj) yqjVar).a ? 4 : 2));
        }
        ore.o();
        return null;
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.f = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objI;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (!this.d.contains(str)) {
            String name = krj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else if (str.equals("WebAppSecureStorageSaveKey")) {
            Object objK = k(str2, true, (nq4) lq4Var);
            if (objK == hu4Var) {
                return objK;
            }
        } else if (str.equals("WebAppSecureStorageGetKey")) {
            Object objJ = j(str2, true, (nq4) lq4Var);
            if (objJ == hu4Var) {
                return objJ;
            }
        } else if (str.equals("WebAppSecureStorageClear")) {
            Object objI2 = i(str2, true, (nq4) lq4Var);
            if (objI2 == hu4Var) {
                return objI2;
            }
        } else if (str.equals("WebAppDeviceStorageSaveKey")) {
            Object objK2 = k(str2, false, (nq4) lq4Var);
            if (objK2 == hu4Var) {
                return objK2;
            }
        } else if (str.equals("WebAppDeviceStorageGetKey")) {
            Object objJ2 = j(str2, false, (nq4) lq4Var);
            if (objJ2 == hu4Var) {
                return objJ2;
            }
        } else if (str.equals("WebAppDeviceStorageClear") && (objI = i(str2, false, (nq4) lq4Var)) == hu4Var) {
            return objI;
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
        return (l44) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v7, types: [gqg, lq4] */
    /* JADX WARN: Type inference failed for: r4v8, types: [frj, gqg, lq4, sqj] */
    public final Object i(String str, boolean z, nq4 nq4Var) {
        grj grjVar;
        frj frjVar;
        frj frjVar2;
        Object objA;
        sqj sqjVar;
        gqg gqgVar;
        p41 p41Var;
        sqj sqjVar2;
        boolean z2;
        gqg gqgVar2;
        frj frjVar3;
        ?? r4;
        frj frjVar4;
        sqj sqjVar3;
        ?? r5;
        boolean z3 = z;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof grj) {
            grjVar = (grj) nq4Var;
            int i = grjVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                grjVar.j = i - Integer.MIN_VALUE;
            } else {
                grjVar = new grj(this, nq4Var);
            }
        } else {
            grjVar = new grj(this, nq4Var);
        }
        grj grjVar2 = grjVar;
        Object objC = grjVar2.h;
        hu4 hu4Var = hu4.a;
        int i2 = grjVar2.j;
        Object obj = null;
        if (i2 != 0) {
            if (i2 == 1) {
                z3 = grjVar2.g;
                frjVar = grjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    boolean z4 = grjVar2.g;
                    gqg gqgVar3 = grjVar2.f;
                    sqj sqjVar4 = grjVar2.e;
                    frj frjVar5 = grjVar2.d;
                    ch3.d0(objC);
                    sqjVar2 = sqjVar4;
                    r4 = 0;
                    gqgVar2 = gqgVar3;
                    frjVar3 = frjVar5;
                    z2 = z4;
                    rjj rjjVar = new rjj(sqjVar2, this, frjVar3, r4, 7);
                    grjVar2.d = frjVar3;
                    grjVar2.e = sqjVar2;
                    grjVar2.f = r4;
                    grjVar2.g = z2;
                    grjVar2.j = 3;
                    objC = gqgVar2.c(rjjVar, grjVar2);
                    if (objC != hu4Var) {
                        frjVar4 = frjVar3;
                        sqjVar3 = sqjVar2;
                        r5 = r4;
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
                boolean z5 = grjVar2.g;
                sqjVar3 = grjVar2.e;
                frj frjVar6 = grjVar2.d;
                ch3.d0(objC);
                z2 = z5;
                frjVar4 = frjVar6;
                r5 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, frjVar4, sqjVar3, r5, 14);
            grjVar2.d = r5;
            grjVar2.e = r5;
            grjVar2.f = r5;
            grjVar2.g = z2;
            grjVar2.j = 4;
            return es8Var.d(poiVar, grjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        frj frjVar7 = z3 ? frj.SECURE_CLEAR_KEYS : frj.CLEAR_KEYS;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            obj = null;
            frjVar2 = frjVar7;
            objA = qs8Var.a(sqj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + frjVar7, webAppJsonException);
                }
            }
            grjVar2.d = frjVar7;
            grjVar2.e = null;
            grjVar2.f = null;
            grjVar2.g = z3;
            grjVar2.j = 1;
            if (l44VarH.a(p41Var2, ks8Var, frjVar7, null, grjVar2) != hu4Var) {
                frjVar = frjVar7;
                frjVar2 = frjVar;
                objA = obj;
            }
        }
        sqjVar = (sqj) objA;
        if (sqjVar != null) {
            gqgVar = new gqg(sqjVar.a, z3);
            p41Var = this.e;
            grjVar2.d = frjVar2;
            grjVar2.e = sqjVar;
            grjVar2.f = gqgVar;
            grjVar2.g = z3;
            grjVar2.j = 2;
            if (p41Var.a(grjVar2, gqgVar) != hu4Var) {
                sqjVar2 = sqjVar;
                z2 = z3;
                gqgVar2 = gqgVar;
                frjVar3 = frjVar2;
                r4 = obj;
                rjj rjjVar2 = new rjj(sqjVar2, this, frjVar3, r4, 7);
                grjVar2.d = frjVar3;
                grjVar2.e = sqjVar2;
                grjVar2.f = r4;
                grjVar2.g = z2;
                grjVar2.j = 3;
                objC = gqgVar2.c(rjjVar2, grjVar2);
                if (objC != hu4Var) {
                    frjVar4 = frjVar3;
                    sqjVar3 = sqjVar2;
                    r5 = r4;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, frjVar4, sqjVar3, r5, 14);
                    grjVar2.d = r5;
                    grjVar2.e = r5;
                    grjVar2.f = r5;
                    grjVar2.g = z2;
                    grjVar2.j = 4;
                    if (es8Var2.d(poiVar2, grjVar2) == hu4Var) {
                    }
                }
            }
        }
        frjVar2 = frjVar;
        objA = obj;
        sqjVar = (sqj) objA;
        if (sqjVar != null) {
            gqgVar = new gqg(sqjVar.a, z3);
            p41Var = this.e;
            grjVar2.d = frjVar2;
            grjVar2.e = sqjVar;
            grjVar2.f = gqgVar;
            grjVar2.g = z3;
            grjVar2.j = 2;
            if (p41Var.a(grjVar2, gqgVar) != hu4Var) {
                sqjVar2 = sqjVar;
                z2 = z3;
                gqgVar2 = gqgVar;
                frjVar3 = frjVar2;
                r4 = obj;
                rjj rjjVar3 = new rjj(sqjVar2, this, frjVar3, r4, 7);
                grjVar2.d = frjVar3;
                grjVar2.e = sqjVar2;
                grjVar2.f = r4;
                grjVar2.g = z2;
                grjVar2.j = 3;
                objC = gqgVar2.c(rjjVar3, grjVar2);
                if (objC != hu4Var) {
                    frjVar4 = frjVar3;
                    sqjVar3 = sqjVar2;
                    r5 = r4;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, frjVar4, sqjVar3, r5, 14);
                    grjVar2.d = r5;
                    grjVar2.e = r5;
                    grjVar2.f = r5;
                    grjVar2.g = z2;
                    grjVar2.j = 4;
                    if (es8Var3.d(poiVar3, grjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x0110  */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:57:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object j(String str, boolean z, nq4 nq4Var) {
        hrj hrjVar;
        frj frjVar;
        frj frjVar2;
        Object objA;
        brj brjVar;
        hqg hqgVar;
        p41 p41Var;
        frj frjVar3;
        Object objC;
        brj brjVar2;
        irj irjVar;
        boolean z2 = z;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof hrj) {
            hrjVar = (hrj) nq4Var;
            int i = hrjVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                hrjVar.j = i - Integer.MIN_VALUE;
            } else {
                hrjVar = new hrj(this, nq4Var);
            }
        } else {
            hrjVar = new hrj(this, nq4Var);
        }
        hrj hrjVar2 = hrjVar;
        Object obj = hrjVar2.h;
        hu4 hu4Var = hu4.a;
        int i2 = hrjVar2.j;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = hrjVar2.g;
                frjVar2 = hrjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    z2 = hrjVar2.g;
                    hqgVar = hrjVar2.f;
                    brj brjVar3 = hrjVar2.e;
                    frj frjVar4 = hrjVar2.d;
                    ch3.d0(obj);
                    brjVar = brjVar3;
                    frjVar3 = frjVar4;
                    irj irjVar2 = new irj(brjVar, this, frjVar3, (lq4) null);
                    hrjVar2.d = frjVar3;
                    hrjVar2.e = brjVar;
                    hrjVar2.f = null;
                    hrjVar2.g = z2;
                    hrjVar2.j = 3;
                    objC = hqgVar.c(irjVar2, hrjVar2);
                    if (objC != hu4Var) {
                        brjVar2 = brjVar;
                        obj = objC;
                    }
                    return hu4Var;
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = hrjVar2.g;
                brjVar2 = hrjVar2.e;
                frjVar3 = hrjVar2.d;
                ch3.d0(obj);
            }
            irjVar = new irj(this, frjVar3, brjVar2, (lq4) null);
            hrjVar2.d = null;
            hrjVar2.e = null;
            hrjVar2.f = null;
            hrjVar2.g = z2;
            hrjVar2.j = 4;
            if (((es8) obj).d(irjVar, hrjVar2) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        ch3.d0(obj);
        frjVar = z2 ? frj.SECURE_GET_KEY : frj.GET_KEY;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.e;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(brj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + frjVar, webAppJsonException);
                }
            }
            hrjVar2.d = frjVar;
            hrjVar2.e = null;
            hrjVar2.f = null;
            hrjVar2.g = z2;
            hrjVar2.j = 1;
            if (l44VarH.a(p41Var2, ks8Var, frjVar, null, hrjVar2) != hu4Var) {
                frjVar2 = frjVar;
                frjVar = frjVar2;
                objA = null;
            }
            return hu4Var;
        }
        brjVar = (brj) objA;
        if (brjVar == null) {
            gm0.Y(krj.class.getName(), "processStorageGetKey. Can't parse request");
            return sbiVar;
        }
        hqgVar = new hqg(brjVar.a, brjVar.c, z2);
        p41Var = this.e;
        hrjVar2.d = frjVar;
        hrjVar2.e = brjVar;
        hrjVar2.f = hqgVar;
        hrjVar2.g = z2;
        hrjVar2.j = 2;
        if (p41Var.a(hrjVar2, hqgVar) != hu4Var) {
            frjVar3 = frjVar;
            irj irjVar3 = new irj(brjVar, this, frjVar3, (lq4) null);
            hrjVar2.d = frjVar3;
            hrjVar2.e = brjVar;
            hrjVar2.f = null;
            hrjVar2.g = z2;
            hrjVar2.j = 3;
            objC = hqgVar.c(irjVar3, hrjVar2);
            if (objC != hu4Var) {
                brjVar2 = brjVar;
                obj = objC;
                irjVar = new irj(this, frjVar3, brjVar2, (lq4) null);
                hrjVar2.d = null;
                hrjVar2.e = null;
                hrjVar2.f = null;
                hrjVar2.g = z2;
                hrjVar2.j = 4;
                if (((es8) obj).d(irjVar, hrjVar2) == hu4Var) {
                    return sbiVar;
                }
            }
        }
        return hu4Var;
        frjVar = frjVar2;
        objA = null;
        brjVar = (brj) objA;
        if (brjVar == null) {
            gm0.Y(krj.class.getName(), "processStorageGetKey. Can't parse request");
            return sbiVar;
        }
        hqgVar = new hqg(brjVar.a, brjVar.c, z2);
        p41Var = this.e;
        hrjVar2.d = frjVar;
        hrjVar2.e = brjVar;
        hrjVar2.f = hqgVar;
        hrjVar2.g = z2;
        hrjVar2.j = 2;
        if (p41Var.a(hrjVar2, hqgVar) != hu4Var) {
            frjVar3 = frjVar;
            irj irjVar4 = new irj(brjVar, this, frjVar3, (lq4) null);
            hrjVar2.d = frjVar3;
            hrjVar2.e = brjVar;
            hrjVar2.f = null;
            hrjVar2.g = z2;
            hrjVar2.j = 3;
            objC = hqgVar.c(irjVar4, hrjVar2);
            if (objC != hu4Var) {
                brjVar2 = brjVar;
                obj = objC;
                irjVar = new irj(this, frjVar3, brjVar2, (lq4) null);
                hrjVar2.d = null;
                hrjVar2.e = null;
                hrjVar2.f = null;
                hrjVar2.g = z2;
                hrjVar2.j = 4;
                if (((es8) obj).d(irjVar, hrjVar2) == hu4Var) {
                    return sbiVar;
                }
            }
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0132  */
    /* JADX WARN: Code duplicated, block: B:57:0x0139  */
    /* JADX WARN: Code duplicated, block: B:61:0x0154  */
    /* JADX WARN: Code duplicated, block: B:65:0x0175  */
    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:0x01bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Type inference failed for: r1v7, types: [es8, frj, nrj] */
    public final Object k(String str, boolean z, nq4 nq4Var) {
        jrj jrjVar;
        frj frjVar;
        frj frjVar2;
        Object objA;
        nrj nrjVar;
        String str2;
        Charset charset;
        ms8 ms8VarG;
        l44 l44VarH;
        p41 p41Var;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        es8 jqgVar;
        p41 p41Var2;
        es8 es8Var;
        frj frjVar3;
        boolean z2;
        nrj nrjVar2;
        lq4 lq4Var;
        frj frjVar4;
        nrj nrjVar3;
        es8 es8Var2;
        poi poiVar;
        boolean z3 = z;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof jrj) {
            jrjVar = (jrj) nq4Var;
            int i = jrjVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jrjVar.j = i - Integer.MIN_VALUE;
            } else {
                jrjVar = new jrj(this, nq4Var);
            }
        } else {
            jrjVar = new jrj(this, nq4Var);
        }
        jrj jrjVar2 = jrjVar;
        Object objC = jrjVar2.h;
        hu4 hu4Var = hu4.a;
        switch (jrjVar2.j) {
            case 0:
                ch3.d0(objC);
                frjVar = z3 ? frj.SECURE_SAVE_KEY : frj.SAVE_KEY;
                qs8 qs8Var = this.a;
                l44 l44VarH2 = h();
                p41 p41Var3 = this.e;
                ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
                try {
                    qs8Var.getClass();
                    objA = qs8Var.a(nrj.Companion.serializer(), str);
                    break;
                } catch (IllegalArgumentException e) {
                    String name = qs8Var.getClass().getName();
                    WebAppJsonException webAppJsonException = new WebAppJsonException(e);
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "json parse error at: " + frjVar, webAppJsonException);
                        }
                    }
                    jrjVar2.d = frjVar;
                    jrjVar2.e = null;
                    jrjVar2.f = null;
                    jrjVar2.g = z3;
                    jrjVar2.j = 1;
                    if (l44VarH2.a(p41Var3, ks8Var, frjVar, null, jrjVar2) != hu4Var) {
                        frjVar2 = frjVar;
                        frjVar = frjVar2;
                        objA = null;
                    }
                    return hu4Var;
                }
                nrjVar = (nrj) objA;
                if (nrjVar != null) {
                    str2 = nrjVar.c;
                    charset = pt2.a;
                    if (str2.getBytes(charset).length <= 128) {
                        str4 = nrjVar.d;
                        if (str4 != null || str4.getBytes(charset).length <= 4000) {
                            str5 = nrjVar.d;
                            str6 = nrjVar.a;
                            str7 = nrjVar.c;
                            if (str5 == null) {
                                jqgVar = new iqg(str6, str7, z3);
                            } else {
                                jqgVar = new jqg(str6, str7, str5, z3);
                            }
                            p41Var2 = this.e;
                            jrjVar2.d = frjVar;
                            jrjVar2.e = nrjVar;
                            jrjVar2.f = jqgVar;
                            jrjVar2.g = z3;
                            jrjVar2.j = 4;
                            if (p41Var2.a(jrjVar2, jqgVar) != hu4Var) {
                                es8Var = jqgVar;
                                frjVar3 = frjVar;
                                z2 = z3;
                                nrjVar2 = nrjVar;
                                lq4Var = null;
                                rjj rjjVar = new rjj(nrjVar2, this, frjVar3, lq4Var, 8);
                                jrjVar2.d = frjVar3;
                                jrjVar2.e = nrjVar2;
                                jrjVar2.f = null;
                                jrjVar2.g = z2;
                                jrjVar2.j = 5;
                                objC = es8Var.c(rjjVar, jrjVar2);
                                if (objC != hu4Var) {
                                    frjVar4 = frjVar3;
                                    nrjVar3 = nrjVar2;
                                    es8Var2 = (es8) objC;
                                    poiVar = new poi(this, frjVar4, nrjVar3, lq4Var, 15);
                                    ?? r1 = lq4Var;
                                    jrjVar2.d = r1;
                                    jrjVar2.e = r1;
                                    jrjVar2.f = r1;
                                    jrjVar2.g = z2;
                                    jrjVar2.j = 6;
                                    if (es8Var2.d(poiVar, jrjVar2) != hu4Var) {
                                    }
                                }
                            }
                        } else {
                            ms8 ms8VarG2 = g(new wqj(z3));
                            l44 l44VarH3 = h();
                            p41 p41Var4 = this.e;
                            String str8 = nrjVar.b;
                            jrjVar2.d = null;
                            jrjVar2.e = null;
                            jrjVar2.f = null;
                            jrjVar2.g = z3;
                            jrjVar2.j = 3;
                            if (l44VarH3.a(p41Var4, ms8VarG2, frjVar, str8, jrjVar2) == hu4Var) {
                            }
                        }
                        return hu4Var;
                    }
                    ms8VarG = g(new vqj(z3));
                    l44VarH = h();
                    p41Var = this.e;
                    str3 = nrjVar.b;
                    jrjVar2.d = null;
                    jrjVar2.e = null;
                    jrjVar2.f = null;
                    jrjVar2.g = z3;
                    jrjVar2.j = 2;
                    if (l44VarH.a(p41Var, ms8VarG, frjVar, str3, jrjVar2) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            case 1:
                z3 = jrjVar2.g;
                frjVar2 = jrjVar2.d;
                ch3.d0(objC);
                frjVar = frjVar2;
                objA = null;
                nrjVar = (nrj) objA;
                if (nrjVar != null) {
                    str2 = nrjVar.c;
                    charset = pt2.a;
                    if (str2.getBytes(charset).length <= 128) {
                        str4 = nrjVar.d;
                        if (str4 != null) {
                            break;
                        }
                        str5 = nrjVar.d;
                        str6 = nrjVar.a;
                        str7 = nrjVar.c;
                        if (str5 == null) {
                            jqgVar = new iqg(str6, str7, z3);
                        } else {
                            jqgVar = new jqg(str6, str7, str5, z3);
                        }
                        p41Var2 = this.e;
                        jrjVar2.d = frjVar;
                        jrjVar2.e = nrjVar;
                        jrjVar2.f = jqgVar;
                        jrjVar2.g = z3;
                        jrjVar2.j = 4;
                        if (p41Var2.a(jrjVar2, jqgVar) != hu4Var) {
                            es8Var = jqgVar;
                            frjVar3 = frjVar;
                            z2 = z3;
                            nrjVar2 = nrjVar;
                            lq4Var = null;
                            rjj rjjVar2 = new rjj(nrjVar2, this, frjVar3, lq4Var, 8);
                            jrjVar2.d = frjVar3;
                            jrjVar2.e = nrjVar2;
                            jrjVar2.f = null;
                            jrjVar2.g = z2;
                            jrjVar2.j = 5;
                            objC = es8Var.c(rjjVar2, jrjVar2);
                            if (objC != hu4Var) {
                                frjVar4 = frjVar3;
                                nrjVar3 = nrjVar2;
                                es8Var2 = (es8) objC;
                                poiVar = new poi(this, frjVar4, nrjVar3, lq4Var, 15);
                                ?? r2 = lq4Var;
                                jrjVar2.d = r2;
                                jrjVar2.e = r2;
                                jrjVar2.f = r2;
                                jrjVar2.g = z2;
                                jrjVar2.j = 6;
                                if (es8Var2.d(poiVar, jrjVar2) != hu4Var) {
                                }
                            }
                        }
                        return hu4Var;
                    }
                    ms8VarG = g(new vqj(z3));
                    l44VarH = h();
                    p41Var = this.e;
                    str3 = nrjVar.b;
                    jrjVar2.d = null;
                    jrjVar2.e = null;
                    jrjVar2.f = null;
                    jrjVar2.g = z3;
                    jrjVar2.j = 2;
                    if (l44VarH.a(p41Var, ms8VarG, frjVar, str3, jrjVar2) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbiVar;
            case 2:
            case 3:
                ch3.d0(objC);
                return sbiVar;
            case 4:
                z3 = jrjVar2.g;
                es8 es8Var3 = jrjVar2.f;
                nrjVar = jrjVar2.e;
                frj frjVar5 = jrjVar2.d;
                ch3.d0(objC);
                es8Var = es8Var3;
                frjVar3 = frjVar5;
                z2 = z3;
                nrjVar2 = nrjVar;
                lq4Var = null;
                rjj rjjVar3 = new rjj(nrjVar2, this, frjVar3, lq4Var, 8);
                jrjVar2.d = frjVar3;
                jrjVar2.e = nrjVar2;
                jrjVar2.f = null;
                jrjVar2.g = z2;
                jrjVar2.j = 5;
                objC = es8Var.c(rjjVar3, jrjVar2);
                if (objC != hu4Var) {
                    frjVar4 = frjVar3;
                    nrjVar3 = nrjVar2;
                    es8Var2 = (es8) objC;
                    poiVar = new poi(this, frjVar4, nrjVar3, lq4Var, 15);
                    ?? r3 = lq4Var;
                    jrjVar2.d = r3;
                    jrjVar2.e = r3;
                    jrjVar2.f = r3;
                    jrjVar2.g = z2;
                    jrjVar2.j = 6;
                    if (es8Var2.d(poiVar, jrjVar2) != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            case 5:
                boolean z4 = jrjVar2.g;
                nrjVar3 = jrjVar2.e;
                frj frjVar6 = jrjVar2.d;
                ch3.d0(objC);
                z2 = z4;
                frjVar4 = frjVar6;
                lq4Var = null;
                es8Var2 = (es8) objC;
                poiVar = new poi(this, frjVar4, nrjVar3, lq4Var, 15);
                ?? r4 = lq4Var;
                jrjVar2.d = r4;
                jrjVar2.e = r4;
                jrjVar2.f = r4;
                jrjVar2.g = z2;
                jrjVar2.j = 6;
                if (es8Var2.d(poiVar, jrjVar2) != hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 6:
                ch3.d0(objC);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
