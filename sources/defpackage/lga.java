package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class lga implements oga {
    public final Collection a;

    public lga(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lga) && cqk.d(this.a, ((lga) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ByIds(messageIds=" + this.a + ")";
    }
}
