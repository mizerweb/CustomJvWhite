package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vlh extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ wlh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlh(wlh wlhVar, int i) {
        super(4, ulh.d);
        this.c = i;
        switch (i) {
            case 1:
                this.d = wlhVar;
                super(4, -1);
                break;
            default:
                this.d = wlhVar;
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        wlh wlhVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    wlh.b(wlhVar, (ulh) obj2);
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    int iIntValue = ((Number) obj2).intValue();
                    ((Number) obj).intValue();
                    wlhVar.j.setColor(iIntValue);
                    wlhVar.invalidate();
                }
                break;
        }
    }
}
