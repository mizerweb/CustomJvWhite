package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s0g implements k79 {
    public final int a;
    public final long b;

    public s0g(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0g) && this.a == ((s0g) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.members_list_shimmer_view_type;
    }

    public final String toString() {
        return c0a.k(this.a, "ShimmerMemberListItem(pos=", ")");
    }
}
