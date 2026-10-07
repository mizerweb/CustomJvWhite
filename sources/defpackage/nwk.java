package defpackage;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.net.NetworkRequest;
import android.util.Rational;
import java.util.ArrayList;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nwk {
    public static adb a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                n1g n1gVarX = n1g.x();
                String str = adb.b;
                n1gVarX.k0(adb.b, nbh.t("Ignoring adding capability '", i, '\''), e);
            }
        }
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = fyg.a[i2];
            if (!a.L0(i3, iArr)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    n1g n1gVarX2 = n1g.x();
                    String str2 = adb.b;
                    n1gVarX2.k0(adb.b, nbh.t("Ignoring removing default capability '", i3, '\''), e2);
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        return new adb(builder.build());
    }

    public static int b(xb0 xb0Var) {
        tvj.a("AudioConfigUtil", "Using default AUDIO source: 5");
        return 5;
    }

    public static int c(xb0 xb0Var) {
        tvj.a("AudioConfigUtil", "Using default AUDIO source format: 2");
        return 2;
    }

    public static kl2 d(int i, int i2, int i3, Rational rational) {
        int iK;
        int iF;
        int iK2;
        if (rational != null) {
            if (fkl.b(rational)) {
                tvj.g("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
                iK = i;
            } else {
                iK = gm0.K(rational.floatValue() * i);
            }
            iF = f(i2, i3, iK);
            if (fkl.b(rational)) {
                tvj.g("CaptureEncodeRates", "Invalid capture-to-encode ratio: " + rational);
            } else {
                iK2 = gm0.K(iF / rational.floatValue());
            }
            StringBuilder sbP = qv1.p("Resolved capture/encode sample rate ", iF, "Hz/", iK2, "Hz, [target sample rate: ");
            qt4.x(i, i2, ", channel count: ", ", source format: ", sbP);
            sbP.append(i3);
            sbP.append(", capture to encode sample rate ratio: ");
            sbP.append(rational);
            sbP.append(']');
            tvj.a("AudioConfigUtil", sbP.toString());
            return new kl2(iF, iK2);
        }
        iF = f(i2, i3, i);
        iK2 = iF;
        StringBuilder sbP2 = qv1.p("Resolved capture/encode sample rate ", iF, "Hz/", iK2, "Hz, [target sample rate: ");
        qt4.x(i, i2, ", channel count: ", ", source format: ", sbP2);
        sbP2.append(i3);
        sbP2.append(", capture to encode sample rate ratio: ");
        sbP2.append(rational);
        sbP2.append(']');
        tvj.a("AudioConfigUtil", sbP2.toString());
        return new kl2(iF, iK2);
    }

    public static int e(int i, int i2, int i3, int i4, int i5) {
        String string;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        double dDoubleValue = rational.doubleValue();
        int iDoubleValue = (int) (rational2.doubleValue() * dDoubleValue * ((double) i));
        if (tvj.f(3, "AudioConfigUtil")) {
            StringBuilder sbP = qv1.p("Base Bitrate(", i, "bps) * Channel Count Ratio(", i2, " / ");
            qt4.x(i3, i4, ") * Sample Rate Ratio(", " / ", sbP);
            sbP.append(i5);
            sbP.append(") = ");
            sbP.append(iDoubleValue);
            string = sbP.toString();
        } else {
            string = "";
        }
        tvj.a("AudioConfigUtil", string);
        return iDoubleValue;
    }

    public static int f(int i, int i2, int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        int i6 = 0;
        while (true) {
            if (i5 > 0 && i > 0) {
                if (AudioRecord.getMinBufferSize(i5, i == 1 ? 16 : 12, i2) > 0) {
                    try {
                        new AudioFormat.Builder().setSampleRate(i5).setChannelMask(i == 1 ? 16 : 12).setEncoding(i2).build();
                        return i5;
                    } catch (IllegalArgumentException unused) {
                    }
                }
            }
            StringBuilder sbP = qv1.p("Sample rate ", i5, " Hz is not supported by audio source with channel count ", i, " and source format ");
            sbP.append(i2);
            tvj.a("AudioConfigUtil", sbP.toString());
            if (arrayList == null) {
                tvj.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i3 + " Hz");
                arrayList = new ArrayList(rg0.f);
                bx3.Y0(arrayList, new z70(i4, new y70(i3)));
            }
            if (i6 >= arrayList.size()) {
                tvj.a("AudioConfigUtil", "No sample rate found or supported by audio source. Falling back to default sample rate of 44100 Hz");
                return 44100;
            }
            int i7 = i6 + 1;
            int iIntValue = ((Number) arrayList.get(i6)).intValue();
            i6 = i7;
            i5 = iIntValue;
        }
    }
}
