package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wyg {
    public final long a;
    public final ezg b;

    public wyg(long j, ezg ezgVar) {
        this.a = j;
        this.b = ezgVar;
    }

    public final Map a() {
        return wm9.Q0(new ylc("ownerId", Long.valueOf(this.a)), new ylc("type", Byte.valueOf(this.b.a)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyg)) {
            return false;
        }
        wyg wygVar = (wyg) obj;
        return this.a == wygVar.a && this.b == wygVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StoryOwnerApi(ownerId=" + this.a + ", type=" + this.b + ")";
    }
}
