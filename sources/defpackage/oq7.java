package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class oq7 {
    public final List a;

    public oq7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq7) && cqk.d(this.a, ((oq7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return v0h.d("GridModeState(opponentsPages=", ")", this.a);
    }
}
