package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a5a implements qg4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ed7 b;
    public final /* synthetic */ t99 c;
    public final /* synthetic */ uz9 d;

    public /* synthetic */ a5a(ed7 ed7Var, t99 t99Var, uz9 uz9Var, int i) {
        this.a = i;
        this.b = ed7Var;
        this.c = t99Var;
        this.d = uz9Var;
    }

    @Override // defpackage.qg4
    public final void accept(Object obj) {
        int i = this.a;
        uz9 uz9Var = this.d;
        t99 t99Var = this.c;
        ed7 ed7Var = this.b;
        c5a c5aVar = (c5a) obj;
        switch (i) {
            case 0:
                c5aVar.q(ed7Var.b, (x4a) ed7Var.c, t99Var, uz9Var);
                break;
            default:
                c5aVar.p(ed7Var.b, (x4a) ed7Var.c, t99Var, uz9Var);
                break;
        }
    }
}
