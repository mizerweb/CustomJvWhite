package defpackage;

import android.util.Size;

/* JADX INFO: loaded from: classes3.dex */
public abstract class srk {
    public static final boolean a(int i, int i2) {
        return (i & i2) == i2;
    }

    public static final y80 b(b87 b87Var) {
        return new y80(b87Var.a, b87Var.n, b87Var.k, b87Var.j, b87Var.G, b87Var.F, b87Var.b, b87Var.d);
    }

    public static final ux9 c(int i, b87 b87Var) {
        if (i != 1) {
            return i != 2 ? d(b87Var) : e(b87Var);
        }
        return b(b87Var);
    }

    public static final rmh d(b87 b87Var) {
        return new rmh(b87Var.a, b87Var.n, b87Var.d);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final kwi e(b87 b87Var) {
        eri eriVar;
        int i = (int) (b87Var.u * b87Var.A);
        int i2 = b87Var.v;
        Size size = b87Var.z % 180 == 0 ? new Size(i, i2) : new Size(i2, i);
        String str = b87Var.a;
        String str2 = b87Var.n;
        String str3 = b87Var.k;
        int i3 = b87Var.j;
        int width = size.getWidth();
        int height = size.getHeight();
        float f = b87Var.y;
        lwa lwaVar = b87Var.l;
        xc7 xc7Var = null;
        if (lwaVar == null) {
            eriVar = null;
            break;
        }
        jwa[] jwaVarArr = lwaVar.a;
        int length = jwaVarArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                eriVar = null;
                break;
            }
            jwa jwaVar = jwaVarArr[i4];
            if (jwaVar instanceof eri) {
                eriVar = (eri) jwaVar;
                break;
            }
            i4++;
        }
        if (eriVar != null) {
            String str4 = eriVar.a;
            switch (str4.hashCode()) {
                case -1096862286:
                    if (str4.equals("lowest")) {
                        xc7Var = xc7.d;
                    }
                    break;
                case -1068855134:
                    if (str4.equals("mobile")) {
                        xc7Var = xc7.c;
                    }
                    break;
                case 3324:
                    if (str4.equals("hd")) {
                        xc7Var = xc7.g;
                    }
                    break;
                case 3665:
                    if (str4.equals("sd")) {
                        xc7Var = xc7.f;
                    }
                    break;
                case 107348:
                    if (str4.equals("low")) {
                        xc7Var = xc7.e;
                    }
                    break;
                case 3154575:
                    if (str4.equals("full")) {
                        xc7Var = xc7.h;
                    }
                    break;
                case 3481927:
                    if (str4.equals("quad")) {
                        xc7Var = xc7.i;
                    }
                    break;
                case 111384492:
                    if (str4.equals("ultra")) {
                        xc7Var = xc7.j;
                    }
                    break;
            }
        }
        return new kwi(str, str2, str3, i3, width, height, f, xc7Var);
    }
}
