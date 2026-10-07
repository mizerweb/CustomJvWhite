package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.os.Looper;
import android.util.Log;
import android.view.Window;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import com.facebook.common.file.FileUtils$FileDeleteException;
import com.facebook.common.file.FileUtils$RenameException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.collections.a;
import org.webrtc.EglBase;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class wk8 {
    public static final long[] a = {10000, BuildConfig.SILENCE_TIME_TO_UPLOAD};
    public static final i68 b = new i68("SVG", ".svg");
    public static final fif[] c = new fif[0];
    public static final int[] d;
    public static volatile r3f e = null;
    public static final String f = "wk8";

    static {
        int[] iArr = new int[np0.m];
        iArr[48] = 0;
        iArr[49] = 1;
        iArr[50] = 2;
        iArr[51] = 3;
        iArr[52] = 4;
        iArr[53] = 5;
        iArr[54] = 6;
        iArr[55] = 7;
        iArr[56] = 8;
        iArr[57] = 9;
        iArr[97] = 10;
        iArr[98] = 11;
        iArr[99] = 12;
        iArr[100] = 13;
        iArr[101] = 14;
        iArr[102] = 15;
        iArr[65] = 10;
        iArr[66] = 11;
        iArr[67] = 12;
        iArr[68] = 13;
        iArr[69] = 14;
        iArr[70] = 15;
        d = iArr;
    }

    public static final long A(long j, long j2, lw5 lw5Var) {
        long jS = ew5.s(j2, lw5Var);
        if (((j - 1) | 1) == BuildConfig.MAX_TIME_TO_UPLOAD) {
            if (!ew5.k(j2) || (j ^ jS) >= 0) {
                return j;
            }
            ore.p("Summing infinities of different signs");
            return 0L;
        }
        if (((jS - 1) | 1) == BuildConfig.MAX_TIME_TO_UPLOAD) {
            long jE = ew5.e(2, j2);
            long jS2 = ew5.s(jE, lw5Var);
            return (1 | (jS2 - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? jS2 : A(A(j, jE, lw5Var), ew5.o(j2, jE), lw5Var);
        }
        long j3 = j + jS;
        if (((jS ^ j3) & (j ^ j3)) >= 0) {
            return j3;
        }
        if (j < 0) {
            return Long.MIN_VALUE;
        }
        return BuildConfig.MAX_TIME_TO_UPLOAD;
    }

    public static final long B(long j, long j2, lw5 lw5Var) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return qe7.P(j3, lw5Var);
        }
        lw5 lw5Var2 = lw5.MILLISECONDS;
        if (lw5Var.compareTo(lw5Var2) >= 0) {
            return ew5.v(v(j3));
        }
        long jConvert = lw5Var.a.convert(1L, TimeUnit.MILLISECONDS);
        long j4 = (j / jConvert) - (j2 / jConvert);
        long j5 = (j % jConvert) - (j2 % jConvert);
        ghb ghbVar = ew5.b;
        return ew5.p(qe7.P(j4, lw5Var2), qe7.P(j5, lw5Var));
    }

    public static final long C(long j, long j2, lw5 lw5Var) {
        if (((j2 - 1) | 1) != BuildConfig.MAX_TIME_TO_UPLOAD) {
            return (1 | (j - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? v(j) : B(j, j2, lw5Var);
        }
        if (j != j2) {
            return ew5.v(v(j2));
        }
        ghb ghbVar = ew5.b;
        return 0L;
    }

    public static final int D(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4]
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5]
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:313:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String E(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void F(gdi gdiVar) {
        gdiVar.d(330, new ko7(3));
        gdiVar.d(331, new gj5(18));
        gdiVar.d(332, new ko7(4));
        gdiVar.b(3, new gj5(17));
        gdiVar.d(333, new mu2(26));
    }

    public static final void G(gdi gdiVar) {
        gdiVar.b(3, new nx9(3));
        gdiVar.d(785, new lf9(12));
        gdiVar.d(786, new lf9(13));
        gdiVar.d(787, new lf9(14));
        gdiVar.d(780, new lf9(15));
        gdiVar.d(788, new lf9(16));
    }

    public static final void H(gdi gdiVar) {
        gdiVar.b(3, new pwb(9));
        gdiVar.d(763, new m3d(6));
        gdiVar.d(764, new m3d(9));
        gdiVar.d(765, new m3d(5));
        gdiVar.d(766, new rwb(12));
    }

    public static final void I(gdi gdiVar) {
        gdiVar.d(72, new r1i(18));
        gdiVar.d(73, new r1i(19));
        gdiVar.d(74, new r1i(20));
        gdiVar.b(2, new m3i(2));
        gdiVar.d(35, new r1i(21));
        gdiVar.d(75, new r1i(22));
        gdiVar.d(76, new r1i(23));
        gdiVar.d(77, new r1i(24));
        gdiVar.d(78, new r1i(25));
        gdiVar.d(79, new r1i(26));
        gdiVar.d(80, new r1i(17));
        gdiVar.d(81, new eaf(28));
    }

    public static nah a() {
        return new nah(null);
    }

    public static String b(String str) {
        char cCharAt = str.charAt(0);
        int[] iArr = d;
        int i = (iArr[cCharAt] << 28) | (iArr[str.charAt(1)] << 24) | (iArr[str.charAt(2)] << 20) | (iArr[str.charAt(3)] << 16) | (iArr[str.charAt(4)] << 12) | (iArr[str.charAt(5)] << 8) | (iArr[str.charAt(6)] << 4) | iArr[str.charAt(7)];
        int length = (str.length() - 8) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (((i >>> ((i2 % 4) * 8)) & 255) ^ (iArr[str.charAt(i3 + 9)] | (iArr[str.charAt(8 + i3)] << 4)));
        }
        return new String(bArr, pt2.a);
    }

    public static final int[] c(kbc kbcVar) {
        int iOrdinal = kbcVar.A().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return new int[]{tre.I0(-1, 0.2f), 0};
            }
            if (iOrdinal != 2) {
                ore.o();
                return null;
            }
        }
        return new int[]{tre.I0(-1, 0.5f), 0};
    }

    public static final void d(Window window, boolean z) {
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "SecureWindow", zo5.s("applySecureFlag=", z), null);
            }
        }
        if (z) {
            window.addFlags(8192);
        } else {
            window.clearFlags(8192);
        }
    }

    public static Uri e(String str) {
        Uri.Builder builderEncodedPath = new Uri.Builder().scheme("max").encodedAuthority(null).encodedPath(r5h.s1(str, "?").toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        String strQ1 = r5h.q1(str, "?", "");
        int length = strQ1.length();
        boolean z = true;
        for (int i = 0; i < length; i++) {
            char cCharAt = strQ1.charAt(i);
            if (cCharAt == '&') {
                sb.append(cCharAt);
                z = true;
            } else if (cCharAt != '=') {
                if (z) {
                    cCharAt = Character.toLowerCase(cCharAt);
                }
                sb.append(cCharAt);
            } else {
                sb.append(cCharAt);
                z = false;
            }
        }
        return builderEncodedPath.encodedQuery(sb.toString()).build();
    }

    public static final Set f(fif fifVar) {
        if (fifVar instanceof j81) {
            return ((j81) fifVar).a();
        }
        HashSet hashSet = new HashSet(fifVar.e());
        int iE = fifVar.e();
        for (int i = 0; i < iE; i++) {
            hashSet.add(fifVar.f(i));
        }
        return hashSet;
    }

    public static void g(String str, int... iArr) {
        String strK;
        int iEglGetError = EGL14.eglGetError();
        Integer numValueOf = Integer.valueOf(iEglGetError);
        if (iEglGetError == 12288) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            if (iIntValue == 12291) {
                strK = "EGL_BAD_ALLOC";
            } else if (iIntValue == 12293) {
                strK = "EGL_BAD_CONFIG";
            } else if (iIntValue != 12297) {
                switch (iIntValue) {
                    case 12299:
                        strK = "EGL_BAD_NATIVE_WINDOW";
                        break;
                    case 12300:
                        strK = "EGL_BAD_PARAMETER";
                        break;
                    case 12301:
                        strK = "EGL_BAD_SURFACE";
                        break;
                    default:
                        strK = qv1.k("0x", Integer.toHexString(iIntValue));
                        break;
                }
            } else {
                strK = "EGL_BAD_MATCH";
            }
            final String str2 = str + ": " + strK;
            Log.e("EGL14Utils", str2);
            if (a.L0(iIntValue, iArr)) {
                return;
            }
            new Exception(str2) { // from class: one.video.gl.EGL14Utils$EGL14UtilsException
            };
        }
    }

    public static EGLConfig h(EGLDisplay eGLDisplay, int i) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12339, i, EglBase.EGL_RECORDABLE_ANDROID, 1, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        ore.q("Unable to find EGL config");
        return null;
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
  (r0v0 int) from 0x0007: SWITCH (r0v0 int)
 case -1811142716: goto B:118:0x0130
 case -1811142715: goto B:113:0x0123
 case -1811142714: goto B:108:0x0116
 case -1811142713: goto B:103:0x0109
 case -1811142712: goto B:98:0x00fc
 case -1811142711: goto B:93:0x00ef
 case -1811142710: goto B:88:0x00e2
 case -1811142709: goto B:83:0x00d5
 case -1811142708: goto B:78:0x00c8
 case -1811142707: goto B:73:0x00bb
 default: goto B:5:0x000a A[RegionRef:SW:4]
  (r0v0 int) from 0x000a: SWITCH (r0v0 int)
 case -1811142685: goto B:68:0x00ae
 case -1811142684: goto B:63:0x00a1
 case -1811142683: goto B:58:0x0094
 default: goto B:6:0x000d A[RegionRef:SW:5]
  (r0v0 int) from 0x000d: SWITCH (r0v0 int)
 case 80123371: goto B:53:0x0087
 case 80123372: goto B:48:0x007a
 case 80123373: goto B:43:0x006d
 case 80123374: goto B:38:0x0060
 case 80123375: goto B:33:0x0053
 case 80123376: goto B:28:0x0046
 case 80123377: goto B:23:0x0039
 case 80123378: goto B:18:0x002c
 case 80123379: goto B:13:0x001f
 case 80123380: goto B:8:0x0012
 default: goto B:331:? A[RegionRef:SW:6]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String i(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final fif[] j(List list) {
        fif[] fifVarArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fifVarArr = (fif[]) list.toArray(new fif[0])) == null) ? c : fifVarArr;
    }

    public static final void k() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new w72();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009f  */
    public static void l(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aeg aegVar = (aeg) arrayList.get(i);
            if (aegVar instanceof zdg) {
                arrayList2.add(aegVar);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            aeg aegVar2 = (aeg) arrayList.get(i2);
            if (aegVar2 instanceof xdg) {
                arrayList3.add(aegVar2);
            }
        }
        if (arrayList3.size() > 1) {
            bx3.Y0(arrayList3, new o6(13));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size3 = arrayList3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            xdg xdgVar = (xdg) arrayList3.get(i3);
            String str = xdgVar.a;
            int i4 = eeg.$EnumSwitchMapping$0[xdgVar.d.ordinal()];
            if (i4 == 1) {
                xdg xdgVar2 = (xdg) ww3.u1(i3 - 1, arrayList3);
                if (!cqk.d(xdgVar2 != null ? xdgVar2.a : null, str)) {
                    arrayList4.add(xdgVar);
                }
            } else if (i4 != 2) {
                ore.o();
                return;
            } else {
                xdg xdgVar3 = (xdg) ww3.u1(i3 + 1, arrayList3);
                if (!cqk.d(xdgVar3 != null ? xdgVar3.a : null, str)) {
                    arrayList4.add(xdgVar);
                }
            }
        }
        arrayList2.addAll(arrayList4);
    }

    public static /* synthetic */ xx6 m(ig7 ig7Var, vt4 vt4Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            vt4Var = k66.a;
        }
        if ((i3 & 2) != 0) {
            i = -3;
        }
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        return ig7Var.b(vt4Var, i, i2);
    }

    public static final iyj n(mzj mzjVar) {
        return new iyj(mzjVar.a, mzjVar.t);
    }

    public static Drawable o(Context context, int i) {
        return hne.c().e(context, i);
    }

    public static final Drawable p(Context context, int i) {
        Drawable drawable = context.getDrawable(i);
        if (drawable != null) {
            return drawable;
        }
        ore.p("Required value was null.");
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(rv8 rv8Var) {
        Class clsD = ((qr3) rv8Var).d();
        if (clsD.isPrimitive()) {
            String name = clsD.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsD;
    }

    public static final ek2 r(lq4 lq4Var) {
        if (!(lq4Var instanceof sn5)) {
            return new ek2(1, lq4Var);
        }
        ek2 ek2VarK = ((sn5) lq4Var).k();
        if (ek2VarK != null) {
            if (!ek2VarK.C()) {
                ek2VarK = null;
            }
            if (ek2VarK != null) {
                return ek2VarK;
            }
        }
        return new ek2(2, lq4Var);
    }

    public static final int s(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                ore.p("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    public static final int t(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int u(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static final long v(long j) {
        if (j < 0) {
            ghb ghbVar = ew5.b;
            return ew5.d;
        }
        ghb ghbVar2 = ew5.b;
        return ew5.c;
    }

    public static final boolean w(int i, int i2) {
        if (i2 >= 0 && i2 < 32) {
            return (i & (1 << i2)) != 0;
        }
        ore.p("bitIndex must be in 0..31");
        return false;
    }

    public static final rv8 x(bw8 bw8Var) {
        rv8 rv8VarC = bw8Var.c();
        if (rv8VarC instanceof rv8) {
            return rv8VarC;
        }
        qr7.y(rv8VarC, "Only KClass supported as classifier, got ");
        return null;
    }

    public static void y(File file) throws FileUtils$CreateDirectoryException {
        if (file.exists()) {
            if (file.isDirectory()) {
                return;
            }
            if (!file.delete()) {
                String absolutePath = file.getAbsolutePath();
                FileUtils$FileDeleteException fileUtils$FileDeleteException = new FileUtils$FileDeleteException(file.getAbsolutePath());
                FileUtils$CreateDirectoryException fileUtils$CreateDirectoryException = new FileUtils$CreateDirectoryException(absolutePath);
                fileUtils$CreateDirectoryException.initCause(fileUtils$FileDeleteException);
                throw fileUtils$CreateDirectoryException;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new FileUtils$CreateDirectoryException(file.getAbsolutePath());
        }
    }

    public static void z(File file, File file2) throws FileUtils$RenameException {
        Throwable fileUtils$FileDeleteException;
        file.getClass();
        file2.delete();
        if (file.renameTo(file2)) {
            return;
        }
        if (file2.exists()) {
            fileUtils$FileDeleteException = new FileUtils$FileDeleteException(file2.getAbsolutePath());
        } else if (file.getParentFile().exists()) {
            fileUtils$FileDeleteException = !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null;
        } else {
            final String absolutePath = file.getAbsolutePath();
            fileUtils$FileDeleteException = new FileNotFoundException(absolutePath) { // from class: com.facebook.common.file.FileUtils$ParentDirNotFoundException
            };
        }
        FileUtils$RenameException fileUtils$RenameException = new FileUtils$RenameException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
        fileUtils$RenameException.initCause(fileUtils$FileDeleteException);
        throw fileUtils$RenameException;
    }
}
