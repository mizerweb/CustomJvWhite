package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class aoi implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gpi b;

    public /* synthetic */ aoi(gpi gpiVar, int i) {
        this.a = i;
        this.b = gpiVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        gpi gpiVar = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                mjg mjgVar = gpiVar.B;
                mjgVar.j(null, b8b.a((b8b) mjgVar.getValue(), fFloatValue));
                break;
            default:
                a8j.x(gpiVar.r1, (oqi) obj);
                break;
        }
        return sbiVar;
    }
}
