package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1c implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a2c b;

    public /* synthetic */ y1c(a2c a2cVar, int i) {
        this.a = i;
        this.b = a2cVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a2c a2cVar = this.b;
        switch (i) {
            case 0:
                return a2cVar.b;
            case 1:
                return new rbc(a2cVar.c, a2cVar.d, new y1c(a2cVar, 0));
            case 2:
                return new v1c((rbc) a2cVar.h.getValue(), a2cVar.e);
            default:
                z1c z1cVar = a2cVar.a;
                if (z1cVar.c) {
                    return new lcj(z1cVar.j);
                }
                return null;
        }
    }
}
