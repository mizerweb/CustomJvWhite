package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public final class crd extends erd {
    public final int a;
    public final int b;

    public crd(int i) {
        this.a = i;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof crd) && this.a == ((crd) obj).a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_URI;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.b;
    }

    public final String toString() {
        return c0a.o("RknLabel(itemViewType=", jll.b(this.a), ")");
    }
}
