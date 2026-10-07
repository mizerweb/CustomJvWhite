package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j4a implements r4a {
    public final /* synthetic */ int a;
    public final /* synthetic */ r4a b;

    public /* synthetic */ j4a(r4a r4aVar, int i) {
        this.a = i;
        this.b = r4aVar;
    }

    @Override // defpackage.r4a
    public final Object k(d3a d3aVar, i2a i2aVar, int i) {
        int i2 = this.a;
        r4a r4aVar = this.b;
        switch (i2) {
            case 0:
                if (d3aVar != null) {
                    throw new ClassCastException();
                }
                t4a.l0(null, i2aVar, i, r4aVar, new iw2(i2aVar, i, 5));
                throw null;
            default:
                return t4a.l0(d3aVar, i2aVar, i, r4aVar, new vf6(d3aVar, i2aVar, i, 3));
        }
    }
}
