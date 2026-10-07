package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class wqd extends erd {
    public final CharSequence a;

    public wqd(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqd) && cqk.d(this.a, ((wqd) obj).a);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
    }

    public final String toString() {
        return "LinkWithQrCodeItem(link=" + ((Object) this.a) + ")";
    }
}
