package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dvb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ evb b;

    public /* synthetic */ dvb(evb evbVar, int i) {
        this.a = i;
        this.b = evbVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        evb evbVar = this.b;
        switch (i) {
            case 0:
                return new qz(3, evbVar);
            default:
                evbVar.c = null;
                evbVar.d = false;
                return sbi.a;
        }
    }
}
