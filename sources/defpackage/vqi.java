package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Display;
import android.view.WindowManager;
import androidx.media3.common.ParserException;
import com.vk.push.core.base.AidlException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class vqi {
    public static final String a;
    public static final byte[] b;
    public static final long[] c;
    public static final Pattern d;
    public static final Pattern e;
    public static final Pattern f;
    public static final Pattern g;
    public static HashMap h;
    public static final String[] i;
    public static final String[] j;
    public static final int[] k;
    public static final int[] l;
    public static final int[] m;

    static {
        String str = Build.DEVICE;
        String str2 = Build.MANUFACTURER;
        a = str + ", " + Build.MODEL + ", " + str2 + ", " + Build.VERSION.SDK_INT;
        b = new byte[0];
        c = new long[0];
        d = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt ](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)?))?");
        e = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        f = Pattern.compile("%([A-Fa-f0-9]{2})");
        g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", MLFeatureConfigProviderBase.CHECKSUM_KEY, "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, AidlException.SDK_IS_NOT_INITIALIZED, 97, 102, 115, 116, 125, 122, 137, 142, 135, np0.m, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, AidlException.TRANSFERRED_IPC_DATA_EXCEPTION, 110, AidlException.HOST_IS_NOT_MASTER, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static Point A(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && T(context)) {
            String strJ = Build.VERSION.SDK_INT < 28 ? J("sys.display-size") : J("vendor.display-size");
            if (!TextUtils.isEmpty(strJ)) {
                try {
                    String[] strArrSplit = strJ.trim().split("x", -1);
                    if (strArrSplit.length == 2) {
                        int i2 = Integer.parseInt(strArrSplit[0]);
                        int i3 = Integer.parseInt(strArrSplit[1]);
                        if (i2 > 0 && i3 > 0) {
                            return new Point(i2, i3);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                lvb.k0("Util", "Invalid display size: " + strJ);
            }
            if ("Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Looper B() {
        Looper looperMyLooper = Looper.myLooper();
        return looperMyLooper != null ? looperMyLooper : Looper.getMainLooper();
    }

    public static int C(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 == 10) {
            return 6004;
        }
        if (i2 == 7) {
            return 6005;
        }
        if (i2 == 8) {
            return 6003;
        }
        switch (i2) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i2) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    public static int D(String str) {
        String[] strArrSplit;
        int length;
        int i2 = 0;
        if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
            return 0;
        }
        String str2 = strArrSplit[length - 1];
        boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
        try {
            str2.getClass();
            i2 = Integer.parseInt(str2);
            if (z) {
                return -i2;
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    public static String E(int i2) {
        if (i2 == 0) {
            return "NO";
        }
        if (i2 == 1) {
            return "NO_UNSUPPORTED_SUBTYPE";
        }
        if (i2 == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i2 == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i2 == 4) {
            return "YES";
        }
        c.t();
        return null;
    }

    public static long F(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
    }

    public static long G(long j2) {
        return j2 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j2;
    }

    public static int H(int i2, ByteOrder byteOrder) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 2 : 268435456;
        }
        if (i2 == 24) {
            return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 21 : 1342177280;
        }
        if (i2 != 32) {
            return 0;
        }
        return byteOrder.equals(ByteOrder.LITTLE_ENDIAN) ? 22 : 1610612736;
    }

    public static long I(float f2, long j2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
    }

    public static String J(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            lvb.l0("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String K(int i2) {
        switch (i2) {
            case ContentLengthStrategy.CHUNKED /* -2 */:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return MediaStreamTrack.AUDIO_TRACK_KIND;
            case 2:
                return MediaStreamTrack.VIDEO_TRACK_KIND;
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? c0a.k(i2, "custom (", ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002a  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e A[RETURN] */
    public static boolean L(l3d l3dVar) {
        boolean z = false;
        if (l3dVar == null) {
            return false;
        }
        int playbackState = l3dVar.getPlaybackState();
        if (playbackState != 1 || !l3dVar.c(2)) {
            if (playbackState == 4 && l3dVar.c(4)) {
                l3dVar.j();
            }
            if (l3dVar.c(1)) {
                return z;
            }
            l3dVar.play();
            return true;
        }
        l3dVar.prepare();
        z = true;
        if (l3dVar.c(1)) {
            return z;
        }
        l3dVar.play();
        return true;
    }

    public static int M(Uri uri) {
        int i2;
        String scheme = uri.getScheme();
        if (scheme != null && (n1g.r("rtsp", scheme) || n1g.r("rtspt", scheme))) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int iLastIndexOf = lastPathSegment.lastIndexOf(46);
            if (iLastIndexOf >= 0) {
                String strB0 = n1g.b0(lastPathSegment.substring(iLastIndexOf + 1));
                strB0.getClass();
                switch (strB0) {
                    case "ism":
                    case "isml":
                        i2 = 1;
                        break;
                    case "mpd":
                        i2 = 0;
                        break;
                    case "m3u8":
                        i2 = 2;
                        break;
                    default:
                        i2 = 4;
                        break;
                }
                if (i2 != 4) {
                    return i2;
                }
            }
            String path = uri.getPath();
            path.getClass();
            Matcher matcher = g.matcher(path);
            if (matcher.matches()) {
                String strGroup = matcher.group(2);
                if (strGroup != null) {
                    if (strGroup.contains("format=mpd-time-csf")) {
                        return 0;
                    }
                    if (strGroup.contains("format=m3u8-aapl")) {
                        return 2;
                    }
                }
                return 1;
            }
        }
        return 4;
    }

    public static int N(Uri uri, String str) {
        if (str == null) {
            return M(uri);
        }
        switch (str) {
            case "application/x-mpegURL":
                return 2;
            case "application/vnd.ms-sstr+xml":
                return 1;
            case "application/dash+xml":
                return 0;
            case "application/x-rtsp":
                return 3;
            default:
                return 4;
        }
    }

    public static boolean O(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4;
    }

    public static boolean P(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        if (i2 == 30) {
            String str = Build.MODEL;
            if (n1g.r(str, "moto g(20)") || n1g.r(str, "rmx3231")) {
                return true;
            }
        }
        return i2 == 34 && n1g.r(Build.MODEL, "sm-x200");
    }

    public static boolean Q(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static boolean R(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || Objects.equals(scheme, "file");
    }

    public static boolean S() {
        String strB0 = n1g.b0(Build.DEVICE);
        return strB0.contains("emulator") || strB0.contains("emu64a") || strB0.contains("emu64x") || strB0.contains("generic");
    }

    public static boolean T(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static String U(Context context, String str) {
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open(str);
            return s(z61.b(inputStreamOpen));
        } finally {
            h(inputStreamOpen);
        }
    }

    public static boolean V(nmc nmcVar, nmc nmcVar2, Inflater inflater) {
        if (nmcVar.a() > 0 && nmcVar.j() == 120 && nmcVar.a() != 0) {
            if (nmcVar2.a.length < nmcVar.a()) {
                nmcVar2.c(nmcVar.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(nmcVar.a, nmcVar.b, nmcVar.a());
            int iInflate = 0;
            while (true) {
                try {
                    byte[] bArr = nmcVar2.a;
                    iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                    if (inflater.finished()) {
                        nmcVar2.M(iInflate);
                        inflater.reset();
                        return true;
                    }
                    if (!inflater.needsDictionary() && !inflater.needsInput()) {
                        byte[] bArr2 = nmcVar2.a;
                        if (iInflate == bArr2.length) {
                            nmcVar2.c(bArr2.length * 2);
                        }
                    }
                } catch (DataFormatException unused) {
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
                inflater.reset();
            }
        }
        return false;
    }

    public static void W(ArrayList arrayList, int i2, int i3, int i4) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i5 = (i3 - i2) - 1; i5 >= 0; i5--) {
            arrayDeque.addFirst(arrayList.remove(i2 + i5));
        }
        arrayList.addAll(Math.min(i4, arrayList.size()), arrayDeque);
    }

    public static long X(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static String Y(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace('_', '-');
        if (!strReplace.isEmpty() && !strReplace.equals("und")) {
            str = strReplace;
        }
        String strB0 = n1g.b0(str);
        int i2 = 0;
        String str2 = strB0.split("-", 2)[0];
        if (h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = i;
            HashMap map = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        map.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                map.put(strArr[i3], strArr[i3 + 1]);
            }
            h = map;
        }
        String str4 = (String) h.get(str2);
        if (str4 != null) {
            strB0 = str4.concat(strB0.substring(str2.length()));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return strB0;
        }
        while (true) {
            String[] strArr2 = j;
            if (i2 >= strArr2.length) {
                return strB0;
            }
            if (strB0.startsWith(strArr2[i2])) {
                return strArr2[i2 + 1] + strB0.substring(strArr2[i2].length());
            }
            i2 += 2;
        }
    }

    public static Object[] Z(Object[] objArr, int i2) {
        lvb.R(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static long a(long j2, long j3) {
        long jG = yok.g(j2, j3);
        return ((jG != Long.MIN_VALUE || j2 + j3 == Long.MIN_VALUE) && (jG != BuildConfig.MAX_TIME_TO_UPLOAD || j2 + j3 == BuildConfig.MAX_TIME_TO_UPLOAD)) ? jG : BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static long a0(String str) throws ParserException {
        Matcher matcher = d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.a(null, "Invalid date/time format: " + str);
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            int i3 = Integer.parseInt(matcher.group(12)) * 60;
            String strGroup = matcher.group(13);
            i2 = strGroup != null ? Integer.parseInt(strGroup) + i3 : i3;
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
    }

    public static int b(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        while (true) {
            i2 = iBinarySearch + 1;
            if (i2 >= jArr.length || jArr[i2] != j2) {
                break;
            }
            iBinarySearch = i2;
        }
        return z ? iBinarySearch : i2;
    }

    public static float b0(long j2, long j3) {
        if (j3 == 0 || j2 != j3) {
            return (j2 / j3) * 100.0f;
        }
        return 100.0f;
    }

    public static int c(bi9 bi9Var, long j2) {
        int iD = bi9Var.d() - 1;
        int i2 = 0;
        while (i2 <= iD) {
            int i3 = (i2 + iD) >>> 1;
            if (bi9Var.c(i3) < j2) {
                i2 = i3 + 1;
            } else {
                iD = i3 - 1;
            }
        }
        int i4 = iD + 1;
        if (i4 < bi9Var.d() && bi9Var.c(i4) == j2) {
            return i4;
        }
        if (iD == -1) {
            return 0;
        }
        return iD;
    }

    public static int c0(long j2, long j3) {
        long jH = yok.h(j2, 100L);
        return k4m.g((jH == BuildConfig.MAX_TIME_TO_UPLOAD || jH == Long.MIN_VALUE) ? j2 / (j3 / 100) : jH / j3);
    }

    public static int d(List list, Comparable comparable, boolean z, boolean z2) {
        int i2;
        int i3;
        int iBinarySearch = Collections.binarySearch(list, comparable);
        if (iBinarySearch < 0) {
            i3 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i2 = iBinarySearch - 1;
                if (i2 < 0 || ((Comparable) list.get(i2)).compareTo(comparable) != 0) {
                    break;
                }
                iBinarySearch = i2;
            }
            i3 = z ? iBinarySearch : i2;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static void d0(Handler handler, Runnable runnable) {
        Looper looper = handler.getLooper();
        if (looper.getThread().isAlive()) {
            if (looper == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static int e(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        int iBinarySearch = Arrays.binarySearch(iArr, i2);
        if (iBinarySearch < 0) {
            i4 = -(iBinarySearch + 2);
        } else {
            while (true) {
                i3 = iBinarySearch - 1;
                if (i3 < 0 || iArr[i3] != i2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i4 = z ? iBinarySearch : i3;
        }
        return z2 ? Math.max(0, i4) : i4;
    }

    public static void e0(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                e0(file2);
            }
        }
        file.delete();
    }

    public static int f(long[] jArr, long j2, boolean z) {
        int i2;
        int iBinarySearch = Arrays.binarySearch(jArr, j2);
        if (iBinarySearch < 0) {
            i2 = -(iBinarySearch + 2);
        } else {
            while (true) {
                int i3 = iBinarySearch - 1;
                if (i3 < 0 || jArr[i3] != j2) {
                    break;
                }
                iBinarySearch = i3;
            }
            i2 = iBinarySearch;
        }
        return z ? Math.max(0, i2) : i2;
    }

    public static void f0(int i2, int i3, List list) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            ore.a();
        } else if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static int g(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static long g0(int i2, long j2) {
        return i0(j2, 1000000L, i2, RoundingMode.DOWN);
    }

    public static void h(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void h0(long j2, long[] jArr) {
        long j3;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long jB = yok.b(j2, 1000000L, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = yok.b(jArr[i2], jB, roundingMode);
                i2++;
            }
            return;
        }
        if (j2 < 1000000 && 1000000 % j2 == 0) {
            long jB2 = yok.b(1000000L, j2, RoundingMode.UNNECESSARY);
            while (i2 < jArr.length) {
                jArr[i2] = yok.h(jArr[i2], jB2);
                i2++;
            }
            return;
        }
        int i3 = 0;
        while (i3 < jArr.length) {
            long j4 = jArr[i3];
            if (j4 != 0) {
                if (j2 >= j4 && j2 % j4 == 0) {
                    jArr[i3] = yok.b(1000000L, yok.b(j2, j4, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j2 >= j4 || j4 % j2 != 0) {
                    j3 = j2;
                    jArr[i3] = j0(j4, 1000000L, j3, roundingMode);
                } else {
                    jArr[i3] = yok.h(1000000L, yok.b(j4, j2, RoundingMode.UNNECESSARY));
                }
                j3 = j2;
            } else {
                j3 = j2;
            }
            i3++;
            j2 = j3;
        }
    }

    public static float i(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static long i0(long j2, long j3, long j4, RoundingMode roundingMode) {
        if (j2 == 0 || j3 == 0) {
            return 0L;
        }
        if (j4 >= j3 && j4 % j3 == 0) {
            return yok.b(j2, yok.b(j4, j3, RoundingMode.UNNECESSARY), roundingMode);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return yok.h(j2, yok.b(j3, j4, RoundingMode.UNNECESSARY));
        }
        if (j4 < j2 || j4 % j2 != 0) {
            return (j4 >= j2 || j2 % j4 != 0) ? j0(j2, j3, j4, roundingMode) : yok.h(j3, yok.b(j2, j4, RoundingMode.UNNECESSARY));
        }
        return yok.b(j3, yok.b(j4, j2, RoundingMode.UNNECESSARY), roundingMode);
    }

    public static int j(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long j0(long j2, long j3, long j4, RoundingMode roundingMode) {
        long jH = yok.h(j2, j3);
        if (jH != BuildConfig.MAX_TIME_TO_UPLOAD && jH != Long.MIN_VALUE) {
            return yok.b(jH, j4, roundingMode);
        }
        long jC = yok.c(Math.abs(j3), Math.abs(j4));
        RoundingMode roundingMode2 = RoundingMode.UNNECESSARY;
        long jB = yok.b(j3, jC, roundingMode2);
        long jB2 = yok.b(j4, jC, roundingMode2);
        long jC2 = yok.c(Math.abs(j2), Math.abs(jB2));
        long jB3 = yok.b(j2, jC2, roundingMode2);
        long jB4 = yok.b(jB2, jC2, roundingMode2);
        long jH2 = yok.h(jB3, jB);
        if (jH2 != BuildConfig.MAX_TIME_TO_UPLOAD && jH2 != Long.MIN_VALUE) {
            return yok.b(jH2, jB4, roundingMode);
        }
        double d2 = jB3 * (jB / jB4);
        if (d2 > 9.223372036854776E18d) {
            return BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (d2 < -9.223372036854776E18d) {
            return Long.MIN_VALUE;
        }
        return gp5.d(d2, roundingMode);
    }

    public static long k(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean k0(l3d l3dVar, boolean z) {
        return l3dVar == null || !l3dVar.z() || l3dVar.getPlaybackState() == 1 || l3dVar.getPlaybackState() == 4 || !(!z || l3dVar.u() == 0 || l3dVar.u() == 4);
    }

    public static boolean l(SparseArray sparseArray, int i2) {
        return sparseArray.indexOfKey(i2) >= 0;
    }

    public static String[] l0(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
    }

    public static boolean m(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static boolean m0(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static Bundle n(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ClassLoader classLoader = vqi.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (RuntimeException e2) {
            lvb.l0("Util", "Ignoring invalid bundle", e2);
            return null;
        }
    }

    public static byte[] n0(int... iArr) {
        byte[] bArr = new byte[iArr.length * 4];
        int i2 = 0;
        for (int i3 : iArr) {
            bArr[i2] = (byte) (i3 >> 24);
            bArr[i2 + 1] = (byte) (i3 >> 16);
            int i4 = i2 + 3;
            bArr[i2 + 2] = (byte) (i3 >> 8);
            i2 += 4;
            bArr[i4] = (byte) i3;
        }
        return bArr;
    }

    public static int o(int i2, int i3, int i4, byte[] bArr) {
        while (i2 < i3) {
            i4 = k[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
            i2++;
        }
        return i4;
    }

    public static mof o0(e89 e89Var, t00 t00Var) {
        mof mofVarR = mof.r();
        ewg ewgVar = new ewg(mofVarR, 14, e89Var);
        im5 im5Var = im5.a;
        mofVarR.b(ewgVar, im5Var);
        e89Var.b(new alg(e89Var, mofVarR, t00Var, 5), im5Var);
        return mofVarR;
    }

    public static Handler p(Handler.Callback callback) {
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper, callback);
    }

    public static long p0(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static Handler q(Handler.Callback callback) {
        return new Handler(B(), callback);
    }

    public static long r(int i2, long j2) {
        return i0(j2, i2, 1000000L, RoundingMode.UP);
    }

    public static String s(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int t(int i2) {
        if (i2 == 30) {
            return 34;
        }
        switch (i2) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i2) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        switch (i2) {
                            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                                return 30;
                            case 21:
                            case 22:
                                return 31;
                            default:
                                return Integer.MAX_VALUE;
                        }
                }
        }
    }

    public static int u(int i2) {
        if (i2 == 10) {
            return Build.VERSION.SDK_INT >= 32 ? 737532 : 6396;
        }
        if (i2 == 16) {
            return Build.VERSION.SDK_INT >= 32 ? 205215996 : 0;
        }
        if (i2 == 24) {
            return Build.VERSION.SDK_INT >= 32 ? 67108860 : 0;
        }
        switch (i2) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                switch (i2) {
                    case 12:
                        return 743676;
                    case 13:
                        return Build.VERSION.SDK_INT >= 32 ? 30136348 : 0;
                    case 14:
                        return Build.VERSION.SDK_INT >= 32 ? 202070268 : 0;
                    default:
                        return 0;
                }
        }
    }

    public static int v(int i2) {
        if (i2 != 2) {
            if (i2 == 3) {
                return 1;
            }
            if (i2 != 4) {
                if (i2 != 21) {
                    if (i2 != 22) {
                        if (i2 != 268435456) {
                            if (i2 != 1342177280) {
                                if (i2 != 1610612736) {
                                    ore.a();
                                    return 0;
                                }
                            }
                        }
                    }
                }
                return 3;
            }
            return 4;
        }
        return 2;
    }

    public static int w(int i2, String str) {
        int i3 = 0;
        for (String str2 : l0(str)) {
            if (i2 == uya.h(uya.d(str2))) {
                i3++;
            }
        }
        return i3;
    }

    public static String x(int i2, String str) {
        String[] strArrL0 = l0(str);
        if (strArrL0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrL0) {
            if (i2 == uya.h(uya.d(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String y(String str) {
        String[] strArrL0 = l0(str);
        if (strArrL0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrL0) {
            if (2 != uya.h(uya.d(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static String z(Context context) {
        TelephonyManager telephonyManager;
        if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return n1g.c0(networkCountryIso);
            }
        }
        return n1g.c0(Locale.getDefault().getCountry());
    }
}
