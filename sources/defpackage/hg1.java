package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hg1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ hg1(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ae1(this.b, 4, true);
            default:
                return new ae1(this.b, 4, false);
        }
    }
}
