package defpackage;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
public final class vha implements wha {
    public final long a;
    public final Long b;
    public final Layout c;
    public final Layout d;

    public vha(long j, Long l, Layout layout, Layout layout2) {
        this.a = j;
        this.b = l;
        this.c = layout;
        this.d = layout2;
    }

    @Override // defpackage.wha
    public final Layout a() {
        return this.c;
    }

    @Override // defpackage.wha
    public final Layout b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vha)) {
            return false;
        }
        vha vhaVar = (vha) obj;
        return this.a == vhaVar.a && cqk.d(this.b, vhaVar.b) && this.c.equals(vhaVar.c) && cqk.d(this.d, vhaVar.d);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        Long l = this.b;
        int iHashCode2 = (this.c.hashCode() + ((iHashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        Layout layout = this.d;
        return iHashCode2 + (layout != null ? layout.hashCode() : 0);
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", accentSourceId=" + this.b + ", bodyLayout=" + this.c + ", forwardedTitleLayout=" + this.d + ")";
    }
}
