package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gs4 {
    public static final Set a = Collections.unmodifiableSet(EnumSet.of(dd2.d, dd2.e, dd2.f, dd2.g));
    public static final Set b = Collections.unmodifiableSet(EnumSet.of(ed2.d, ed2.a));
    public static final Set c;
    public static final Set d;

    static {
        cd2 cd2Var = cd2.e;
        cd2 cd2Var2 = cd2.d;
        cd2 cd2Var3 = cd2.a;
        Set setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(cd2Var, cd2Var2, cd2Var3));
        c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(cd2Var2);
        enumSetCopyOf.remove(cd2Var3);
        d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0177 A[PHI: r7
  0x0177: PHI (r7v5 char) = (r7v1 char), (r7v0 char) binds: [B:122:0x0199, B:106:0x0175] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean a(sm2 sm2Var, boolean z) {
        char c2;
        char c3;
        xg metadata = sm2Var.b.getMetadata();
        Integer num = (Integer) metadata.a.get(CaptureResult.CONTROL_AF_MODE);
        char c4 = 5;
        char c5 = 4;
        if ((num != null && num.intValue() == 0) || (num != null && num.intValue() == 5)) {
            c2 = 2;
        } else if ((num != null && num.intValue() == 1) || (num != null && num.intValue() == 2)) {
            c2 = 3;
        } else if ((num != null && num.intValue() == 4) || (num != null && num.intValue() == 3)) {
            c2 = 4;
        } else {
            if (num != null && tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Unknown AF mode (" + num.intValue() + ") for " + ((Object) tc7.a(metadata.a.getFrameNumber())) + '!');
            }
            c2 = 1;
        }
        boolean z2 = c2 == 2 || a.contains(sm2Var.r());
        xg metadata2 = sm2Var.b.getMetadata();
        Integer num2 = (Integer) metadata2.a.get(CaptureResult.CONTROL_AE_MODE);
        if (num2 != null && num2.intValue() == 0) {
            c3 = 2;
        } else if (num2 != null && num2.intValue() == 1) {
            c3 = 3;
        } else if (num2 != null && num2.intValue() == 2) {
            c3 = 4;
        } else if (num2 != null && num2.intValue() == 3) {
            c3 = 5;
        } else if (num2 != null && num2.intValue() == 4) {
            c3 = 6;
        } else {
            if (num2 != null && tvj.f(3, "CXCP")) {
                Log.d("CXCP", "Unknown AE mode (" + num2.intValue() + ") for " + ((Object) tc7.a(metadata2.a.getFrameNumber())) + '!');
            }
            c3 = 1;
        }
        boolean z3 = c3 == 2;
        boolean z4 = !z ? !(z3 || c.contains(sm2Var.w())) : !(z3 || d.contains(sm2Var.w()));
        xg metadata3 = sm2Var.b.getMetadata();
        Integer num3 = (Integer) metadata3.a.get(CaptureResult.CONTROL_AWB_MODE);
        if (num3 != null && num3.intValue() == 0) {
            c4 = 2;
        } else if (num3 != null && num3.intValue() == 1) {
            c4 = 3;
        } else if (num3 != null && num3.intValue() == 2) {
            c4 = c5;
        } else if (num3 == null || num3.intValue() != 3) {
            if (num3 != null && num3.intValue() == 4) {
                c4 = 6;
            } else {
                c5 = 7;
                if (num3 != null && num3.intValue() == 5) {
                    c4 = c5;
                } else {
                    c4 = '\b';
                    if (num3 == null || num3.intValue() != 6) {
                        if (num3 != null && num3.intValue() == 7) {
                            c4 = '\t';
                        } else if (num3 != null && num3.intValue() == 8) {
                            c4 = '\n';
                        } else {
                            if (num3 != null && tvj.f(3, "CXCP")) {
                                Log.d("CXCP", "Unknown AWB mode (" + num3.intValue() + ") for " + ((Object) tc7.a(metadata3.a.getFrameNumber())) + '!');
                            }
                            c4 = 1;
                        }
                    }
                }
            }
        }
        boolean z5 = c4 == 2 || b.contains(sm2Var.s());
        tvj.a("ConvergenceUtils", "checkCaptureResult, AE=" + sm2Var.w() + " AF =" + sm2Var.r() + " AWB=" + sm2Var.s());
        return z2 && z4 && z5;
    }
}
