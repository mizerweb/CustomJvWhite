package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class xl5 extends uh5 {
    public int m;

    public xl5(zvj zvjVar) {
        super(zvjVar);
        if (zvjVar instanceof cz7) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.uh5
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (qh5 qh5Var : this.k) {
            qh5Var.a(qh5Var);
        }
    }
}
