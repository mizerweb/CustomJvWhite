package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h3a implements n3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3a b;
    public final /* synthetic */ int c;

    public /* synthetic */ h3a(o3a o3aVar, int i, int i2) {
        this.a = i2;
        this.b = o3aVar;
        this.c = i;
    }

    @Override // defpackage.n3a
    public final void b(i2a i2aVar) {
        int i = this.a;
        int i2 = this.c;
        o3a o3aVar = this.b;
        switch (i) {
            case 0:
                o3aVar.g.t.setRepeatMode(mz8.p(i2));
                break;
            default:
                o3aVar.g.t.A(mz8.r(i2));
                break;
        }
    }
}
