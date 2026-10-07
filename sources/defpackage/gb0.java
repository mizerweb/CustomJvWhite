package defpackage;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class gb0 extends d2a {
    public final PeerConnectionFactory f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb0(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, CidLogger cidLogger) {
        super(str, mediaStream, cidLogger);
        peerConnectionFactory.getClass();
        str.getClass();
        cidLogger.getClass();
        this.f = peerConnectionFactory;
    }

    @Override // defpackage.d2a
    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(audioTrack);
        }
    }

    @Override // defpackage.d2a
    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        audioTrack.getClass();
        if (mediaStream != null) {
            mediaStream.removeTrack(audioTrack);
        }
    }

    @Override // defpackage.d2a
    public final MediaSource g() {
        AudioSource audioSourceCreateAudioSource = this.f.createAudioSource(new MediaConstraints());
        audioSourceCreateAudioSource.getClass();
        return audioSourceCreateAudioSource;
    }

    @Override // defpackage.d2a
    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        str.getClass();
        AudioTrack audioTrackCreateAudioTrack = this.f.createAudioTrack(str, (AudioSource) mediaSource);
        audioTrackCreateAudioTrack.getClass();
        return audioTrackCreateAudioTrack;
    }

    public final String toString() {
        return "OkSdkAudioRecord";
    }
}
