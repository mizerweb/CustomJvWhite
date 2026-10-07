package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes.dex */
public final class mc6 implements xf {
    public static final ste d = new ste(", ", 1);
    public static final NumberFormat e;
    public final tsh a = new tsh();
    public final rsh b = new rsh();
    public final long c = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        e = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    public static String a(tb0 tb0Var) {
        String str;
        String strValueOf;
        ArrayList arrayList = new ArrayList();
        int i = tb0Var.a;
        if (i != -1) {
            StringBuilder sb = new StringBuilder("enc=");
            if (i == 30) {
                strValueOf = "dts-uhd-p2";
            } else if (i == 268435456) {
                strValueOf = "pcm-16be";
            } else if (i == 1073741824) {
                strValueOf = "aac-er-bsac";
            } else if (i == 1342177280) {
                strValueOf = "pcm-24be";
            } else if (i != 1610612736) {
                switch (i) {
                    case 2:
                        strValueOf = "pcm-16";
                        break;
                    case 3:
                        strValueOf = "pcm-8";
                        break;
                    case 4:
                        strValueOf = "pcm-float";
                        break;
                    case 5:
                        strValueOf = "ac3";
                        break;
                    case 6:
                        strValueOf = "eac3";
                        break;
                    case 7:
                        strValueOf = "dts";
                        break;
                    case 8:
                        strValueOf = "dts-hd";
                        break;
                    case 9:
                        strValueOf = "mp3";
                        break;
                    case 10:
                        strValueOf = "aac-lc";
                        break;
                    case 11:
                        strValueOf = "aac-he-v1";
                        break;
                    case 12:
                        strValueOf = "aac-he-v2";
                        break;
                    default:
                        switch (i) {
                            case 14:
                                strValueOf = "truehd";
                                break;
                            case 15:
                                strValueOf = "aac-eld";
                                break;
                            case 16:
                                strValueOf = "aac-xhe";
                                break;
                            case 17:
                                strValueOf = "ac4";
                                break;
                            case 18:
                                strValueOf = "eac3-joc";
                                break;
                            default:
                                switch (i) {
                                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                        strValueOf = "opus";
                                        break;
                                    case 21:
                                        strValueOf = "pcm-24";
                                        break;
                                    case 22:
                                        strValueOf = "pcm-32";
                                        break;
                                    default:
                                        strValueOf = String.valueOf(i);
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                strValueOf = "pcm-32be";
            }
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        int i2 = tb0Var.c;
        switch (i2) {
            case 4:
                str = "mono";
                break;
            case 12:
                str = "stereo";
                break;
            case 204:
                str = "quad";
                break;
            case 252:
                str = "5.1";
                break;
            case 6396:
                str = "7.1";
                break;
            case 737532:
                str = "5.1.4";
                break;
            case 743676:
                str = "7.1.4";
                break;
            case 3145980:
                str = "5.1.2";
                break;
            case 3152124:
                str = "7.1.2";
                break;
            case 202070268:
                str = "9.1.4";
                break;
            case 205215996:
                str = "9.1.6";
                break;
            default:
                str = "0x" + Integer.toHexString(i2);
                break;
        }
        arrayList.add("channelConf=".concat(str));
        arrayList.add("sampleRate=" + tb0Var.b);
        arrayList.add("bufferSize=" + tb0Var.f);
        if (tb0Var.d) {
            arrayList.add("tunneling");
        }
        if (tb0Var.e) {
            arrayList.add("offload");
        }
        ste steVar = d;
        steVar.getClass();
        Iterator it = arrayList.iterator();
        StringBuilder sb2 = new StringBuilder();
        steVar.a(sb2, it);
        return sb2.toString();
    }

    public static String d(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return e.format(j / 1000.0f);
    }

    @Override // defpackage.xf
    public final void A(wf wfVar, uz9 uz9Var) {
        f(wfVar, "upstreamDiscarded", b87.e(uz9Var.c));
    }

    @Override // defpackage.xf
    public final void A0(wf wfVar, tb0 tb0Var) {
        f(wfVar, "audioTrackReleased", a(tb0Var));
    }

    @Override // defpackage.xf
    public final void B(wf wfVar, int i, int i2) {
        f(wfVar, "surfaceSize", qt4.l("w=", i, i2, ", h="));
    }

    @Override // defpackage.xf
    public final void B0(wf wfVar, int i, int i2, boolean z) {
        StringBuilder sbY = zo5.y(i, "rendererIndex=", ", ");
        sbY.append(vqi.K(i2));
        sbY.append(", ");
        sbY.append(z);
        f(wfVar, "rendererReady", sbY.toString());
    }

    @Override // defpackage.xf
    public final void C0(wf wfVar) {
        e(wfVar, "audioEnabled");
    }

    @Override // defpackage.xf
    public final void D(wf wfVar, p70 p70Var) {
        f(wfVar, "audioAttributes", p70Var.a + "," + p70Var.b + "," + p70Var.c + "," + p70Var.d);
    }

    @Override // defpackage.xf
    public final void D0(wf wfVar, t55 t55Var) {
        e(wfVar, "videoEnabled");
    }

    @Override // defpackage.xf
    public final void E0(wf wfVar, int i) {
        f(wfVar, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.xf
    public final void F(wf wfVar, tb0 tb0Var) {
        f(wfVar, "audioTrackInit", a(tb0Var));
    }

    @Override // defpackage.xf
    public final void F0(wf wfVar, int i) {
        f(wfVar, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.xf
    public final void G(wf wfVar, k4j k4jVar) {
        StringBuilder sb = new StringBuilder("w=" + k4jVar.a + ", h=" + k4jVar.b);
        float f = k4jVar.c;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        f(wfVar, "videoSize", sb.toString());
    }

    @Override // defpackage.xf
    public final void H0(wf wfVar, float f) {
        f(wfVar, "volume", Float.toString(f));
    }

    @Override // defpackage.xf
    public final void I0(wf wfVar, int i, long j, long j2) {
        lvb.k0("OneMeMediaSessionService", b(wfVar, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    @Override // defpackage.xf
    public final void L(wf wfVar, Object obj, long j) {
        f(wfVar, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.xf
    public final void N(wf wfVar) {
        e(wfVar, "audioDisabled");
    }

    @Override // defpackage.xf
    public final void O(wf wfVar, PlaybackException playbackException) {
        lvb.k0("OneMeMediaSessionService", b(wfVar, "playerFailed", null, playbackException));
    }

    @Override // defpackage.xf
    public final void O0(wf wfVar, uz9 uz9Var) {
        f(wfVar, "downstreamFormat", b87.e(uz9Var.c));
    }

    @Override // defpackage.xf
    public final void P0(wf wfVar, b87 b87Var, w55 w55Var) {
        f(wfVar, "videoInputFormat", b87.e(b87Var));
    }

    @Override // defpackage.xf
    public final void Q0(wf wfVar) {
        e(wfVar, "drmSessionReleased");
    }

    @Override // defpackage.xf
    public final void R(wf wfVar, t55 t55Var) {
        e(wfVar, "videoDisabled");
    }

    @Override // defpackage.xf
    public final void R0(wf wfVar, String str) {
        f(wfVar, "videoDecoderInitialized", str);
    }

    @Override // defpackage.xf
    public final void S0(wf wfVar, boolean z) {
        f(wfVar, "loading", Boolean.toString(z));
    }

    @Override // defpackage.xf
    public final void T0(wf wfVar, fzh fzhVar) {
        lwa lwaVar;
        g("tracks [".concat(c(wfVar)));
        c98 c98Var = fzhVar.a;
        for (int i = 0; i < c98Var.size(); i++) {
            ezh ezhVar = (ezh) c98Var.get(i);
            g("  group [ id=" + ezhVar.b().b);
            for (int i2 = 0; i2 < ezhVar.a; i2++) {
                String str = ezhVar.g(i2) ? "[X]" : "[ ]";
                String strE = vqi.E(ezhVar.d(i2));
                StringBuilder sbR = c0a.r(i2, "    ", str, " Track:", ", ");
                sbR.append(b87.e(ezhVar.c(i2)));
                sbR.append(", supported=");
                sbR.append(strE);
                g(sbR.toString());
            }
            g("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < c98Var.size(); i3++) {
            ezh ezhVar2 = (ezh) c98Var.get(i3);
            for (int i4 = 0; !z && i4 < ezhVar2.a; i4++) {
                if (ezhVar2.g(i4) && (lwaVar = ezhVar2.c(i4).l) != null && lwaVar.e() > 0) {
                    g("  Metadata [");
                    h(lwaVar, "    ");
                    g("  ]");
                    z = true;
                }
            }
        }
        g("]");
    }

    @Override // defpackage.xf
    public final void U0(wf wfVar, Exception exc) {
        lvb.k0("OneMeMediaSessionService", b(wfVar, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.xf
    public final void V0(wf wfVar, int i, boolean z) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        if (i == 1) {
            str = "USER_REQUEST";
        } else if (i == 2) {
            str = "AUDIO_FOCUS_LOSS";
        } else if (i == 3) {
            str = "AUDIO_BECOMING_NOISY";
        } else if (i != 4) {
            str = i != 5 ? "?" : "END_OF_MEDIA_ITEM";
        } else {
            str = "REMOTE";
        }
        sb.append(str);
        f(wfVar, "playWhenReady", sb.toString());
    }

    @Override // defpackage.xf
    public final void W0(wf wfVar, int i) {
        String str;
        if (i == 0) {
            str = "NONE";
        } else if (i == 1) {
            str = "TRANSIENT_AUDIO_FOCUS_LOSS";
        } else if (i != 3) {
            str = i != 4 ? "?" : "SCRUBBING";
        } else {
            str = "UNSUITABLE_AUDIO_OUTPUT";
        }
        f(wfVar, "playbackSuppressionReason", str);
    }

    @Override // defpackage.xf
    public final void X0(wf wfVar) {
        e(wfVar, "drmKeysRestored");
    }

    @Override // defpackage.xf
    public final void a0(wf wfVar, boolean z) {
        f(wfVar, "shuffleModeEnabled", Boolean.toString(z));
    }

    public final String b(wf wfVar, String str, String str2, Throwable th) {
        StringBuilder sbZ = zo5.z(str, " [");
        sbZ.append(c(wfVar));
        String string = sbZ.toString();
        if (th instanceof PlaybackException) {
            StringBuilder sbZ2 = zo5.z(string, ", errorCode=");
            sbZ2.append(((PlaybackException) th).b());
            string = sbZ2.toString();
        }
        if (str2 != null) {
            string = zo5.p(string, ", ", str2);
        }
        String strP0 = lvb.p0(th);
        if (!TextUtils.isEmpty(strP0)) {
            StringBuilder sbZ3 = zo5.z(string, "\n  ");
            sbZ3.append(strP0.replace("\n", "\n  "));
            sbZ3.append('\n');
            string = sbZ3.toString();
        }
        return string.concat("]");
    }

    public final String c(wf wfVar) {
        String string = "window=" + wfVar.c;
        x4a x4aVar = wfVar.d;
        if (x4aVar != null) {
            StringBuilder sbZ = zo5.z(string, ", period=");
            sbZ.append(wfVar.b.b(x4aVar.a));
            string = sbZ.toString();
            if (x4aVar.b()) {
                StringBuilder sbZ2 = zo5.z(string, ", adGroup=");
                sbZ2.append(x4aVar.b);
                StringBuilder sbZ3 = zo5.z(sbZ2.toString(), ", ad=");
                sbZ3.append(x4aVar.c);
                string = sbZ3.toString();
            }
        }
        return "eventTime=" + d(wfVar.a - this.c) + ", mediaPos=" + d(wfVar.e) + ", " + string;
    }

    @Override // defpackage.xf
    public final void d0(wf wfVar, String str) {
        f(wfVar, "audioDecoderReleased", str);
    }

    public final void e(wf wfVar, String str) {
        g(b(wfVar, str, null, null));
    }

    public final void f(wf wfVar, String str, String str2) {
        g(b(wfVar, str, str2, null));
    }

    @Override // defpackage.xf
    public final void f0(wf wfVar, String str) {
        f(wfVar, "audioDecoderInitialized", str);
    }

    public final void g(String str) {
        lvb.g0("OneMeMediaSessionService", str);
    }

    public final void h(lwa lwaVar, String str) {
        for (int i = 0; i < lwaVar.e(); i++) {
            StringBuilder sbC = nbh.C(str);
            sbC.append(lwaVar.d(i));
            g(sbC.toString());
        }
    }

    @Override // defpackage.xf
    public final void h0(wf wfVar, int i) {
        String str;
        if (i == 1) {
            str = "IDLE";
        } else if (i == 2) {
            str = "BUFFERING";
        } else if (i != 3) {
            str = i != 4 ? "?" : "ENDED";
        } else {
            str = "READY";
        }
        f(wfVar, "state", str);
    }

    @Override // defpackage.xf
    public final void k0(wf wfVar, int i) {
        f(wfVar, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.xf
    public final void m0(wf wfVar, b87 b87Var) {
        f(wfVar, "audioInputFormat", b87.e(b87Var));
    }

    @Override // defpackage.xf
    public final void n(wf wfVar) {
        e(wfVar, "drmKeysLoaded");
    }

    @Override // defpackage.xf
    public final void n0(wf wfVar, int i) {
        String str;
        if (i == 0) {
            str = "OFF";
        } else if (i != 1) {
            str = i != 2 ? "?" : "ALL";
        } else {
            str = "ONE";
        }
        f(wfVar, "repeatMode", str);
    }

    @Override // defpackage.xf
    public final void o(wf wfVar, boolean z) {
        f(wfVar, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.xf
    public final void p(wf wfVar, boolean z) {
        f(wfVar, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.xf
    public final void r(wf wfVar, k3d k3dVar, k3d k3dVar2, int i) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(k3dVar);
        sb.append("], PositionInfo:new [");
        sb.append(k3dVar2);
        sb.append("]");
        f(wfVar, "positionDiscontinuity", sb.toString());
    }

    @Override // defpackage.xf
    public final void r0(wf wfVar, int i) {
        ush ushVar = wfVar.b;
        int iH = ushVar.h();
        int iO = ushVar.o();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(c(wfVar));
        sb.append(", periodCount=");
        sb.append(iH);
        sb.append(", windowCount=");
        sb.append(iO);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        g(sb.toString());
        for (int i2 = 0; i2 < Math.min(iH, 3); i2++) {
            rsh rshVar = this.b;
            ushVar.f(i2, rshVar, false);
            g("  period [" + d(vqi.p0(rshVar.d)) + "]");
        }
        if (iH > 3) {
            g("  ...");
        }
        for (int i3 = 0; i3 < Math.min(iO, 3); i3++) {
            tsh tshVar = this.a;
            ushVar.n(i3, tshVar);
            g("  window [" + d(vqi.p0(tshVar.l)) + ", seekable=" + tshVar.g + ", dynamic=" + tshVar.h + "]");
        }
        if (iO > 3) {
            g("  ...");
        }
        g("]");
    }

    @Override // defpackage.xf
    public final void s0(wf wfVar, int i) {
        f(wfVar, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // defpackage.xf
    public final void t(wf wfVar, s2d s2dVar) {
        f(wfVar, "playbackParameters", s2dVar.toString());
    }

    @Override // defpackage.xf
    public final void u(wf wfVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        lvb.k0("OneMeMediaSessionService", b(wfVar, "internalError", "loadError", iOException));
    }

    @Override // defpackage.xf
    public final void v(wf wfVar, long j) {
        f(wfVar, "audioPositionAdvancing", "since " + d((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.c));
    }

    @Override // defpackage.xf
    public final void v0(wf wfVar, int i) {
        String str;
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(c(wfVar));
        sb.append(", reason=");
        if (i == 0) {
            str = "REPEAT";
        } else if (i == 1) {
            str = "AUTO";
        } else if (i != 2) {
            str = i != 3 ? "?" : "PLAYLIST_CHANGED";
        } else {
            str = "SEEK";
        }
        sb.append(str);
        sb.append("]");
        g(sb.toString());
    }

    @Override // defpackage.xf
    public final void y(wf wfVar, lwa lwaVar) {
        g("metadata [".concat(c(wfVar)));
        h(lwaVar, "  ");
        g("]");
    }

    @Override // defpackage.xf
    public final void z0(wf wfVar, String str) {
        f(wfVar, "videoDecoderReleased", str);
    }
}
