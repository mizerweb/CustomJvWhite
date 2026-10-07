package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q14 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rre b;

    public /* synthetic */ q14(rre rreVar, int i) {
        this.a = i;
        this.b = rreVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        rre rreVar = this.b;
        switch (i) {
            case 0:
                Object obj = rreVar.j.get(zfe.a(dwa.class));
                if (obj != null) {
                    return (dwa) obj;
                }
                ore.k("Required value was null.");
                return null;
            default:
                Object obj2 = rreVar.j.get(zfe.a(shc.class));
                if (obj2 != null) {
                    return (shc) obj2;
                }
                ore.k("Required value was null.");
                return null;
        }
    }
}
