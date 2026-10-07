package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class d9a implements f9a {
    public final Collection a;

    public d9a(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9a) && this.a.equals(((d9a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalDeleteMembers(ids=" + this.a + ")";
    }
}
