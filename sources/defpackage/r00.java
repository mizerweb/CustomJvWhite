package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class r00 implements s00, xhe {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;

    public r00(ywf ywfVar) {
        this.c = new ave();
        this.d = new ave();
        this.e = new ave();
        this.f = new ave();
        this.g = new f0(0.0f);
        this.h = new f0(0.0f);
        this.a = new f0(0.0f);
        this.b = new f0(0.0f);
        this.i = new cy5(0);
        this.j = new cy5(0);
        this.k = new cy5(0);
        this.l = new cy5(0);
        this.c = ywfVar.a;
        this.d = ywfVar.b;
        this.e = ywfVar.c;
        this.f = ywfVar.d;
        this.g = ywfVar.e;
        this.h = ywfVar.f;
        this.a = ywfVar.g;
        this.b = ywfVar.h;
        this.i = ywfVar.i;
        this.j = ywfVar.j;
        this.k = ywfVar.k;
        this.l = ywfVar.l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(r00 r00Var, nq4 nq4Var) {
        faa faaVar;
        Object obj;
        if (nq4Var instanceof faa) {
            faaVar = (faa) nq4Var;
            int i = faaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                faaVar.g = i - Integer.MIN_VALUE;
            } else {
                faaVar = new faa(r00Var, nq4Var);
            }
        } else {
            faaVar = new faa(r00Var, nq4Var);
        }
        Object objH = faaVar.e;
        int i2 = faaVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objH);
            no4 no4Var = (no4) r00Var.c;
            faaVar.g = 1;
            objH = no4Var.a.h();
            if (objH != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(objH);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = faaVar.d;
            ch3.d0(objH);
        }
        qu6 qu6VarN0 = yhf.n0(new sw(1, (Iterable) obj), new s9a(1));
        qyc qycVar = (qyc) ((ifh) r00Var.e).getValue();
        vt4 context = faaVar.getContext();
        return new m2i(qu6VarN0, new zd(cqk.a(context), context, qycVar, 1));
        mjg mjgVar = (mjg) r00Var.h;
        faaVar.d = objH;
        faaVar.g = 2;
        mjgVar.setValue((List) objH);
        if (sbi.a != hu4Var) {
            obj = objH;
            qu6 qu6VarN1 = yhf.n0(new sw(1, (Iterable) obj), new s9a(1));
            qyc qycVar2 = (qyc) ((ifh) r00Var.e).getValue();
            vt4 context2 = faaVar.getContext();
            return new m2i(qu6VarN1, new zd(cqk.a(context2), context2, qycVar2, 1));
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(r00 r00Var, nq4 nq4Var) {
        gaa gaaVar;
        Object obj;
        if (nq4Var instanceof gaa) {
            gaaVar = (gaa) nq4Var;
            int i = gaaVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                gaaVar.g = i - Integer.MIN_VALUE;
            } else {
                gaaVar = new gaa(r00Var, nq4Var);
            }
        } else {
            gaaVar = new gaa(r00Var, nq4Var);
        }
        Object objJ = gaaVar.e;
        int i2 = gaaVar.g;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objJ);
            xn3 xn3Var = (xn3) r00Var.d;
            gaaVar.g = 1;
            objJ = xn3Var.j().J(new kn3(0));
            if (objJ != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            ch3.d0(objJ);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = gaaVar.d;
            ch3.d0(objJ);
        }
        qu6 qu6VarM0 = yhf.m0(new sw(1, (Iterable) obj), new s9a(2));
        vt4 context = gaaVar.getContext();
        return new m2i(qu6VarM0, new zd(cqk.a(context), context, r00Var, 2));
        mjg mjgVar = (mjg) r00Var.i;
        gaaVar.d = objJ;
        gaaVar.g = 2;
        mjgVar.setValue((List) objJ);
        if (sbi.a != hu4Var) {
            obj = objJ;
            qu6 qu6VarM1 = yhf.m0(new sw(1, (Iterable) obj), new s9a(2));
            vt4 context2 = gaaVar.getContext();
            return new m2i(qu6VarM1, new zd(cqk.a(context2), context2, r00Var, 2));
        }
        return hu4Var;
    }

    public static final ArrayList c(r00 r00Var, List list, String str) {
        String strA;
        r00Var.getClass();
        ny8 ny8Var = (ny8) r00Var.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            vg4 vg4Var = (vg4) obj;
            if (z5h.K0(String.valueOf(vg4Var.w()), str, false) || ((daf) ny8Var.getValue()).g(String.valueOf(vg4Var.k()), str) || ((strA = xoh.a(vg4Var.o())) != null && ((daf) ny8Var.getValue()).g(strA, str))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public ywf d() {
        ywf ywfVar = new ywf();
        ywfVar.a = (yab) this.c;
        ywfVar.b = (yab) this.d;
        ywfVar.c = (yab) this.e;
        ywfVar.d = (yab) this.f;
        ywfVar.e = (mt4) this.g;
        ywfVar.f = (mt4) this.h;
        ywfVar.g = (mt4) this.a;
        ywfVar.h = (mt4) this.b;
        ywfVar.i = (cy5) this.i;
        ywfVar.j = (cy5) this.j;
        ywfVar.k = (cy5) this.k;
        ywfVar.l = (cy5) this.l;
        return ywfVar;
    }

    public Long e() {
        if (((Boolean) ((e5d) ((ny8) this.l).getValue()).q5.a(e5d.S6[330]).i()).booleanValue()) {
            return Long.valueOf(((s7f) ((et3) ((ny8) this.k).getValue())).f());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object f(nq4 nq4Var) {
        m00 m00Var;
        Object objR;
        ny8 ny8Var = (ny8) this.b;
        if (nq4Var instanceof m00) {
            m00Var = (m00) nq4Var;
            int i = m00Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                m00Var.f = i - Integer.MIN_VALUE;
            } else {
                m00Var = new m00(this, nq4Var);
            }
        } else {
            m00Var = new m00(this, nq4Var);
        }
        Object objI = m00Var.d;
        int i2 = m00Var.f;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            q24 q24Var = (q24) this.c;
            wy2 wy2Var = new wy2(q24Var.a, -1L, 0, 0L, 1, 0L, true, true, mg5.REGULAR, (String) null, new Long(q24Var.b), 1024);
            m00Var.f = 1;
            objI = i(wy2Var, m00Var);
            if (objI != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(objI);
                    return objI;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        long jLongValue = ((Number) objI).longValue();
        l34 l34Var = (l34) ny8Var.getValue();
        m00Var.f = 3;
        objR = l34Var.r(jLongValue, m00Var);
        if (objR != obj) {
            return obj;
        }
        return objR;
        gda gdaVar = (gda) ww3.t1(((fz2) objI).c);
        if (gdaVar == null) {
            return null;
        }
        l34 l34Var2 = (l34) ny8Var.getValue();
        q24 q24Var2 = (q24) this.c;
        long jA = ((l7f) this.g).a();
        Long lE = e();
        m00Var.f = 2;
        objI = ((j35) l34Var2.b.getValue()).b(new f24(l34Var2, q24Var2, gdaVar, jA, lE, (lq4) null), m00Var);
        if (objI != obj) {
            long jLongValue2 = ((Number) objI).longValue();
            l34 l34Var3 = (l34) ny8Var.getValue();
            m00Var.f = 3;
            objR = l34Var3.r(jLongValue2, m00Var);
            if (objR != obj) {
                return objR;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(fz2 fz2Var, nq4 nq4Var) {
        n00 n00Var;
        a0b a0bVar = (a0b) this.e;
        if (nq4Var instanceof n00) {
            n00Var = (n00) nq4Var;
            int i = n00Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                n00Var.f = i - Integer.MIN_VALUE;
            } else {
                n00Var = new n00(this, nq4Var);
            }
        } else {
            n00Var = new n00(this, nq4Var);
        }
        Object objK = n00Var.d;
        int i2 = n00Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objK);
                ghb ghbVar = ew5.b;
                long jO = qe7.O(2, lw5.SECONDS);
                n00Var.f = 1;
                objK = a0bVar.k(fz2Var, jO, n00Var);
                hu4 hu4Var = hu4.a;
                if (objK == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objK);
            }
            m8b m8bVar = (m8b) objK;
            if (m8bVar.j()) {
                a0b.u(a0bVar, m8bVar);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V((String) this.h, "fail to request missed contacts", th);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0262 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:34:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:38:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:40:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x021d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0227  */
    /* JADX WARN: Code duplicated, block: B:49:0x0230  */
    /* JADX WARN: Code duplicated, block: B:52:0x0238  */
    /* JADX WARN: Code duplicated, block: B:56:0x024c  */
    /* JADX WARN: Code duplicated, block: B:58:0x025f  */
    /* JADX WARN: Code duplicated, block: B:62:0x026f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0283  */
    /* JADX WARN: Code duplicated, block: B:72:0x0286  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x02dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Code duplicated, block: B:89:0x0392  */
    /* JADX WARN: Code duplicated, block: B:92:0x039a  */
    /* JADX WARN: Code duplicated, block: B:94:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:96:0x03aa  */
    public Object h(fz2 fz2Var, s04 s04Var, long j, int i, long j2, int i2, long j3, nq4 nq4Var) {
        o00 o00Var;
        long j4;
        hu4 hu4Var;
        int i3;
        long j5;
        int i4;
        long j6;
        s04 s04Var2;
        fz2 fz2Var2;
        hu4 hu4Var2;
        Object objB;
        o00 o00Var2;
        long j7;
        long j8;
        fz2 fz2Var3;
        fz2 fz2Var4;
        int i5;
        long j9;
        long j10;
        long j11;
        long j12;
        int i6;
        Long l;
        s04 s04Var3;
        int i7;
        ky3 ky3Var;
        int i8;
        long j13;
        int i9;
        s04 s04Var4;
        hu4 hu4Var3;
        int i10;
        ArrayList arrayList;
        Iterator it;
        long j14;
        hu4 hu4Var4;
        int i11;
        hu4 hu4Var5;
        long j15;
        int i12;
        r00 r00Var;
        int i13;
        int i14;
        int i15;
        long j16;
        long j17;
        int i16;
        long j18;
        fz2 fz2Var5;
        ky3 ky3Var2;
        Object objF;
        int i17;
        fz2 fz2Var6;
        s04 s04Var5;
        int i18;
        int i19;
        long j19;
        int i20;
        int i21;
        int i22;
        fz2 fz2Var7;
        s04 s04Var6;
        Object next;
        fx2 fx2VarC;
        long j20;
        hu4 hu4Var6;
        fz2 fz2Var8;
        fx2 fx2Var;
        long j21;
        fz2 fz2Var9;
        s04 s04Var7;
        nx2 nx2Var;
        fz2 fz2Var10 = fz2Var;
        ny8 ny8Var = (ny8) this.b;
        q24 q24Var = (q24) this.c;
        if (nq4Var instanceof o00) {
            o00Var = (o00) nq4Var;
            int i23 = o00Var.q;
            if ((i23 & Integer.MIN_VALUE) != 0) {
                o00Var.q = i23 - Integer.MIN_VALUE;
            } else {
                o00Var = new o00(this, nq4Var);
            }
        } else {
            o00Var = new o00(this, nq4Var);
        }
        Object objR = o00Var.o;
        int i24 = o00Var.q;
        hu4 hu4Var7 = hu4.a;
        switch (i24) {
            case 0:
                ch3.d0(objR);
                l34 l34Var = (l34) ny8Var.getValue();
                q24 q24Var2 = (q24) this.c;
                List list = fz2Var10.c;
                long jA = ((l7f) this.g).a();
                Long lE = e();
                o00Var.d = fz2Var10;
                o00Var.e = s04Var;
                j4 = j;
                o00Var.g = j4;
                o00Var.k = i;
                o00Var.h = j2;
                o00Var.l = i2;
                o00Var.i = j3;
                o00Var.q = 1;
                Object objB2 = ((j35) l34Var.b.getValue()).b(new w24(lE, list, l34Var, q24Var2, jA, null), o00Var);
                if (objB2 != hu4Var7) {
                    objB2 = sbi.a;
                }
                if (objB2 == hu4Var7) {
                    return hu4Var7;
                }
                hu4Var = hu4Var7;
                i3 = i2;
                j5 = j2;
                i4 = i;
                j6 = j3;
                s04Var2 = s04Var;
                bs3 bs3Var = (bs3) ((ny8) this.i).getValue();
                q24 q24Var3 = (q24) this.c;
                List list2 = fz2Var10.c;
                o00Var.d = fz2Var10;
                o00Var.e = s04Var2;
                o00Var.g = j4;
                o00Var.k = i4;
                o00Var.h = j5;
                o00Var.l = i3;
                o00Var.i = j6;
                fz2Var2 = fz2Var10;
                o00Var.q = 2;
                o00 o00Var3 = o00Var;
                hu4Var2 = hu4Var;
                objB = bs3Var.b(q24Var3, j4, i3, j6, i4, j5, list2, o00Var3);
                o00Var2 = o00Var3;
                if (objB != hu4Var2) {
                    long j22 = j5;
                    j7 = j4;
                    j8 = j22;
                    fz2Var3 = fz2Var2;
                    o00Var2.d = fz2Var3;
                    o00Var2.e = s04Var2;
                    o00Var2.g = j7;
                    o00Var2.k = i4;
                    o00Var2.h = j8;
                    o00Var2.l = i3;
                    o00Var2.i = j6;
                    o00Var2.q = 3;
                    if (g(fz2Var3, o00Var2) != hu4Var2) {
                        fz2Var4 = fz2Var3;
                        i5 = i4;
                        j9 = j7;
                        j10 = j6;
                        j11 = j8;
                        j12 = j10;
                        i6 = i5;
                        l = new Long(s04Var2.b.y);
                        if (l.longValue() == 0) {
                            l = null;
                        }
                        if (l != null) {
                            long jLongValue = l.longValue();
                            l34 l34Var2 = (l34) ny8Var.getValue();
                            o00Var2.d = fz2Var4;
                            o00Var2.e = s04Var2;
                            o00Var2.g = j9;
                            s04Var3 = s04Var2;
                            o00Var2.k = i6;
                            o00Var2.h = j11;
                            o00Var2.l = i3;
                            o00Var2.i = j12;
                            o00Var2.j = jLongValue;
                            o00Var2.m = 0;
                            o00Var2.q = 4;
                            objR = l34Var2.r(jLongValue, o00Var2);
                            if (objR != hu4Var2) {
                                i8 = i6;
                                ky3Var = (ky3) objR;
                                i7 = i8;
                            }
                        } else {
                            s04Var3 = s04Var2;
                            i7 = i6;
                            ky3Var = null;
                        }
                        j13 = j11;
                        i9 = i3;
                        s04Var4 = s04Var3;
                        hu4Var3 = hu4Var2;
                        if (ky3Var == null && j9 == ky3Var.c) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        List list3 = fz2Var4.c;
                        arrayList = new ArrayList();
                        it = list3.iterator();
                        while (it.hasNext()) {
                            Iterator it2 = it;
                            next = it2.next();
                            hu4 hu4Var8 = hu4Var3;
                            long j23 = j12;
                            if (((gda) next).b >= j9) {
                                arrayList.add(next);
                            }
                            it = it2;
                            hu4Var3 = hu4Var8;
                            j12 = j23;
                        }
                        j14 = j12;
                        hu4Var4 = hu4Var3;
                        if (i9 > 0 || j14 != 0 || ((arrayList.isEmpty() && i10 == 0) || arrayList.size() >= i9)) {
                            i11 = 0;
                        } else {
                            i11 = 1;
                        }
                        if (i11 != 0) {
                            l34 l34Var3 = (l34) ny8Var.getValue();
                            o00Var2.d = fz2Var4;
                            o00Var2.e = s04Var4;
                            o00Var2.g = j9;
                            o00Var2.k = i7;
                            o00Var2.h = j13;
                            o00Var2.l = i9;
                            j19 = j14;
                            o00Var2.i = j19;
                            o00Var2.m = i10;
                            o00Var2.n = i11;
                            o00Var2.q = 5;
                            objR = l34Var3.w(q24Var, o00Var2);
                            hu4Var5 = hu4Var4;
                            if (objR == hu4Var5) {
                                return hu4Var5;
                            }
                            int i25 = i7;
                            i20 = i10;
                            i21 = i25;
                            i22 = i11;
                            fz2Var7 = fz2Var4;
                            s04Var6 = s04Var4;
                            i15 = i21;
                            fz2Var5 = fz2Var7;
                            ky3Var2 = (ky3) objR;
                            i14 = i20;
                            j16 = j13;
                            j17 = j19;
                            i16 = i9;
                            j18 = j9;
                            s04Var4 = s04Var6;
                            i13 = i22;
                            r00Var = this;
                        } else {
                            hu4Var5 = hu4Var4;
                            j15 = j14;
                            i12 = i11;
                            if (s04Var4.b.j == 0 || i9 <= 0) {
                                r00Var = this;
                                i13 = i12;
                                i14 = i10;
                                i15 = i7;
                                j16 = j13;
                                j17 = j15;
                                i16 = i9;
                                j18 = j9;
                                fz2Var5 = fz2Var4;
                                ky3Var2 = null;
                            } else {
                                o00Var2.d = fz2Var4;
                                o00Var2.e = s04Var4;
                                o00Var2.g = j9;
                                o00Var2.k = i7;
                                o00Var2.h = j13;
                                o00Var2.l = i9;
                                o00Var2.i = j15;
                                o00Var2.m = i10;
                                o00Var2.n = i12;
                                o00Var2.q = 6;
                                r00Var = this;
                                int i26 = i10;
                                objF = r00Var.f(o00Var2);
                                if (objF == hu4Var5) {
                                    return hu4Var5;
                                }
                                i17 = i12;
                                fz2Var6 = fz2Var4;
                                s04Var5 = s04Var4;
                                i18 = i7;
                                i19 = i26;
                                ky3Var2 = (ky3) objF;
                                fz2Var5 = fz2Var6;
                                i14 = i19;
                                j16 = j13;
                                j17 = j15;
                                i15 = i18;
                                i16 = i9;
                                j18 = j9;
                                s04Var4 = s04Var5;
                                i13 = i17;
                            }
                        }
                        fx2VarC = s04Var4.b.n.c(false);
                        j20 = s04Var4.b.j;
                        xn3 xn3Var = (xn3) ((ny8) r00Var.a).getValue();
                        q24 q24Var4 = s04Var4.r;
                        p00 p00Var = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                        hu4Var6 = hu4Var5;
                        fz2Var8 = fz2Var5;
                        o00Var2.d = fz2Var8;
                        o00Var2.e = null;
                        o00Var2.f = fx2VarC;
                        o00Var2.g = j18;
                        o00Var2.k = i15;
                        o00Var2.h = j16;
                        o00Var2.l = i16;
                        o00Var2.i = j17;
                        o00Var2.m = i14;
                        o00Var2.n = i13;
                        o00Var2.j = j20;
                        o00Var2.q = 7;
                        objR = xn3Var.e(q24Var4, p00Var, o00Var2);
                        if (objR == hu4Var6) {
                            return hu4Var6;
                        }
                        fx2Var = fx2VarC;
                        j21 = j20;
                        fz2Var9 = fz2Var8;
                        s04Var7 = (s04) objR;
                        if (s04Var7 != null) {
                            nx2Var = s04Var7.b;
                            if (cqk.d(fx2Var, nx2Var.n) || j21 != nx2Var.j) {
                                ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                            }
                        }
                        return new Integer(fz2Var9.c.size());
                    }
                }
                return hu4Var2;
            case 1:
                long j24 = o00Var.i;
                int i27 = o00Var.l;
                long j25 = o00Var.h;
                int i28 = o00Var.k;
                long j26 = o00Var.g;
                s04 s04Var8 = o00Var.e;
                fz2 fz2Var11 = o00Var.d;
                ch3.d0(objR);
                s04Var2 = s04Var8;
                i3 = i27;
                fz2Var10 = fz2Var11;
                j5 = j25;
                j4 = j26;
                i4 = i28;
                j6 = j24;
                hu4Var = hu4Var7;
                bs3 bs3Var2 = (bs3) ((ny8) this.i).getValue();
                q24 q24Var5 = (q24) this.c;
                List list4 = fz2Var10.c;
                o00Var.d = fz2Var10;
                o00Var.e = s04Var2;
                o00Var.g = j4;
                o00Var.k = i4;
                o00Var.h = j5;
                o00Var.l = i3;
                o00Var.i = j6;
                fz2Var2 = fz2Var10;
                o00Var.q = 2;
                o00 o00Var4 = o00Var;
                hu4Var2 = hu4Var;
                objB = bs3Var2.b(q24Var5, j4, i3, j6, i4, j5, list4, o00Var4);
                o00Var2 = o00Var4;
                if (objB != hu4Var2) {
                    long j27 = j5;
                    j7 = j4;
                    j8 = j27;
                    fz2Var3 = fz2Var2;
                    o00Var2.d = fz2Var3;
                    o00Var2.e = s04Var2;
                    o00Var2.g = j7;
                    o00Var2.k = i4;
                    o00Var2.h = j8;
                    o00Var2.l = i3;
                    o00Var2.i = j6;
                    o00Var2.q = 3;
                    if (g(fz2Var3, o00Var2) != hu4Var2) {
                        fz2Var4 = fz2Var3;
                        i5 = i4;
                        j9 = j7;
                        j10 = j6;
                        j11 = j8;
                        j12 = j10;
                        i6 = i5;
                        l = new Long(s04Var2.b.y);
                        if (l.longValue() == 0) {
                            l = null;
                        }
                        if (l != null) {
                            long jLongValue2 = l.longValue();
                            l34 l34Var4 = (l34) ny8Var.getValue();
                            o00Var2.d = fz2Var4;
                            o00Var2.e = s04Var2;
                            o00Var2.g = j9;
                            s04Var3 = s04Var2;
                            o00Var2.k = i6;
                            o00Var2.h = j11;
                            o00Var2.l = i3;
                            o00Var2.i = j12;
                            o00Var2.j = jLongValue2;
                            o00Var2.m = 0;
                            o00Var2.q = 4;
                            objR = l34Var4.r(jLongValue2, o00Var2);
                            if (objR != hu4Var2) {
                                i8 = i6;
                                ky3Var = (ky3) objR;
                                i7 = i8;
                            }
                        } else {
                            s04Var3 = s04Var2;
                            i7 = i6;
                            ky3Var = null;
                        }
                        j13 = j11;
                        i9 = i3;
                        s04Var4 = s04Var3;
                        hu4Var3 = hu4Var2;
                        if (ky3Var == null) {
                            i10 = 0;
                        } else {
                            i10 = 0;
                        }
                        List list5 = fz2Var4.c;
                        arrayList = new ArrayList();
                        it = list5.iterator();
                        while (it.hasNext()) {
                            Iterator it3 = it;
                            next = it3.next();
                            hu4 hu4Var9 = hu4Var3;
                            long j28 = j12;
                            if (((gda) next).b >= j9) {
                                arrayList.add(next);
                            }
                            it = it3;
                            hu4Var3 = hu4Var9;
                            j12 = j28;
                        }
                        j14 = j12;
                        hu4Var4 = hu4Var3;
                        if (i9 > 0) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                        }
                        if (i11 != 0) {
                            l34 l34Var5 = (l34) ny8Var.getValue();
                            o00Var2.d = fz2Var4;
                            o00Var2.e = s04Var4;
                            o00Var2.g = j9;
                            o00Var2.k = i7;
                            o00Var2.h = j13;
                            o00Var2.l = i9;
                            j19 = j14;
                            o00Var2.i = j19;
                            o00Var2.m = i10;
                            o00Var2.n = i11;
                            o00Var2.q = 5;
                            objR = l34Var5.w(q24Var, o00Var2);
                            hu4Var5 = hu4Var4;
                            if (objR == hu4Var5) {
                                return hu4Var5;
                            }
                            int i29 = i7;
                            i20 = i10;
                            i21 = i29;
                            i22 = i11;
                            fz2Var7 = fz2Var4;
                            s04Var6 = s04Var4;
                            i15 = i21;
                            fz2Var5 = fz2Var7;
                            ky3Var2 = (ky3) objR;
                            i14 = i20;
                            j16 = j13;
                            j17 = j19;
                            i16 = i9;
                            j18 = j9;
                            s04Var4 = s04Var6;
                            i13 = i22;
                            r00Var = this;
                        } else {
                            hu4Var5 = hu4Var4;
                            j15 = j14;
                            i12 = i11;
                            if (s04Var4.b.j == 0) {
                            }
                            r00Var = this;
                            i13 = i12;
                            i14 = i10;
                            i15 = i7;
                            j16 = j13;
                            j17 = j15;
                            i16 = i9;
                            j18 = j9;
                            fz2Var5 = fz2Var4;
                            ky3Var2 = null;
                        }
                        fx2VarC = s04Var4.b.n.c(false);
                        j20 = s04Var4.b.j;
                        xn3 xn3Var2 = (xn3) ((ny8) r00Var.a).getValue();
                        q24 q24Var6 = s04Var4.r;
                        p00 p00Var2 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                        hu4Var6 = hu4Var5;
                        fz2Var8 = fz2Var5;
                        o00Var2.d = fz2Var8;
                        o00Var2.e = null;
                        o00Var2.f = fx2VarC;
                        o00Var2.g = j18;
                        o00Var2.k = i15;
                        o00Var2.h = j16;
                        o00Var2.l = i16;
                        o00Var2.i = j17;
                        o00Var2.m = i14;
                        o00Var2.n = i13;
                        o00Var2.j = j20;
                        o00Var2.q = 7;
                        objR = xn3Var2.e(q24Var6, p00Var2, o00Var2);
                        if (objR == hu4Var6) {
                            return hu4Var6;
                        }
                        fx2Var = fx2VarC;
                        j21 = j20;
                        fz2Var9 = fz2Var8;
                        s04Var7 = (s04) objR;
                        if (s04Var7 != null) {
                            nx2Var = s04Var7.b;
                            if (cqk.d(fx2Var, nx2Var.n)) {
                                ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                            } else {
                                ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                            }
                        }
                        return new Integer(fz2Var9.c.size());
                    }
                }
                return hu4Var2;
            case 2:
                long j29 = o00Var.i;
                int i30 = o00Var.l;
                j8 = o00Var.h;
                int i31 = o00Var.k;
                long j30 = o00Var.g;
                s04 s04Var9 = o00Var.e;
                fz2 fz2Var12 = o00Var.d;
                ch3.d0(objR);
                i3 = i30;
                hu4Var2 = hu4Var7;
                s04Var2 = s04Var9;
                o00Var2 = o00Var;
                fz2Var3 = fz2Var12;
                j7 = j30;
                i4 = i31;
                j6 = j29;
                o00Var2.d = fz2Var3;
                o00Var2.e = s04Var2;
                o00Var2.g = j7;
                o00Var2.k = i4;
                o00Var2.h = j8;
                o00Var2.l = i3;
                o00Var2.i = j6;
                o00Var2.q = 3;
                if (g(fz2Var3, o00Var2) != hu4Var2) {
                    fz2Var4 = fz2Var3;
                    i5 = i4;
                    j9 = j7;
                    j10 = j6;
                    j11 = j8;
                    j12 = j10;
                    i6 = i5;
                    l = new Long(s04Var2.b.y);
                    if (l.longValue() == 0) {
                        l = null;
                    }
                    if (l != null) {
                        long jLongValue3 = l.longValue();
                        l34 l34Var6 = (l34) ny8Var.getValue();
                        o00Var2.d = fz2Var4;
                        o00Var2.e = s04Var2;
                        o00Var2.g = j9;
                        s04Var3 = s04Var2;
                        o00Var2.k = i6;
                        o00Var2.h = j11;
                        o00Var2.l = i3;
                        o00Var2.i = j12;
                        o00Var2.j = jLongValue3;
                        o00Var2.m = 0;
                        o00Var2.q = 4;
                        objR = l34Var6.r(jLongValue3, o00Var2);
                        if (objR != hu4Var2) {
                            i8 = i6;
                            ky3Var = (ky3) objR;
                            i7 = i8;
                        }
                    } else {
                        s04Var3 = s04Var2;
                        i7 = i6;
                        ky3Var = null;
                    }
                    j13 = j11;
                    i9 = i3;
                    s04Var4 = s04Var3;
                    hu4Var3 = hu4Var2;
                    if (ky3Var == null) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                    }
                    List list6 = fz2Var4.c;
                    arrayList = new ArrayList();
                    it = list6.iterator();
                    while (it.hasNext()) {
                        Iterator it4 = it;
                        next = it4.next();
                        hu4 hu4Var10 = hu4Var3;
                        long j210 = j12;
                        if (((gda) next).b >= j9) {
                            arrayList.add(next);
                        }
                        it = it4;
                        hu4Var3 = hu4Var10;
                        j12 = j210;
                    }
                    j14 = j12;
                    hu4Var4 = hu4Var3;
                    if (i9 > 0) {
                        i11 = 0;
                    } else {
                        i11 = 0;
                    }
                    if (i11 != 0) {
                        l34 l34Var7 = (l34) ny8Var.getValue();
                        o00Var2.d = fz2Var4;
                        o00Var2.e = s04Var4;
                        o00Var2.g = j9;
                        o00Var2.k = i7;
                        o00Var2.h = j13;
                        o00Var2.l = i9;
                        j19 = j14;
                        o00Var2.i = j19;
                        o00Var2.m = i10;
                        o00Var2.n = i11;
                        o00Var2.q = 5;
                        objR = l34Var7.w(q24Var, o00Var2);
                        hu4Var5 = hu4Var4;
                        if (objR == hu4Var5) {
                            return hu4Var5;
                        }
                        int i210 = i7;
                        i20 = i10;
                        i21 = i210;
                        i22 = i11;
                        fz2Var7 = fz2Var4;
                        s04Var6 = s04Var4;
                        i15 = i21;
                        fz2Var5 = fz2Var7;
                        ky3Var2 = (ky3) objR;
                        i14 = i20;
                        j16 = j13;
                        j17 = j19;
                        i16 = i9;
                        j18 = j9;
                        s04Var4 = s04Var6;
                        i13 = i22;
                        r00Var = this;
                    } else {
                        hu4Var5 = hu4Var4;
                        j15 = j14;
                        i12 = i11;
                        if (s04Var4.b.j == 0) {
                        }
                        r00Var = this;
                        i13 = i12;
                        i14 = i10;
                        i15 = i7;
                        j16 = j13;
                        j17 = j15;
                        i16 = i9;
                        j18 = j9;
                        fz2Var5 = fz2Var4;
                        ky3Var2 = null;
                    }
                    fx2VarC = s04Var4.b.n.c(false);
                    j20 = s04Var4.b.j;
                    xn3 xn3Var3 = (xn3) ((ny8) r00Var.a).getValue();
                    q24 q24Var7 = s04Var4.r;
                    p00 p00Var3 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                    hu4Var6 = hu4Var5;
                    fz2Var8 = fz2Var5;
                    o00Var2.d = fz2Var8;
                    o00Var2.e = null;
                    o00Var2.f = fx2VarC;
                    o00Var2.g = j18;
                    o00Var2.k = i15;
                    o00Var2.h = j16;
                    o00Var2.l = i16;
                    o00Var2.i = j17;
                    o00Var2.m = i14;
                    o00Var2.n = i13;
                    o00Var2.j = j20;
                    o00Var2.q = 7;
                    objR = xn3Var3.e(q24Var7, p00Var3, o00Var2);
                    if (objR == hu4Var6) {
                        return hu4Var6;
                    }
                    fx2Var = fx2VarC;
                    j21 = j20;
                    fz2Var9 = fz2Var8;
                    s04Var7 = (s04) objR;
                    if (s04Var7 != null) {
                        nx2Var = s04Var7.b;
                        if (cqk.d(fx2Var, nx2Var.n)) {
                            ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                        } else {
                            ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                        }
                    }
                    return new Integer(fz2Var9.c.size());
                }
                return hu4Var2;
            case 3:
                long j31 = o00Var.i;
                int i32 = o00Var.l;
                j8 = o00Var.h;
                int i33 = o00Var.k;
                long j32 = o00Var.g;
                s04 s04Var10 = o00Var.e;
                fz2Var4 = o00Var.d;
                ch3.d0(objR);
                i3 = i32;
                hu4Var2 = hu4Var7;
                ny8Var = ny8Var;
                s04Var2 = s04Var10;
                j9 = j32;
                j10 = j31;
                o00Var2 = o00Var;
                i5 = i33;
                j11 = j8;
                j12 = j10;
                i6 = i5;
                l = new Long(s04Var2.b.y);
                if (l.longValue() == 0) {
                    l = null;
                }
                if (l != null) {
                    long jLongValue4 = l.longValue();
                    l34 l34Var8 = (l34) ny8Var.getValue();
                    o00Var2.d = fz2Var4;
                    o00Var2.e = s04Var2;
                    o00Var2.g = j9;
                    s04Var3 = s04Var2;
                    o00Var2.k = i6;
                    o00Var2.h = j11;
                    o00Var2.l = i3;
                    o00Var2.i = j12;
                    o00Var2.j = jLongValue4;
                    o00Var2.m = 0;
                    o00Var2.q = 4;
                    objR = l34Var8.r(jLongValue4, o00Var2);
                    if (objR != hu4Var2) {
                        i8 = i6;
                        ky3Var = (ky3) objR;
                        i7 = i8;
                    }
                    return hu4Var2;
                }
                s04Var3 = s04Var2;
                i7 = i6;
                ky3Var = null;
                j13 = j11;
                i9 = i3;
                s04Var4 = s04Var3;
                hu4Var3 = hu4Var2;
                if (ky3Var == null) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
                List list7 = fz2Var4.c;
                arrayList = new ArrayList();
                it = list7.iterator();
                while (it.hasNext()) {
                    Iterator it5 = it;
                    next = it5.next();
                    hu4 hu4Var11 = hu4Var3;
                    long j211 = j12;
                    if (((gda) next).b >= j9) {
                        arrayList.add(next);
                    }
                    it = it5;
                    hu4Var3 = hu4Var11;
                    j12 = j211;
                }
                j14 = j12;
                hu4Var4 = hu4Var3;
                if (i9 > 0) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    l34 l34Var9 = (l34) ny8Var.getValue();
                    o00Var2.d = fz2Var4;
                    o00Var2.e = s04Var4;
                    o00Var2.g = j9;
                    o00Var2.k = i7;
                    o00Var2.h = j13;
                    o00Var2.l = i9;
                    j19 = j14;
                    o00Var2.i = j19;
                    o00Var2.m = i10;
                    o00Var2.n = i11;
                    o00Var2.q = 5;
                    objR = l34Var9.w(q24Var, o00Var2);
                    hu4Var5 = hu4Var4;
                    if (objR == hu4Var5) {
                        return hu4Var5;
                    }
                    int i211 = i7;
                    i20 = i10;
                    i21 = i211;
                    i22 = i11;
                    fz2Var7 = fz2Var4;
                    s04Var6 = s04Var4;
                    i15 = i21;
                    fz2Var5 = fz2Var7;
                    ky3Var2 = (ky3) objR;
                    i14 = i20;
                    j16 = j13;
                    j17 = j19;
                    i16 = i9;
                    j18 = j9;
                    s04Var4 = s04Var6;
                    i13 = i22;
                    r00Var = this;
                } else {
                    hu4Var5 = hu4Var4;
                    j15 = j14;
                    i12 = i11;
                    if (s04Var4.b.j == 0) {
                    }
                    r00Var = this;
                    i13 = i12;
                    i14 = i10;
                    i15 = i7;
                    j16 = j13;
                    j17 = j15;
                    i16 = i9;
                    j18 = j9;
                    fz2Var5 = fz2Var4;
                    ky3Var2 = null;
                }
                fx2VarC = s04Var4.b.n.c(false);
                j20 = s04Var4.b.j;
                xn3 xn3Var4 = (xn3) ((ny8) r00Var.a).getValue();
                q24 q24Var8 = s04Var4.r;
                p00 p00Var4 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                hu4Var6 = hu4Var5;
                fz2Var8 = fz2Var5;
                o00Var2.d = fz2Var8;
                o00Var2.e = null;
                o00Var2.f = fx2VarC;
                o00Var2.g = j18;
                o00Var2.k = i15;
                o00Var2.h = j16;
                o00Var2.l = i16;
                o00Var2.i = j17;
                o00Var2.m = i14;
                o00Var2.n = i13;
                o00Var2.j = j20;
                o00Var2.q = 7;
                objR = xn3Var4.e(q24Var8, p00Var4, o00Var2);
                if (objR == hu4Var6) {
                    return hu4Var6;
                }
                fx2Var = fx2VarC;
                j21 = j20;
                fz2Var9 = fz2Var8;
                s04Var7 = (s04) objR;
                if (s04Var7 != null) {
                    nx2Var = s04Var7.b;
                    if (cqk.d(fx2Var, nx2Var.n)) {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    } else {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    }
                }
                return new Integer(fz2Var9.c.size());
            case 4:
                j12 = o00Var.i;
                int i34 = o00Var.l;
                j11 = o00Var.h;
                i8 = o00Var.k;
                j9 = o00Var.g;
                s04 s04Var11 = o00Var.e;
                fz2 fz2Var13 = o00Var.d;
                ch3.d0(objR);
                i3 = i34;
                hu4Var2 = hu4Var7;
                ny8Var = ny8Var;
                s04Var3 = s04Var11;
                fz2Var4 = fz2Var13;
                o00Var2 = o00Var;
                ky3Var = (ky3) objR;
                i7 = i8;
                j13 = j11;
                i9 = i3;
                s04Var4 = s04Var3;
                hu4Var3 = hu4Var2;
                if (ky3Var == null) {
                    i10 = 0;
                } else {
                    i10 = 0;
                }
                List list8 = fz2Var4.c;
                arrayList = new ArrayList();
                it = list8.iterator();
                while (it.hasNext()) {
                    Iterator it6 = it;
                    next = it6.next();
                    hu4 hu4Var12 = hu4Var3;
                    long j212 = j12;
                    if (((gda) next).b >= j9) {
                        arrayList.add(next);
                    }
                    it = it6;
                    hu4Var3 = hu4Var12;
                    j12 = j212;
                }
                j14 = j12;
                hu4Var4 = hu4Var3;
                if (i9 > 0) {
                    i11 = 0;
                } else {
                    i11 = 0;
                }
                if (i11 != 0) {
                    l34 l34Var10 = (l34) ny8Var.getValue();
                    o00Var2.d = fz2Var4;
                    o00Var2.e = s04Var4;
                    o00Var2.g = j9;
                    o00Var2.k = i7;
                    o00Var2.h = j13;
                    o00Var2.l = i9;
                    j19 = j14;
                    o00Var2.i = j19;
                    o00Var2.m = i10;
                    o00Var2.n = i11;
                    o00Var2.q = 5;
                    objR = l34Var10.w(q24Var, o00Var2);
                    hu4Var5 = hu4Var4;
                    if (objR == hu4Var5) {
                        return hu4Var5;
                    }
                    int i212 = i7;
                    i20 = i10;
                    i21 = i212;
                    i22 = i11;
                    fz2Var7 = fz2Var4;
                    s04Var6 = s04Var4;
                    i15 = i21;
                    fz2Var5 = fz2Var7;
                    ky3Var2 = (ky3) objR;
                    i14 = i20;
                    j16 = j13;
                    j17 = j19;
                    i16 = i9;
                    j18 = j9;
                    s04Var4 = s04Var6;
                    i13 = i22;
                    r00Var = this;
                } else {
                    hu4Var5 = hu4Var4;
                    j15 = j14;
                    i12 = i11;
                    if (s04Var4.b.j == 0) {
                    }
                    r00Var = this;
                    i13 = i12;
                    i14 = i10;
                    i15 = i7;
                    j16 = j13;
                    j17 = j15;
                    i16 = i9;
                    j18 = j9;
                    fz2Var5 = fz2Var4;
                    ky3Var2 = null;
                }
                fx2VarC = s04Var4.b.n.c(false);
                j20 = s04Var4.b.j;
                xn3 xn3Var5 = (xn3) ((ny8) r00Var.a).getValue();
                q24 q24Var9 = s04Var4.r;
                p00 p00Var5 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                hu4Var6 = hu4Var5;
                fz2Var8 = fz2Var5;
                o00Var2.d = fz2Var8;
                o00Var2.e = null;
                o00Var2.f = fx2VarC;
                o00Var2.g = j18;
                o00Var2.k = i15;
                o00Var2.h = j16;
                o00Var2.l = i16;
                o00Var2.i = j17;
                o00Var2.m = i14;
                o00Var2.n = i13;
                o00Var2.j = j20;
                o00Var2.q = 7;
                objR = xn3Var5.e(q24Var9, p00Var5, o00Var2);
                if (objR == hu4Var6) {
                    return hu4Var6;
                }
                fx2Var = fx2VarC;
                j21 = j20;
                fz2Var9 = fz2Var8;
                s04Var7 = (s04) objR;
                if (s04Var7 != null) {
                    nx2Var = s04Var7.b;
                    if (cqk.d(fx2Var, nx2Var.n)) {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    } else {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    }
                }
                return new Integer(fz2Var9.c.size());
            case 5:
                int i35 = o00Var.n;
                i20 = o00Var.m;
                long j33 = o00Var.i;
                int i36 = o00Var.l;
                long j34 = o00Var.h;
                int i37 = o00Var.k;
                j9 = o00Var.g;
                s04Var6 = o00Var.e;
                i22 = i35;
                fz2Var7 = o00Var.d;
                ch3.d0(objR);
                i21 = i37;
                o00Var2 = o00Var;
                j13 = j34;
                i9 = i36;
                hu4Var5 = hu4Var7;
                j19 = j33;
                i15 = i21;
                fz2Var5 = fz2Var7;
                ky3Var2 = (ky3) objR;
                i14 = i20;
                j16 = j13;
                j17 = j19;
                i16 = i9;
                j18 = j9;
                s04Var4 = s04Var6;
                i13 = i22;
                r00Var = this;
                fx2VarC = s04Var4.b.n.c(false);
                j20 = s04Var4.b.j;
                xn3 xn3Var6 = (xn3) ((ny8) r00Var.a).getValue();
                q24 q24Var10 = s04Var4.r;
                p00 p00Var6 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                hu4Var6 = hu4Var5;
                fz2Var8 = fz2Var5;
                o00Var2.d = fz2Var8;
                o00Var2.e = null;
                o00Var2.f = fx2VarC;
                o00Var2.g = j18;
                o00Var2.k = i15;
                o00Var2.h = j16;
                o00Var2.l = i16;
                o00Var2.i = j17;
                o00Var2.m = i14;
                o00Var2.n = i13;
                o00Var2.j = j20;
                o00Var2.q = 7;
                objR = xn3Var6.e(q24Var10, p00Var6, o00Var2);
                if (objR == hu4Var6) {
                    return hu4Var6;
                }
                fx2Var = fx2VarC;
                j21 = j20;
                fz2Var9 = fz2Var8;
                s04Var7 = (s04) objR;
                if (s04Var7 != null) {
                    nx2Var = s04Var7.b;
                    if (cqk.d(fx2Var, nx2Var.n)) {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    } else {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    }
                }
                return new Integer(fz2Var9.c.size());
            case 6:
                int i38 = o00Var.n;
                i19 = o00Var.m;
                long j35 = o00Var.i;
                i9 = o00Var.l;
                long j36 = o00Var.h;
                int i39 = o00Var.k;
                long j37 = o00Var.g;
                s04Var5 = o00Var.e;
                i17 = i38;
                fz2Var6 = o00Var.d;
                ch3.d0(objR);
                r00Var = this;
                objF = objR;
                o00Var2 = o00Var;
                j13 = j36;
                hu4Var5 = hu4Var7;
                i18 = i39;
                j9 = j37;
                j15 = j35;
                ky3Var2 = (ky3) objF;
                fz2Var5 = fz2Var6;
                i14 = i19;
                j16 = j13;
                j17 = j15;
                i15 = i18;
                i16 = i9;
                j18 = j9;
                s04Var4 = s04Var5;
                i13 = i17;
                fx2VarC = s04Var4.b.n.c(false);
                j20 = s04Var4.b.j;
                xn3 xn3Var7 = (xn3) ((ny8) r00Var.a).getValue();
                q24 q24Var11 = s04Var4.r;
                p00 p00Var7 = new p00(fz2Var5, j18, i15, j16, i16, j17, ky3Var2, null);
                hu4Var6 = hu4Var5;
                fz2Var8 = fz2Var5;
                o00Var2.d = fz2Var8;
                o00Var2.e = null;
                o00Var2.f = fx2VarC;
                o00Var2.g = j18;
                o00Var2.k = i15;
                o00Var2.h = j16;
                o00Var2.l = i16;
                o00Var2.i = j17;
                o00Var2.m = i14;
                o00Var2.n = i13;
                o00Var2.j = j20;
                o00Var2.q = 7;
                objR = xn3Var7.e(q24Var11, p00Var7, o00Var2);
                if (objR == hu4Var6) {
                    return hu4Var6;
                }
                fx2Var = fx2VarC;
                j21 = j20;
                fz2Var9 = fz2Var8;
                s04Var7 = (s04) objR;
                if (s04Var7 != null) {
                    nx2Var = s04Var7.b;
                    if (cqk.d(fx2Var, nx2Var.n)) {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    } else {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    }
                }
                return new Integer(fz2Var9.c.size());
            case 7:
                j21 = o00Var.j;
                fx2Var = o00Var.f;
                fz2Var9 = o00Var.d;
                ch3.d0(objR);
                s04Var7 = (s04) objR;
                if (s04Var7 != null) {
                    nx2Var = s04Var7.b;
                    if (cqk.d(fx2Var, nx2Var.n)) {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    } else {
                        ((p24) ((ny8) this.j).getValue()).a(new wy3(q24Var));
                    }
                }
                return new Integer(fz2Var9.c.size());
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(wy2 wy2Var, nq4 nq4Var) {
        q00 q00Var;
        if (nq4Var instanceof q00) {
            q00Var = (q00) nq4Var;
            int i = q00Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                q00Var.f = i - Integer.MIN_VALUE;
            } else {
                q00Var = new q00(this, nq4Var);
            }
        } else {
            q00Var = new q00(this, nq4Var);
        }
        Object objN = q00Var.d;
        int i2 = q00Var.f;
        if (i2 == 0) {
            ch3.d0(objN);
            j3 j3VarX0 = e9i.x0(new bye(new f00(this, wy2Var, (lq4) null, 4)), BuildConfig.MAX_TIME_TO_UPLOAD, new sfd(this, (lq4) null, 10));
            q00Var.f = 1;
            objN = e9i.N(j3VarX0, q00Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objN);
        }
        return (fz2) objN;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s00
    public Object j(Collection collection, nq4 nq4Var) {
        j00 j00Var;
        if (nq4Var instanceof j00) {
            j00Var = (j00) nq4Var;
            int i = j00Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                j00Var.f = i - Integer.MIN_VALUE;
            } else {
                j00Var = new j00(this, nq4Var);
            }
        } else {
            j00Var = new j00(this, nq4Var);
        }
        Object objJ = j00Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = j00Var.f;
        if (i2 == 0) {
            ch3.d0(objJ);
            h00 h00Var = (h00) this.f;
            j00Var.f = 1;
            objJ = h00Var.j(collection, j00Var);
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objJ);
        }
        List list = (List) objJ;
        String str = (String) this.h;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, zo5.h(list.size(), "getHistoryItems: result count: "), null);
            }
        }
        return list;
    }

    public void l(int i, mt4 mt4Var) {
        this.f = p90.j(i);
        this.b = mt4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r1 == r10) goto L23;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(long r14, int r16, long r17, defpackage.nq4 r19) {
        /*
            r13 = this;
            r1 = r19
            boolean r2 = r1 instanceof defpackage.l00
            if (r2 == 0) goto L16
            r2 = r1
            l00 r2 = (defpackage.l00) r2
            int r3 = r2.i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.i = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            l00 r2 = new l00
            r2.<init>(r13, r1)
            goto L14
        L1c:
            java.lang.Object r1 = r9.g
            hu4 r10 = defpackage.hu4.a
            int r2 = r9.i
            r11 = 0
            r12 = 2
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 == r3) goto L35
            if (r2 != r12) goto L2f
            defpackage.ch3.d0(r1)
            goto L77
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r11
        L35:
            long r2 = r9.e
            int r4 = r9.f
            long r5 = r9.d
            defpackage.ch3.d0(r1)
            r7 = r5
            r6 = r4
            r4 = r7
            r7 = r2
            goto L63
        L43:
            defpackage.ch3.d0(r1)
            r9.d = r14
            r4 = r16
            r9.f = r4
            r7 = r17
            r9.e = r7
            r9.i = r3
            r3 = 0
            r5 = 0
            r0 = r13
            r1 = r14
            java.lang.Object r3 = r0.s(r1, r3, r4, r5, r7, r9)
            if (r3 != r10) goto L5e
            goto L76
        L5e:
            r4 = r14
            r6 = r16
            r7 = r17
        L63:
            java.lang.Object r1 = r13.f
            r3 = r1
            h00 r3 = (defpackage.h00) r3
            r9.d = r4
            r9.f = r6
            r9.e = r7
            r9.i = r12
            java.lang.Object r1 = r3.m(r4, r6, r7, r9)
            if (r1 != r10) goto L77
        L76:
            return r10
        L77:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r13.h
            java.lang.String r0 = (java.lang.String) r0
            a4c r2 = defpackage.gm0.f
            if (r2 != 0) goto L82
            goto L97
        L82:
            je9 r3 = defpackage.je9.d
            boolean r4 = r2.b(r3)
            if (r4 == 0) goto L97
            int r4 = r1.size()
            java.lang.String r5 = "getComments: result count: "
            java.lang.String r4 = defpackage.zo5.h(r4, r5)
            r2.c(r3, r0, r4, r11)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.m(long, int, long, nq4):java.lang.Object");
    }

    public void n(mt4 mt4Var) {
        this.b = mt4Var;
    }

    public void o(int i, mt4 mt4Var) {
        this.e = p90.j(i);
        this.a = mt4Var;
    }

    public void p(mt4 mt4Var) {
        this.a = mt4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r0 == r1) goto L22;
     */
    @Override // defpackage.s00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object q(long r7, int r9, long r10, defpackage.nq4 r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof defpackage.k00
            if (r0 == 0) goto L14
            r0 = r12
            k00 r0 = (defpackage.k00) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.i = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            k00 r0 = new k00
            r0.<init>(r6, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.g
            hu4 r1 = defpackage.hu4.a
            int r2 = r12.i
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.ch3.d0(r0)
            r2 = r6
            goto L65
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r3
        L34:
            long r10 = r12.e
            int r9 = r12.f
            long r7 = r12.d
            defpackage.ch3.d0(r0)
            r2 = r6
            goto L52
        L3f:
            defpackage.ch3.d0(r0)
            r12.d = r7
            r12.f = r9
            r12.e = r10
            r12.i = r5
            java.lang.Object r0 = defpackage.xhe.k(r6, r7, r9, r10, r12)
            r2 = r6
            if (r0 != r1) goto L52
            goto L64
        L52:
            java.lang.Object r6 = r2.f
            h00 r6 = (defpackage.h00) r6
            r12.d = r7
            r12.f = r9
            r12.e = r10
            r12.i = r4
            java.lang.Object r0 = r6.q(r7, r9, r10, r12)
            if (r0 != r1) goto L65
        L64:
            return r1
        L65:
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r6 = r2.h
            java.lang.String r6 = (java.lang.String) r6
            a4c r7 = defpackage.gm0.f
            if (r7 != 0) goto L70
            goto L85
        L70:
            je9 r8 = defpackage.je9.d
            boolean r9 = r7.b(r8)
            if (r9 == 0) goto L85
            int r9 = r0.size()
            java.lang.String r10 = "getComments: result count: "
            java.lang.String r9 = defpackage.zo5.h(r9, r10)
            r7.c(r8, r6, r9, r3)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.q(long, int, long, nq4):java.lang.Object");
    }

    public void r(int i, mt4 mt4Var) {
        this.c = p90.j(i);
        this.g = mt4Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x018e, code lost:
    
        if (r10 == r12) goto L42;
     */
    @Override // defpackage.xhe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object s(long r29, int r31, int r32, long r33, long r35, defpackage.nq4 r37) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r00.s(long, int, int, long, long, nq4):java.lang.Object");
    }

    public void t(mt4 mt4Var) {
        this.g = mt4Var;
    }

    public void u(int i, mt4 mt4Var) {
        this.d = p90.j(i);
        this.h = mt4Var;
    }

    public void v(mt4 mt4Var) {
        this.h = mt4Var;
    }

    public r00(no4 no4Var, xn3 xn3Var, a9a a9aVar, xhh xhhVar, ny8 ny8Var, ny8 ny8Var2, ifh ifhVar) {
        this.c = no4Var;
        this.d = xn3Var;
        this.a = ny8Var;
        this.b = ny8Var2;
        this.e = ifhVar;
        dq4 dq4VarA = cqk.a(((n0c) xhhVar).b());
        this.f = dq4VarA;
        this.g = new AtomicBoolean(false);
        r66 r66Var = r66.a;
        this.h = p90.a(r66Var);
        this.i = p90.a(r66Var);
        mjg mjgVarA = p90.a(r66Var);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        this.l = e9i.b(0, 0, 7);
        e9i.j0(new fz6(a9aVar.c, new qz9(this, (lq4) null, 3), 3), dq4VarA);
    }

    public r00() {
        this.c = new ave();
        this.d = new ave();
        this.e = new ave();
        this.f = new ave();
        this.g = new f0(0.0f);
        this.h = new f0(0.0f);
        this.a = new f0(0.0f);
        this.b = new f0(0.0f);
        this.i = new cy5(0);
        this.j = new cy5(0);
        this.k = new cy5(0);
        this.l = new cy5(0);
    }

    public r00(q24 q24Var, sih sihVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, a0b a0bVar, h00 h00Var, l7f l7fVar, ny8 ny8Var5, ny8 ny8Var6) {
        this.c = q24Var;
        this.d = sihVar;
        this.e = a0bVar;
        this.f = h00Var;
        this.g = l7fVar;
        this.h = "AsyncCommentsRemoteDataSource#" + q24Var;
        this.a = ny8Var;
        this.b = ny8Var2;
        this.i = ny8Var4;
        this.j = ny8Var3;
        this.k = ny8Var5;
        this.l = ny8Var6;
    }
}
