package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ok3 implements pk3 {
    public final Set a;

    public ok3(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok3) && cqk.d(this.a, ((ok3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Mute(chatIds=" + this.a + ")";
    }
}
