package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jqi extends oqi {
    public final List a;

    public jqi(c79 c79Var) {
        this.a = c79Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqi) && cqk.d(this.a, ((jqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("ShowMenu(actions=", ")", this.a);
    }
}
