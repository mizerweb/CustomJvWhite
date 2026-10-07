package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class fam {
    private final iwk a;

    public /* synthetic */ fam(dam damVar, eam eamVar) {
        this.a = damVar.a;
    }

    public final iwk a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fam) {
            return f55.h(this.a, ((fam) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
