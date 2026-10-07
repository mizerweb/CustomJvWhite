package defpackage;

import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes3.dex */
public final class vt1 {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof vt1);
    }

    public final int hashCode() {
        return Integer.hashCode(65536) + spc.a(65536, spc.a(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS, spc.a(16384, spc.a(8192, spc.a(2048000, spc.a(2048000, spc.a(512000, Integer.hashCode(204800) * 31)))))));
    }

    public final String toString() {
        return "Bitrates(bitrateVideo2g=204800, bitrateVideo3g=512000, bitrateVideoLte=2048000, bitrateVideoWifi=2048000, bitrateAudioMin=8192, bitrateAudio2g=16384, bitrateAudio3g=32768, bitrateAudioLte=65536, bitrateAudioWifi=65536)";
    }
}
