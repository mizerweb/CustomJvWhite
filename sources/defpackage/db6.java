package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* JADX INFO: loaded from: classes2.dex */
public final class db6 {
    public final omi a;
    public final zx3 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public i64 f;
    public cb6 g;

    public db6(kg2 kg2Var, omi omiVar, zx3 zx3Var) {
        Integer num;
        this.a = omiVar;
        this.b = zx3Var;
        bg2 bg2Var = kg2Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        Object obj = ab6.a;
        qb2 qb2Var = (qb2) bg2Var;
        Object objC = qb2Var.c(key);
        Range range = (Range) (objC != null ? objC : obj);
        this.c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.d = z;
        this.e = !z ? Rational.ZERO : (Rational) qb2Var.c(CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }
}
