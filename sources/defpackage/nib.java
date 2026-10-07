package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class nib {
    public final long a;
    public final w50 b;

    public nib(long j, w50 w50Var) {
        this.a = j;
        this.b = w50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nib) {
            nib nibVar = (nib) obj;
            if (this.a == nibVar.a && this.b == nibVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }
}
