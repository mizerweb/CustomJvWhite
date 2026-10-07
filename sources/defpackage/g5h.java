package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g5h {
    public final List a;

    public g5h(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g5h) && cqk.d(this.a, ((g5h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("SkipAnyOf(containsAnyOf=", ")", this.a);
    }
}
