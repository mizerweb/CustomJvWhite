package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bd4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ agi b;

    public /* synthetic */ bd4(agi agiVar, int i) {
        this.a = i;
        this.b = agiVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        agi agiVar = this.b;
        switch (i) {
            case 0:
                return new ohe(agiVar);
            case 1:
                return new phe(agiVar);
            default:
                return "acquireChunk chunk: " + agiVar.x;
        }
    }
}
