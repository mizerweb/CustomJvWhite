package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.Window;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iq4 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static Icon b(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static String c(Context context) {
        return context.getAttributionTag();
    }

    public static String d(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static String e(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static void f(NotificationChannel notificationChannel) {
        notificationChannel.isImportantConversation();
    }

    public static void g(Window window) {
        window.setDecorFitsSystemWindows(false);
    }

    public static void h(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
