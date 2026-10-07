package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class jh1 implements lh1 {
    public final Set a;

    public jh1(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jh1) && this.a.equals(((jh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContacts(contactIds=" + this.a + ")";
    }
}
