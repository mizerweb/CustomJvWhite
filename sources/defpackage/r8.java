package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r8 implements k79 {
    public final tnh a;

    public r8(tnh tnhVar) {
        int i = i7c.b;
        this.a = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r8) || !this.a.equals(((r8) obj).a)) {
            return false;
        }
        long j = i7c.a;
        return j == j;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return i7c.a;
    }

    public final int hashCode() {
        return Long.hashCode(i7c.a) + zo5.c(R.drawable.icon_call_by_number, Integer.hashCode(this.a.c) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.search_action_view_type;
    }

    public final String toString() {
        long j = i7c.a;
        StringBuilder sb = new StringBuilder("ActionModel(text=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(R.drawable.icon_call_by_number);
        sb.append(", itemId=");
        return c0a.m(j, ")", sb);
    }
}
