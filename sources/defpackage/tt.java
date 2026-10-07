package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class tt implements af7 {
    public static final tt b = new tt(0);
    public static final tt c = new tt(1);
    public static final tt d = new tt(2);
    public static final tt e = new tt(3);
    public final /* synthetic */ int a;

    public /* synthetic */ tt(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new st();
            case 1:
                return null;
            case 2:
                return sbi.a;
            default:
                return "Got uncaught exception";
        }
    }
}
