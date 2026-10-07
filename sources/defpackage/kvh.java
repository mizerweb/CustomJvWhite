package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kvh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mvh b;

    public /* synthetic */ kvh(mvh mvhVar, int i) {
        this.a = i;
        this.b = mvhVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        mvh mvhVar = this.b;
        switch (i) {
            case 0:
                mvhVar.dismiss();
                return sbi.a;
            default:
                return new ivh(mvhVar.c, mvhVar.e, mvhVar.f);
        }
    }
}
