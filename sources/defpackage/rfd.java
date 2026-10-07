package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class rfd implements Serializable {
    public final int a;
    public final agd b;

    public rfd(int i, agd agdVar) {
        this.a = i;
        this.b = agdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rfd)) {
            return false;
        }
        rfd rfdVar = (rfd) obj;
        return this.a == rfdVar.a && this.b == rfdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Presence(seen=" + this.a + ", status=" + this.b + ")";
    }
}
