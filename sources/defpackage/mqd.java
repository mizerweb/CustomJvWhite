package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes3.dex */
public final class mqd extends frd {
    public final rz2 a;

    public mqd(rz2 rz2Var) {
        this.a = rz2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqd) && this.a.equals(((mqd) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.k79
    public final int j() {
        return 16384;
    }

    public final String toString() {
        return "ChatLinkItem(model=" + this.a + ")";
    }
}
