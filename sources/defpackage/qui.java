package defpackage;

import android.util.Range;
import android.util.Rational;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qui {
    public static final LinkedHashMap a;

    static {
        lj0 lj0Var = lj0.d;
        ylc ylcVar = new ylc(1, lj0Var);
        lj0 lj0Var2 = lj0.g;
        ylc ylcVar2 = new ylc(2, lj0Var2);
        Integer numValueOf = Integer.valueOf(np0.r);
        lj0 lj0Var3 = lj0.h;
        a = wm9.S0(new ylc("video/hevc", wm9.Q0(ylcVar, ylcVar2, new ylc(numValueOf, lj0Var3), new ylc(8192, lj0Var3))), new ylc("video/av01", wm9.Q0(new ylc(1, lj0Var), new ylc(2, lj0Var2), new ylc(numValueOf, lj0Var3), new ylc(8192, lj0Var3))), new ylc("video/x-vnd.on2.vp9", wm9.Q0(new ylc(1, lj0Var), new ylc(4, lj0Var2), new ylc(numValueOf, lj0Var3), new ylc(16384, lj0Var3), new ylc(2, lj0Var), new ylc(8, lj0Var2), new ylc(8192, lj0Var3), new ylc(Integer.valueOf(PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS), lj0Var3))), new ylc("video/dolby-vision", wm9.Q0(new ylc(Integer.valueOf(np0.n), lj0Var2), new ylc(Integer.valueOf(np0.o), lj0.e))));
    }

    public static lj0 a(int i, String str) {
        lj0 lj0Var;
        Map map = (Map) a.get(str);
        if (map != null && (lj0Var = (lj0) map.get(Integer.valueOf(i))) != null) {
            return lj0Var;
        }
        tvj.g("VideoConfigUtil", c0a.l(i, "Unsupported mime type ", str, " or profile level ", ". Data space is unspecified."));
        return lj0.d;
    }

    public static kl2 b(n4j n4jVar, Range range) {
        Range range2 = ich.q;
        int iIntValue = range.equals(range2) ? 30 : ((Number) range.getUpper()).intValue();
        StringBuilder sbP = qv1.p("Resolved capture/encode frame rate ", iIntValue, "fps/", iIntValue, "fps, [Expected operating range: ");
        sbP.append(range.equals(range2) ? "<UNSPECIFIED>" : String.valueOf(range));
        sbP.append(']');
        tvj.a("VideoConfigUtil", sbP.toString());
        return new kl2(iIntValue, iIntValue);
    }

    public static final t2j c(mj0 mj0Var, fx5 fx5Var, o5a o5aVar) {
        String str;
        ih0 ih0Var;
        String str2;
        int i = o5aVar.c;
        int i2 = fx5Var.a;
        if (!fx5Var.b()) {
            o75.f(93, fx5Var, "Dynamic range must be a fully specified dynamic range [provided dynamic range: ");
            return null;
        }
        String str3 = i == 1 ? "video/x-vnd.on2.vp8" : "video/avc";
        if (mj0Var == null) {
            str = null;
            ih0Var = null;
        } else {
            Set set = (Set) nx5.b.get(Integer.valueOf(i2));
            if (set == null) {
                set = Collections.EMPTY_SET;
            }
            Set set2 = (Set) nx5.a.get(Integer.valueOf(fx5Var.b));
            if (set2 == null) {
                set2 = Collections.EMPTY_SET;
            }
            Iterator it = mj0Var.d.iterator();
            while (true) {
                if (it.hasNext()) {
                    ih0Var = (ih0) it.next();
                    str = null;
                    if (set.contains(Integer.valueOf(ih0Var.j)) && set2.contains(Integer.valueOf(ih0Var.h))) {
                        String str4 = ih0Var.b;
                        if (str3.equals(str4)) {
                            tvj.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + str3 + ']');
                        } else if (i == -1) {
                            tvj.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_UNSPECIFIED. Using CamcorderProfile to derive VIDEO settings [mime type: " + str3 + ", dynamic range: " + fx5Var + ']');
                        }
                        str3 = str4;
                    }
                } else {
                    str = null;
                    ih0Var = null;
                }
            }
        }
        if (ih0Var == null) {
            if (i == -1) {
                if (i2 == 1) {
                    str2 = "video/avc";
                } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                    str2 = "video/hevc";
                } else {
                    str2 = i2 != 6 ? str : "video/dolby-vision";
                }
                if (str2 == null) {
                    throw new UnsupportedOperationException("Unsupported dynamic range: " + fx5Var + "\nNo supported default mime type available.");
                }
                str3 = str2;
            }
            if (mj0Var == null) {
                tvj.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str3 + ", dynamic range: " + fx5Var + ']');
            } else {
                tvj.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + str3 + ", dynamic range: " + fx5Var + ']');
            }
        }
        return new t2j(str3, ih0Var);
    }

    public static final int d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        String string;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        Rational rational4 = new Rational(i8, i9);
        double dDoubleValue = rational.doubleValue();
        int iDoubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * dDoubleValue * ((double) i));
        if (tvj.f(3, "VideoConfigUtil")) {
            StringBuilder sbP = qv1.p("Base Bitrate(", i, "bps) * Bit Depth Ratio (", i2, " / ");
            qt4.x(i3, i4, ") * Frame Rate Ratio(", " / ", sbP);
            qt4.x(i5, i6, ") * Width Ratio(", " / ", sbP);
            qt4.x(i7, i8, ") * Height Ratio(", " / ", sbP);
            sbP.append(i9);
            sbP.append(") = ");
            sbP.append(iDoubleValue);
            string = sbP.toString();
        } else {
            string = "";
        }
        tvj.a("VideoConfigUtil", string);
        return iDoubleValue;
    }
}
