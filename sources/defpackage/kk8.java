package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kk8 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aec b;

    public /* synthetic */ kk8(aec aecVar, int i) {
        this.a = i;
        this.b = aecVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        aec aecVar = this.b;
        switch (i) {
            case 0:
                return aecVar.c();
            case 1:
                aecVar.getClass();
                return null;
            default:
                aecVar.d();
                return null;
        }
    }
}
