package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fic implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gic b;

    public /* synthetic */ fic(gic gicVar, int i) {
        this.a = i;
        this.b = gicVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        a8g a8gVar = pq3.j;
        gic gicVar = this.b;
        switch (i2) {
            case 0:
                i = ((bs0) ((t84) a8gVar.h(gicVar).f().c).e).c;
                break;
            default:
                i = ((bs0) ((t84) a8gVar.h(gicVar).f().c).e).b;
                break;
        }
        return Integer.valueOf(i);
    }
}
