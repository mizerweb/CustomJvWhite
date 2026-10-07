package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wbd implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ecd b;

    public /* synthetic */ wbd(ecd ecdVar, int i) {
        this.a = i;
        this.b = ecdVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ecd ecdVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                ecd.a(ecdVar, fFloatValue);
                break;
            case 1:
                ecd.c(ecdVar, fFloatValue, f.floatValue());
                break;
            default:
                f.getClass();
                ecd.d(ecdVar, fFloatValue);
                break;
        }
        return sbiVar;
    }
}
