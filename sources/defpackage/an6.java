package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class an6 {
    public final rre a;
    public final pl b = new pl(6);

    public an6(rre rreVar) {
        this.a = rreVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(an6 an6Var, List list, nq4 nq4Var) {
        vm6 vm6Var;
        if (nq4Var instanceof vm6) {
            vm6Var = (vm6) nq4Var;
            int i = vm6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                vm6Var.h = i - Integer.MIN_VALUE;
            } else {
                vm6Var = new vm6(an6Var, nq4Var);
            }
        } else {
            vm6Var = new vm6(an6Var, nq4Var);
        }
        Object objI = vm6Var.f;
        int i2 = vm6Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            vm6Var.d = an6Var;
            vm6Var.e = list;
            vm6Var.h = 1;
            objI = ch3.I(vm6Var, an6Var.a, true, false, new us5(17));
            if (objI != hu4Var) {
            }
        }
        if (i2 == 1) {
            list = vm6Var.e;
            an6Var = vm6Var.d;
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = vm6Var.e;
            ch3.d0(objI);
        }
        int iIntValue = ((Number) objI).intValue() + 1;
        an6Var.getClass();
        ArrayList arrayListD = d(iIntValue, list);
        vm6Var.d = null;
        vm6Var.e = null;
        vm6Var.h = 2;
        Object objI2 = ch3.I(vm6Var, an6Var.a, false, true, new w14(an6Var, 18, arrayListD));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object c(an6 an6Var, List list, nq4 nq4Var) {
        wm6 wm6Var;
        if (nq4Var instanceof wm6) {
            wm6Var = (wm6) nq4Var;
            int i = wm6Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm6Var.h = i - Integer.MIN_VALUE;
            } else {
                wm6Var = new wm6(an6Var, nq4Var);
            }
        } else {
            wm6Var = new wm6(an6Var, nq4Var);
        }
        Object obj = wm6Var.f;
        int i2 = wm6Var.h;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            wm6Var.d = an6Var;
            wm6Var.e = list;
            wm6Var.h = 1;
            Object objI = ch3.I(wm6Var, an6Var.a, false, true, new us5(20));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 == 1) {
            list = wm6Var.e;
            an6Var = wm6Var.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = wm6Var.e;
            ch3.d0(obj);
        }
        an6Var.getClass();
        ArrayList arrayListD = d(0, list);
        wm6Var.d = null;
        wm6Var.e = null;
        wm6Var.h = 2;
        Object objI2 = ch3.I(wm6Var, an6Var.a, false, true, new w14(an6Var, 18, arrayListD));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }

    public static ArrayList d(int i, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            long jLongValue = ((Number) list.get(i2)).longValue();
            ql6 ql6Var = new ql6();
            ql6Var.a = jLongValue;
            ql6Var.b = i + i2;
            arrayList.add(ql6Var);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object e(an6 an6Var, long j, boolean z, nq4 nq4Var) {
        xm6 xm6Var;
        if (nq4Var instanceof xm6) {
            xm6Var = (xm6) nq4Var;
            int i = xm6Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xm6Var.i = i - Integer.MIN_VALUE;
            } else {
                xm6Var = new xm6(an6Var, nq4Var);
            }
        } else {
            xm6Var = new xm6(an6Var, nq4Var);
        }
        Object objI = xm6Var.g;
        int i2 = xm6Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            xm6Var.d = an6Var;
            xm6Var.e = j;
            xm6Var.f = z;
            xm6Var.i = 1;
            objI = ch3.I(xm6Var, an6Var.a, true, false, new us5(18));
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objI);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(objI);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = xm6Var.f;
        j = xm6Var.e;
        an6Var = xm6Var.d;
        ch3.d0(objI);
        ArrayList arrayList = new ArrayList((Collection) objI);
        if (!z) {
            if (arrayList.remove(new Long(j))) {
                xm6Var.d = null;
                xm6Var.e = j;
                xm6Var.f = z;
                xm6Var.i = 2;
                if (an6Var.b(arrayList, xm6Var) == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        if (arrayList.indexOf(new Long(j)) == -1) {
            arrayList.add(0, new Long(j));
            xm6Var.d = null;
            xm6Var.e = j;
            xm6Var.f = z;
            xm6Var.i = 3;
            if (an6Var.b(arrayList, xm6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object g(an6 an6Var, long j, int i, nq4 nq4Var) {
        ym6 ym6Var;
        if (nq4Var instanceof ym6) {
            ym6Var = (ym6) nq4Var;
            int i2 = ym6Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ym6Var.i = i2 - Integer.MIN_VALUE;
            } else {
                ym6Var = new ym6(an6Var, nq4Var);
            }
        } else {
            ym6Var = new ym6(an6Var, nq4Var);
        }
        Object objI = ym6Var.g;
        int i3 = ym6Var.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(objI);
            ym6Var.d = an6Var;
            ym6Var.e = j;
            ym6Var.f = i;
            ym6Var.i = 1;
            objI = ch3.I(ym6Var, an6Var.a, true, false, new us5(18));
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ch3.d0(objI);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = ym6Var.f;
        j = ym6Var.e;
        an6Var = ym6Var.d;
        ch3.d0(objI);
        List list = (List) objI;
        int iIndexOf = list.indexOf(new Long(j));
        if (iIndexOf >= 0 && i >= 0 && i < list.size()) {
            p90.H(iIndexOf, i, list);
            ym6Var.d = null;
            ym6Var.e = j;
            ym6Var.f = i;
            ym6Var.i = 2;
            if (an6Var.b(list, ym6Var) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }

    public final Object b(List list, nq4 nq4Var) {
        Object objH = ch3.H(nq4Var, new zm6(this, list, null, 1), this.a);
        return objH == hu4.a ? objH : sbi.a;
    }

    public final Object f(List list, nq4 nq4Var) {
        Object objI = ch3.I(nq4Var, this.a, false, true, new tj1(1, nbh.x(")", nbh.C("DELETE FROM favorite_stickers WHERE id IN ("), list), list));
        return objI == hu4.a ? objI : sbi.a;
    }
}
