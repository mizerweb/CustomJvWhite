package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class e5h {
    public final f5h a;
    public final boolean b;
    public final boolean c;

    public e5h(f5h f5hVar, boolean z, boolean z2) {
        this.a = f5hVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5h)) {
            return false;
        }
        e5h e5hVar = (e5h) obj;
        return cqk.d(this.a, e5hVar.a) && this.b == e5hVar.b && this.c == e5hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n((this.a.hashCode() + (Boolean.hashCode(false) * 31)) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StrictModeConfig(enabled=false, violationHandler=");
        sb.append(this.a);
        sb.append(", allowNetwork=");
        sb.append(this.b);
        sb.append(", allowDisk=");
        return qt4.r(sb, this.c, ")");
    }
}
