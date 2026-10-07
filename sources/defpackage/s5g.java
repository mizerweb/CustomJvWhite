package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s5g implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5g b;

    public /* synthetic */ s5g(y5g y5gVar, int i) {
        this.a = i;
        this.b = y5gVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        y5g y5gVar = this.b;
        String strB = (String) obj;
        switch (i) {
            case 0:
                return y5g.a(y5gVar, strB);
            default:
                strB.getClass();
                g5g signalingLogger = y5gVar.getSignalingLogger();
                signalingLogger.getClass();
                if (signalingLogger.b.shouldHideSensitiveInformation()) {
                    strB = lql.b(strB);
                    strB.getClass();
                }
                signalingLogger.a.log(signalingLogger.d, "May be ERROR, socket is already with ".concat(strB));
                return sbi.a;
        }
    }
}
