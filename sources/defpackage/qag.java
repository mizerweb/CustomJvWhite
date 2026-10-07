package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qag extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ rag d;

    /* JADX WARN: Illegal instructions before constructor call */
    public qag(rag ragVar, int i) {
        this.c = i;
        switch (i) {
            case 1:
                Float fValueOf = Float.valueOf(1.0f);
                this.d = ragVar;
                super(4, fValueOf);
                break;
            case 2:
                Float fValueOf2 = Float.valueOf(1.0f);
                this.d = ragVar;
                super(4, fValueOf2);
                break;
            default:
                Float fValueOf3 = Float.valueOf(0.0f);
                this.d = ragVar;
                super(4, fValueOf3);
                break;
        }
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        rag ragVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    ragVar.d(ragVar.d);
                    ragVar.e = ragVar.a();
                }
                break;
            case 1:
                if (!cqk.d(obj, obj2)) {
                    ragVar.d(ragVar.d);
                    ragVar.e = ragVar.a();
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    ragVar.e = ragVar.a();
                }
                break;
        }
    }
}
