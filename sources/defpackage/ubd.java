package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ubd implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ecd b;

    public /* synthetic */ ubd(ecd ecdVar, int i) {
        this.a = i;
        this.b = ecdVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ecd ecdVar = this.b;
        switch (i) {
            case 0:
                xbd xbdVar = ecdVar.a;
                if (xbdVar != null) {
                    xbdVar.k(ecdVar.b);
                }
                return sbiVar;
            case 1:
                xbd xbdVar2 = ecdVar.a;
                if (xbdVar2 != null) {
                    xbdVar2.h();
                }
                return sbiVar;
            case 2:
                return new tbd(ecdVar.a);
            default:
                xbd xbdVar3 = ecdVar.a;
                if (xbdVar3 != null) {
                    xbdVar3.k(ecdVar.b);
                }
                return sbiVar;
        }
    }
}
