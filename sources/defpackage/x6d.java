package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class x6d extends a7d {
    public final List a;
    public final rnh b;

    public x6d(rnh rnhVar, List list) {
        this.a = list;
        this.b = rnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6d)) {
            return false;
        }
        x6d x6dVar = (x6d) obj;
        return this.a.equals(x6dVar.a) && this.b.equals(x6dVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AvatarStack(avatarsInfo=" + this.a + ", title=" + this.b + ")";
    }
}
