package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;
import ru.ok.android.onelog.NetworkClass;

/* JADX INFO: loaded from: classes3.dex */
public final class koc implements VideoEncoderFactory.VideoEncoderSelector, zp9 {
    public final ioc a;
    public final fi1 b;
    public final CidLogger c;
    public VideoCodecInfo d;
    public VideoCodecInfo e;
    public boolean f;
    public ajk g;
    public boolean h;
    public final Object i;

    public koc(ioc iocVar, fi1 fi1Var, xt1 xt1Var, CidLogger cidLogger) {
        fi1Var.getClass();
        xt1Var.getClass();
        this.a = iocVar;
        this.b = fi1Var;
        this.c = cidLogger;
        this.g = new ajk(1, new bq9(0.0d, 0.0d), false);
        this.h = true;
        this.i = new Object();
    }

    public static VideoCodecInfo b(VideoCodecInfo[] videoCodecInfoArr, String str) {
        for (VideoCodecInfo videoCodecInfo : videoCodecInfoArr) {
            if (cqk.d(videoCodecInfo.name, str)) {
                return videoCodecInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    public final VideoCodecInfo a() throws JSONException {
        VideoCodecInfo videoCodecInfoB;
        VideoCodecInfo[] supportedCodecs;
        ajk ajkVar;
        String str;
        if (this.e != null) {
            VideoCodecInfo videoCodecInfo = this.d;
            if (!cqk.d(videoCodecInfo != null ? videoCodecInfo.name : null, "H265")) {
                VideoCodecInfo videoCodecInfo2 = this.e;
                if (!cqk.d(videoCodecInfo2 != null ? videoCodecInfo2.name : null, "H265")) {
                    ajk ajkVar2 = this.g;
                    if (joc.$EnumSwitchMapping$0[qt4.D(ajkVar2.a)] == 1) {
                        videoCodecInfoB = this.e;
                    } else {
                        boolean z = ajkVar2.c;
                        ioc iocVar = this.a;
                        if (z) {
                            if (iocVar.a.r.E == fh6.b && iocVar.c.w() == zvh.c) {
                                supportedCodecs = new VideoCodecInfo[0];
                            } else {
                                supportedCodecs = ((VideoEncoderFactory) iocVar.h.getValue()).getSupportedCodecs();
                                supportedCodecs.getClass();
                            }
                            VideoCodecInfo videoCodecInfoB2 = b(supportedCodecs, "VP9");
                            if (videoCodecInfoB2 == null) {
                                videoCodecInfoB = b(supportedCodecs, "VP8");
                                if (videoCodecInfoB == null) {
                                    videoCodecInfoB = b(this.a.a(), "VP8");
                                }
                            } else {
                                videoCodecInfoB = videoCodecInfoB2;
                            }
                        } else {
                            videoCodecInfoB = b(iocVar.a(), "VP8");
                            if (videoCodecInfoB == null) {
                                this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Software VP8 encoder not found");
                            }
                        }
                    }
                    if (!cqk.d(videoCodecInfoB, this.d)) {
                        VideoCodecInfo videoCodecInfo3 = this.d;
                        String str2 = videoCodecInfo3 != null ? videoCodecInfo3.name : null;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = videoCodecInfoB != null ? videoCodecInfoB.name : null;
                        if (str3 == null) {
                            str3 = "";
                        }
                        this.c.log("PatchedVideoEncoderFactoryCodecSelector", nbh.w("Selected encoder \"", str3, "\" differs from current one \"", str2, "\". Let us suggest an update"));
                        synchronized (this.i) {
                            if (this.h) {
                                ajkVar = null;
                            } else {
                                this.h = true;
                                ajkVar = this.g;
                            }
                        }
                        if (ajkVar != null) {
                            fi1 fi1Var = this.b;
                            JSONObject jSONObjectPut = new JSONObject().put(RttRateHintConfig.RTT, this.g.b.a).put("loss", gm0.J(this.g.b.b * 100.0d));
                            int i = this.g.a;
                            if (i == 1) {
                                str = NetworkClass.GOOD;
                            } else if (i == 2) {
                                str = "bad_1";
                            } else {
                                if (i != 3) {
                                    throw null;
                                }
                                str = "bad_2";
                            }
                            String string = jSONObjectPut.put("network_quality", str).put("codec_old", str2).put("codec_new", str3).toString();
                            string.getClass();
                            fi1.a(fi1Var, "video_encoder_changed_by_network_adapter", EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(string)), null, 4);
                        }
                        return videoCodecInfoB;
                    }
                } else if (!this.f) {
                    this.f = true;
                    this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Using H265 encoder, ignore network condition change");
                }
            } else if (!this.f) {
                this.f = true;
                this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Using H265 encoder, ignore network condition change");
            }
        }
        return null;
    }

    @Override // defpackage.zp9
    public final void f(aq9 aq9Var) {
        aq9Var.getClass();
        this.c.log("PatchedVideoEncoderFactoryCodecSelector", "Network condition did change. New condition is " + aq9Var);
        synchronized (this.i) {
            this.g = new ajk(aq9Var.a, aq9Var.b, aq9Var.d);
            this.h = false;
        }
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public VideoCodecInfo onAvailableBitrate(int i) {
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public final void onCurrentEncoder(VideoCodecInfo videoCodecInfo) {
        VideoCodecInfo videoCodecInfo2 = this.e;
        CidLogger cidLogger = this.c;
        if (videoCodecInfo2 == null && videoCodecInfo != null) {
            cidLogger.log("PatchedVideoEncoderFactoryCodecSelector", "Encoder  " + videoCodecInfo + " was selected as default");
            this.e = videoCodecInfo;
        }
        this.d = videoCodecInfo;
        cidLogger.log("PatchedVideoEncoderFactoryCodecSelector", "Codec selected: " + videoCodecInfo + " for condition " + this.g);
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public VideoCodecInfo onEncoderBroken() {
        boolean zD = cqk.d(this.d, this.e);
        CidLogger cidLogger = this.c;
        if (zD) {
            VideoCodecInfo videoCodecInfo = this.e;
            if (videoCodecInfo != null) {
                cidLogger.log("PatchedVideoEncoderFactoryCodecSelector", "Default encoder " + videoCodecInfo + " was broken. reset");
            }
            this.e = null;
        }
        VideoCodecInfo videoCodecInfo2 = this.d;
        if (videoCodecInfo2 != null) {
            cidLogger.log("PatchedVideoEncoderFactoryCodecSelector", "Current encoder " + videoCodecInfo2 + " was broken. reset");
        }
        this.d = null;
        return a();
    }

    @Override // org.webrtc.VideoEncoderFactory.VideoEncoderSelector
    public VideoCodecInfo onResolutionChange(int i, int i2) {
        return a();
    }
}
