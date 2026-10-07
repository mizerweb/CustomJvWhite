package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l5c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ m5c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public l5c(m5c m5cVar, int i) {
        this.c = i;
        int i2 = 4;
        this.d = m5cVar;
        switch (i) {
            case 1:
                super(i2, j5c.a);
                break;
            default:
                super(i2, k5c.a);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        m5c m5cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    m5cVar.d();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    m5cVar.c();
                }
                break;
        }
    }
}
