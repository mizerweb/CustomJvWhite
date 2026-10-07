package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public final class rga implements tga {
    public final Collection a;

    public rga(Collection collection) {
        this.a = collection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (rga.class.equals(obj != null ? obj.getClass() : null)) {
            return cqk.d(this.a, ((rga) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(messageIds=" + this.a + ")";
    }
}
