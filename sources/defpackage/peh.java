package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class peh implements qf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ reh b;

    public /* synthetic */ peh(reh rehVar, int i) {
        this.a = i;
        this.b = rehVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        reh rehVar = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        Float f = (Float) obj2;
        switch (i) {
            case 0:
                f.getClass();
                reh.a(rehVar, fFloatValue);
                break;
            default:
                reh.b(rehVar, fFloatValue, f.floatValue());
                break;
        }
        return sbiVar;
    }
}
