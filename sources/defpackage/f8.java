package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f8 implements vnd {
    public final int a;
    public final ctf b;
    public final int c;

    public f8(int i, ctf ctfVar, int i2) {
        this.a = i;
        this.b = ctfVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj;
        return this.a == f8Var.a && cqk.d(this.b, f8Var.b) && this.c == f8Var.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        if (k79Var instanceof f8) {
            return this.a == ((f8) k79Var).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.c;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        if ((k79Var instanceof f8) && !(((f8) k79Var).b.h instanceof ksf)) {
            return equals(k79Var);
        }
        return false;
    }

    @Override // defpackage.k79
    public final Object n(k79 k79Var) {
        if (!(k79Var instanceof f8)) {
            return null;
        }
        msf msfVar = ((f8) k79Var).b.h;
        if (msfVar instanceof ksf) {
            return new lod(((ksf) msfVar).a);
        }
        return null;
    }

    public final String toString() {
        String strD = gll.d(this.c);
        StringBuilder sb = new StringBuilder("ActionItem(actionId=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", itemViewType=");
        return zo5.w(sb, strD, ")");
    }

    public /* synthetic */ f8(int i, ctf ctfVar) {
        this(i, ctfVar, 1024);
    }
}
