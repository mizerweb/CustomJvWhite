package defpackage;

import android.graphics.Matrix;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public abstract class v3e {
    public static final float[] a = new float[9];

    public static float a(Matrix matrix) {
        float[] fArr = a;
        matrix.getValues(fArr);
        double dPow = Math.pow(fArr[0], 2.0d);
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow(fArr[3], 2.0d) + dPow);
    }

    public static final String b(String str) {
        String lastPathSegment;
        return (str == null || str.length() == 0 || str.length() == 0 || (lastPathSegment = Uri.parse(str).getLastPathSegment()) == null) ? "" : lastPathSegment;
    }

    public static final String c(String str) {
        String lastPathSegment;
        String str2 = "";
        if (str == null || str.length() == 0) {
            return "";
        }
        if (str.length() != 0 && (lastPathSegment = Uri.parse(str).getLastPathSegment()) != null) {
            str2 = lastPathSegment;
        }
        return "https://max.ru/joincall/".concat(str2);
    }
}
