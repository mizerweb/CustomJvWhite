package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes4.dex */
public final class zqd extends erd {
    public final int a;
    public final int b;
    public final int c;

    public zqd(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zqd)) {
            return false;
        }
        zqd zqdVar = (zqd) obj;
        return this.a == zqdVar.a && this.b == zqdVar.b;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return this.c;
    }

    public final String toString() {
        return "PendingRequestsCount(count=" + this.a + ", itemViewType=" + jll.b(this.b) + ")";
    }
}
