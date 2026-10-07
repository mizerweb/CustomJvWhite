package defpackage;

import android.net.Uri;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class dn0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
    }

    private final Object l(Object obj) {
        lg lgVar = (lg) this.i;
        String str = (String) this.h;
        int i = this.f;
        try {
            if (i != 0) {
                if (i == 1) {
                    ch3.d0(obj);
                    return null;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
            kzi kziVar = (kzi) ((d0c) this.g).a;
            this.f = 1;
            kziVar.x(str, lgVar);
            sbi sbiVar = sbi.a;
            hu4 hu4Var = hu4.a;
            if (sbiVar == hu4Var) {
                return hu4Var;
            }
            return null;
        } catch (Exception e) {
            Log.w("CXCP", "Failed to open " + ((Object) ef2.b(str)), e);
            int iA = yil.a(e);
            if (iA != 0) {
                lgVar.b(null, new kg(6, new ne2(iA), e, 2));
            }
            yil.a(e);
            return null;
        }
    }

    private final Object n(Object obj) {
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        rt2 rt2VarB = ((gu2) this.h).B();
        if (rt2VarB != null) {
            List list = (List) this.i;
            List list2 = list;
            gu2 gu2Var = (gu2) this.h;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(yab.h(gu4Var, null, 0, new f00(it.next(), (lq4) null, gu2Var, rt2VarB, list), 3));
            }
            this.g = null;
            this.f = 1;
            Object objC = ch3.c(arrayList, this);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    private final Object o(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (lv2) this.i, 0);
            this.g = null;
            this.f = 1;
            Object objCollect = jzVar.collect(iv2Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object p(Object obj) {
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            jz jzVar = (jz) this.h;
            iv2 iv2Var = new iv2(yx6Var, (hy2) this.i, 1);
            this.g = null;
            this.f = 1;
            Object objCollect = jzVar.collect(iv2Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    private final Object q(Object obj) {
        boolean z;
        boolean z2;
        rt2 rt2Var = (rt2) this.i;
        kz5 kz5Var = (kz5) this.g;
        String str = kz5Var.d;
        hy2 hy2Var = (hy2) this.h;
        mjg mjgVar = hy2Var.k;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            kz5 kz5Var2 = (kz5) mjgVar.getValue();
            if (!cqk.d(str, kz5Var2 != null ? kz5Var2.d : null) && str != null) {
                qp2 qp2Var = (qp2) hy2Var.z.getValue();
                long j = rt2Var.a;
                this.f = 1;
                Object objA = qp2Var.a(j, this, str);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        String str2 = kz5Var.f;
        String string = str2 != null ? r5h.y1(str2).toString() : null;
        if (string == null || string.length() != 0) {
            z = false;
        } else {
            kz5 kz5Var3 = (kz5) mjgVar.getValue();
            if (string.equals(kz5Var3 != null ? kz5Var3.f : null)) {
                z = false;
            } else {
                z = true;
            }
        }
        if (string != null && string.length() != 0) {
            kz5 kz5Var4 = (kz5) mjgVar.getValue();
            z2 = cqk.d(string, kz5Var4 != null ? kz5Var4.f : null) ? false : true;
        }
        if (z || z2) {
            ((pvb) hy2Var.s.getValue()).h(rt2Var.a, rt2Var.A(), string);
        }
        return sbi.a;
    }

    private final Object r(Object obj) {
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            t7a t7aVar = (t7a) this.g;
            r8e r8eVar = t7aVar.m;
            f90 f90Var = new f90((oy2) this.h, (u23) this.i, t7aVar, 2);
            this.f = 1;
            Object objCollect = r8eVar.a.collect(f90Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        throw new KotlinNothingValueException();
    }

    private final Object s(Object obj) {
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                h03 h03Var = (h03) this.h;
                m8b m8bVar = (m8b) this.i;
                hre hreVarA = ((n25) ((qw2) h03Var).n.get()).a();
                this.g = gu4Var;
                this.f = 1;
                Object objD = hreVarA.d(m8bVar, this);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            qv1.t(gu4Var, "fail to clearNonParticipantChats", th);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    private final Object t(Object obj) {
        e23 e23Var;
        boolean zX;
        o60 o60Var = (o60) this.h;
        boolean z = o60Var.e;
        n23 n23Var = (n23) this.i;
        pzf pzfVar = n23Var.o;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        Uri uri = null;
        if (i == 0) {
            ch3.d0(obj);
            String strA = z ? o60Var.a() : o60Var.b(us0.e);
            if (strA != null) {
                vze vzeVar = n23Var.f;
                this.g = gu4Var;
                this.f = 1;
                obj = vze.c(vzeVar, strA, z, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            }
            e23Var = (e23) n23Var.t.getAndUpdate(new g23(0));
            zX = cqk.x(gu4Var);
            sbi sbiVar = sbi.a;
            if (zX) {
                if (uri == null && e23Var != null) {
                    pzfVar.a(new iq5(uri, e23Var.d));
                    return sbiVar;
                }
                if (uri == null && e23Var != null) {
                    pzfVar.a(new hq5(n23.I(e23Var.d, false)));
                }
            }
            return sbiVar;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        uri = (Uri) obj;
        e23Var = (e23) n23Var.t.getAndUpdate(new g23(0));
        zX = cqk.x(gu4Var);
        sbi sbiVar2 = sbi.a;
        if (zX) {
            if (uri == null) {
            }
            if (uri == null) {
                pzfVar.a(new hq5(n23.I(e23Var.d, false)));
            }
        }
        return sbiVar2;
    }

    private final Object u(Object obj) {
        String str = (String) this.i;
        x43 x43Var = (x43) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            xx6 xx6VarG = ((c59) x43Var.v.getValue()).g(str);
            f90 f90Var = new f90(x43Var, str, gu4Var, 3);
            this.g = null;
            this.f = 1;
            Object objCollect = xx6VarG.collect(f90Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x01a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x01a4 A[RETURN] */
    private final Object v(Object obj) {
        List list;
        Object next;
        e70 e70Var;
        Object objB;
        o60 o60Var;
        List list2;
        Object next2;
        rt2 rt2VarG;
        d70 d70Var;
        lk9 lk9VarC;
        r43 r43Var;
        x7a x7aVar = (x7a) this.i;
        x43 x43Var = (x43) this.h;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            v7a v7aVar = (v7a) x7aVar;
            fda fdaVarB = x43.B(x43Var, v7aVar.b);
            if (fdaVarB != null) {
                sfa sfaVar = fdaVarB.a;
                int iD = qt4.D(v7aVar.e);
                if (iD != 0) {
                    if (iD == 1) {
                        c46 c46Var = sfaVar.n;
                        if (c46Var != null && (list2 = (List) c46Var.a) != null) {
                            Iterator it = list2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                                e70 e70Var2 = (e70) next2;
                                if (e70Var2 != null && (d70Var = e70Var2.d) != null && d70Var.a == v7aVar.c) {
                                    break;
                                }
                            }
                            e70 e70Var3 = (e70) next2;
                            if (e70Var3 != null && (rt2VarG = x43Var.G()) != null) {
                                long jA = rt2VarG.A();
                                if (((wd4) x43Var.x.getValue()).h()) {
                                    pvb pvbVar = x43Var.i;
                                    pvb.t(pvbVar, new z2j(pvbVar.u().a.g(), v7aVar.c, jA, sfaVar.b, v7aVar.b, e70Var3.t, true, true, e70Var3.d.o, false, ns5.CHAT_MEDIA));
                                    ((i8b) x43Var.I.getValue()).a(v7aVar.b);
                                    return sbiVar;
                                }
                                lk9 lk9VarC2 = ((n0c) x43Var.H()).c();
                                r43 r43Var2 = new r43(x43Var, null, 3);
                                this.g = null;
                                this.f = 4;
                                if (yab.K0(lk9VarC2, r43Var2, this) == hu4Var) {
                                    return hu4Var;
                                }
                            }
                        }
                    } else if (iD != 2) {
                        ore.o();
                        return null;
                    }
                }
                c46 c46Var2 = sfaVar.n;
                if (c46Var2 != null && (list = (List) c46Var2.a) != null) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        e70 e70Var4 = (e70) next;
                        if (e70Var4 != null && (o60Var = e70Var4.b) != null && o60Var.i == v7aVar.c) {
                            break;
                        }
                    }
                    e70Var = (e70) next;
                    if (e70Var != null) {
                        boolean zD = e70Var.d();
                        o60 o60Var2 = e70Var.b;
                        String strA = zD ? o60Var2.a() : o60Var2.b(us0.e);
                        if (strA != null) {
                            vze vzeVar = (vze) x43Var.q.getValue();
                            boolean zD2 = e70Var.d();
                            this.g = e70Var;
                            this.f = 1;
                            objB = vzeVar.b(strA, zD2, this);
                            if (objB != hu4Var) {
                            }
                        } else {
                            zv8[] zv8VarArr = x43.q1;
                            lk9VarC = ((n0c) x43Var.H()).c();
                            r43Var = new r43(x43Var, null, 2);
                            this.g = null;
                            this.f = 3;
                            if (yab.K0(lk9VarC, r43Var, this) == hu4Var) {
                            }
                        }
                        return hu4Var;
                    }
                }
            }
            return sbiVar;
        }
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i == 4) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        e70Var = (e70) this.g;
        ch3.d0(obj);
        objB = obj;
        if (((Boolean) objB).booleanValue()) {
            zv8[] zv8VarArr2 = x43.q1;
            lk9 lk9VarC3 = ((n0c) x43Var.H()).c();
            in1 in1Var = new in1(e70Var, x43Var, null, 19);
            this.g = null;
            this.f = 2;
            if (yab.K0(lk9VarC3, in1Var, this) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        zv8[] zv8VarArr3 = x43.q1;
        lk9VarC = ((n0c) x43Var.H()).c();
        r43Var = new r43(x43Var, null, 2);
        this.g = null;
        this.f = 3;
        if (yab.K0(lk9VarC, r43Var, this) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    private final Object w(Object obj) {
        String str = (String) this.i;
        l63 l63Var = (l63) this.h;
        gu4 gu4Var = (gu4) this.g;
        int i = this.f;
        if (i == 0) {
            ch3.d0(obj);
            xx6 xx6VarG = ((c59) l63Var.y.getValue()).g(str);
            f90 f90Var = new f90(l63Var, str, gu4Var, 4);
            this.g = null;
            this.f = 1;
            Object objCollect = xx6VarG.collect(f90Var, this);
            hu4 hu4Var = hu4.a;
            if (objCollect == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }

    private final Object x(Object obj) {
        int i = this.f;
        try {
            if (i == 0) {
                ch3.d0(obj);
                xd3 xd3Var = (xd3) this.h;
                rt2 rt2Var = (rt2) this.i;
                yy2 yy2Var = (yy2) xd3Var.F.getValue();
                m8b m8bVarA = ui9.a(rt2Var.A());
                this.g = null;
                this.f = 1;
                Object objA = yy2Var.a(m8bVarA, this);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        } catch (Throwable unused) {
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a A[RETURN] */
    private final Object y(Object obj) {
        nx2 nx2Var;
        zw2 zw2Var;
        yx6 yx6Var = (yx6) this.g;
        int i = this.f;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            q24 q24Var = ((xd3) this.h).e;
            if (q24Var == null) {
                Boolean bool = Boolean.FALSE;
                this.g = null;
                this.f = 1;
                if (yx6Var.emit(bool, this) != hu4Var) {
                    return sbiVar;
                }
            } else {
                xn3 xn3Var = (xn3) ((ny8) this.i).getValue();
                long j = q24Var.a;
                this.g = yx6Var;
                this.f = 2;
                obj = xn3Var.i(j, this);
                if (obj != hu4Var) {
                }
            }
            return hu4Var;
        }
        if (i == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i != 2) {
            if (i == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        rt2 rt2Var = (rt2) obj;
        boolean z = false;
        if (rt2Var != null && (nx2Var = rt2Var.b) != null && (zw2Var = nx2Var.I) != null && zw2Var.m) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(!z);
        this.g = null;
        this.f = 3;
        if (yx6Var.emit(boolValueOf, this) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0058, code lost:
    
        if (r12 == r4) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object z(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.h
            xd3 r0 = (defpackage.xd3) r0
            int r1 = r11.f
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L24
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L14
            defpackage.ch3.d0(r12)
            goto L5b
        L14:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            r11 = 0
            return r11
        L1b:
            java.lang.Object r1 = r11.g
            xne r1 = (defpackage.xne) r1
            defpackage.ch3.d0(r12)
        L22:
            r6 = r1
            goto L34
        L24:
            defpackage.ch3.d0(r12)
            xne r1 = r0.j
            r11.g = r1
            r11.f = r3
            java.lang.Object r12 = r0.P(r11)
            if (r12 != r4) goto L22
            goto L5a
        L34:
            java.lang.Number r12 = (java.lang.Number) r12
            long r7 = r12.longValue()
            r9 = 0
            r11.g = r9
            r11.f = r2
            ny8 r12 = r6.c
            java.lang.Object r12 = r12.getValue()
            xhh r12 = (defpackage.xhh) r12
            n0c r12 = (defpackage.n0c) r12
            xt4 r12 = r12.b()
            zw9 r5 = new zw9
            r10 = 11
            r5.<init>(r6, r7, r9, r10)
            java.lang.Object r12 = defpackage.yab.K0(r12, r5, r11)
            if (r12 != r4) goto L5b
        L5a:
            return r4
        L5b:
            wne r12 = (defpackage.wne) r12
            sbi r1 = defpackage.sbi.a
            if (r12 == 0) goto La1
            java.lang.Long r2 = r12.b
            java.lang.CharSequence r3 = r12.a
            if (r3 == 0) goto La1
            boolean r4 = defpackage.r5h.X0(r3)
            if (r4 == 0) goto L6e
            goto La1
        L6e:
            if (r2 == 0) goto L8e
            long r4 = r2.longValue()
            java.lang.Object r11 = r11.i
            java.lang.Long r11 = (java.lang.Long) r11
            if (r11 != 0) goto L7b
            goto L8e
        L7b:
            long r6 = r11.longValue()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 != 0) goto L8e
            java.lang.String r11 = r0.p
            java.lang.String r12 = "clear draft because edit id already send"
            defpackage.gm0.n(r11, r12)
            r0.E()
            return r1
        L8e:
            java.lang.String r11 = r0.p
            java.lang.String r4 = "send restored draft on UI"
            defpackage.gm0.n(r11, r4)
            ic6 r11 = r0.L1
            kc3 r0 = new kc3
            java.lang.Long r12 = r12.c
            r0.<init>(r3, r12, r2)
            defpackage.a8j.x(r11, r0)
        La1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.z(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                return new dn0((in0) this.h, (qo7) obj2, lq4Var, 0);
            case 1:
                return new dn0((a5j) this.h, (Uri) obj2, lq4Var, 1);
            case 2:
                return new dn0((y8) this.h, (String) obj2, lq4Var, 2);
            case 3:
                dn0 dn0Var = new dn0((je) this.h, (ny8) obj2, lq4Var, 3);
                dn0Var.g = obj;
                return dn0Var;
            case 4:
                dn0 dn0Var2 = new dn0((vh) this.h, (Uri) obj2, lq4Var, 4);
                dn0Var2.g = obj;
                return dn0Var2;
            case 5:
                dn0 dn0Var3 = new dn0((View) obj2, lq4Var, 5);
                dn0Var3.h = obj;
                return dn0Var3;
            case 6:
                return new dn0((xm) this.g, (List) this.h, (Map) obj2, lq4Var, 6);
            case 7:
                return new dn0((xm) obj2, lq4Var, 7);
            case 8:
                return new dn0((h00) this.h, (List) obj2, lq4Var, 8);
            case 9:
                return new dn0((n30) this.g, (List) this.h, (List) obj2, lq4Var, 9);
            case 10:
                dn0 dn0Var4 = new dn0((kl1) this.h, (xx6) obj2, lq4Var, 10);
                dn0Var4.g = obj;
                return dn0Var4;
            case 11:
                return new dn0((y92) this.h, (sv1) obj2, lq4Var, 11);
            case 12:
                return new dn0((ya2) obj2, lq4Var, 12);
            case 13:
                return new dn0((ljf) this.g, (String) this.h, (db2) obj2, lq4Var, 13);
            case 14:
                return new dn0((d0c) this.g, (String) this.h, (lg) obj2, lq4Var, 14);
            case 15:
                dn0 dn0Var5 = new dn0((kgf) this.h, obj2, lq4Var, 15);
                dn0Var5.g = obj;
                return dn0Var5;
            case 16:
                dn0 dn0Var6 = new dn0((gu2) this.h, (List) obj2, lq4Var, 16);
                dn0Var6.g = obj;
                return dn0Var6;
            case 17:
                dn0 dn0Var7 = new dn0((jz) this.h, lq4Var, (lv2) obj2, 17);
                dn0Var7.g = obj;
                return dn0Var7;
            case 18:
                dn0 dn0Var8 = new dn0((jz) this.h, lq4Var, (hy2) obj2, 18);
                dn0Var8.g = obj;
                return dn0Var8;
            case 19:
                return new dn0((kz5) this.g, (hy2) this.h, (rt2) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new dn0((t7a) this.g, (oy2) this.h, (u23) obj2, lq4Var, 20);
            case 21:
                dn0 dn0Var9 = new dn0((h03) this.h, (m8b) obj2, lq4Var, 21);
                dn0Var9.g = obj;
                return dn0Var9;
            case 22:
                dn0 dn0Var10 = new dn0((o60) this.h, (n23) obj2, lq4Var, 22);
                dn0Var10.g = obj;
                return dn0Var10;
            case 23:
                dn0 dn0Var11 = new dn0((x43) this.h, (String) obj2, lq4Var, 23);
                dn0Var11.g = obj;
                return dn0Var11;
            case 24:
                return new dn0((x43) this.h, (x7a) obj2, lq4Var, 24);
            case 25:
                dn0 dn0Var12 = new dn0((l63) this.h, (String) obj2, lq4Var, 25);
                dn0Var12.g = obj;
                return dn0Var12;
            case 26:
                dn0 dn0Var13 = new dn0((xd3) this.h, (rt2) obj2, lq4Var, 26);
                dn0Var13.g = obj;
                return dn0Var13;
            case 27:
                dn0 dn0Var14 = new dn0((xd3) this.h, (ny8) obj2, lq4Var, 27);
                dn0Var14.g = obj;
                return dn0Var14;
            case 28:
                return new dn0((xd3) this.h, (Long) obj2, lq4Var, 28);
            default:
                return new dn0((xd3) this.g, (q87) this.h, (g4b) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((dn0) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((dn0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 16:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((dn0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                return ((dn0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 19:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return hu4.a;
            case 21:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 22:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 25:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 26:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                return ((dn0) create((yx6) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((dn0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0234  */
    /* JADX WARN: Code duplicated, block: B:126:0x023c  */
    /* JADX WARN: Code duplicated, block: B:221:0x047d  */
    /* JADX WARN: Code duplicated, block: B:243:0x04ff A[PHI: r0 r6
  0x04ff: PHI (r0v75 java.lang.Object) = (r0v74 java.lang.Object), (r0v110 java.lang.Object) binds: [B:241:0x04fc, B:208:0x0433] A[DONT_GENERATE, DONT_INLINE]
  0x04ff: PHI (r6v25 java.util.List) = (r6v24 java.util.List), (r6v31 java.util.List) binds: [B:241:0x04fc, B:208:0x0433] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x0509  */
    /* JADX WARN: Code duplicated, block: B:248:0x0521  */
    /* JADX WARN: Code duplicated, block: B:250:0x0523 A[PHI: r6
  0x0523: PHI (r6v26 java.util.List) = (r6v25 java.util.List), (r6v29 java.util.List) binds: [B:244:0x0507, B:249:0x0522] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:252:0x052b  */
    /* JADX WARN: Code duplicated, block: B:255:0x054e  */
    /* JADX WARN: Code duplicated, block: B:347:0x073b  */
    /* JADX WARN: Code duplicated, block: B:349:0x0743  */
    /* JADX WARN: Code duplicated, block: B:393:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:413:0x0838  */
    /* JADX WARN: Code duplicated, block: B:414:0x0839 A[Catch: all -> 0x076b, TryCatch #3 {all -> 0x076b, blocks: (B:356:0x0766, B:411:0x082d, B:414:0x0839, B:416:0x0841, B:423:0x086f, B:424:0x0870, B:427:0x0875, B:429:0x087d), top: B:449:0x075b }] */
    /* JADX WARN: Code duplicated, block: B:416:0x0841 A[Catch: all -> 0x076b, TRY_LEAVE, TryCatch #3 {all -> 0x076b, blocks: (B:356:0x0766, B:411:0x082d, B:414:0x0839, B:416:0x0841, B:423:0x086f, B:424:0x0870, B:427:0x0875, B:429:0x087d), top: B:449:0x075b }] */
    /* JADX WARN: Code duplicated, block: B:420:0x085d  */
    /* JADX WARN: Code duplicated, block: B:426:0x0874  */
    /* JADX WARN: Code duplicated, block: B:427:0x0875 A[Catch: all -> 0x076b, TryCatch #3 {all -> 0x076b, blocks: (B:356:0x0766, B:411:0x082d, B:414:0x0839, B:416:0x0841, B:423:0x086f, B:424:0x0870, B:427:0x0875, B:429:0x087d), top: B:449:0x075b }] */
    /* JADX WARN: Code duplicated, block: B:429:0x087d A[Catch: all -> 0x076b, TRY_LEAVE, TryCatch #3 {all -> 0x076b, blocks: (B:356:0x0766, B:411:0x082d, B:414:0x0839, B:416:0x0841, B:423:0x086f, B:424:0x0870, B:427:0x0875, B:429:0x087d), top: B:449:0x075b }] */
    /* JADX WARN: Code duplicated, block: B:433:0x0899  */
    /* JADX WARN: Code duplicated, block: B:515:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0149  */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x037f, code lost:
    
        if (defpackage.e9i.L(r0, r3, r18) == r2) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x04ac, code lost:
    
        if (r0 == r5) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x054f, code lost:
    
        if (r0 == r5) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016c, code lost:
    
        if (r4 == r0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01d3, code lost:
    
        if (r5.p(r18) == r0) goto L97;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:416:0x0841, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:429:0x087d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x0149, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [v44] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x016c -> B:89:0x016f). Please report as a decompilation issue!!! */
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(jz jzVar, lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = jzVar;
        this.i = obj;
    }
}
