package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class drd extends erd {
    public final int a;

    public drd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drd) && this.a == ((drd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
    }

    public final int hashCode() {
        return qt4.D(this.a) + (Integer.hashCode(-2146435072) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return -2146435072;
    }

    public final String toString() {
        String str;
        StringBuilder sbV = qt4.v("Scheduled(itemViewType=", jll.b(-2146435072), ", chatType=");
        int i = this.a;
        if (i == 1) {
            str = "CHAT";
        } else if (i == 2) {
            str = "DIALOG";
        } else if (i != 3) {
            str = i != 4 ? "null" : "UNKNOWN";
        } else {
            str = "CHANNEL";
        }
        sbV.append(str);
        sbV.append(")");
        return sbV.toString();
    }
}
