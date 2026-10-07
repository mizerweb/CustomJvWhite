package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sxi extends vxi {
    public final List a;

    public sxi(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxi) && cqk.d(this.a, ((sxi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("FilesReady(uriList=", ")", this.a);
    }
}
