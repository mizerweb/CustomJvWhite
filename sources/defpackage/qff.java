package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qff implements uff {
    public final jef a;

    public qff(jef jefVar) {
        this.a = jefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qff) && cqk.d(this.a, ((qff) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
