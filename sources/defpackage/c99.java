package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c99 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r6a b;

    public /* synthetic */ c99(r6a r6aVar, int i) {
        this.a = i;
        this.b = r6aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        r6a r6aVar = this.b;
        switch (i) {
            case 0:
                t07 t07Var = (t07) r6aVar.c;
                if (t07Var != null) {
                    ((g8b) r6aVar.a).j(t07Var);
                }
                break;
            default:
                if (((t07) r6aVar.c) == null) {
                    r6aVar.c = new t07(2, r6aVar);
                }
                ((g8b) r6aVar.a).f((t07) r6aVar.c);
                break;
        }
    }
}
