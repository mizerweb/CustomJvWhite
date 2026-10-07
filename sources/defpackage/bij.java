package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bij {
    public final ny8 a;
    public final pzf b = e9i.b(0, 0, 7);
    public final dq4 c;

    public bij(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.c = cqk.a(((n0c) ((xhh) ny8Var2.getValue())).a());
        ((t51) ny8Var.getValue()).d(this);
    }

    public final void a(aij aijVar) {
        yab.i0(this.c, null, 0, new oli(this, aijVar, null, 14), 3);
    }

    @l7h
    public final void onEvent(yq0 yq0Var) {
        a(new zhj(yq0Var.a));
    }

    @l7h
    public final void onEvent(vq6 vq6Var) {
        throw null;
    }

    @l7h
    public final void onEvent(tq6 tq6Var) {
        a(new zhj(tq6Var.b));
    }

    @l7h
    public final void onEvent(rq6 rq6Var) {
        a(new xhj(rq6Var.b));
    }

    @l7h
    public final void onEvent(uq6 uq6Var) {
        a(new yhj(uq6Var.a));
    }
}
