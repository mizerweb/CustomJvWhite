package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class cd8 extends c98 {
    public final /* synthetic */ p98 c;

    public cd8(p98 p98Var) {
        this.c = p98Var;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return this.c.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        p98 p98Var = this.c;
        switch (p98Var.d) {
            case 0:
                ypb ypbVar = ((mhe) p98Var.e).e;
                lvb.U(i, ypbVar.c);
                return new xpb(ypbVar, i);
            default:
                ypb ypbVar2 = ((mhe) p98Var.e).e;
                lvb.U(i, ypbVar2.c);
                return ypbVar2.a[i];
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
