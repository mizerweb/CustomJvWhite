package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes2.dex */
public final class gzf {
    public static int a(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
