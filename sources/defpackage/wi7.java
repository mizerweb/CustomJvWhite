package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class wi7 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ ej7 c;

    public /* synthetic */ wi7(yx6 yx6Var, ej7 ej7Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = ej7Var;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:78:0x016b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        vi7 vi7Var;
        nh7 nh7Var;
        yi7 yi7Var;
        dj7 dj7Var;
        int i = this.a;
        List listJ = r66.a;
        sbi sbiVar = sbi.a;
        ej7 ej7Var = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        int i2 = 0;
        switch (i) {
            case 0:
                if (lq4Var instanceof vi7) {
                    vi7Var = (vi7) lq4Var;
                    int i3 = vi7Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vi7Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        vi7Var = new vi7(this, lq4Var);
                    }
                } else {
                    vi7Var = new vi7(this, lq4Var);
                }
                Object objB = vi7Var.d;
                int i4 = vi7Var.e;
                if (i4 == 0) {
                    ch3.d0(objB);
                    nh7Var = (nh7) obj;
                    gm0.n("ej7", "album changed");
                    List list = (List) ej7Var.f.q.get(nh7Var.a);
                    if (list != null) {
                        listJ = list;
                    }
                    vi7Var.g = yx6Var;
                    vi7Var.h = nh7Var;
                    vi7Var.i = 0;
                    vi7Var.e = 1;
                    objB = ej7.B(ej7Var, listJ, vi7Var);
                    if (objB != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        ch3.d0(objB);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = vi7Var.i;
                nh7Var = vi7Var.h;
                yx6Var = vi7Var.g;
                ch3.d0(objB);
                ylc ylcVar = new ylc(nh7Var, (List) objB);
                vi7Var.g = null;
                vi7Var.h = null;
                vi7Var.i = i2;
                vi7Var.e = 2;
                if (yx6Var.emit(ylcVar, vi7Var) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            case 1:
                if (lq4Var instanceof yi7) {
                    yi7Var = (yi7) lq4Var;
                    int i5 = yi7Var.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        yi7Var.e = i5 - Integer.MIN_VALUE;
                    } else {
                        yi7Var = new yi7(this, lq4Var);
                    }
                } else {
                    yi7Var = new yi7(this, lq4Var);
                }
                Object obj2 = yi7Var.d;
                int i6 = yi7Var.e;
                if (i6 != 0) {
                    if (i6 == 1) {
                        ch3.d0(obj2);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj2);
                ArrayList arrayList = new ArrayList();
                for (nh7 nh7Var2 : (List) obj) {
                    boolean z = nh7Var2.d;
                    mh7 mh7Var = nh7Var2.a;
                    boolean z2 = !z || cqk.d(mh7Var, jh7.a) || cqk.d(mh7Var, kh7.a);
                    if (ej7Var.c.n && z2) {
                        nh7Var2 = null;
                    }
                    if (nh7Var2 != null) {
                        arrayList.add(nh7Var2);
                    }
                }
                yi7Var.e = 1;
                return yx6Var.emit(arrayList, yi7Var) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof dj7) {
                    dj7Var = (dj7) lq4Var;
                    int i7 = dj7Var.e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        dj7Var.e = i7 - Integer.MIN_VALUE;
                    } else {
                        dj7Var = new dj7(this, lq4Var);
                    }
                } else {
                    dj7Var = new dj7(this, lq4Var);
                }
                Object obj3 = dj7Var.d;
                int i8 = dj7Var.e;
                if (i8 != 0) {
                    if (i8 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                List list2 = (List) obj;
                int i9 = ej7Var.p.c;
                ph7 ph7Var = ej7Var.c;
                boolean z3 = ph7Var.a;
                boolean z4 = ph7Var.i;
                boolean z5 = ph7Var.j;
                if (i9 > 0) {
                    if (z4 || z5 || z3) {
                        c79 c79VarW = yab.w();
                        if (z3 || z4) {
                            c79VarW.add(ii7.b);
                        }
                        if (z5) {
                            c79VarW.add(li7.b);
                        }
                        c79 c79VarJ = yab.j(c79VarW);
                        int size = c79VarJ.getSize();
                        c79 c79VarW2 = yab.w();
                        if (z4 && z5) {
                            c79VarW2.add(ji7.b);
                            c79VarW2.add(mi7.b);
                        }
                        c79 c79VarJ2 = yab.j(c79VarW2);
                        if (c79VarJ2.isEmpty()) {
                            listJ = ww3.G1(list2, c79VarJ);
                        } else {
                            int iMax = Math.max(0, i9 - size);
                            int iMax2 = Math.max(0, i9 - c79VarJ2.b);
                            List list3 = list2;
                            List listN1 = ww3.N1(list3, iMax);
                            List listL1 = ww3.l1(list3, iMax);
                            List listN2 = ww3.N1(listL1, iMax2);
                            List listL2 = ww3.l1(listL1, iMax2);
                            c79 c79VarW3 = yab.w();
                            c79VarW3.addAll(c79VarJ);
                            c79VarW3.addAll(listN1);
                            c79VarW3.addAll(c79VarJ2);
                            c79VarW3.addAll(listN2);
                            c79VarW3.addAll(listL2);
                            listJ = yab.j(c79VarW3);
                        }
                    } else {
                        listJ = list2;
                    }
                }
                dj7Var.e = 1;
                return yx6Var.emit(listJ, dj7Var) == hu4Var ? hu4Var : sbiVar;
        }
    }
}
