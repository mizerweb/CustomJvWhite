package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ijh extends ux8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ stb b;
    public final /* synthetic */ Throwable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ijh(stb stbVar, Throwable th, int i) {
        super(0);
        this.a = i;
        this.b = stbVar;
        this.c = th;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        Throwable th = this.c;
        stb stbVar = this.b;
        switch (i) {
            case 0:
                stbVar.onFailure(th);
                break;
            default:
                stbVar.onFailure(th);
                break;
        }
        return sbiVar;
    }
}
