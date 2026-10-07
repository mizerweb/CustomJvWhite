package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vcb implements vd4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vcb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b() {
    }

    @Override // defpackage.vd4
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((wcb) obj).d.set(null);
                break;
            default:
                rnf rnfVar = (rnf) obj;
                gm0.n(rnfVar.f, "onConnectionTypeChange");
                rnfVar.p.obtainMessage(5).sendToTarget();
                break;
        }
    }

    @Override // defpackage.vd4
    public final void c() {
        switch (this.a) {
            case 0:
                break;
            default:
                rnf rnfVar = (rnf) this.b;
                gm0.n(rnfVar.f, "onBackgroundDataEnabledChange");
                rnfVar.p.obtainMessage(5).sendToTarget();
                break;
        }
    }
}
