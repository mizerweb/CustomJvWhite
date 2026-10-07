package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ml implements zl {
    public final /* synthetic */ nl a;

    public ml(nl nlVar) {
        this.a = nlVar;
    }

    @Override // defpackage.zl
    public final void a(Double[] dArr) {
        nl nlVar = this.a;
        yt1 yt1Var = nlVar.a.j0.a.a;
        if (yt1Var != null) {
            int length = dArr.length;
            float[] fArr = new float[length];
            for (int i = 0; i < length; i++) {
                fArr[i] = (float) dArr[i].doubleValue();
            }
            km kmVar = nlVar.h;
            kmVar.getClass();
            kmVar.g.post(new i0(kmVar, yt1Var, fArr, 2));
        }
    }

    @Override // defpackage.zl
    public final void b() {
    }
}
