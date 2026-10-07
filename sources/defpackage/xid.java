package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xid implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;

    public /* synthetic */ xid(int i, int i2, long j) {
        this.a = i2;
        this.b = j;
        this.c = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return yid.c(this.b, this.c);
            default:
                return yid.g(this.b, this.c);
        }
    }
}
