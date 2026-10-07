package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class m7d extends o7d {
    public final tnh a;
    public final ksf b;

    public m7d(tnh tnhVar, ksf ksfVar) {
        int i = z5c.d;
        this.a = tnhVar;
        this.b = ksfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7d)) {
            return false;
        }
        m7d m7dVar = (m7d) obj;
        if (!this.a.equals(m7dVar.a) || !this.b.equals(m7dVar.b)) {
            return false;
        }
        long j = z5c.b;
        return j == j;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return z5c.b;
    }

    public final int hashCode() {
        return Long.hashCode(z5c.b) + ((this.b.hashCode() + (Integer.hashCode(this.a.c) * 31)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_poll_create__setting_item_viewtype;
    }

    public final String toString() {
        long j = z5c.b;
        StringBuilder sb = new StringBuilder("Setting(title=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", itemId=");
        return c0a.m(j, ")", sb);
    }
}
