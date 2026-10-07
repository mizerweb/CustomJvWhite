package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gvi implements hvd {
    public final /* synthetic */ vfe a;
    public final /* synthetic */ hvd b;

    public /* synthetic */ gvi(vfe vfeVar, hvd hvdVar) {
        this.a = vfeVar;
        this.b = hvdVar;
    }

    @Override // defpackage.hvd
    public final void a(float f) {
        vfe vfeVar = this.a;
        hvd hvdVar = this.b;
        String str = mvi.f;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "convert: progress " + f, null);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - vfeVar.a >= 1000) {
            vfeVar.a = jCurrentTimeMillis;
            if (hvdVar != null) {
                hvdVar.a(f * 100.0f);
            }
        }
    }
}
