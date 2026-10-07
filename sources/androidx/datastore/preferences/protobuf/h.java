package androidx.datastore.preferences.protobuf;

import defpackage.b1k;
import defpackage.c71;
import defpackage.di9;
import defpackage.l3f;
import defpackage.mci;
import defpackage.qt4;
import defpackage.vu3;
import defpackage.xi8;
import defpackage.zy8;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final Class a;
    public static final i b;
    public static final i c;
    public static final mci d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        b = v(false);
        c = v(true);
        d = new mci();
    }

    public static void A(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                vu3Var.getClass();
                vu3Var.y(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 8;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.z(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void B(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += vu3.k(((Integer) list.get(i3)).intValue());
        }
        vu3Var.I(iK);
        while (i2 < list.size()) {
            vu3Var.B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void C(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.w(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 4;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.x(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void D(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 8;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.z(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void E(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                vu3Var.getClass();
                vu3Var.w(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 4;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.x(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void F(int i, List list, b1k b1kVar, l3f l3fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            b1kVar.I(i, list.get(i2), l3fVar);
        }
    }

    public static void G(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.A(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iK = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iK += vu3.k(((Integer) list.get(i3)).intValue());
        }
        vu3Var.I(iK);
        while (i2 < list.size()) {
            vu3Var.B(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void H(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += vu3.o(((Long) list.get(i3)).longValue());
        }
        vu3Var.I(iO);
        while (i2 < list.size()) {
            vu3Var.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void I(int i, List list, b1k b1kVar, l3f l3fVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((vu3) b1kVar.b).D(i, (a) list.get(i2), l3fVar);
        }
    }

    public static void J(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.w(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 4;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.x(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void K(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.y(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3 += 8;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.z(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void L(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                vu3Var.H(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iN += vu3.n((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        vu3Var.I(iN);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            vu3Var.I((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void M(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                vu3Var.J(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iO += vu3.o((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        vu3Var.I(iO);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            vu3Var.K((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void N(int i, List list, b1k b1kVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!(list instanceof zy8)) {
            while (i2 < list.size()) {
                vu3Var.E(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zy8 zy8Var = (zy8) list;
        while (i2 < list.size()) {
            Object objT = zy8Var.t(i2);
            if (objT instanceof String) {
                vu3Var.E(i, (String) objT);
            } else {
                vu3Var.u(i, (c71) objT);
            }
            i2++;
        }
    }

    public static void O(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.H(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iN = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iN += vu3.n(((Integer) list.get(i3)).intValue());
        }
        vu3Var.I(iN);
        while (i2 < list.size()) {
            vu3Var.I(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void P(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.J(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int iO = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iO += vu3.o(((Long) list.get(i3)).longValue());
        }
        vu3Var.I(iO);
        while (i2 < list.size()) {
            vu3Var.K(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = vu3.m(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iM += vu3.g((c71) list.get(i2));
        }
        return iM;
    }

    public static int b(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + c(list);
    }

    public static int c(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof xi8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i = 0; i < size; i++) {
            iK += vu3.k(((Integer) list.get(i)).intValue());
        }
        return iK;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return vu3.h(i) * size;
    }

    public static int e(List list) {
        return list.size() * 4;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return vu3.i(i) * size;
    }

    public static int g(List list) {
        return list.size() * 8;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + i(list);
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof xi8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iK = 0;
        for (int i = 0; i < size; i++) {
            iK += vu3.k(((Integer) list.get(i)).intValue());
        }
        return iK;
    }

    public static int j(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (vu3.m(i) * list.size()) + k(list);
    }

    public static int k(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof di9) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += vu3.o(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    public static int l(int i, List list, l3f l3fVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM = vu3.m(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int iB = ((a) list.get(i2)).b(l3fVar);
            iM += vu3.n(iB) + iB;
        }
        return iM;
    }

    public static int m(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + n(list);
    }

    public static int n(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof xi8)) {
                int iN = 0;
                for (int i = 0; i < size; i++) {
                    int iIntValue = ((Integer) list.get(i)).intValue();
                    iN += vu3.n((iIntValue >> 31) ^ (iIntValue << 1));
                }
                return iN;
            }
            qt4.A(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + p(list);
    }

    public static int p(List list) {
        int size = list.size();
        if (size != 0) {
            if (!(list instanceof di9)) {
                int iO = 0;
                for (int i = 0; i < size; i++) {
                    long jLongValue = ((Long) list.get(i)).longValue();
                    iO += vu3.o((jLongValue >> 63) ^ (jLongValue << 1));
                }
                return iO;
            }
            qt4.A(list);
            if (size > 0) {
                throw null;
            }
        }
        return 0;
    }

    public static int q(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iM = vu3.m(i) * size;
        if (!(list instanceof zy8)) {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof c71) {
                    int size2 = ((c71) obj).size();
                    iM = vu3.n(size2) + size2 + iM;
                } else {
                    iM = vu3.l((String) obj) + iM;
                }
                i2++;
            }
            return iM;
        }
        zy8 zy8Var = (zy8) list;
        while (i2 < size) {
            Object objT = zy8Var.t(i2);
            if (objT instanceof c71) {
                int size3 = ((c71) objT).size();
                iM = vu3.n(size3) + size3 + iM;
            } else {
                iM = vu3.l((String) objT) + iM;
            }
            i2++;
        }
        return iM;
    }

    public static int r(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + s(list);
    }

    public static int s(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof xi8) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iN = 0;
        for (int i = 0; i < size; i++) {
            iN += vu3.n(((Integer) list.get(i)).intValue());
        }
        return iN;
    }

    public static int t(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (vu3.m(i) * size) + u(list);
    }

    public static int u(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof di9) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int iO = 0;
        for (int i = 0; i < size; i++) {
            iO += vu3.o(((Long) list.get(i)).longValue());
        }
        return iO;
    }

    public static i v(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (i) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static void w(i iVar, Object obj, Object obj2) {
        ((mci) iVar).getClass();
        d dVar = (d) obj;
        j jVar = dVar.unknownFields;
        j jVar2 = ((d) obj2).unknownFields;
        if (!jVar2.equals(j.f)) {
            int i = jVar.a + jVar2.a;
            int[] iArrCopyOf = Arrays.copyOf(jVar.b, i);
            System.arraycopy(jVar2.b, 0, iArrCopyOf, jVar.a, jVar2.a);
            Object[] objArrCopyOf = Arrays.copyOf(jVar.c, i);
            System.arraycopy(jVar2.c, 0, objArrCopyOf, jVar.a, jVar2.a);
            jVar = new j(i, iArrCopyOf, objArrCopyOf, true);
        }
        dVar.unknownFields = jVar;
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void y(int i, List list, b1k b1kVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        vu3 vu3Var = (vu3) b1kVar.b;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                vu3Var.t(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        vu3Var.G(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = vu3.f;
            i3++;
        }
        vu3Var.I(i3);
        while (i2 < list.size()) {
            vu3Var.r(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void z(int i, List list, b1k b1kVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        b1kVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((vu3) b1kVar.b).u(i, (c71) list.get(i2));
        }
    }
}
