package defpackage;

import android.app.Notification;
import android.content.LocusId;
import android.graphics.Insets;
import android.os.Trace;

/* JADX INFO: loaded from: classes.dex */
public abstract class li8 {
    public static void a(int i, String str) {
        Trace.beginAsyncSection(str, i);
    }

    public static LocusId b(String str) {
        return new LocusId(str);
    }

    public static void c(int i, String str) {
        Trace.endAsyncSection(str, i);
    }

    public static boolean d() {
        return Trace.isEnabled();
    }

    public static Insets e(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void f(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void g(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void h(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void i(int i, String str) {
        Trace.setCounter(str, i);
    }
}
