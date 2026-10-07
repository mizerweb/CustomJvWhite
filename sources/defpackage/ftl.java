package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ftl implements xwd {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4i b;

    public /* synthetic */ ftl(e4i e4iVar, int i) {
        this.a = i;
        this.b = e4iVar;
    }

    @Override // defpackage.xwd
    public final Object get() {
        int i = this.a;
        e4i e4iVar = this.b;
        switch (i) {
            case 0:
                return e4iVar.a("FIREBASE_ML_SDK", new z86("json"), ldf.s);
            case 1:
                return e4iVar.a("FIREBASE_ML_SDK", new z86("proto"), ou7.l);
            case 2:
                return e4iVar.a("FIREBASE_ML_SDK", new z86("json"), new ku8());
            default:
                return e4iVar.a("FIREBASE_ML_SDK", new z86("proto"), new yr8(21));
        }
    }
}
