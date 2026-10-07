package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoder;
import org.webrtc.VideoEncoderFactory;
import org.webrtc.VideoEncoderFallback;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ioc implements VideoEncoderFactory, zp9 {
    public final xt1 a;
    public final CidLogger b;
    public final due c;
    public final koc d;
    public VideoCodecInfo e;
    public final CopyOnWriteArraySet f;
    public final boolean g;
    public final ifh h;
    public final ifh i;

    public ioc(EglBase.Context context, boolean z, fi1 fi1Var, xt1 xt1Var, CidLogger cidLogger, due dueVar, ou7 ou7Var, b1k b1kVar) {
        context.getClass();
        fi1Var.getClass();
        xt1Var.getClass();
        this.a = xt1Var;
        this.b = cidLogger;
        this.c = dueVar;
        this.d = z ? new koc(this, fi1Var, xt1Var, cidLogger) : null;
        this.f = new CopyOnWriteArraySet();
        this.g = xt1Var.r.x;
        this.h = new ifh(new ja1(context, this, ou7Var, b1kVar, 10));
        this.i = new ifh(new iua(17, this));
    }

    public final VideoCodecInfo[] a() {
        VideoCodecInfo[] supportedCodecs = ((VideoEncoderFactory) this.i.getValue()).getSupportedCodecs();
        supportedCodecs.getClass();
        return supportedCodecs;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoder createEncoder(VideoCodecInfo videoCodecInfo) {
        boolean zD;
        videoCodecInfo.getClass();
        koc kocVar = this.d;
        if (kocVar != null) {
            zD = cqk.d(videoCodecInfo.name, "VP9");
            kocVar.c.log("PatchedVideoEncoderFactoryCodecSelector", "isSoftwareCodecProhibited check for: " + videoCodecInfo + ", resulted as " + zD);
        } else {
            zD = false;
        }
        xt1 xt1Var = this.a;
        VideoEncoder videoEncoderCreateEncoder = (xt1Var.r.E == fh6.b && this.c.w() == zvh.c) ? null : ((VideoEncoderFactory) this.h.getValue()).createEncoder(videoCodecInfo);
        VideoEncoder videoEncoderCreateEncoder2 = (videoEncoderCreateEncoder == null || !zD) ? ((VideoEncoderFactory) this.i.getValue()).createEncoder(videoCodecInfo) : null;
        String str = videoCodecInfo.name;
        String str2 = videoEncoderCreateEncoder == null ? "false" : "true";
        String str3 = videoEncoderCreateEncoder2 == null ? "false" : "true";
        fh6 fh6Var = xt1Var.r.E;
        String str4 = fh6Var == fh6.a ? "false" : "true";
        String str5 = fh6Var != fh6.c ? "false" : "true";
        StringBuilder sbQ = qv1.q("Encoder is about to create: ", str, " hw=", str2, " sw=");
        nbh.G(sbQ, str3, " simulcast sw=", str4, " simulcast hw=");
        sbQ.append(str5);
        this.b.log("PatchedVideoEncoderFactory", sbQ.toString());
        this.e = videoCodecInfo;
        videoCodecInfo.name.getClass();
        Iterator it = this.f.iterator();
        it.getClass();
        while (it.hasNext()) {
            qpc qpcVar = (qpc) it.next();
            qpcVar.getClass();
            qpcVar.j(new bjk(qpcVar, new lpc(qpcVar, 0), 1));
        }
        if (videoEncoderCreateEncoder == null || videoEncoderCreateEncoder2 == null) {
            return videoEncoderCreateEncoder == null ? videoEncoderCreateEncoder2 : videoEncoderCreateEncoder;
        }
        return new VideoEncoderFallback(videoEncoderCreateEncoder2, videoEncoderCreateEncoder);
    }

    @Override // defpackage.zp9
    public final void f(aq9 aq9Var) {
        aq9Var.getClass();
        koc kocVar = this.d;
        if (kocVar != null) {
            kocVar.f(aq9Var);
        }
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return this.d;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        xt1 xt1Var = this.a;
        boolean zA = xt1Var.r.E.a();
        zvh zvhVar = zvh.c;
        due dueVar = this.c;
        if (zA && dueVar.w() == zvhVar) {
            VideoCodecInfo[] videoCodecInfoArrA = a();
            ArrayList arrayList = new ArrayList();
            for (VideoCodecInfo videoCodecInfo : videoCodecInfoArrA) {
                if (!cqk.d(videoCodecInfo.name, "VP9")) {
                    arrayList.add(videoCodecInfo);
                }
            }
            linkedHashSet.addAll(arrayList);
        } else {
            cx3.a1(linkedHashSet, a());
        }
        VideoCodecInfo[] supportedCodecs = (xt1Var.r.E == fh6.b && dueVar.w() == zvhVar) ? new VideoCodecInfo[0] : ((VideoEncoderFactory) this.h.getValue()).getSupportedCodecs();
        Set setSingleton = this.g ? c76.a : Collections.singleton("H265");
        if (setSingleton.isEmpty()) {
            supportedCodecs.getClass();
            cx3.a1(linkedHashSet, supportedCodecs);
        } else {
            supportedCodecs.getClass();
            for (VideoCodecInfo videoCodecInfo2 : supportedCodecs) {
                if (!setSingleton.contains(videoCodecInfo2.name)) {
                    linkedHashSet.add(videoCodecInfo2);
                }
            }
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[0]);
    }
}
