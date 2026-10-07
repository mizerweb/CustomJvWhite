package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eea extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ fea d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eea(Object obj, fea feaVar, int i) {
        super(4, obj);
        this.c = i;
        this.d = feaVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        fea feaVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    feaVar.d((int[]) obj2, feaVar.getBounds());
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    feaVar.e((int[]) obj2, feaVar.getBounds());
                }
                break;
        }
    }
}
