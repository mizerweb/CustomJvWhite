package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wqg implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e5d b;

    public /* synthetic */ wqg(e5d e5dVar, int i) {
        this.a = i;
        this.b = e5dVar;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Integer num;
        int i = this.a;
        e5d e5dVar = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(((Boolean) e5dVar.B().i()).booleanValue() && ((Boolean) e5dVar.M4.a(e5d.S6[300]).i()).booleanValue() && (num = ((vqg) e5dVar.r().i()).e) != null && num.intValue() != -1);
            default:
                ghb ghbVar = ew5.b;
                return new ew5(qe7.O(((vqg) e5dVar.r().i()).g, lw5.SECONDS));
        }
    }
}
