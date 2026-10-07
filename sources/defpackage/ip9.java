package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ip9 extends dp9 {
    public final /* synthetic */ int a;
    public final sf7 b;
    public final Object c;

    public /* synthetic */ ip9(Object obj, sf7 sf7Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = sf7Var;
    }

    @Override // defpackage.dp9
    public final void c(mp9 mp9Var) {
        int i = this.a;
        sf7 sf7Var = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((dp9) obj).a(new hp9(mp9Var, sf7Var, 0));
                break;
            default:
                ((v7g) obj).h(new hp9(mp9Var, sf7Var, 1));
                break;
        }
    }
}
