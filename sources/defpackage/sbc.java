package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sbc extends f83 {
    public final /* synthetic */ int c = 0;
    public final /* synthetic */ tbc d;

    /* JADX WARN: Illegal instructions before constructor call */
    public sbc(tbc tbcVar) {
        Float fValueOf = Float.valueOf(0.0f);
        this.d = tbcVar;
        super(4, fValueOf);
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        tbc tbcVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    tbcVar.invalidateSelf();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    tbcVar.invalidateSelf();
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbc(xeh xehVar, tbc tbcVar) {
        super(4, xehVar);
        this.d = tbcVar;
    }
}
