package defpackage;

import android.media.AudioFormat;
import android.media.Spatializer;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ke5 implements ddd {
    public final /* synthetic */ ve5 a;
    public final /* synthetic */ pe5 b;

    public /* synthetic */ ke5(ve5 ve5Var, pe5 pe5Var) {
        this.a = ve5Var;
        this.b = pe5Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006c A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x009c  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00af  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    @Override // defpackage.ddd
    public final boolean apply(Object obj) {
        Boolean bool;
        ae7 ae7Var;
        Spatializer spatializer;
        Spatializer spatializer2;
        ae7 ae7Var2;
        p70 p70Var;
        int i;
        int iU;
        AudioFormat.Builder channelMask;
        int i2;
        boolean zCanBeSpatialized;
        ae7 ae7Var3;
        b87 b87Var = (b87) obj;
        ve5 ve5Var = this.a;
        ve5Var.getClass();
        if (this.b.A0 && ((bool = ve5Var.j) == null || !bool.booleanValue())) {
            int i3 = b87Var.F;
            String str = b87Var.n;
            if (i3 != -1 && i3 > 2) {
                if (str == null) {
                    if (Build.VERSION.SDK_INT >= 32 && (ae7Var = ve5Var.h) != null && ae7Var.a) {
                        spatializer = (Spatializer) ae7Var.b;
                        spatializer.getClass();
                        if (o70.e(spatializer).isAvailable()) {
                            spatializer2 = (Spatializer) ve5Var.h.b;
                            spatializer2.getClass();
                            if (o70.e(spatializer2).isEnabled()) {
                                ae7Var2 = ve5Var.h;
                                p70Var = ve5Var.i;
                                ae7Var2.getClass();
                                i = b87Var.F;
                                if (Objects.equals(str, "audio/eac3-joc")) {
                                    if (i == 16) {
                                        i = 12;
                                    }
                                } else if (Objects.equals(str, "audio/iamf")) {
                                    if (i == -1) {
                                        i = 6;
                                    }
                                } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
                                    i = 24;
                                }
                                iU = vqi.u(i);
                                if (iU == 0) {
                                    zCanBeSpatialized = false;
                                } else {
                                    channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iU);
                                    i2 = b87Var.G;
                                    if (i2 != -1) {
                                        channelMask.setSampleRate(i2);
                                    }
                                    Spatializer spatializer3 = (Spatializer) ae7Var2.b;
                                    spatializer3.getClass();
                                    zCanBeSpatialized = o70.e(spatializer3).canBeSpatialized(p70Var.c(), channelMask.build());
                                }
                                if (zCanBeSpatialized) {
                                }
                            }
                        }
                    }
                    return false;
                }
                switch (str) {
                    case "audio/eac3-joc":
                    case "audio/ac3":
                    case "audio/ac4":
                    case "audio/eac3":
                        if (Build.VERSION.SDK_INT >= 32 && (ae7Var3 = ve5Var.h) != null && ae7Var3.a) {
                        }
                    default:
                        if (Build.VERSION.SDK_INT >= 32) {
                            spatializer = (Spatializer) ae7Var.b;
                            spatializer.getClass();
                            if (o70.e(spatializer).isAvailable()) {
                                spatializer2 = (Spatializer) ve5Var.h.b;
                                spatializer2.getClass();
                                if (o70.e(spatializer2).isEnabled()) {
                                    ae7Var2 = ve5Var.h;
                                    p70Var = ve5Var.i;
                                    ae7Var2.getClass();
                                    i = b87Var.F;
                                    if (Objects.equals(str, "audio/eac3-joc")) {
                                        if (i == 16) {
                                            i = 12;
                                        }
                                    } else if (Objects.equals(str, "audio/iamf")) {
                                        if (i == -1) {
                                            i = 6;
                                        }
                                    } else if (Objects.equals(str, "audio/ac4")) {
                                        i = 24;
                                    }
                                    iU = vqi.u(i);
                                    if (iU == 0) {
                                        zCanBeSpatialized = false;
                                    } else {
                                        channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iU);
                                        i2 = b87Var.G;
                                        if (i2 != -1) {
                                            channelMask.setSampleRate(i2);
                                        }
                                        Spatializer spatializer4 = (Spatializer) ae7Var2.b;
                                        spatializer4.getClass();
                                        zCanBeSpatialized = o70.e(spatializer4).canBeSpatialized(p70Var.c(), channelMask.build());
                                    }
                                    if (zCanBeSpatialized) {
                                    }
                                }
                            }
                        }
                        return false;
                }
            }
        }
        return true;
    }
}
