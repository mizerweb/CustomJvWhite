package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class f33 implements s00 {
    public final xhh a;
    public final long b;
    public final mg5 c;
    public final n11 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final Set i;

    public f33(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, xhh xhhVar, long j, mg5 mg5Var, Set set, n11 n11Var) {
        this.a = xhhVar;
        this.b = j;
        this.c = mg5Var;
        this.d = n11Var;
        this.e = ny8Var;
        this.f = ny8Var4;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = fml.a(set);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        if (r13 == r4) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r12, defpackage.nq4 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.e33
            if (r0 == 0) goto L13
            r0 = r13
            e33 r0 = (defpackage.e33) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            e33 r0 = new e33
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.g
            r2 = 2
            r3 = 1
            hu4 r4 = defpackage.hu4.a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2f
            java.util.List r11 = r0.d
            java.util.List r11 = (java.util.List) r11
            defpackage.ch3.d0(r13)
            goto La8
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r11)
            r11 = 0
            return r11
        L36:
            java.util.List r12 = r0.d
            java.util.List r12 = (java.util.List) r12
            defpackage.ch3.d0(r13)
            goto L59
        L3e:
            defpackage.ch3.d0(r13)
            ny8 r13 = r11.e
            java.lang.Object r13 = r13.getValue()
            xn3 r13 = (defpackage.xn3) r13
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            r0.d = r1
            r0.g = r3
            long r5 = r11.b
            java.lang.Object r13 = r13.v(r5, r0)
            if (r13 != r4) goto L59
            goto La7
        L59:
            r9 = r13
            rt2 r9 = (defpackage.rt2) r9
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            xhh r13 = r11.a
            n0c r13 = (defpackage.n0c) r13
            xt4 r13 = r13.b()
            if (r13 != 0) goto L6c
            vt4 r13 = r0.getContext()
        L6c:
            dq4 r13 = defpackage.cqk.a(r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.yw3.W0(r12, r3)
            r1.<init>(r3)
            java.util.Iterator r12 = r12.iterator()
        L7f:
            boolean r3 = r12.hasNext()
            r7 = 0
            if (r3 == 0) goto L9d
            java.lang.Object r6 = r12.next()
            f00 r5 = new f00
            r10 = 16
            r8 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            r11 = 3
            r3 = 0
            yf5 r11 = defpackage.yab.h(r13, r7, r3, r5, r11)
            r1.add(r11)
            r11 = r8
            goto L7f
        L9d:
            r0.d = r7
            r0.g = r2
            java.lang.Object r13 = defpackage.ch3.c(r1, r0)
            if (r13 != r4) goto La8
        La7:
            return r4
        La8:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r11 = defpackage.ww3.o1(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f33.a(java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // defpackage.s00
    public final Object j(Collection collection, nq4 nq4Var) {
        b33 b33Var;
        if (nq4Var instanceof b33) {
            b33Var = (b33) nq4Var;
            int i = b33Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                b33Var.f = i - Integer.MIN_VALUE;
            } else {
                b33Var = new b33(this, nq4Var);
            }
        } else {
            b33Var = new b33(this, nq4Var);
        }
        b33 b33Var2 = b33Var;
        Object objX = b33Var2.d;
        int i2 = b33Var2.f;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objX);
            sua suaVar = (sua) this.f.getValue();
            b33Var2.f = 1;
            objX = ((ose) suaVar.a).x(this.b, collection, this.i, b33Var2);
            if (objX != obj) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objX);
                return objX;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objX);
        b33Var2.f = 2;
        Object objA = a((List) objX, b33Var2);
        return objA == obj ? obj : objA;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // defpackage.s00
    public final Object m(long j, int i, long j2, nq4 nq4Var) {
        d33 d33Var;
        List arrayList;
        long j3;
        Object obj;
        long j4;
        List list;
        List list2;
        int i2 = i;
        if (nq4Var instanceof d33) {
            d33Var = (d33) nq4Var;
            int i3 = d33Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                d33Var.j = i3 - Integer.MIN_VALUE;
            } else {
                d33Var = new d33(this, nq4Var);
            }
        } else {
            d33Var = new d33(this, nq4Var);
        }
        d33 d33Var2 = d33Var;
        Object obj2 = d33Var2.h;
        int i4 = d33Var2.j;
        Object obj3 = hu4.a;
        if (i4 != 0) {
            if (i4 == 1) {
                j4 = d33Var2.e;
                i2 = d33Var2.f;
                j3 = d33Var2.d;
                List list3 = d33Var2.g;
                ch3.d0(obj2);
                obj = obj2;
                arrayList = list3;
            } else {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = d33Var2.g;
                ch3.d0(obj2);
            }
            list2 = (List) obj2;
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
            return list;
        }
        ch3.d0(obj2);
        arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        sua suaVar = (sua) this.f.getValue();
        Integer num = new Integer(i2);
        d33Var2.g = arrayList;
        d33Var2.d = j;
        d33Var2.f = i2;
        d33Var2.e = j2;
        d33Var2.j = 1;
        Object objU = ((ose) suaVar.a).u(this.b, j, this.i, num, false, this.c, d33Var2);
        if (objU != obj3) {
            j3 = j;
            obj = objU;
            j4 = j2;
        }
        return obj3;
        d33Var2.g = arrayList;
        d33Var2.d = j3;
        d33Var2.f = i2;
        d33Var2.e = j4;
        d33Var2.j = 2;
        Object objA = a((List) obj, d33Var2);
        if (objA != obj3) {
            List list4 = arrayList;
            obj2 = objA;
            list = list4;
            list2 = (List) obj2;
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
            return list;
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // defpackage.s00
    public final Object q(long j, int i, long j2, nq4 nq4Var) {
        c33 c33Var;
        List arrayList;
        long j3;
        Object obj;
        long j4;
        List list;
        List list2;
        int i2 = i;
        if (nq4Var instanceof c33) {
            c33Var = (c33) nq4Var;
            int i3 = c33Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c33Var.j = i3 - Integer.MIN_VALUE;
            } else {
                c33Var = new c33(this, nq4Var);
            }
        } else {
            c33Var = new c33(this, nq4Var);
        }
        c33 c33Var2 = c33Var;
        Object obj2 = c33Var2.h;
        int i4 = c33Var2.j;
        Object obj3 = hu4.a;
        if (i4 != 0) {
            if (i4 == 1) {
                j4 = c33Var2.e;
                i2 = c33Var2.f;
                j3 = c33Var2.d;
                List list3 = c33Var2.g;
                ch3.d0(obj2);
                obj = obj2;
                arrayList = list3;
            } else {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = c33Var2.g;
                ch3.d0(obj2);
            }
            list2 = (List) obj2;
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
            return list;
        }
        ch3.d0(obj2);
        arrayList = new ArrayList();
        if (i2 <= 0) {
            return arrayList;
        }
        sua suaVar = (sua) this.f.getValue();
        Integer num = new Integer(i2);
        c33Var2.g = arrayList;
        c33Var2.d = j;
        c33Var2.f = i2;
        c33Var2.e = j2;
        c33Var2.j = 1;
        Object objU = ((ose) suaVar.a).u(this.b, j, this.i, num, true, this.c, c33Var2);
        if (objU != obj3) {
            j3 = j;
            obj = objU;
            j4 = j2;
        }
        return obj3;
        c33Var2.g = arrayList;
        c33Var2.d = j3;
        c33Var2.f = i2;
        c33Var2.e = j4;
        c33Var2.j = 2;
        Object objA = a((List) obj, c33Var2);
        if (objA != obj3) {
            List list4 = arrayList;
            obj2 = objA;
            list = list4;
            list2 = (List) obj2;
            if (!list2.isEmpty()) {
                list.addAll(list2);
            }
            return list;
        }
        return obj3;
    }
}
