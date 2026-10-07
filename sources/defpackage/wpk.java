package defpackage;

import android.view.ViewGroup;
import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wpk {
    public static final byte[] a = {0, 0, 0, 0, 16, 0, -128, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] b = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static boolean a(kj6 kj6Var) {
        nmc nmcVar = new nmc(8);
        int i = dc1.h(kj6Var, nmcVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        kj6Var.u(0, nmcVar.a, 4);
        nmcVar.N(0);
        int iM = nmcVar.m();
        if (iM == 1463899717) {
            return true;
        }
        lvb.k0("WavHeaderReader", "Unsupported form type: " + iM);
        return false;
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static void c(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    public static dc1 d(int i, kj6 kj6Var, nmc nmcVar) throws ParserException {
        dc1 dc1VarH = dc1.h(kj6Var, nmcVar);
        while (true) {
            int i2 = dc1VarH.a;
            if (i2 == i) {
                return dc1VarH;
            }
            qt4.y(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = dc1VarH.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            kj6Var.E((int) j2);
            dc1VarH = dc1.h(kj6Var, nmcVar);
        }
    }
}
