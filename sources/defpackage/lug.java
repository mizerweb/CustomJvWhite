package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lug implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ lug(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new fr3(this.b, 2);
            default:
                return zo5.s("is size update consumed: ", this.b);
        }
    }
}
