package defpackage;

import android.text.TextUtils;
import com.vk.push.core.base.AidlException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes.dex */
public abstract class uya {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        gx gxVarF;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (gxVarF = f(str2)) == null || (iA = gxVarF.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] strArrL0 = vqi.l0(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : strArrL0) {
                if (str2.equals(d(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        gx gxVarF;
        str.getClass();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts.hd;profile=lbr":
                return 8;
            case "audio/vnd.dts":
                return 7;
            case "audio/mp4a-latm":
                if (str2 == null || (gxVarF = f(str2)) == null) {
                    return 0;
                }
                return gxVarF.a();
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/vnd.dts.uhd;profile=p2":
                return 30;
            case "audio/eac3":
                return 6;
            case "audio/mpeg":
                return 9;
            case "audio/opus":
                return 20;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        gx gxVarF;
        String strE = null;
        if (str != null) {
            String strB0 = n1g.b0(str.trim());
            if (strB0.startsWith("avc1") || strB0.startsWith("avc3")) {
                return "video/avc";
            }
            if (strB0.startsWith("hev1") || strB0.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (strB0.startsWith("dvav") || strB0.startsWith("dva1") || strB0.startsWith("dvhe") || strB0.startsWith("dvh1")) {
                return "video/dolby-vision";
            }
            if (strB0.startsWith("av01")) {
                return "video/av01";
            }
            if (strB0.startsWith("vp9") || strB0.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (strB0.startsWith("vp8") || strB0.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (strB0.startsWith("mp4a")) {
                if (strB0.startsWith("mp4a.") && (gxVarF = f(strB0)) != null) {
                    strE = e(gxVarF.a);
                }
                return strE == null ? "audio/mp4a-latm" : strE;
            }
            if (strB0.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (strB0.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (strB0.startsWith("ac-3") || strB0.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (strB0.startsWith("ec-3") || strB0.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (strB0.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (strB0.startsWith("ac-4") || strB0.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (strB0.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (strB0.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (strB0.startsWith("dtsh") || strB0.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (strB0.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (strB0.startsWith("opus")) {
                return "audio/opus";
            }
            if (strB0.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (strB0.startsWith("flac")) {
                return "audio/flac";
            }
            if (strB0.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (strB0.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (strB0.contains("cea708")) {
                return "application/cea-708";
            }
            if (strB0.contains("eia608") || strB0.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() > 0) {
                qt4.A(arrayList.get(0));
                throw null;
            }
        }
        return null;
    }

    public static String e(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case AidlException.HOST_IS_NOT_MASTER /* 103 */:
            case AidlException.SDK_IS_NOT_INITIALIZED /* 104 */:
                return "audio/mp4a-latm";
            case AidlException.TRANSFERRED_IPC_DATA_EXCEPTION /* 105 */:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static gx f(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new gx(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if (k(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        qt4.A(arrayList.get(0));
        throw null;
    }

    public static boolean i(String str) {
        return MediaStreamTrack.AUDIO_TRACK_KIND.equals(g(str));
    }

    public static boolean j(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean k(String str) {
        return "image".equals(g(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean l(String str) {
        return "text".equals(g(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return MediaStreamTrack.VIDEO_TRACK_KIND.equals(g(str));
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        String strB0 = n1g.b0(str);
        strB0.getClass();
        switch (strB0) {
            case "video/x-mvhevc":
                return "video/mv-hevc";
            case "audio/x-flac":
                return "audio/flac";
            case "application/x-mpegurl":
                return "application/x-mpegURL";
            case "audio/x-wav":
                return "audio/wav";
            case "audio/mpeg-l1":
                return "audio/mpeg-L1";
            case "audio/mpeg-l2":
                return "audio/mpeg-L2";
            case "audio/mp3":
                return "audio/mpeg";
            default:
                return strB0;
        }
    }
}
