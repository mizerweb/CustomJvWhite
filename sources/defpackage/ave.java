package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ave extends yab {
    @Override // defpackage.yab
    public final void H(ixf ixfVar, float f, float f2) {
        ixfVar.d(f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        exf exfVar = new exf(0.0f, 0.0f, f3, f3);
        exf.b(exfVar, 180.0f);
        exf.c(exfVar, 90.0f);
        ixfVar.f.add(exfVar);
        cxf cxfVar = new cxf(exfVar);
        ixfVar.a(180.0f);
        ixfVar.g.add(cxfVar);
        ixfVar.d = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        ixfVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f5) + f4;
        ixfVar.c = (f5 * ((float) Math.sin(Math.toRadians(270.0d)))) + f4;
    }
}
