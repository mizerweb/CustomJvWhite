package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iz2 {
    public final ny8 a;
    public final ny8 b;
    public final String c = iz2.class.getName();

    public iz2(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public static void a(iz2 iz2Var, long j, long j2, long j3, long j4, mg5 mg5Var) {
        String str = iz2Var.c;
        StringBuilder sbT = qt4.t(j, "from: chatId = ", ", time = ", vd7.K(Long.valueOf(j3)));
        sbT.append(", chatAccessToken=");
        sbT.append(true);
        gm0.n(str, sbT.toString());
        sih.b((sih) iz2Var.b.getValue(), new ez2(((s7f) ((et3) iz2Var.a.getValue())).g(), j, j2, j3, j4, false, 0L, mg5Var, 7552));
    }

    public static long b(iz2 iz2Var, long j, long j2, long j3, long j4, long j5, mg5 mg5Var, boolean z) {
        String str = iz2Var.c;
        String strK = vd7.K(Long.valueOf(j3));
        String strK2 = vd7.K(Long.valueOf(j4));
        StringBuilder sbT = qt4.t(j, "from-to: chatId = ", ", time = ", strK);
        sbT.append(", backwardTime = ");
        sbT.append(strK2);
        sbT.append(", chatAccessToken=");
        sbT.append(true);
        gm0.n(str, sbT.toString());
        return sih.b((sih) iz2Var.b.getValue(), new ez2(((s7f) ((et3) iz2Var.a.getValue())).g(), j, j2, j3, j5, z, j4, mg5Var, 6400));
    }

    public static void c(iz2 iz2Var, long j, long j2, long j3, long j4, long j5, mg5 mg5Var) {
        String str = iz2Var.c;
        String strK = vd7.K(Long.valueOf(j3));
        String strK2 = vd7.K(Long.valueOf(j4));
        StringBuilder sbT = qt4.t(j, "to: chatId = ", ", time = ", strK);
        sbT.append(", backwardTime = ");
        sbT.append(strK2);
        sbT.append(", chatAccessToken=");
        sbT.append(true);
        gm0.n(str, sbT.toString());
        sih.b((sih) iz2Var.b.getValue(), new ez2(((s7f) ((et3) iz2Var.a.getValue())).g(), j, j2, j3, j5, false, j4, mg5Var, 6528));
    }
}
