package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t05 {
    public final vwd A;
    public final vwd B;
    public final vwd C;
    public final vwd D;
    public final vwd E;
    public final vwd F;
    public final vwd G;
    public final vwd H;
    public final qd2 a;
    public final r05 b;
    public final vwd c;
    public final vwd d;
    public final vwd e;
    public final vwd f;
    public final vwd g;
    public final vwd h;
    public final vwd i;
    public final vwd j;
    public final vwd k;
    public final vwd l;
    public final vwd m;
    public final vwd n;
    public final vwd o;
    public final vwd p;
    public final vwd q;
    public final vwd r;
    public final vwd s;
    public final vwd t;
    public final vwd u;
    public final vwd v;
    public final vwd w;
    public final vwd x;
    public final rg5 y = new rg5();
    public final vwd z;

    public t05(r05 r05Var, qd2 qd2Var, h6f h6fVar) {
        this.b = r05Var;
        this.a = qd2Var;
        this.c = tt2.d(r05Var, this, 4);
        this.d = tt2.d(r05Var, this, 3);
        this.e = tt2.d(r05Var, this, 2);
        this.f = tt2.d(r05Var, this, 9);
        this.g = tt2.d(r05Var, this, 10);
        this.h = tt2.d(r05Var, this, 8);
        this.i = tt2.d(r05Var, this, 7);
        this.j = tt2.d(r05Var, this, 11);
        this.k = tt2.d(r05Var, this, 6);
        this.l = tt2.d(r05Var, this, 12);
        this.m = tt2.d(r05Var, this, 5);
        this.n = tt2.d(r05Var, this, 14);
        this.o = tt2.d(r05Var, this, 13);
        this.p = tt2.d(r05Var, this, 16);
        this.q = tt2.d(r05Var, this, 15);
        this.r = tt2.d(r05Var, this, 17);
        this.s = tt2.d(r05Var, this, 18);
        this.t = tt2.d(r05Var, this, 19);
        this.u = tt2.d(r05Var, this, 20);
        this.v = tt2.d(r05Var, this, 22);
        this.w = tt2.d(r05Var, this, 21);
        this.x = tt2.d(r05Var, this, 23);
        this.z = tt2.d(r05Var, this, 25);
        this.A = tt2.d(r05Var, this, 26);
        this.B = tt2.d(r05Var, this, 28);
        this.C = tt2.d(r05Var, this, 27);
        this.D = tt2.d(r05Var, this, 29);
        this.E = tt2.d(r05Var, this, 24);
        this.F = tt2.d(r05Var, this, 30);
        this.G = tt2.d(r05Var, this, 1);
        this.H = tt2.d(r05Var, this, 31);
        rg5.a(this.y, dp5.a(new s05(r05Var, this, 0, 0)));
    }

    public final plh a() {
        s2e s2eVarA = ((ch2) this.i.get()).a();
        Iterator it = s2eVarA.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).b()) {
                return new h0a(s2eVarA);
            }
        }
        if (!s2eVarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            return zpe.k;
        }
        return new h0a(s2eVarA);
    }

    public final m1k b() {
        Range range;
        Float f;
        kg2 kg2Var = (kg2) this.d.get();
        bg2 bg2Var = kg2Var.b;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = ohb.b;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (tvj.f(5, "CXCP")) {
                        Log.w("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    if (((qb2) bg2Var).c(key) == null) {
                        return new ohb(kg2Var);
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Float fValueOf = Float.valueOf(1.0f);
            int i = 3;
            try {
                Range range2 = (Range) ((qb2) bg2Var).c(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
                if (range2 == null) {
                    if (tvj.f(5, "CXCP")) {
                        Log.w("CXCP", "Failed to read CONTROL_ZOOM_RATIO_RANGE for " + ((Object) ef2.b(((qb2) bg2Var).a)) + '!');
                    }
                    range = new Range(fValueOf, fValueOf);
                } else {
                    float fFloatValue = ((Number) range2.getLower()).floatValue();
                    if (Math.abs(fFloatValue) >= ((double) Math.ulp(Math.abs(fFloatValue))) * 2.0d && ((Number) range2.getLower()).floatValue() >= 0.0f) {
                        f = (Float) range2.getLower();
                    } else {
                        if (tvj.f(5, "CXCP")) {
                            Log.w("CXCP", "Invalid lower zoom range detected: " + range2.getLower());
                        }
                        f = fValueOf;
                    }
                    float fFloatValue2 = ((Number) range2.getUpper()).floatValue();
                    if (Math.abs(fFloatValue2) >= ((double) Math.ulp(Math.abs(fFloatValue2))) * 2.0d && ((Number) range2.getUpper()).floatValue() >= 0.0f) {
                        fValueOf = (Float) range2.getUpper();
                    } else if (tvj.f(5, "CXCP")) {
                        Log.w("CXCP", "Invalid upper zoom range detected: " + range2.getUpper());
                    }
                    range = new Range(f, fValueOf);
                }
            } catch (AssertionError e) {
                if (uk5.a(ControlZoomRatioRangeAssertionErrorQuirk.class) != null) {
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "Device is known to throw an exception while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE. CONTROL_ZOOM_RATIO_RANGE is not supported. [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "].");
                    }
                } else if (tvj.f(6, "CXCP")) {
                    Log.e("CXCP", "Exception thrown while retrieving the value for CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE on devices not known to throw exceptions during this operation. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: " + Build.MANUFACTURER + ", Model: " + Build.MODEL + ", API Level: " + Build.VERSION.SDK_INT + "]. CONTROL_ZOOM_RATIO_RANGE is not available.", e);
                }
                if (tvj.f(5, "CXCP")) {
                    Log.w("CXCP", "AssertionError: failed to get CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE", e);
                }
                range = null;
            }
            if (range != null) {
                return new xp9(kg2Var, i, range);
            }
        }
        return new euc(kg2Var);
    }
}
