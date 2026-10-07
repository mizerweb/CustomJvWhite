package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cj4 implements ej4 {
    public final l8b a;

    public cj4(l8b l8bVar) {
        this.a = l8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cj4) && this.a.equals(((cj4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PresenceUpdate(presences=" + this.a + ")";
    }
}
