package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class f2f implements l2f {
    public final ArrayList a;
    public final ArrayList b;

    public f2f(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2f)) {
            return false;
        }
        f2f f2fVar = (f2f) obj;
        return this.a.equals(f2fVar.a) && this.b.equals(f2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Contacts(contacts=" + this.a + ", phones=" + this.b + ")";
    }
}
