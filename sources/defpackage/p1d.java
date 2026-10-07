package defpackage;

import one.me.calls.ui.ui.pip.PipScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p1d implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PipScreen b;

    public /* synthetic */ p1d(PipScreen pipScreen, int i) {
        this.a = i;
        this.b = pipScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        PipScreen pipScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PipScreen.f;
                return pipScreen.o1().g();
            default:
                j1d j1dVar = (j1d) pipScreen.c.getAccessor().c(864);
                return new i1d(new ks9(23, pipScreen), j1dVar.a, j1dVar.b, j1dVar.c, j1dVar.d, j1dVar.e, j1dVar.f, j1dVar.g);
        }
    }
}
