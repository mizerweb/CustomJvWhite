package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSession;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class o4 {
    public static /* bridge */ /* synthetic */ ColorStateListDrawable c(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ MediaSession d(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    public static /* bridge */ /* synthetic */ boolean o(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
