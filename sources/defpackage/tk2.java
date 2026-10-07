package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tk2 implements vk2 {
    public final g59 a;

    public tk2(g59 g59Var) {
        this.a = g59Var;
    }

    @Override // defpackage.vk2
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tk2) && cqk.d(this.a, ((tk2) obj).a);
    }

    @Override // defpackage.vk2
    public final long getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Link(state=" + this.a + ")";
    }
}
