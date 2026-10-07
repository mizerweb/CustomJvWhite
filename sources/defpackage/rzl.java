package defpackage;

import android.graphics.Bitmap;
import android.graphics.Gainmap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rzl {
    public static String a(int i, String str) {
        if (i == -1) {
            return str;
        }
        return str + i;
    }

    public static boolean b(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[1];
        return f == f2 && f2 == fArr[2];
    }

    public static boolean c(Gainmap gainmap, Gainmap gainmap2) {
        return gainmap.getGamma() == gainmap2.getGamma() && gainmap.getRatioMax() == gainmap2.getRatioMax() && gainmap.getRatioMin() == gainmap2.getRatioMin() && gainmap.getEpsilonHdr() == gainmap2.getEpsilonHdr() && gainmap.getEpsilonSdr() == gainmap2.getEpsilonSdr() && gainmap.getDisplayRatioForFullHdr() == gainmap2.getDisplayRatioForFullHdr() && gainmap.getMinDisplayRatioForHdrTransition() == gainmap2.getMinDisplayRatioForHdrTransition() && gainmap.getGainmapContents() == gainmap2.getGainmapContents() && gainmap.getGainmapContents().getGenerationId() == gainmap2.getGainmapContents().getGenerationId();
    }

    public static long d(nmc nmcVar, int i, int i2) {
        nmcVar.N(i);
        if (nmcVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iM = nmcVar.m();
        if ((8388608 & iM) != 0 || ((2096896 & iM) >> 8) != i2 || (iM & 32) == 0 || nmcVar.A() < 7 || nmcVar.a() < 7 || (nmcVar.A() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        nmcVar.k(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static void e(v30 v30Var, Gainmap gainmap, int i) {
        int i2 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
        float[] gamma = gainmap.getGamma();
        int i3 = (gamma[0] == 1.0f && gamma[1] == 1.0f && gamma[2] == 1.0f) ? 1 : 0;
        int i4 = (b(gamma) && b(gainmap.getRatioMax()) && b(gainmap.getRatioMin())) ? 1 : 0;
        v30Var.B(i2, a(i, "uGainmapIsAlpha"));
        v30Var.B(i3, a(i, "uNoGamma"));
        v30Var.B(i4, a(i, "uSingleChannel"));
        String strA = a(i, "uLogRatioMin");
        float[] ratioMin = gainmap.getRatioMin();
        v30Var.A(strA, new float[]{(float) Math.log(ratioMin[0]), (float) Math.log(ratioMin[1]), (float) Math.log(ratioMin[2])});
        String strA2 = a(i, "uLogRatioMax");
        float[] ratioMax = gainmap.getRatioMax();
        v30Var.A(strA2, new float[]{(float) Math.log(ratioMax[0]), (float) Math.log(ratioMax[1]), (float) Math.log(ratioMax[2])});
        v30Var.A(a(i, "uEpsilonSdr"), gainmap.getEpsilonSdr());
        v30Var.A(a(i, "uEpsilonHdr"), gainmap.getEpsilonHdr());
        v30Var.A(a(i, "uGainmapGamma"), gamma);
        v30Var.z(a(i, "uDisplayRatioHdr"), gainmap.getDisplayRatioForFullHdr());
        v30Var.z(a(i, "uDisplayRatioSdr"), gainmap.getMinDisplayRatioForHdrTransition());
        tab.e();
    }
}
