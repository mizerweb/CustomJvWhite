package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g3a implements n3a {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3a b;
    public final /* synthetic */ long c;

    public /* synthetic */ g3a(o3a o3aVar, long j, int i) {
        this.a = i;
        this.b = o3aVar;
        this.c = j;
    }

    @Override // defpackage.n3a
    public final void b(i2a i2aVar) {
        int i = this.a;
        long j = this.c;
        o3a o3aVar = this.b;
        switch (i) {
            case 0:
                o3aVar.g.t.D((int) j);
                break;
            default:
                o3aVar.g.t.seekTo(j);
                break;
        }
    }
}
