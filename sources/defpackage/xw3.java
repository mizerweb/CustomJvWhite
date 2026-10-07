package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xw3 extends yab {
    public static int M0(List list, Comparable comparable) {
        int size = list.size();
        T0(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iD = e9i.D((Comparable) list.get(i3), comparable);
            if (iD < 0) {
                i2 = i3 + 1;
            } else {
                if (iD <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static hj8 N0(Collection collection) {
        return new hj8(0, collection.size() - 1, 1);
    }

    public static int O0(List list) {
        return list.size() - 1;
    }

    public static List P0(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : r66.a;
    }

    public static List Q0(Object obj) {
        return obj != null ? Collections.singletonList(obj) : r66.a;
    }

    public static ArrayList R0(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new wv(objArr, true));
    }

    public static final List S0(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : Collections.singletonList(list.get(0));
        }
        return r66.a;
    }

    public static final void T0(int i, int i2) {
        if (i2 < 0) {
            ore.p(c0a.k(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            c.r(nbh.u("toIndex (", i2, ") is greater than size (", i, ")."));
        }
    }

    public static void U0() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void V0() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
