package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m95 extends rr0 {
    public final /* synthetic */ int d;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m95(int i, long j, long j2, Object obj) {
        super(j, j2);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.gt9
    public final long a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                c();
                return ((l95) obj).e(this.c);
            default:
                c();
                return ((o95) obj).h(this.c);
        }
    }

    @Override // defpackage.gt9
    public final long b() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                c();
                return ((l95) obj).d(this.c);
            default:
                c();
                return ((o95) obj).f(this.c);
        }
    }
}
