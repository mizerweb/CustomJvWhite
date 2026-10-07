package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wc8 implements oah {
    public final List a;
    public final boolean b;

    public wc8(List list, boolean z) {
        oc9.j("List of suppliers is empty!", !list.isEmpty());
        this.a = list;
        this.b = z;
    }

    public static wc8 a(ArrayList arrayList, boolean z) {
        return new wc8(arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wc8) {
            return qdl.b(this.a, ((wc8) obj).a);
        }
        return false;
    }

    @Override // defpackage.oah
    public final Object get() {
        return new vc8(this);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.x(this.a, "list");
        return dc9VarC.toString();
    }
}
