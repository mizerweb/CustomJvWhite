package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j6 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5d b;

    public /* synthetic */ j6(e5d e5dVar, int i) {
        this.a = i;
        this.b = e5dVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        e5d e5dVar = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) e5dVar.b0.a(e5d.S6[51]).i();
                bool.booleanValue();
                return bool;
            case 1:
                return Boolean.valueOf(a55.a(((Number) e5dVar.d().i()).intValue()) == a55.DEV_OPTIONS_MENU);
            case 2:
                return new g5d(e5dVar);
            default:
                return new f5d(e5dVar);
        }
    }
}
