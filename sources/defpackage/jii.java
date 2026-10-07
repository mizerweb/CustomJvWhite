package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jii implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kii b;

    public /* synthetic */ jii(kii kiiVar, int i) {
        this.a = i;
        this.b = kiiVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        kii kiiVar = this.b;
        switch (i) {
            case 0:
                return (String) kiiVar.a.c.getValue();
            case 1:
                return ((a2c) kiiVar.b.getValue()).c();
            case 2:
                return ((n0c) ((xhh) kiiVar.c.getValue())).b();
            default:
                return new qd6(a2c.f(((n0c) ((xhh) kiiVar.c.getValue())).e(), "upload-file", 1, 1, true, true, 5, 64));
        }
    }
}
