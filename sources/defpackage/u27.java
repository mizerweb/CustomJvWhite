package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u27 extends w27 {
    public final CharSequence a;
    public final boolean b;

    public u27(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    @Override // defpackage.w27
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u27)) {
            return false;
        }
        u27 u27Var = (u27) obj;
        return cqk.d(this.a, u27Var.a) && this.b == u27Var.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Creation(name=" + ((Object) this.a) + ", isCreateButtonEnabled=" + this.b + ")";
    }

    public /* synthetic */ u27() {
        this(null, false);
    }
}
