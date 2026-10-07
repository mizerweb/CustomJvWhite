package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m9c implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q9c b;

    public /* synthetic */ m9c(q9c q9cVar, int i) {
        this.a = i;
        this.b = q9cVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        q9c q9cVar = this.b;
        switch (i) {
            case 0:
                q9cVar.invalidate();
                break;
            default:
                n9c n9cVar = q9cVar.i;
                if (n9cVar != null) {
                    ((gr7) ((uvc) n9cVar).b).s.stop();
                }
                break;
        }
        return sbiVar;
    }
}
