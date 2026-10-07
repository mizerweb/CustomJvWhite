package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uk2 implements vk2 {
    public final umh a;

    public uk2(umh umhVar) {
        this.a = umhVar;
    }

    @Override // defpackage.vk2
    public final int a() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uk2) && cqk.d(this.a, ((uk2) obj).a);
    }

    @Override // defpackage.vk2
    public final long getId() {
        return this.a.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(state=" + this.a + ")";
    }
}
