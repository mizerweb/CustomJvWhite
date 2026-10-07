package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class u3f {
    public static final /* synthetic */ u3f a = new u3f();
    public static final String b = v3f.class.getSimpleName();
    public static final String[] c;

    static {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i == 29) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
        } else {
            strArr = i >= 33 ? new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"} : new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        c = strArr;
    }
}
