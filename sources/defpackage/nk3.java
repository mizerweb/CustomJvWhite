package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class nk3 implements pk3 {
    public final Set a;

    public nk3(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nk3) && cqk.d(this.a, ((nk3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Delete(chatIds=" + this.a + ")";
    }
}
