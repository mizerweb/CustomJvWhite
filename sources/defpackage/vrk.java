package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vrk {
    public static final Uri b(Uri uri, ry9 ry9Var) {
        String strValueOf;
        Uri.Builder builderBuildUpon = uri.buildUpon();
        Integer num = ry9Var.d.H;
        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
            strValueOf = String.valueOf(0);
        }
        return builderBuildUpon.appendQueryParameter("MediaItemType", strValueOf).build();
    }

    public abstract int a(ux3 ux3Var);
}
