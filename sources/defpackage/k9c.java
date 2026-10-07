package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k9c extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ l9c d;

    /* JADX WARN: Illegal instructions before constructor call */
    public k9c(l9c l9cVar, int i) {
        this.c = i;
        int i2 = 4;
        this.d = l9cVar;
        switch (i) {
            case 1:
                super(i2, d9c.a);
                break;
            case 2:
                super(i2, g9c.a);
                break;
            default:
                super(i2, x8c.a);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        l9c l9cVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    l9cVar.setLeft((a9c) obj2);
                    l9cVar.y();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    l9cVar.setRight((f9c) obj2);
                    l9cVar.y();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    l9cVar.setStyle((g9c) obj2);
                    l9cVar.y();
                }
                break;
        }
    }
}
