package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mh3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rre b;

    public /* synthetic */ mh3(rre rreVar, int i) {
        this.a = i;
        this.b = rreVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        rre rreVar = this.b;
        switch (i) {
            case 0:
                Object obj = rreVar.j.get(zfe.a(vo3.class));
                if (obj != null) {
                    return (vo3) obj;
                }
                ore.k("Required value was null.");
                return null;
            case 1:
                Object obj2 = rreVar.j.get(zfe.a(dwa.class));
                if (obj2 != null) {
                    return (dwa) obj2;
                }
                ore.k("Required value was null.");
                return null;
            default:
                Object obj3 = rreVar.j.get(zfe.a(vo3.class));
                if (obj3 != null) {
                    return (vo3) obj3;
                }
                ore.k("Required value was null.");
                return null;
        }
    }
}
