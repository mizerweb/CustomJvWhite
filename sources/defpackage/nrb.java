package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nrb extends fqb {
    public final fqb[] a;
    public final uik b;
    public final int c;

    public nrb(fqb[] fqbVarArr, uik uikVar, int i) {
        this.a = fqbVarArr;
        this.b = uikVar;
        this.c = i;
    }

    @Override // defpackage.fqb
    public final void g(rrb rrbVar) {
        fqb[] fqbVarArr = this.a;
        int length = fqbVarArr.length;
        if (length == 0) {
            rrbVar.c(l66.a);
            rrbVar.b();
            return;
        }
        lrb lrbVar = new lrb(rrbVar, this.b, length);
        int i = this.c;
        mrb[] mrbVarArr = lrbVar.c;
        int length2 = mrbVarArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            mrbVarArr[i2] = new mrb(lrbVar, i);
        }
        lrbVar.lazySet(0);
        lrbVar.a.c(lrbVar);
        for (int i3 = 0; i3 < length2 && !lrbVar.e; i3++) {
            fqbVarArr[i3].f(mrbVarArr[i3]);
        }
    }
}
