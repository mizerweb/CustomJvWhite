package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r0g implements k79 {
    public final int a;
    public final long b;

    public r0g(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0g) && this.a == ((r0g) obj).a;
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
        return R.id.oneme_poll_voterslist__shimmer_item_view_type;
    }

    public final String toString() {
        return c0a.k(this.a, "ShimmerMemberListItem(pos=", ")");
    }
}
