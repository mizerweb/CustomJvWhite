package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ppd extends rpd {
    public final List a;

    public ppd(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ppd) && this.a.equals(((ppd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("ShowMoreActions(actions=", ")", this.a);
    }
}
