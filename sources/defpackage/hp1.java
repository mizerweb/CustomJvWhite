package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hp1 implements jp1 {
    public final String a;

    public hp1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp1) && this.a.equals(((hp1) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 9223372036854775805L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 9223372036854775805L == k79Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return 3;
    }

    public final String toString() {
        return c0a.o("CallShareLinkPreviewState(link=", this.a, ")");
    }
}
