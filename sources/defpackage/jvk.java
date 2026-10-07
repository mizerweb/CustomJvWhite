package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jvk {
    public static final long a(e70 e70Var) {
        long length;
        float f;
        String str = e70Var.u;
        long j = e70Var.w;
        if (j > 0) {
            return j;
        }
        j60 j60Var = e70Var.j;
        long j2 = j60Var != null ? j60Var.b : 0L;
        if (j2 > 0) {
            return j2;
        }
        if (str.length() > 0) {
            try {
                length = new File(str).length();
            } catch (Throwable th) {
                gm0.l(e70.class.getName(), "Не смогли извлечь размер из файла", th);
                length = 0;
            }
            if (length > 0) {
                return length;
            }
        }
        o60 o60Var = e70Var.b;
        if (o60Var != null) {
            int i = o60Var.d;
            int i2 = o60Var.c;
            gm0.n(o60.class.getName(), "Photo meta: " + i2 + "x" + i);
            return ((long) (i2 * i)) * 3;
        }
        d70 d70Var = e70Var.d;
        if (d70Var == null) {
            return 0L;
        }
        int i3 = d70Var.g;
        int i4 = d70Var.f;
        int i5 = i4 * i3;
        if (i5 <= 76800) {
            f = 1.0f;
        } else if (i5 <= 307200) {
            f = 2.5f;
        } else if (i5 <= 921600) {
            f = 5.0f;
        } else if (i5 <= 2073600) {
            f = 8.0f;
        } else if (i5 <= 3686400) {
            f = 16.0f;
        } else {
            f = i5 <= 8294400 ? 35.0f : 45.0f;
        }
        String name = d70.class.getName();
        StringBuilder sbP = qv1.p("Video meta: ", i4, "x", i3, ", estimated bitrate: ");
        sbP.append(f);
        gm0.n(name, sbP.toString());
        return (long) (((d70Var.c / 1000.0f) * f) / 8.0f);
    }

    public static final ArrayList b(int i) {
        hj8 hj8Var = new hj8(i, 23, 1);
        ArrayList arrayList = new ArrayList(yw3.W0(hj8Var, 10));
        Iterator it = hj8Var.iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                return arrayList;
            }
            arrayList.add(new zrh(gj8Var.nextInt()));
        }
    }

    public static final ArrayList c(int i) {
        hj8 hj8Var = new hj8(i, 59, 1);
        ArrayList arrayList = new ArrayList(yw3.W0(hj8Var, 10));
        Iterator it = hj8Var.iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                return arrayList;
            }
            arrayList.add(new zrh(gj8Var.nextInt()));
        }
    }
}
