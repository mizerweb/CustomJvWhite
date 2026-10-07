package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mtg extends kih {
    public final boolean c;

    public mtg(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mtg) && this.c == ((mtg) obj).c;
    }

    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return qv1.m("Response(success=", ")", this.c);
    }
}
