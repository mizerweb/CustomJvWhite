package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class tpb implements VideoDecoderFactory {
    public final EglBase.Context a;
    public final CidLogger b;
    public final ifh c;
    public final ifh d;
    public final boolean e;
    public volatile boolean f;

    public tpb(EglBase.Context context, CidLogger cidLogger, xt1 xt1Var) {
        xt1Var.getClass();
        this.a = context;
        this.b = cidLogger;
        final int i = 0;
        this.c = new ifh(new af7(this) { // from class: ppb
            public final /* synthetic */ tpb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                tpb tpbVar = this.b;
                switch (i2) {
                    case 0:
                        try {
                            return new qpb(tpbVar.a, new f4a(27));
                        } catch (Throwable th) {
                            return new rpb(tpbVar.b, new IllegalStateException("Can't create HardwareVideoDecoder", th));
                        }
                    default:
                        try {
                            return new SoftwareVideoDecoderFactory();
                        } catch (Throwable th2) {
                            return new rpb(tpbVar.b, new IllegalStateException("Can't create SoftwareVideoDecoder", th2));
                        }
                }
            }
        });
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: ppb
            public final /* synthetic */ tpb b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                tpb tpbVar = this.b;
                switch (i3) {
                    case 0:
                        try {
                            return new qpb(tpbVar.a, new f4a(27));
                        } catch (Throwable th) {
                            return new rpb(tpbVar.b, new IllegalStateException("Can't create HardwareVideoDecoder", th));
                        }
                    default:
                        try {
                            return new SoftwareVideoDecoderFactory();
                        } catch (Throwable th2) {
                            return new rpb(tpbVar.b, new IllegalStateException("Can't create SoftwareVideoDecoder", th2));
                        }
                }
            }
        });
        this.e = xt1Var.r.x;
        this.f = true;
    }

    public final spb a(VideoCodecInfo videoCodecInfo) {
        VideoDecoder videoDecoderFallback;
        if (videoCodecInfo != null) {
            String str = videoCodecInfo.name;
            if ((!cqk.d(str, "VP8") && !cqk.d(str, "VP9")) || this.f) {
                try {
                    videoDecoderFallback = ((VideoDecoderFactory) this.c.getValue()).createDecoder(videoCodecInfo);
                } catch (Exception e) {
                    this.b.log("OKDefaultVideoDecoderFactory", "Hardware encoder creating failed! Error=" + e.getMessage());
                    videoDecoderFallback = null;
                }
                VideoDecoder videoDecoderCreateDecoder = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
                if (videoDecoderFallback != null && videoDecoderCreateDecoder != null) {
                    videoDecoderFallback = new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderFallback);
                } else if (videoDecoderFallback == null) {
                    if (videoDecoderCreateDecoder != null) {
                        videoDecoderFallback = videoDecoderCreateDecoder;
                    }
                }
                return new spb(videoDecoderFallback, videoCodecInfo, this.b);
            }
            VideoDecoder videoDecoderCreateDecoder2 = ((VideoDecoderFactory) this.d.getValue()).createDecoder(videoCodecInfo);
            if (videoDecoderCreateDecoder2 != null) {
                return new spb(videoDecoderCreateDecoder2, videoCodecInfo, this.b);
            }
        }
        return null;
    }

    public final VideoCodecInfo[] b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        VideoCodecInfo[] supportedCodecs = ((VideoDecoderFactory) this.d.getValue()).getSupportedCodecs();
        Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs, supportedCodecs.length));
        VideoCodecInfo[] supportedCodecs2 = ((VideoDecoderFactory) this.c.getValue()).getSupportedCodecs();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        if (!this.f) {
            linkedHashSet2.add("VP8");
            linkedHashSet2.add("VP9");
        }
        if (!this.e) {
            linkedHashSet2.add("H265");
        }
        if (linkedHashSet2.isEmpty()) {
            Collections.addAll(linkedHashSet, Arrays.copyOf(supportedCodecs2, supportedCodecs2.length));
        } else {
            supportedCodecs2.getClass();
            for (VideoCodecInfo videoCodecInfo : supportedCodecs2) {
                if (!linkedHashSet2.contains(videoCodecInfo.name)) {
                    linkedHashSet.add(videoCodecInfo);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        try {
            return a(videoCodecInfo);
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "Can't create video decoder", th);
            return null;
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        try {
            return b();
        } catch (Throwable th) {
            this.b.reportException("OKDefaultVideoDecoderFactory", "get.supported.codecs.failed", th);
            return new VideoCodecInfo[0];
        }
    }
}
