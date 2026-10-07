package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vh7 implements wh7 {
    public final jef a;

    public vh7(jef jefVar) {
        this.a = jefVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vh7) && cqk.d(this.a, ((vh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveMediaItem(item=" + this.a + ")";
    }
}
