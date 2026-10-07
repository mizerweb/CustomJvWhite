package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import one.me.webapp.domain.jsbridge.WebAppJsonException;

/* JADX INFO: loaded from: classes3.dex */
public final class sfj implements os8 {
    public static final List j = Collections.singletonList("unknown");
    public final qs8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ifh e = new ifh(new vbi(21, this));
    public final ud7 f;
    public final Set g;
    public final p41 h;
    public jdj i;

    public sfj(qs8 qs8Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, gu4 gu4Var) {
        this.a = qs8Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        int i = 0;
        this.f = new ud7(gu4Var, new hfj(i, this));
        ma6 ma6Var = ifj.j;
        ArrayList arrayList = new ArrayList(yw3.W0(ma6Var, 10));
        y1 y1Var = new y1(i, ma6Var);
        while (y1Var.hasNext()) {
            arrayList.add(((ifj) y1Var.next()).a);
        }
        this.g = ww3.X1(arrayList);
        this.h = yab.b(0, 0, null, 7);
    }

    public static final void f(sfj sfjVar, String str) {
        jdj jdjVar = sfjVar.i;
        if (jdjVar != null) {
            fgj.a((fgj) sfjVar.b.getValue(), str, jdjVar.a, jdjVar.b, true, 0, null, null, 240);
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0089  */
    public static ms8 g(Throwable th) {
        afj afjVar = th instanceof afj ? (afj) th : null;
        if (afjVar instanceof tej) {
            return new ks8(new ns8("access_denied", 3));
        }
        int i = 0;
        if (afjVar instanceof uej) {
            int i2 = jfj.$EnumSwitchMapping$0[((uej) afjVar).a.ordinal()];
            if (i2 == 1) {
                i = 4;
            } else if (i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    i = 6;
                } else {
                    if (i2 != 5) {
                        ore.o();
                        return null;
                    }
                    i = 5;
                }
            }
            return new ks8(new ns8("not_found", i));
        }
        if (afjVar instanceof vej) {
            return new ks8(new ns8("not_supported", ((vej) afjVar).a ? 3 : 1));
        }
        if (!(afjVar instanceof wej)) {
            if (afjVar instanceof yej) {
                return new ks8(new ns8("token_not_found", 4));
            }
            if (afjVar instanceof zej) {
                return new ks8(new ns8("too_large", 3));
            }
            if (afjVar instanceof xej) {
                return new ks8(new ns8("refused", 1));
            }
            if (afjVar == null) {
                return ls8.d;
            }
            ore.o();
            return null;
        }
        int i3 = jfj.$EnumSwitchMapping$0[((wej) afjVar).a.ordinal()];
        if (i3 == 1) {
            i = 2;
        } else if (i3 != 2) {
            if (i3 == 3 || i3 == 4) {
                i = 2;
            } else {
                if (i3 != 5) {
                    ore.o();
                    return null;
                }
                i = 4;
            }
        }
        return new ks8(new ns8("permission_denied", i));
    }

    @Override // defpackage.os8
    public final void b(jdj jdjVar) {
        this.i = jdjVar;
    }

    @Override // defpackage.os8
    public final Object c(String str, String str2, lq4 lq4Var) {
        Object objK;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        if (this.g.contains(str)) {
            this.f.a();
            if (str.equals("WebAppBiometryGetInfo")) {
                Object objJ = j(str2, (nq4) lq4Var);
                if (objJ == hu4Var) {
                    return objJ;
                }
            } else if (str.equals("WebAppBiometryRequestAccess")) {
                Object objL = l(str2, (nq4) lq4Var);
                if (objL == hu4Var) {
                    return objL;
                }
            } else if (str.equals("WebAppBiometryUpdateToken")) {
                Object objM = m(str2, (nq4) lq4Var);
                if (objM == hu4Var) {
                    return objM;
                }
            } else if (str.equals("WebAppBiometryRequestAuth")) {
                Object objI = i(str2, (nq4) lq4Var);
                if (objI == hu4Var) {
                    return objI;
                }
            } else if (str.equals("WebAppBiometryOpenSettings") && (objK = k(str2, (nq4) lq4Var)) == hu4Var) {
                return objK;
            }
        } else {
            String name = sfj.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "Unknown method with name = " + str + " in JsDelegate: " + this, null);
                    return sbiVar;
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.os8
    public final p41 d() {
        return this.h;
    }

    @Override // defpackage.os8
    public final Set e() {
        return this.g;
    }

    public final l44 h() {
        return (l44) this.c.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object i(String str, nq4 nq4Var) {
        kfj kfjVar;
        ifj ifjVar;
        ifj ifjVar2;
        Object objA;
        sdj sdjVar;
        jx0 jx0Var;
        p41 p41Var;
        ifj ifjVar3;
        Object objC;
        sdj sdjVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof kfj) {
            kfjVar = (kfj) nq4Var;
            int i = kfjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                kfjVar.i = i - Integer.MIN_VALUE;
            } else {
                kfjVar = new kfj(this, nq4Var);
            }
        } else {
            kfjVar = new kfj(this, nq4Var);
        }
        kfj kfjVar2 = kfjVar;
        Object obj = kfjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = kfjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                ifjVar2 = kfjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    jx0Var = kfjVar2.f;
                    sdj sdjVar3 = kfjVar2.e;
                    ifj ifjVar4 = kfjVar2.d;
                    ch3.d0(obj);
                    sdjVar = sdjVar3;
                    ifjVar3 = ifjVar4;
                    lfj lfjVar = new lfj(this, sdjVar, ifjVar3, (lq4) null);
                    kfjVar2.d = ifjVar3;
                    kfjVar2.e = sdjVar;
                    kfjVar2.f = null;
                    kfjVar2.i = 3;
                    objC = jx0Var.c(lfjVar, kfjVar2);
                    if (objC != hu4Var) {
                        sdjVar2 = sdjVar;
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
                sdjVar2 = kfjVar2.e;
                ifjVar3 = kfjVar2.d;
                ch3.d0(obj);
            }
            lfj lfjVar2 = new lfj(this, ifjVar3, sdjVar2, (lq4) null);
            kfjVar2.d = null;
            kfjVar2.e = null;
            kfjVar2.f = null;
            kfjVar2.i = 4;
            return ((es8) obj).d(lfjVar2, kfjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        ifjVar = ifj.REQUEST_AUTH;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.h;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(sdj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + ifjVar, webAppJsonException);
                }
            }
            kfjVar2.d = ifjVar;
            kfjVar2.e = null;
            kfjVar2.f = null;
            kfjVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, ifjVar, null, kfjVar2) != hu4Var) {
                ifjVar2 = ifjVar;
                ifjVar = ifjVar2;
                objA = null;
            }
        }
        sdjVar = (sdj) objA;
        if (sdjVar != null) {
            jx0Var = new jx0(sdjVar.a, sdjVar.c);
            p41Var = this.h;
            kfjVar2.d = ifjVar;
            kfjVar2.e = sdjVar;
            kfjVar2.f = jx0Var;
            kfjVar2.i = 2;
            if (p41Var.a(kfjVar2, jx0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                lfj lfjVar3 = new lfj(this, sdjVar, ifjVar3, (lq4) null);
                kfjVar2.d = ifjVar3;
                kfjVar2.e = sdjVar;
                kfjVar2.f = null;
                kfjVar2.i = 3;
                objC = jx0Var.c(lfjVar3, kfjVar2);
                if (objC != hu4Var) {
                    sdjVar2 = sdjVar;
                    obj = objC;
                    lfj lfjVar4 = new lfj(this, ifjVar3, sdjVar2, (lq4) null);
                    kfjVar2.d = null;
                    kfjVar2.e = null;
                    kfjVar2.f = null;
                    kfjVar2.i = 4;
                    if (((es8) obj).d(lfjVar4, kfjVar2) == hu4Var) {
                    }
                }
            }
        }
        ifjVar = ifjVar2;
        objA = null;
        sdjVar = (sdj) objA;
        if (sdjVar != null) {
            jx0Var = new jx0(sdjVar.a, sdjVar.c);
            p41Var = this.h;
            kfjVar2.d = ifjVar;
            kfjVar2.e = sdjVar;
            kfjVar2.f = jx0Var;
            kfjVar2.i = 2;
            if (p41Var.a(kfjVar2, jx0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                lfj lfjVar5 = new lfj(this, sdjVar, ifjVar3, (lq4) null);
                kfjVar2.d = ifjVar3;
                kfjVar2.e = sdjVar;
                kfjVar2.f = null;
                kfjVar2.i = 3;
                objC = jx0Var.c(lfjVar5, kfjVar2);
                if (objC != hu4Var) {
                    sdjVar2 = sdjVar;
                    obj = objC;
                    lfj lfjVar6 = new lfj(this, ifjVar3, sdjVar2, (lq4) null);
                    kfjVar2.d = null;
                    kfjVar2.e = null;
                    kfjVar2.f = null;
                    kfjVar2.i = 4;
                    if (((es8) obj).d(lfjVar6, kfjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0108  */
    /* JADX WARN: Code duplicated, block: B:43:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v4, types: [kx0, lq4] */
    /* JADX WARN: Type inference failed for: r13v5, types: [dfj, ifj, kx0, lq4] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    public final Object j(String str, nq4 nq4Var) {
        mfj mfjVar;
        ifj ifjVar;
        ifj ifjVar2;
        Object objA;
        Object obj;
        dfj dfjVar;
        kx0 kx0Var;
        p41 p41Var;
        ifj ifjVar3;
        Object obj2;
        ?? r13;
        Object objC;
        dfj dfjVar2;
        ?? r14;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof mfj) {
            mfjVar = (mfj) nq4Var;
            int i = mfjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                mfjVar.i = i - Integer.MIN_VALUE;
            } else {
                mfjVar = new mfj(this, nq4Var);
            }
        } else {
            mfjVar = new mfj(this, nq4Var);
        }
        mfj mfjVar2 = mfjVar;
        Object obj3 = mfjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = mfjVar2.i;
        lq4 lq4Var = null;
        if (i2 != 0) {
            if (i2 == 1) {
                ifjVar2 = mfjVar2.d;
                ch3.d0(obj3);
                obj2 = null;
            } else {
                if (i2 == 2) {
                    kx0Var = mfjVar2.f;
                    dfj dfjVar3 = mfjVar2.e;
                    ifj ifjVar4 = mfjVar2.d;
                    ch3.d0(obj3);
                    dfjVar = dfjVar3;
                    ifjVar3 = ifjVar4;
                    r13 = 0;
                    nfj nfjVar = new nfj(this, dfjVar, ifjVar3, (lq4) r13);
                    mfjVar2.d = ifjVar3;
                    mfjVar2.e = dfjVar;
                    mfjVar2.f = r13;
                    mfjVar2.i = 3;
                    objC = kx0Var.c(nfjVar, mfjVar2);
                    if (objC != hu4Var) {
                        dfjVar2 = dfjVar;
                        obj3 = objC;
                        r14 = r13;
                    }
                }
                if (i2 != 3) {
                    if (i2 == 4) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dfjVar2 = mfjVar2.e;
                ifjVar3 = mfjVar2.d;
                ch3.d0(obj3);
                r14 = 0;
            }
            nfj nfjVar2 = new nfj(this, ifjVar3, dfjVar2, (lq4) r14);
            mfjVar2.d = r14;
            mfjVar2.e = r14;
            mfjVar2.f = r14;
            mfjVar2.i = 4;
            return ((es8) obj3).d(nfjVar2, mfjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj3);
        ud7 ud7Var = this.f;
        ghb ghbVar = ew5.b;
        Object obj4 = null;
        ud7Var.c.B(ud7Var, ud7.d[0], yab.i0(ud7Var.a, null, 2, new vq(qe7.O(10, lw5.SECONDS), ud7Var, lq4Var, 27), 1));
        ifjVar = ifj.GET_INFO;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.h;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(dfj.Companion.serializer(), str);
            obj = obj4;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + ifjVar, webAppJsonException);
                }
            }
            mfjVar2.d = ifjVar;
            mfjVar2.e = null;
            mfjVar2.f = null;
            mfjVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, ifjVar, null, mfjVar2) != hu4Var) {
                ifjVar2 = ifjVar;
                obj2 = obj4;
                ifjVar = ifjVar2;
                objA = obj2;
                obj = obj2;
            }
        }
        dfjVar = (dfj) objA;
        if (dfjVar != null) {
            kx0Var = new kx0(dfjVar.a);
            p41Var = this.h;
            mfjVar2.d = ifjVar;
            mfjVar2.e = dfjVar;
            mfjVar2.f = kx0Var;
            mfjVar2.i = 2;
            if (p41Var.a(mfjVar2, kx0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                r13 = obj;
                nfj nfjVar3 = new nfj(this, dfjVar, ifjVar3, (lq4) r13);
                mfjVar2.d = ifjVar3;
                mfjVar2.e = dfjVar;
                mfjVar2.f = r13;
                mfjVar2.i = 3;
                objC = kx0Var.c(nfjVar3, mfjVar2);
                if (objC != hu4Var) {
                    dfjVar2 = dfjVar;
                    obj3 = objC;
                    r14 = r13;
                    nfj nfjVar4 = new nfj(this, ifjVar3, dfjVar2, (lq4) r14);
                    mfjVar2.d = r14;
                    mfjVar2.e = r14;
                    mfjVar2.f = r14;
                    mfjVar2.i = 4;
                    if (((es8) obj3).d(nfjVar4, mfjVar2) == hu4Var) {
                    }
                }
            }
        }
        ifjVar = ifjVar2;
        objA = obj2;
        obj = obj2;
        dfjVar = (dfj) objA;
        if (dfjVar != null) {
            kx0Var = new kx0(dfjVar.a);
            p41Var = this.h;
            mfjVar2.d = ifjVar;
            mfjVar2.e = dfjVar;
            mfjVar2.f = kx0Var;
            mfjVar2.i = 2;
            if (p41Var.a(mfjVar2, kx0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                r13 = obj;
                nfj nfjVar5 = new nfj(this, dfjVar, ifjVar3, (lq4) r13);
                mfjVar2.d = ifjVar3;
                mfjVar2.e = dfjVar;
                mfjVar2.f = r13;
                mfjVar2.i = 3;
                objC = kx0Var.c(nfjVar5, mfjVar2);
                if (objC != hu4Var) {
                    dfjVar2 = dfjVar;
                    obj3 = objC;
                    r14 = r13;
                    nfj nfjVar6 = new nfj(this, ifjVar3, dfjVar2, (lq4) r14);
                    mfjVar2.d = r14;
                    mfjVar2.e = r14;
                    mfjVar2.f = r14;
                    mfjVar2.i = 4;
                    if (((es8) obj3).d(nfjVar6, mfjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[PHI: r2 r3 r4
  0x0056: PHI (r2v10 lx0) = (r2v8 lx0), (r2v19 lx0) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r3v3 vfj) = (r3v2 vfj), (r3v7 vfj) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]
  0x0056: PHI (r4v6 ifj) = (r4v4 ifj), (r4v9 ifj) binds: [B:42:0x00f0, B:20:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v8, types: [ifj, lq4, lx0, vfj] */
    public final Object k(String str, nq4 nq4Var) {
        ofj ofjVar;
        ifj ifjVar;
        Object objA;
        ifj ifjVar2;
        vfj vfjVar;
        lx0 lx0Var;
        p41 p41Var;
        vfj vfjVar2;
        ifj ifjVar3;
        lq4 lq4Var;
        vfj vfjVar3;
        ifj ifjVar4;
        ?? r4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ofj) {
            ofjVar = (ofj) nq4Var;
            int i = ofjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofjVar.i = i - Integer.MIN_VALUE;
            } else {
                ofjVar = new ofj(this, nq4Var);
            }
        } else {
            ofjVar = new ofj(this, nq4Var);
        }
        ofj ofjVar2 = ofjVar;
        Object objC = ofjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = ofjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                ifjVar = ofjVar2.d;
                ch3.d0(objC);
            } else {
                if (i2 == 2) {
                    lx0Var = ofjVar2.f;
                    vfjVar = ofjVar2.e;
                    ifjVar2 = ofjVar2.d;
                    ch3.d0(objC);
                    lx0 lx0Var2 = lx0Var;
                    vfjVar2 = vfjVar;
                    ifjVar3 = ifjVar2;
                    lq4Var = null;
                    p7g p7gVar = new p7g(this, vfjVar2, ifjVar3, lq4Var, 28);
                    ofjVar2.d = ifjVar3;
                    ofjVar2.e = vfjVar2;
                    ofjVar2.f = null;
                    ofjVar2.i = 3;
                    objC = lx0Var2.c(p7gVar, ofjVar2);
                    if (objC != hu4Var) {
                        vfjVar3 = vfjVar2;
                        ifjVar4 = ifjVar3;
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
                vfj vfjVar4 = ofjVar2.e;
                ifj ifjVar5 = ofjVar2.d;
                ch3.d0(objC);
                vfjVar3 = vfjVar4;
                ifjVar4 = ifjVar5;
                r4 = 0;
            }
            es8 es8Var = (es8) objC;
            poi poiVar = new poi(this, ifjVar4, vfjVar3, r4, 1);
            ofjVar2.d = r4;
            ofjVar2.e = r4;
            ofjVar2.f = r4;
            ofjVar2.i = 4;
            return es8Var.d(poiVar, ofjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        ifj ifjVar6 = ifj.OPEN_SETTINGS;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.h;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(vfj.Companion.serializer(), str);
            ifjVar2 = ifjVar6;
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + ifjVar6, webAppJsonException);
                }
            }
            ofjVar2.d = ifjVar6;
            ofjVar2.e = null;
            ofjVar2.f = null;
            ofjVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, ifjVar6, null, ofjVar2) != hu4Var) {
                ifjVar = ifjVar6;
                ifjVar2 = ifjVar;
                objA = null;
            }
        }
        vfjVar = (vfj) objA;
        if (vfjVar != null) {
            lx0Var = new lx0(vfjVar.a);
            p41Var = this.h;
            ofjVar2.d = ifjVar2;
            ofjVar2.e = vfjVar;
            ofjVar2.f = lx0Var;
            ofjVar2.i = 2;
            if (p41Var.a(ofjVar2, lx0Var) != hu4Var) {
                lx0 lx0Var3 = lx0Var;
                vfjVar2 = vfjVar;
                ifjVar3 = ifjVar2;
                lq4Var = null;
                p7g p7gVar2 = new p7g(this, vfjVar2, ifjVar3, lq4Var, 28);
                ofjVar2.d = ifjVar3;
                ofjVar2.e = vfjVar2;
                ofjVar2.f = null;
                ofjVar2.i = 3;
                objC = lx0Var3.c(p7gVar2, ofjVar2);
                if (objC != hu4Var) {
                    vfjVar3 = vfjVar2;
                    ifjVar4 = ifjVar3;
                    r4 = lq4Var;
                    es8 es8Var2 = (es8) objC;
                    poi poiVar2 = new poi(this, ifjVar4, vfjVar3, r4, 1);
                    ofjVar2.d = r4;
                    ofjVar2.e = r4;
                    ofjVar2.f = r4;
                    ofjVar2.i = 4;
                    if (es8Var2.d(poiVar2, ofjVar2) == hu4Var) {
                    }
                }
            }
        }
        ifjVar2 = ifjVar;
        objA = null;
        vfjVar = (vfj) objA;
        if (vfjVar != null) {
            lx0Var = new lx0(vfjVar.a);
            p41Var = this.h;
            ofjVar2.d = ifjVar2;
            ofjVar2.e = vfjVar;
            ofjVar2.f = lx0Var;
            ofjVar2.i = 2;
            if (p41Var.a(ofjVar2, lx0Var) != hu4Var) {
                lx0 lx0Var4 = lx0Var;
                vfjVar2 = vfjVar;
                ifjVar3 = ifjVar2;
                lq4Var = null;
                p7g p7gVar3 = new p7g(this, vfjVar2, ifjVar3, lq4Var, 28);
                ofjVar2.d = ifjVar3;
                ofjVar2.e = vfjVar2;
                ofjVar2.f = null;
                ofjVar2.i = 3;
                objC = lx0Var4.c(p7gVar3, ofjVar2);
                if (objC != hu4Var) {
                    vfjVar3 = vfjVar2;
                    ifjVar4 = ifjVar3;
                    r4 = lq4Var;
                    es8 es8Var3 = (es8) objC;
                    poi poiVar3 = new poi(this, ifjVar4, vfjVar3, r4, 1);
                    ofjVar2.d = r4;
                    ofjVar2.e = r4;
                    ofjVar2.f = r4;
                    ofjVar2.i = 4;
                    if (es8Var3.d(poiVar3, ofjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0107  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object l(String str, nq4 nq4Var) {
        pfj pfjVar;
        ifj ifjVar;
        ifj ifjVar2;
        Object objA;
        pdj pdjVar;
        ix0 ix0Var;
        p41 p41Var;
        ifj ifjVar3;
        Object objC;
        pdj pdjVar2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof pfj) {
            pfjVar = (pfj) nq4Var;
            int i = pfjVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                pfjVar.i = i - Integer.MIN_VALUE;
            } else {
                pfjVar = new pfj(this, nq4Var);
            }
        } else {
            pfjVar = new pfj(this, nq4Var);
        }
        pfj pfjVar2 = pfjVar;
        Object obj = pfjVar2.g;
        hu4 hu4Var = hu4.a;
        int i2 = pfjVar2.i;
        if (i2 != 0) {
            if (i2 == 1) {
                ifjVar2 = pfjVar2.d;
                ch3.d0(obj);
            } else {
                if (i2 == 2) {
                    ix0Var = pfjVar2.f;
                    pdj pdjVar3 = pfjVar2.e;
                    ifj ifjVar4 = pfjVar2.d;
                    ch3.d0(obj);
                    pdjVar = pdjVar3;
                    ifjVar3 = ifjVar4;
                    qfj qfjVar = new qfj(pdjVar, this, ifjVar3, (lq4) null);
                    pfjVar2.d = ifjVar3;
                    pfjVar2.e = pdjVar;
                    pfjVar2.f = null;
                    pfjVar2.i = 3;
                    objC = ix0Var.c(qfjVar, pfjVar2);
                    if (objC != hu4Var) {
                        pdjVar2 = pdjVar;
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
                pdjVar2 = pfjVar2.e;
                ifjVar3 = pfjVar2.d;
                ch3.d0(obj);
            }
            qfj qfjVar2 = new qfj(this, ifjVar3, pdjVar2, (lq4) null);
            pfjVar2.d = null;
            pfjVar2.e = null;
            pfjVar2.f = null;
            pfjVar2.i = 4;
            return ((es8) obj).d(qfjVar2, pfjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(obj);
        ifjVar = ifj.REQUEST_ACCESS;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.h;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            objA = qs8Var.a(pdj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + ifjVar, webAppJsonException);
                }
            }
            pfjVar2.d = ifjVar;
            pfjVar2.e = null;
            pfjVar2.f = null;
            pfjVar2.i = 1;
            if (l44VarH.a(p41Var2, ks8Var, ifjVar, null, pfjVar2) != hu4Var) {
                ifjVar2 = ifjVar;
                ifjVar = ifjVar2;
                objA = null;
            }
        }
        pdjVar = (pdj) objA;
        if (pdjVar != null) {
            ix0Var = new ix0(pdjVar.a, pdjVar.c);
            p41Var = this.h;
            pfjVar2.d = ifjVar;
            pfjVar2.e = pdjVar;
            pfjVar2.f = ix0Var;
            pfjVar2.i = 2;
            if (p41Var.a(pfjVar2, ix0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                qfj qfjVar3 = new qfj(pdjVar, this, ifjVar3, (lq4) null);
                pfjVar2.d = ifjVar3;
                pfjVar2.e = pdjVar;
                pfjVar2.f = null;
                pfjVar2.i = 3;
                objC = ix0Var.c(qfjVar3, pfjVar2);
                if (objC != hu4Var) {
                    pdjVar2 = pdjVar;
                    obj = objC;
                    qfj qfjVar4 = new qfj(this, ifjVar3, pdjVar2, (lq4) null);
                    pfjVar2.d = null;
                    pfjVar2.e = null;
                    pfjVar2.f = null;
                    pfjVar2.i = 4;
                    if (((es8) obj).d(qfjVar4, pfjVar2) == hu4Var) {
                    }
                }
            }
        }
        ifjVar = ifjVar2;
        objA = null;
        pdjVar = (pdj) objA;
        if (pdjVar != null) {
            ix0Var = new ix0(pdjVar.a, pdjVar.c);
            p41Var = this.h;
            pfjVar2.d = ifjVar;
            pfjVar2.e = pdjVar;
            pfjVar2.f = ix0Var;
            pfjVar2.i = 2;
            if (p41Var.a(pfjVar2, ix0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                qfj qfjVar5 = new qfj(pdjVar, this, ifjVar3, (lq4) null);
                pfjVar2.d = ifjVar3;
                pfjVar2.e = pdjVar;
                pfjVar2.f = null;
                pfjVar2.i = 3;
                objC = ix0Var.c(qfjVar5, pfjVar2);
                if (objC != hu4Var) {
                    pdjVar2 = pdjVar;
                    obj = objC;
                    qfj qfjVar6 = new qfj(this, ifjVar3, pdjVar2, (lq4) null);
                    pfjVar2.d = null;
                    pfjVar2.e = null;
                    pfjVar2.f = null;
                    pfjVar2.i = 4;
                    if (((es8) obj).d(qfjVar6, pfjVar2) == hu4Var) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x0167  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [egj, ifj, java.lang.String, mx0] */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String, mx0] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [egj, ifj, java.lang.String, lq4, mx0] */
    public final Object m(String str, nq4 nq4Var) {
        rfj rfjVar;
        ifj ifjVar;
        Object obj;
        ifj ifjVar2;
        ?? r15;
        Object objA;
        egj egjVar;
        String str2;
        mx0 mx0Var;
        p41 p41Var;
        ifj ifjVar3;
        mx0 mx0Var2;
        String str3;
        egj egjVar2;
        ?? r16;
        egj egjVar3;
        ifj ifjVar4;
        ?? r17;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof rfj) {
            rfjVar = (rfj) nq4Var;
            int i = rfjVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rfjVar.j = i - Integer.MIN_VALUE;
            } else {
                rfjVar = new rfj(this, nq4Var);
            }
        } else {
            rfjVar = new rfj(this, nq4Var);
        }
        rfj rfjVar2 = rfjVar;
        Object objC = rfjVar2.h;
        hu4 hu4Var = hu4.a;
        int i2 = rfjVar2.j;
        if (i2 != 0) {
            if (i2 == 1) {
                ifjVar2 = rfjVar2.d;
                ch3.d0(objC);
                obj = null;
            } else {
                if (i2 == 2) {
                    ch3.d0(objC);
                    return sbiVar;
                }
                if (i2 == 3) {
                    mx0 mx0Var3 = rfjVar2.g;
                    String str4 = rfjVar2.f;
                    egj egjVar4 = rfjVar2.e;
                    ifjVar3 = rfjVar2.d;
                    ch3.d0(objC);
                    r16 = 0;
                    str3 = str4;
                    egjVar2 = egjVar4;
                    mx0Var2 = mx0Var3;
                    poi poiVar = new poi(2, null, str3, egjVar2, this, ifjVar3);
                    rfjVar2.d = ifjVar3;
                    rfjVar2.e = egjVar2;
                    rfjVar2.f = r16;
                    rfjVar2.g = r16;
                    rfjVar2.j = 4;
                    objC = mx0Var2.c(poiVar, rfjVar2);
                    if (objC != hu4Var) {
                        egjVar3 = egjVar2;
                        ifjVar4 = ifjVar3;
                        r17 = r16;
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
                egj egjVar5 = rfjVar2.e;
                ifj ifjVar5 = rfjVar2.d;
                ch3.d0(objC);
                egjVar3 = egjVar5;
                ifjVar4 = ifjVar5;
                r17 = 0;
            }
            es8 es8Var = (es8) objC;
            ?? r4 = r17;
            poi poiVar2 = new poi(this, ifjVar4, egjVar3, r4, 3);
            rfjVar2.d = r4;
            rfjVar2.e = r4;
            rfjVar2.f = r4;
            rfjVar2.g = r4;
            rfjVar2.j = 5;
            return es8Var.d(poiVar2, rfjVar2) == hu4Var ? hu4Var : sbiVar;
        }
        ch3.d0(objC);
        ifjVar = ifj.UPDATE_TOKEN;
        qs8 qs8Var = this.a;
        l44 l44VarH = h();
        p41 p41Var2 = this.h;
        ks8 ks8Var = new ks8(new ns8("json_decode_error", 2));
        try {
            qs8Var.getClass();
            r15 = 0;
            objA = qs8Var.a(egj.Companion.serializer(), str);
        } catch (IllegalArgumentException e) {
            String name = qs8Var.getClass().getName();
            WebAppJsonException webAppJsonException = new WebAppJsonException(e);
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "json parse error at: " + ifjVar, webAppJsonException);
                }
            }
            rfjVar2.d = ifjVar;
            rfjVar2.e = null;
            rfjVar2.f = null;
            rfjVar2.g = null;
            rfjVar2.j = 1;
            obj = null;
            if (l44VarH.a(p41Var2, ks8Var, ifjVar, null, rfjVar2) != hu4Var) {
                ifjVar2 = ifjVar;
                ifjVar = ifjVar2;
                objA = obj;
                r15 = obj;
            }
        }
        egjVar = (egj) objA;
        if (egjVar != null) {
            str2 = egjVar.d;
            if (str2 != null || str2.length() == 0 || str2.length() <= 1024) {
                mx0Var = new mx0(egjVar.a, str2, egjVar.c);
                p41Var = this.h;
                rfjVar2.d = ifjVar;
                rfjVar2.e = egjVar;
                rfjVar2.f = str2;
                rfjVar2.g = mx0Var;
                rfjVar2.j = 3;
                if (p41Var.a(rfjVar2, mx0Var) != hu4Var) {
                    ifjVar3 = ifjVar;
                    mx0Var2 = mx0Var;
                    str3 = str2;
                    egjVar2 = egjVar;
                    r16 = r15;
                    poi poiVar3 = new poi(2, null, str3, egjVar2, this, ifjVar3);
                    rfjVar2.d = ifjVar3;
                    rfjVar2.e = egjVar2;
                    rfjVar2.f = r16;
                    rfjVar2.g = r16;
                    rfjVar2.j = 4;
                    objC = mx0Var2.c(poiVar3, rfjVar2);
                    if (objC != hu4Var) {
                        egjVar3 = egjVar2;
                        ifjVar4 = ifjVar3;
                        r17 = r16;
                        es8 es8Var2 = (es8) objC;
                        ?? r5 = r17;
                        poi poiVar4 = new poi(this, ifjVar4, egjVar3, r5, 3);
                        rfjVar2.d = r5;
                        rfjVar2.e = r5;
                        rfjVar2.f = r5;
                        rfjVar2.g = r5;
                        rfjVar2.j = 5;
                        if (es8Var2.d(poiVar4, rfjVar2) == hu4Var) {
                        }
                    }
                }
            } else {
                ms8 ms8VarG = g(new zej());
                l44 l44VarH2 = h();
                p41 p41Var3 = this.h;
                String str5 = egjVar.b;
                rfjVar2.d = r15;
                rfjVar2.e = r15;
                rfjVar2.f = r15;
                rfjVar2.g = r15;
                rfjVar2.j = 2;
                if (l44VarH2.a(p41Var3, ms8VarG, ifjVar, str5, rfjVar2) == hu4Var) {
                }
            }
        }
        ifjVar = ifjVar2;
        objA = obj;
        r15 = obj;
        egjVar = (egj) objA;
        if (egjVar != null) {
            str2 = egjVar.d;
            if (str2 != null) {
            }
            mx0Var = new mx0(egjVar.a, str2, egjVar.c);
            p41Var = this.h;
            rfjVar2.d = ifjVar;
            rfjVar2.e = egjVar;
            rfjVar2.f = str2;
            rfjVar2.g = mx0Var;
            rfjVar2.j = 3;
            if (p41Var.a(rfjVar2, mx0Var) != hu4Var) {
                ifjVar3 = ifjVar;
                mx0Var2 = mx0Var;
                str3 = str2;
                egjVar2 = egjVar;
                r16 = r15;
                poi poiVar5 = new poi(2, null, str3, egjVar2, this, ifjVar3);
                rfjVar2.d = ifjVar3;
                rfjVar2.e = egjVar2;
                rfjVar2.f = r16;
                rfjVar2.g = r16;
                rfjVar2.j = 4;
                objC = mx0Var2.c(poiVar5, rfjVar2);
                if (objC != hu4Var) {
                    egjVar3 = egjVar2;
                    ifjVar4 = ifjVar3;
                    r17 = r16;
                    es8 es8Var3 = (es8) objC;
                    ?? r6 = r17;
                    poi poiVar6 = new poi(this, ifjVar4, egjVar3, r6, 3);
                    rfjVar2.d = r6;
                    rfjVar2.e = r6;
                    rfjVar2.f = r6;
                    rfjVar2.g = r6;
                    rfjVar2.j = 5;
                    if (es8Var3.d(poiVar6, rfjVar2) == hu4Var) {
                    }
                }
            }
        }
    }
}
