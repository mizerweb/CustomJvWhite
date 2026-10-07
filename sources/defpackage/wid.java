package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wid implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ wid(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return yid.f(this.b);
            case 1:
                return yid.b(this.b);
            case 2:
                return yid.h(this.b);
            case 3:
                return zo5.j(this.b, "onForeground at realtime=");
            default:
                return zo5.j(this.b, "onBackground at realtime=");
        }
    }
}
