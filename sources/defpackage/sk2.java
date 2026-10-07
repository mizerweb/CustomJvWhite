package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sk2 implements vk2 {
    public final lu5 a;

    public sk2(lu5 lu5Var) {
        this.a = lu5Var;
    }

    @Override // defpackage.vk2
    public final int a() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sk2) && cqk.d(this.a, ((sk2) obj).a);
    }

    @Override // defpackage.vk2
    public final long getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drawing(state=" + this.a + ")";
    }
}
