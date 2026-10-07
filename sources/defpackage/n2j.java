package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n2j implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cyi b;

    public /* synthetic */ n2j(cyi cyiVar, int i) {
        this.a = i;
        this.b = cyiVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        cyi cyiVar = this.b;
        switch (i) {
            case 0:
                cyiVar.setVisibility(8);
                break;
            default:
                cyiVar.setVisibility(0);
                break;
        }
        return sbiVar;
    }
}
