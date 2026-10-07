package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gzi implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ izi b;
    public final /* synthetic */ oxi c;
    public final /* synthetic */ l1j d;

    public /* synthetic */ gzi(izi iziVar, izi iziVar2, oxi oxiVar, l1j l1jVar, int i) {
        this.a = i;
        this.b = iziVar2;
        this.c = oxiVar;
        this.d = l1jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l1j l1jVar = this.d;
        oxi oxiVar = this.c;
        izi iziVar = this.b;
        switch (i) {
            case 0:
                if (!iziVar.e.n() && !iziVar.g.d) {
                    izi.R(iziVar, oxiVar, l1jVar, new hzi(0, iziVar), 4);
                    break;
                }
                break;
            default:
                if (!iziVar.e.B() && !iziVar.e.n() && !iziVar.g.d) {
                    izi.R(iziVar, oxiVar, l1jVar, null, 12);
                    break;
                }
                break;
        }
    }
}
