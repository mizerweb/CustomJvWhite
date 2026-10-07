package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: loaded from: classes.dex */
public final class k30 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public k30(yx6 yx6Var, ny8 ny8Var, n30 n30Var, ny8 ny8Var2) {
        this.a = 0;
        this.b = yx6Var;
        this.c = ny8Var;
        this.e = n30Var;
        this.d = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(xx6 xx6Var, lq4 lq4Var) {
        or2 or2Var;
        if (lq4Var instanceof or2) {
            or2Var = (or2) lq4Var;
            int i = or2Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                or2Var.h = i - Integer.MIN_VALUE;
            } else {
                or2Var = new or2(this, lq4Var);
            }
        } else {
            or2Var = new or2(this, lq4Var);
        }
        Object obj = or2Var.f;
        int i2 = or2Var.h;
        if (i2 == 0) {
            ch3.d0(obj);
            vo8 vo8Var = (vo8) this.b;
            if (vo8Var != null && !vo8Var.isActive()) {
                throw vo8Var.A();
            }
            fgf fgfVar = (fgf) this.c;
            or2Var.d = this;
            or2Var.e = xx6Var;
            or2Var.h = 1;
            Object objA = fgfVar.a(or2Var);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xx6Var = or2Var.e;
            this = or2Var.d;
            ch3.d0(obj);
        }
        yab.i0((njd) this.d, null, 0, new gz(xx6Var, (mhf) this.e, (fgf) this.c, null, 3), 3);
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r1.emit(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object d(int[] r14, defpackage.lq4 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.d
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.b
            yx6 r1 = (defpackage.yx6) r1
            java.lang.Object r2 = r13.c
            wfe r2 = (defpackage.wfe) r2
            boolean r3 = r15 instanceof defpackage.v4i
            if (r3 == 0) goto L1f
            r3 = r15
            v4i r3 = (defpackage.v4i) r3
            int r4 = r3.g
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.g = r4
            goto L24
        L1f:
            v4i r3 = new v4i
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.e
            int r4 = r3.g
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3e
            if (r4 == r7) goto L38
            if (r4 != r6) goto L32
            goto L38
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r13)
            return r5
        L38:
            int[] r14 = r3.d
            defpackage.ch3.d0(r15)
            goto L98
        L3e:
            defpackage.ch3.d0(r15)
            java.lang.Object r15 = r2.a
            hu4 r4 = defpackage.hu4.a
            if (r15 != 0) goto L56
            java.util.Set r13 = kotlin.collections.a.p1(r0)
            r3.d = r14
            r3.g = r7
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.e
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.a
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.ore.k(r13)
            return r5
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.ww3.X1(r15)
            r3.d = r14
            r3.g = r6
            java.lang.Object r13 = r1.emit(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.a = r14
            sbi r13 = defpackage.sbi.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k30.d(int[], lq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0038  */
    /* JADX WARN: Code duplicated, block: B:46:0x0136  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b3  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        j30 j30Var;
        tr2 tr2Var;
        hl3 hl3Var;
        kx6 kx6Var;
        k30 k30Var = this;
        Object obj2 = obj;
        int i = k30Var.a;
        Object obj3 = k30Var.e;
        int i2 = 4;
        Object obj4 = k30Var.b;
        Object obj5 = k30Var.d;
        sbi sbiVar = sbi.a;
        Object obj6 = k30Var.c;
        hu4 hu4Var = hu4.a;
        int i3 = 1;
        switch (i) {
            case 0:
                String str = ((n30) obj3).e;
                if (lq4Var instanceof j30) {
                    j30Var = (j30) lq4Var;
                    int i4 = j30Var.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        j30Var.e = i4 - Integer.MIN_VALUE;
                    } else {
                        j30Var = new j30(k30Var, lq4Var);
                    }
                } else {
                    j30Var = new j30(k30Var, lq4Var);
                }
                Object obj7 = j30Var.d;
                int i5 = j30Var.e;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj7);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj7);
                yx6 yx6Var = (yx6) obj4;
                if (!((svb) ((ny8) obj6).getValue()).b()) {
                    gm0.n(str, "checkUpdates: not authorized");
                    return sbiVar;
                }
                if (((wsc) ((wwb) ((ny8) obj5).getValue()).a.getValue()).c(wsc.g)) {
                    j30Var.e = 1;
                    return yx6Var.emit(obj2, j30Var) == hu4Var ? hu4Var : sbiVar;
                }
                gm0.n(str, "checkUpdates: no permission");
                return sbiVar;
            case 1:
                return k30Var.b((xx6) obj2, lq4Var);
            case 2:
                if (lq4Var instanceof tr2) {
                    tr2Var = (tr2) lq4Var;
                    int i6 = tr2Var.h;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tr2Var.h = i6 - Integer.MIN_VALUE;
                    } else {
                        tr2Var = new tr2(k30Var, lq4Var);
                    }
                } else {
                    tr2Var = new tr2(k30Var, lq4Var);
                }
                Object obj8 = tr2Var.f;
                int i7 = tr2Var.h;
                if (i7 == 0) {
                    ch3.d0(obj8);
                    vo8 vo8Var = (vo8) ((wfe) obj6).a;
                    if (vo8Var != null) {
                        vo8Var.b(new ChildCancelledException("Child of the scoped flow was cancelled"));
                        tr2Var.d = k30Var;
                        tr2Var.e = obj2;
                        tr2Var.h = 1;
                        if (vo8Var.g(tr2Var) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj9 = tr2Var.e;
                    k30 k30Var2 = tr2Var.d;
                    ch3.d0(obj8);
                    obj2 = obj9;
                    k30Var = k30Var2;
                }
                ((wfe) k30Var.c).a = yab.i0((gu4) k30Var.d, null, 4, new sr2((ur2) k30Var.e, (yx6) k30Var.b, obj2, null), 1);
                return sbiVar;
            case 3:
                rl3 rl3Var = (rl3) obj5;
                if (lq4Var instanceof hl3) {
                    hl3Var = (hl3) lq4Var;
                    int i8 = hl3Var.e;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        hl3Var.e = i8 - Integer.MIN_VALUE;
                    } else {
                        hl3Var = new hl3(k30Var, lq4Var);
                    }
                } else {
                    hl3Var = new hl3(k30Var, lq4Var);
                }
                Object obj10 = hl3Var.d;
                int i9 = hl3Var.e;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ch3.d0(obj10);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj10);
                yx6 yx6Var2 = (yx6) obj4;
                vj4 vj4Var = (vj4) obj2;
                List list = vj4Var.a;
                List list2 = vj4Var.c;
                r66 r66Var = r66.a;
                if (list == null) {
                    list = r66Var;
                }
                if (list2 == null) {
                    list2 = r66Var;
                }
                int i10 = 0;
                ohf ohfVarK0 = a.K0(new ohf[]{new sw(1, list), new sw(1, list2)});
                nre nreVar = new nre(i2);
                if (ohfVarK0 instanceof m2i) {
                    m2i m2iVar = (m2i) ohfVarK0;
                    kx6Var = new kx6(m2iVar.a, m2iVar.b, nreVar);
                } else {
                    kx6Var = new kx6(ohfVarK0, new nre(3), nreVar);
                }
                m2i m2iVarT0 = yhf.t0(new rj7(yhf.n0(kx6Var, new jl3(rl3Var, i10, (Long) obj3)), 1, (zc6) obj6), new kl3(i10, rl3Var));
                ArrayList arrayList = new ArrayList(list2.size() + list.size());
                Iterator it = m2iVarT0.a.iterator();
                while (it.hasNext()) {
                    ek4 ek4Var = (ek4) m2iVarT0.b.invoke(it.next());
                    long j = ek4Var.a;
                    Uri uri = ek4Var.g;
                    boolean z = ek4Var.h;
                    boolean z2 = ek4Var.i;
                    CharSequence charSequence = ek4Var.b;
                    ynh ynhVar = ek4Var.f;
                    Iterator it2 = it;
                    arrayList.add(new lk6(j, uri, z, z2, charSequence, ynhVar == null ? ek4Var.e : ynhVar, ynhVar == null, ek4Var.j));
                    it = it2;
                    i3 = 1;
                }
                hl3Var.e = i3;
                return yx6Var2.emit(arrayList, hl3Var) == hu4Var ? hu4Var : sbiVar;
            default:
                return k30Var.d((int[]) obj2, lq4Var);
        }
    }

    public k30(wfe wfeVar, gu4 gu4Var, ur2 ur2Var, yx6 yx6Var) {
        this.a = 2;
        this.c = wfeVar;
        this.d = gu4Var;
        this.e = ur2Var;
        this.b = yx6Var;
    }

    public k30(wfe wfeVar, yx6 yx6Var, String[] strArr, int[] iArr) {
        this.a = 4;
        this.c = wfeVar;
        this.b = yx6Var;
        this.d = strArr;
        this.e = iArr;
    }

    public /* synthetic */ k30(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
