package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class wo3 extends zq0 {
    public final Collection b;
    public final boolean c;
    public final boolean d;
    public final mg5 e;
    public final yq0 f;
    public final boolean g;
    public final Set h;

    public /* synthetic */ wo3(Collection collection, boolean z, boolean z2, mg5 mg5Var, cid cidVar, Set set, int i) {
        this(collection, z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? mg5.REGULAR : mg5Var, (yq0) ((i & 16) != 0 ? null : cidVar), false, (i & 64) != 0 ? c76.a : set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wo3)) {
            return false;
        }
        wo3 wo3Var = (wo3) obj;
        return cqk.d(this.b, wo3Var.b) && this.c == wo3Var.c && this.d == wo3Var.d && this.e == wo3Var.e && cqk.d(this.f, wo3Var.f) && this.g == wo3Var.g && cqk.d(this.h, wo3Var.h);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + nbh.n(nbh.n(this.b.hashCode() * 31, 31, this.c), 31, this.d)) * 31;
        yq0 yq0Var = this.f;
        return this.h.hashCode() + nbh.n((iHashCode + (yq0Var == null ? 0 : yq0Var.hashCode())) * 31, 31, this.g);
    }

    @Override // defpackage.zq0
    public final String toString() {
        return "ChatsUpdateEvent(chatIds=" + this.b + ", orderChange=" + this.c + ", initialDataLoaded=" + this.d + ", itemType=" + this.e + ", error=" + this.f + ", replaceDuplicate=" + this.g + ", chatServerIds=" + this.h + ")";
    }

    public wo3(Collection collection, boolean z, boolean z2, mg5 mg5Var, yq0 yq0Var, boolean z3, Set set) {
        this.b = collection;
        this.c = z;
        this.d = z2;
        this.e = mg5Var;
        this.f = yq0Var;
        this.g = z3;
        this.h = set;
    }

    public wo3(Collection collection, boolean z) {
        this(collection, z, false, (mg5) null, (cid) null, (Set) null, 124);
    }
}
