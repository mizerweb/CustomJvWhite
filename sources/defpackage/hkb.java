package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class hkb extends kih {
    public final st2 c;
    public final long d;
    public final long[] e;
    public final boolean f;

    public hkb(st2 st2Var, long j, long[] jArr, boolean z) {
        this.c = st2Var;
        this.d = j;
        this.e = jArr;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hkb) {
            hkb hkbVar = (hkb) obj;
            if (this.f == hkbVar.f && this.c == hkbVar.c && this.d == hkbVar.d && Arrays.equals(this.e, hkbVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + qt4.g((this.c.hashCode() + (Boolean.hashCode(this.f) * 31)) * 31, 31, this.d);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return "Response(chat=" + this.c + ", postId=" + this.d + ", messageIds=" + Arrays.toString(this.e) + ", isTtl=" + this.f + ")";
    }
}
