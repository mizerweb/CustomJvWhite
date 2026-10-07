package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class xqd extends erd {
    public final int a;
    public final boolean b;
    public final xnh c;
    public final u8b d;
    public final Long e;
    public final int f;
    public final Long g;
    public final int h;

    public xqd(int i, boolean z, xnh xnhVar, u8b u8bVar, Long l, int i2, Long l2, int i3) {
        i = (i3 & 1) != 0 ? 524288 : i;
        u8bVar = (i3 & 8) != 0 ? cqb.b : u8bVar;
        l = (i3 & 16) != 0 ? null : l;
        i2 = (i3 & 32) != 0 ? 0 : i2;
        l2 = (i3 & 64) != 0 ? null : l2;
        this.a = i;
        this.b = z;
        this.c = xnhVar;
        this.d = u8bVar;
        this.e = l;
        this.f = i2;
        this.g = l2;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqd)) {
            return false;
        }
        xqd xqdVar = (xqd) obj;
        return this.a == xqdVar.a && this.b == xqdVar.b && cqk.d(this.c, xqdVar.c) && cqk.d(this.d, xqdVar.d) && cqk.d(this.e, xqdVar.e) && this.f == xqdVar.f && cqk.d(this.g, xqdVar.g);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + nbh.n(Integer.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31;
        Long l = this.e;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        int i = this.f;
        int iD = (iHashCode2 + (i == 0 ? 0 : qt4.D(i))) * 31;
        Long l2 = this.g;
        return (iD + (l2 != null ? l2.hashCode() : 0)) * 31;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.h;
    }

    public final String toString() {
        String str;
        StringBuilder sbA = zo5.A("OfficialOrgLabel(itemViewType=", jll.b(this.a), ", isRedesign=", ", orgName=", this.b);
        sbA.append(this.c);
        sbA.append(", links=");
        sbA.append(this.d);
        sbA.append(", orgId=");
        sbA.append(this.e);
        sbA.append(", sourceType=");
        int i = this.f;
        if (i == 1) {
            str = "DIALOG_USER_ID";
        } else if (i != 2) {
            str = i != 3 ? "null" : "CHANNEL_ID";
        } else {
            str = "DIALOG_BOT_ID";
        }
        sbA.append(str);
        sbA.append(", sourceId=");
        sbA.append(this.g);
        sbA.append(", placement=");
        sbA.append("null");
        sbA.append(")");
        return sbA.toString();
    }
}
