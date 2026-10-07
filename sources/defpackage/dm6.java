package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dm6 {
    public final rre a;
    public final pl b = new pl(5);

    public dm6(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(dm6 dm6Var, List list, nq4 nq4Var) {
        tl6 tl6Var;
        if (nq4Var instanceof tl6) {
            tl6Var = (tl6) nq4Var;
            int i = tl6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                tl6Var.h = i - Integer.MIN_VALUE;
            } else {
                tl6Var = new tl6(dm6Var, nq4Var);
            }
        } else {
            tl6Var = new tl6(dm6Var, nq4Var);
        }
        Object objI = tl6Var.f;
        int i2 = tl6Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            tl6Var.d = dm6Var;
            tl6Var.e = list;
            tl6Var.h = 1;
            objI = ch3.I(tl6Var, dm6Var.a, true, false, new us5(13));
            if (objI != hu4Var) {
            }
        }
        if (i2 == 1) {
            list = tl6Var.e;
            dm6Var = tl6Var.d;
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = tl6Var.e;
            ch3.d0(objI);
        }
        long jIntValue = ((long) ((Number) objI).intValue()) + 1;
        dm6Var.getClass();
        ArrayList arrayListD = d(jIntValue, list);
        tl6Var.d = null;
        tl6Var.e = null;
        tl6Var.h = 2;
        Object objI2 = ch3.I(tl6Var, dm6Var.a, false, true, new w14(dm6Var, 17, arrayListD));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(dm6 dm6Var, List list, nq4 nq4Var) {
        ul6 ul6Var;
        if (nq4Var instanceof ul6) {
            ul6Var = (ul6) nq4Var;
            int i = ul6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ul6Var.h = i - Integer.MIN_VALUE;
            } else {
                ul6Var = new ul6(dm6Var, nq4Var);
            }
        } else {
            ul6Var = new ul6(dm6Var, nq4Var);
        }
        Object obj = ul6Var.f;
        int i2 = ul6Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            ul6Var.d = dm6Var;
            ul6Var.e = list;
            ul6Var.h = 1;
            Object objI = ch3.I(ul6Var, dm6Var.a, false, true, new us5(14));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 == 1) {
            list = ul6Var.e;
            dm6Var = ul6Var.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = ul6Var.e;
            ch3.d0(obj);
        }
        dm6Var.getClass();
        ArrayList arrayListD = d(0L, list);
        ul6Var.d = null;
        ul6Var.e = null;
        ul6Var.h = 2;
        Object objI2 = ch3.I(ul6Var, dm6Var.a, false, true, new w14(dm6Var, 17, arrayListD));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    public static ArrayList d(long j, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i < 0) {
                xw3.V0();
                throw null;
            }
            long jLongValue = ((Number) obj).longValue();
            rl6 rl6Var = new rl6();
            rl6Var.a = jLongValue;
            rl6Var.b = ((long) i) + j;
            arrayList.add(rl6Var);
            i = i2;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object f(dm6 dm6Var, long j, boolean z, nq4 nq4Var) {
        vl6 vl6Var;
        if (nq4Var instanceof vl6) {
            vl6Var = (vl6) nq4Var;
            int i = vl6Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vl6Var.i = i - Integer.MIN_VALUE;
            } else {
                vl6Var = new vl6(dm6Var, nq4Var);
            }
        } else {
            vl6Var = new vl6(dm6Var, nq4Var);
        }
        Object objE = vl6Var.g;
        int i2 = vl6Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            vl6Var.d = dm6Var;
            vl6Var.e = j;
            vl6Var.f = z;
            vl6Var.i = 1;
            objE = dm6Var.e(vl6Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objE);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(objE);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = vl6Var.f;
        j = vl6Var.e;
        dm6Var = vl6Var.d;
        ch3.d0(objE);
        ArrayList arrayList = new ArrayList((Collection) objE);
        if (!z) {
            if (arrayList.remove(new Long(j))) {
                vl6Var.d = null;
                vl6Var.e = j;
                vl6Var.f = z;
                vl6Var.i = 2;
                if (dm6Var.b(arrayList, vl6Var) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        if (arrayList.indexOf(new Long(j)) == -1) {
            arrayList.add(0, new Long(j));
            vl6Var.d = null;
            vl6Var.e = j;
            vl6Var.f = z;
            vl6Var.i = 3;
            if (dm6Var.b(arrayList, vl6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object g(dm6 dm6Var, List list, nq4 nq4Var) {
        wl6 wl6Var;
        if (nq4Var instanceof wl6) {
            wl6Var = (wl6) nq4Var;
            int i = wl6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wl6Var.h = i - Integer.MIN_VALUE;
            } else {
                wl6Var = new wl6(dm6Var, nq4Var);
            }
        } else {
            wl6Var = new wl6(dm6Var, nq4Var);
        }
        Object objE = wl6Var.f;
        int i2 = wl6Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            wl6Var.d = dm6Var;
            wl6Var.e = list;
            wl6Var.h = 1;
            objE = dm6Var.e(wl6Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = wl6Var.e;
            ch3.d0(objE);
            return sbiVar;
        }
        list = wl6Var.e;
        dm6Var = wl6Var.d;
        ch3.d0(objE);
        ArrayList arrayList = new ArrayList((Collection) objE);
        if (arrayList.removeIf(new u6(3, new sl6(0, list)))) {
            wl6Var.d = null;
            wl6Var.e = null;
            wl6Var.h = 2;
            if (dm6Var.b(arrayList, wl6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object h(dm6 dm6Var, long j, int i, nq4 nq4Var) {
        yl6 yl6Var;
        if (nq4Var instanceof yl6) {
            yl6Var = (yl6) nq4Var;
            int i2 = yl6Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yl6Var.i = i2 - Integer.MIN_VALUE;
            } else {
                yl6Var = new yl6(dm6Var, nq4Var);
            }
        } else {
            yl6Var = new yl6(dm6Var, nq4Var);
        }
        Object objE = yl6Var.g;
        int i3 = yl6Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objE);
            yl6Var.d = dm6Var;
            yl6Var.e = j;
            yl6Var.f = i;
            yl6Var.i = 1;
            objE = dm6Var.e(yl6Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ch3.d0(objE);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = yl6Var.f;
        j = yl6Var.e;
        dm6Var = yl6Var.d;
        ch3.d0(objE);
        List list = (List) objE;
        int iIndexOf = list.indexOf(new Long(j));
        if (iIndexOf >= 0 && i >= 0 && i < list.size()) {
            p90.H(iIndexOf, i, list);
            yl6Var.d = null;
            yl6Var.e = j;
            yl6Var.f = i;
            yl6Var.i = 2;
            if (dm6Var.b(list, yl6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object i(dm6 dm6Var, long j, long j2, nq4 nq4Var) {
        xl6 xl6Var;
        if (nq4Var instanceof xl6) {
            xl6Var = (xl6) nq4Var;
            int i = xl6Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xl6Var.i = i - Integer.MIN_VALUE;
            } else {
                xl6Var = new xl6(dm6Var, nq4Var);
            }
        } else {
            xl6Var = new xl6(dm6Var, nq4Var);
        }
        Object objE = xl6Var.g;
        int i2 = xl6Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objE);
            xl6Var.d = dm6Var;
            xl6Var.e = j;
            xl6Var.f = j2;
            xl6Var.i = 1;
            objE = dm6Var.e(xl6Var);
            if (objE != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objE);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = xl6Var.f;
        j = xl6Var.e;
        dm6Var = xl6Var.d;
        ch3.d0(objE);
        List list = (List) objE;
        int iIndexOf = list.indexOf(new Long(j));
        int iIndexOf2 = list.indexOf(new Long(j2));
        if (iIndexOf >= 0 && iIndexOf2 >= 0) {
            p90.H(iIndexOf, iIndexOf2, list);
            xl6Var.d = null;
            xl6Var.e = j;
            xl6Var.f = j2;
            xl6Var.i = 2;
            if (dm6Var.b(list, xl6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public final Object b(List list, nq4 nq4Var) {
        Object objH = ch3.H(nq4Var, new zl6(this, list, null, 1), this.a);
        return objH == hu4.a ? objH : sbi.a;
    }

    public final Object e(nq4 nq4Var) {
        return ch3.I(nq4Var, this.a, true, false, new us5(16));
    }
}
