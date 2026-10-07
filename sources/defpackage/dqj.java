package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class dqj implements os8 {
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final Set e;
    public final p41 f;

    public dqj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        ma6 ma6Var = xpj.g;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((xpj) y1Var.next()).a);
        }
        this.e = ww3.X1(arrayList);
        this.f = yab.b(0, 0, null, 7);
    }

    public static ms8 f(Throwable th) {
        vpj vpjVar = th instanceof vpj ? (vpj) th : null;
        if (cqk.d(vpjVar, spj.a)) {
            return new ks8(new ns8("invalid_request", 3));
        }
        if (cqk.d(vpjVar, tpj.a)) {
            return new ks8(new ns8("too_large_link", 2));
        }
        if (cqk.d(vpjVar, upj.a)) {
            return new ks8(new ns8("too_large_text", 1));
        }
        if (vpjVar == null) {
            return ls8.d;
        }
        ore.o();
        return null;
    }

    public static ms8 l(String str, String str2) {
        Throwable th;
        if ((str == null || r5h.X0(str)) && (str2 == null || r5h.X0(str2))) {
            th = spj.a;
        } else if (str == null || str.length() <= 200) {
            th = (str2 == null || str2.length() <= 200) ? null : upj.a;
        } else {
            th = tpj.a;
        }
        if (th != null) {
            return f(th);
        }
        return null;
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object next;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        Iterator it = xpj.g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((xpj) next).a.equals(str));
        xpj xpjVar = (xpj) next;
        if (xpjVar == null) {
            String name = dqj.class.getName();
            String str3 = "Unknown method with name = " + str + " in JsDelegate: " + this;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                a4c.f(a4cVar, je9.g, name, str3, null, null, 8);
                return sbiVar;
            }
        } else {
            int iOrdinal = xpjVar.ordinal();
            if (iOrdinal == 0) {
                Object objI = i(str2, (nq4) lq4Var);
                if (objI == hu4Var) {
                    return objI;
                }
            } else {
                if (iOrdinal != 1) {
                    ore.o();
                    return null;
                }
                Object objH = h(str2, (nq4) lq4Var);
                if (objH == hu4Var) {
                    return objH;
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.f;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.e;
    }

    public final l44 g() {
        return (l44) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x0159  */
    /* JADX WARN: Code duplicated, block: B:55:0x0175  */
    /* JADX WARN: Code duplicated, block: B:59:0x0192 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object h(String str, nq4 nq4Var) {
        ypj ypjVar;
        xpj xpjVar;
        xpj xpjVar2;
        Object objA;
        kkj kkjVar;
        Long lB;
        Long lB2;
        Object objJ;
        kkj kkjVar2;
        Long l;
        Long l2;
        ms8 ms8Var;
        qpj qpjVar;
        p41 p41Var;
        qpj qpjVar2;
        kkj kkjVar3;
        xpj xpjVar3;
        l44 l44VarG;
        hr2 hr2Var;
        String str2;
        kkj kkjVar4;
        xpj xpjVar4;
        zpj zpjVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ypj) {
            ypjVar = (ypj) nq4Var;
            int i = ypjVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ypjVar.k = i - Integer.MIN_VALUE;
            } else {
                ypjVar = new ypj(this, nq4Var);
            }
        } else {
            ypjVar = new ypj(this, nq4Var);
        }
        ypj ypjVar2 = ypjVar;
        Object objC = ypjVar2.i;
        Object obj = hu4.a;
        switch (ypjVar2.k) {
            case 0:
                ch3.d0(objC);
                xpjVar = xpj.MAX_SHARE;
                qs8 qs8Var = this.a;
                l44 l44VarG2 = g();
                hr2 hr2Var2 = this.f;
                ms8 ks8Var = new ks8(new ns8("json_decode_error", 2));
                try {
                    qs8Var.getClass();
                    objA = qs8Var.a(kkj.Companion.serializer(), str);
                    break;
                } catch (IllegalArgumentException e) {
                    String name = qs8Var.getClass().getName();
                    WebAppJsonException webAppJsonException = new WebAppJsonException(e);
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "json parse error at: " + xpjVar, webAppJsonException);
                        }
                    }
                    ypjVar2.d = xpjVar;
                    ypjVar2.e = null;
                    ypjVar2.f = null;
                    ypjVar2.g = null;
                    ypjVar2.h = null;
                    ypjVar2.k = 1;
                    if (l44VarG2.a(hr2Var2, ks8Var, xpjVar, null, ypjVar2) != obj) {
                        xpjVar2 = xpjVar;
                        xpjVar = xpjVar2;
                        objA = null;
                    }
                    return obj;
                }
                kkjVar = (kkj) objA;
                if (kkjVar != null) {
                    lB = bgl.b(kkjVar.e);
                    lB2 = bgl.b(kkjVar.d);
                    String str3 = kkjVar.c;
                    String str4 = kkjVar.b;
                    ypjVar2.d = xpjVar;
                    ypjVar2.e = kkjVar;
                    ypjVar2.f = lB;
                    ypjVar2.g = lB2;
                    ypjVar2.h = null;
                    ypjVar2.k = 2;
                    objJ = j(lB, lB2, str3, str4, ypjVar2);
                    if (objJ != obj) {
                        kkjVar2 = kkjVar;
                        objC = objJ;
                        l = lB;
                        l2 = lB2;
                        ms8Var = (ms8) objC;
                        if (ms8Var != null) {
                            l44VarG = g();
                            hr2Var = this.f;
                            str2 = kkjVar2.a;
                            ypjVar2.d = null;
                            ypjVar2.e = null;
                            ypjVar2.f = null;
                            ypjVar2.g = null;
                            ypjVar2.k = 3;
                            if (l44VarG.a(hr2Var, ms8Var, xpjVar, str2, ypjVar2) != obj) {
                            }
                        } else {
                            String str5 = kkjVar2.a;
                            qpjVar = new qpj(l, l2, kkjVar2.b, kkjVar2.c);
                            p41Var = this.f;
                            ypjVar2.d = xpjVar;
                            ypjVar2.e = kkjVar2;
                            ypjVar2.f = null;
                            ypjVar2.g = null;
                            ypjVar2.h = qpjVar;
                            ypjVar2.k = 4;
                            if (p41Var.a(ypjVar2, qpjVar) != obj) {
                                qpjVar2 = qpjVar;
                                kkjVar3 = kkjVar2;
                                xpjVar3 = xpjVar;
                                zpj zpjVar2 = new zpj(this, kkjVar3, xpjVar3, (lq4) null);
                                ypjVar2.d = xpjVar3;
                                ypjVar2.e = kkjVar3;
                                ypjVar2.f = null;
                                ypjVar2.g = null;
                                ypjVar2.h = null;
                                ypjVar2.k = 5;
                                objC = qpjVar2.c(zpjVar2, ypjVar2);
                                if (objC != obj) {
                                    kkjVar4 = kkjVar3;
                                    xpjVar4 = xpjVar3;
                                    zpjVar = new zpj(this, xpjVar4, kkjVar4, (lq4) null);
                                    ypjVar2.d = null;
                                    ypjVar2.e = null;
                                    ypjVar2.f = null;
                                    ypjVar2.g = null;
                                    ypjVar2.h = null;
                                    ypjVar2.k = 6;
                                    if (((es8) objC).d(zpjVar, ypjVar2) == obj) {
                                    }
                                }
                            }
                        }
                    }
                    return obj;
                }
                return sbiVar;
            case 1:
                xpjVar2 = ypjVar2.d;
                ch3.d0(objC);
                xpjVar = xpjVar2;
                objA = null;
                kkjVar = (kkj) objA;
                if (kkjVar != null) {
                    lB = bgl.b(kkjVar.e);
                    lB2 = bgl.b(kkjVar.d);
                    String str6 = kkjVar.c;
                    String str7 = kkjVar.b;
                    ypjVar2.d = xpjVar;
                    ypjVar2.e = kkjVar;
                    ypjVar2.f = lB;
                    ypjVar2.g = lB2;
                    ypjVar2.h = null;
                    ypjVar2.k = 2;
                    objJ = j(lB, lB2, str6, str7, ypjVar2);
                    if (objJ != obj) {
                        kkjVar2 = kkjVar;
                        objC = objJ;
                        l = lB;
                        l2 = lB2;
                        ms8Var = (ms8) objC;
                        if (ms8Var != null) {
                            l44VarG = g();
                            hr2Var = this.f;
                            str2 = kkjVar2.a;
                            ypjVar2.d = null;
                            ypjVar2.e = null;
                            ypjVar2.f = null;
                            ypjVar2.g = null;
                            ypjVar2.k = 3;
                            if (l44VarG.a(hr2Var, ms8Var, xpjVar, str2, ypjVar2) != obj) {
                            }
                        } else {
                            String str8 = kkjVar2.a;
                            qpjVar = new qpj(l, l2, kkjVar2.b, kkjVar2.c);
                            p41Var = this.f;
                            ypjVar2.d = xpjVar;
                            ypjVar2.e = kkjVar2;
                            ypjVar2.f = null;
                            ypjVar2.g = null;
                            ypjVar2.h = qpjVar;
                            ypjVar2.k = 4;
                            if (p41Var.a(ypjVar2, qpjVar) != obj) {
                                qpjVar2 = qpjVar;
                                kkjVar3 = kkjVar2;
                                xpjVar3 = xpjVar;
                                zpj zpjVar3 = new zpj(this, kkjVar3, xpjVar3, (lq4) null);
                                ypjVar2.d = xpjVar3;
                                ypjVar2.e = kkjVar3;
                                ypjVar2.f = null;
                                ypjVar2.g = null;
                                ypjVar2.h = null;
                                ypjVar2.k = 5;
                                objC = qpjVar2.c(zpjVar3, ypjVar2);
                                if (objC != obj) {
                                    kkjVar4 = kkjVar3;
                                    xpjVar4 = xpjVar3;
                                    zpjVar = new zpj(this, xpjVar4, kkjVar4, (lq4) null);
                                    ypjVar2.d = null;
                                    ypjVar2.e = null;
                                    ypjVar2.f = null;
                                    ypjVar2.g = null;
                                    ypjVar2.h = null;
                                    ypjVar2.k = 6;
                                    if (((es8) objC).d(zpjVar, ypjVar2) == obj) {
                                    }
                                }
                            }
                        }
                    }
                    return obj;
                }
                return sbiVar;
            case 2:
                l2 = ypjVar2.g;
                l = ypjVar2.f;
                kkjVar2 = ypjVar2.e;
                xpj xpjVar5 = ypjVar2.d;
                ch3.d0(objC);
                xpjVar = xpjVar5;
                ms8Var = (ms8) objC;
                if (ms8Var != null) {
                    l44VarG = g();
                    hr2Var = this.f;
                    str2 = kkjVar2.a;
                    ypjVar2.d = null;
                    ypjVar2.e = null;
                    ypjVar2.f = null;
                    ypjVar2.g = null;
                    ypjVar2.k = 3;
                    if (l44VarG.a(hr2Var, ms8Var, xpjVar, str2, ypjVar2) != obj) {
                        return sbiVar;
                    }
                } else {
                    String str9 = kkjVar2.a;
                    qpjVar = new qpj(l, l2, kkjVar2.b, kkjVar2.c);
                    p41Var = this.f;
                    ypjVar2.d = xpjVar;
                    ypjVar2.e = kkjVar2;
                    ypjVar2.f = null;
                    ypjVar2.g = null;
                    ypjVar2.h = qpjVar;
                    ypjVar2.k = 4;
                    if (p41Var.a(ypjVar2, qpjVar) != obj) {
                        qpjVar2 = qpjVar;
                        kkjVar3 = kkjVar2;
                        xpjVar3 = xpjVar;
                        zpj zpjVar4 = new zpj(this, kkjVar3, xpjVar3, (lq4) null);
                        ypjVar2.d = xpjVar3;
                        ypjVar2.e = kkjVar3;
                        ypjVar2.f = null;
                        ypjVar2.g = null;
                        ypjVar2.h = null;
                        ypjVar2.k = 5;
                        objC = qpjVar2.c(zpjVar4, ypjVar2);
                        if (objC != obj) {
                            kkjVar4 = kkjVar3;
                            xpjVar4 = xpjVar3;
                            zpjVar = new zpj(this, xpjVar4, kkjVar4, (lq4) null);
                            ypjVar2.d = null;
                            ypjVar2.e = null;
                            ypjVar2.f = null;
                            ypjVar2.g = null;
                            ypjVar2.h = null;
                            ypjVar2.k = 6;
                            if (((es8) objC).d(zpjVar, ypjVar2) == obj) {
                                return sbiVar;
                            }
                        }
                    }
                }
                return obj;
            case 3:
                ch3.d0(objC);
                return sbiVar;
            case 4:
                qpjVar2 = ypjVar2.h;
                kkjVar3 = ypjVar2.e;
                xpjVar3 = ypjVar2.d;
                ch3.d0(objC);
                zpj zpjVar5 = new zpj(this, kkjVar3, xpjVar3, (lq4) null);
                ypjVar2.d = xpjVar3;
                ypjVar2.e = kkjVar3;
                ypjVar2.f = null;
                ypjVar2.g = null;
                ypjVar2.h = null;
                ypjVar2.k = 5;
                objC = qpjVar2.c(zpjVar5, ypjVar2);
                if (objC != obj) {
                    kkjVar4 = kkjVar3;
                    xpjVar4 = xpjVar3;
                    zpjVar = new zpj(this, xpjVar4, kkjVar4, (lq4) null);
                    ypjVar2.d = null;
                    ypjVar2.e = null;
                    ypjVar2.f = null;
                    ypjVar2.g = null;
                    ypjVar2.h = null;
                    ypjVar2.k = 6;
                    if (((es8) objC).d(zpjVar, ypjVar2) == obj) {
                        return sbiVar;
                    }
                }
                return obj;
            case 5:
                kkjVar4 = ypjVar2.e;
                xpjVar4 = ypjVar2.d;
                ch3.d0(objC);
                zpjVar = new zpj(this, xpjVar4, kkjVar4, (lq4) null);
                ypjVar2.d = null;
                ypjVar2.e = null;
                ypjVar2.f = null;
                ypjVar2.g = null;
                ypjVar2.h = null;
                ypjVar2.k = 6;
                if (((es8) objC).d(zpjVar, ypjVar2) == obj) {
                    return obj;
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

    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0110  */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0144  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [jqj, rpj, xpj] */
    /* JADX WARN: Type inference failed for: r4v5, types: [lq4, rpj] */
    /* JADX WARN: Type inference failed for: r4v6, types: [jqj, lq4, rpj, xpj] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public final Object i(String str, nq4 nq4Var) {
        aqj aqjVar;
        xpj xpjVar;
        xpj xpjVar2;
        ?? A;
        jqj jqjVar;
        ms8 ms8VarL;
        rpj rpjVar;
        p41 p41Var;
        rpj rpjVar2;
        jqj jqjVar2;
        xpj xpjVar3;
        l44 l44VarG;
        p41 p41Var2;
        String str2;
        ?? r4;
        jqj jqjVar3;
        xpj xpjVar4;
        ?? r5;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof aqj) {
            aqjVar = (aqj) nq4Var;
            int i = aqjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aqjVar.i = i - Integer.MIN_VALUE;
            } else {
                aqjVar = new aqj(this, nq4Var);
            }
        } else {
            aqjVar = new aqj(this, nq4Var);
        }
        aqj aqjVar2 = aqjVar;
        Object objC = aqjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = aqjVar2.i;
        ?? r7 = 0;
        if (i2 != 0) {
            if (i2 == 1) {
                xpjVar2 = aqjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    ch3.d0(objC);
                    return sbiVar;
                }
                if (i2 == 3) {
                    rpj rpjVar3 = aqjVar2.f;
                    jqj jqjVar4 = aqjVar2.e;
                    xpj xpjVar5 = aqjVar2.d;
                    ch3.d0(objC);
                    rpjVar2 = rpjVar3;
                    jqjVar2 = jqjVar4;
                    xpjVar3 = xpjVar5;
                    r4 = 0;
                    rjj rjjVar = new rjj(this, jqjVar2, xpjVar3, r4, 6);
                    aqjVar2.d = xpjVar3;
                    aqjVar2.e = jqjVar2;
                    aqjVar2.f = r4;
                    aqjVar2.i = 4;
                    objC = rpjVar2.c(rjjVar, aqjVar2);
                    if (objC != hu4Var) {
                        xpj xpjVar6 = xpjVar3;
                        jqjVar3 = jqjVar2;
                        xpjVar4 = xpjVar6;
                        r5 = r4;
                    }
                }
                if (i2 != 4) {
                    if (i2 == 5) {
                        ch3.d0(objC);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jqj jqjVar5 = aqjVar2.e;
                xpj xpjVar7 = aqjVar2.d;
                ch3.d0(objC);
                jqjVar3 = jqjVar5;
                xpjVar4 = xpjVar7;
                r5 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, xpjVar4, jqjVar3, r5, 13);
            aqjVar2.d = r5;
            aqjVar2.e = r5;
            aqjVar2.f = r5;
            aqjVar2.i = 5;
            return es8Var.d(poiVar, aqjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        xpjVar = xpj.SHARE;
        qs8 qs8Var = this.a;
        l44 l44VarG2 = g();
        p41 p41Var3 = this.f;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            r7 = 0;
            A = qs8Var.a(jqj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + xpjVar, webAppJsonException);
                }
            }
            aqjVar2.d = xpjVar;
            aqjVar2.e = null;
            aqjVar2.f = null;
            aqjVar2.i = 1;
            if (l44VarG2.a(p41Var3, ks8Var, xpjVar, null, aqjVar2) != hu4Var) {
                xpjVar2 = xpjVar;
                xpjVar = xpjVar2;
                A = r7;
            }
        }
        jqjVar = (jqj) A;
        if (jqjVar != null) {
            ms8VarL = l(jqjVar.c, jqjVar.b);
            if (ms8VarL != null) {
                l44VarG = g();
                p41Var2 = this.f;
                str2 = jqjVar.a;
                aqjVar2.d = r7;
                aqjVar2.e = r7;
                aqjVar2.f = r7;
                aqjVar2.i = 2;
                if (l44VarG.a(p41Var2, ms8VarL, xpjVar, str2, aqjVar2) == hu4Var) {
                }
            } else {
                rpjVar = new rpj(jqjVar.b, jqjVar.c);
                p41Var = this.f;
                aqjVar2.d = xpjVar;
                aqjVar2.e = jqjVar;
                aqjVar2.f = rpjVar;
                aqjVar2.i = 3;
                if (p41Var.a(aqjVar2, rpjVar) != hu4Var) {
                    rpjVar2 = rpjVar;
                    jqjVar2 = jqjVar;
                    xpjVar3 = xpjVar;
                    r4 = r7;
                    rjj rjjVar2 = new rjj(this, jqjVar2, xpjVar3, r4, 6);
                    aqjVar2.d = xpjVar3;
                    aqjVar2.e = jqjVar2;
                    aqjVar2.f = r4;
                    aqjVar2.i = 4;
                    objC = rpjVar2.c(rjjVar2, aqjVar2);
                    if (objC != hu4Var) {
                        xpj xpjVar8 = xpjVar3;
                        jqjVar3 = jqjVar2;
                        xpjVar4 = xpjVar8;
                        r5 = r4;
                        es8 es8Var2 = (es8) objC;
                        poi poiVar2 = new poi(this, xpjVar4, jqjVar3, r5, 13);
                        aqjVar2.d = r5;
                        aqjVar2.e = r5;
                        aqjVar2.f = r5;
                        aqjVar2.i = 5;
                        if (es8Var2.d(poiVar2, aqjVar2) == hu4Var) {
                        }
                    }
                }
            }
        }
        xpjVar = xpjVar2;
        A = r7;
        jqjVar = (jqj) A;
        if (jqjVar != null) {
            ms8VarL = l(jqjVar.c, jqjVar.b);
            if (ms8VarL != null) {
                l44VarG = g();
                p41Var2 = this.f;
                str2 = jqjVar.a;
                aqjVar2.d = r7;
                aqjVar2.e = r7;
                aqjVar2.f = r7;
                aqjVar2.i = 2;
                if (l44VarG.a(p41Var2, ms8VarL, xpjVar, str2, aqjVar2) == hu4Var) {
                }
            } else {
                rpjVar = new rpj(jqjVar.b, jqjVar.c);
                p41Var = this.f;
                aqjVar2.d = xpjVar;
                aqjVar2.e = jqjVar;
                aqjVar2.f = rpjVar;
                aqjVar2.i = 3;
                if (p41Var.a(aqjVar2, rpjVar) != hu4Var) {
                    rpjVar2 = rpjVar;
                    jqjVar2 = jqjVar;
                    xpjVar3 = xpjVar;
                    r4 = r7;
                    rjj rjjVar3 = new rjj(this, jqjVar2, xpjVar3, r4, 6);
                    aqjVar2.d = xpjVar3;
                    aqjVar2.e = jqjVar2;
                    aqjVar2.f = r4;
                    aqjVar2.i = 4;
                    objC = rpjVar2.c(rjjVar3, aqjVar2);
                    if (objC != hu4Var) {
                        xpj xpjVar9 = xpjVar3;
                        jqjVar3 = jqjVar2;
                        xpjVar4 = xpjVar9;
                        r5 = r4;
                        es8 es8Var3 = (es8) objC;
                        poi poiVar3 = new poi(this, xpjVar4, jqjVar3, r5, 13);
                        aqjVar2.d = r5;
                        aqjVar2.e = r5;
                        aqjVar2.f = r5;
                        aqjVar2.i = 5;
                        if (es8Var3.d(poiVar3, aqjVar2) == hu4Var) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object j(Long l, Long l2, String str, String str2, nq4 nq4Var) {
        bqj bqjVar;
        if (nq4Var instanceof bqj) {
            bqjVar = (bqj) nq4Var;
            int i = bqjVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                bqjVar.f = i - Integer.MIN_VALUE;
            } else {
                bqjVar = new bqj(this, nq4Var);
            }
        } else {
            bqjVar = new bqj(this, nq4Var);
        }
        bqj bqjVar2 = bqjVar;
        Object objK = bqjVar2.d;
        int i2 = bqjVar2.f;
        if (i2 == 0) {
            ch3.d0(objK);
            if (l == null || l2 == null) {
                return l(str, str2);
            }
            long jLongValue = l.longValue();
            long jLongValue2 = l2.longValue();
            bqjVar2.f = 1;
            objK = k(jLongValue, jLongValue2, bqjVar2);
            Object obj = hu4.a;
            if (objK == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK);
        }
        if (((Boolean) objK).booleanValue()) {
            return null;
        }
        return f(spj.a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object k(long j, long j2, nq4 nq4Var) {
        cqj cqjVar;
        if (nq4Var instanceof cqj) {
            cqjVar = (cqj) nq4Var;
            int i = cqjVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cqjVar.f = i - Integer.MIN_VALUE;
            } else {
                cqjVar = new cqj(this, nq4Var);
            }
        } else {
            cqjVar = new cqj(this, nq4Var);
        }
        cqj cqjVar2 = cqjVar;
        Object objP = cqjVar2.d;
        int i2 = cqjVar2.f;
        if (i2 == 0) {
            ch3.d0(objP);
            rt2 rt2Var = (rt2) ((xn3) this.c.getValue()).l(j).a.getValue();
            if (rt2Var == null) {
                return Boolean.FALSE;
            }
            long j3 = rt2Var.a;
            sua suaVar = (sua) this.d.getValue();
            cqjVar2.f = 1;
            objP = suaVar.p(j3, j2, cqjVar2);
            hu4 hu4Var = hu4.a;
            if (objP == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objP);
        }
        return ((sfa) objP) == null ? Boolean.FALSE : Boolean.TRUE;
    }
}
