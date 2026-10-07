package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zld extends cmd {
    public final List b;

    public zld(c79 c79Var) {
        this.b = c79Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zld) && cqk.d(this.b, ((zld) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return v0h.d("ShowContextMenu(actions=", ")", this.b);
    }
}
