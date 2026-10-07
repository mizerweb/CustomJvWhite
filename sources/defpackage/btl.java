package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btl {
    public static float a(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f5 - f3;
        float f8 = f6 - f4;
        float f9 = (f8 * f8) + (f7 * f7);
        float fU = 0.0f;
        if (f9 > 0.0f) {
            fU = oc9.u((((f2 - f4) * f8) + ((f - f3) * f7)) / f9, 0.0f, 1.0f);
        }
        float f10 = f - ((f7 * fU) + f3);
        float f11 = f2 - ((fU * f8) + f4);
        return (f11 * f11) + (f10 * f10);
    }

    public static final czg b(azg azgVar) {
        int i;
        long jA = azgVar.a();
        if (azgVar instanceof zyg) {
            i = 1;
        } else if (azgVar instanceof yyg) {
            i = 2;
        } else {
            if (!(azgVar instanceof xyg)) {
                ore.o();
                return null;
            }
            i = 3;
        }
        return new czg(jA, i);
    }
}
