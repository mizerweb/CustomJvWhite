package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kod implements mod {
    public final fql a;

    public kod(fql fqlVar) {
        this.a = fqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kod) && this.a.equals(((kod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShortLinkPayload(state=" + this.a + ")";
    }
}
