package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yh7 implements fi7 {
    public final List a;

    public yh7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yh7) && this.a.equals(((yh7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("OnSelectionChanged(items=", ")", this.a);
    }
}
