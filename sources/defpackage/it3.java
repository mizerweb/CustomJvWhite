package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class it3 {
    public static final ft0 a;

    static {
        Looper mainLooper = Looper.getMainLooper();
        ft0 ft0Var = new ft0();
        ft0Var.a = new Handler(mainLooper, null);
        a = ft0Var;
    }

    public static void a(Context context, String str) {
        a.A(new i0(context, "Copied Text", str, 14));
    }

    public static final boolean b() {
        return Build.VERSION.SDK_INT <= 32 || ((Boolean) msi.a.getValue()).booleanValue();
    }

    public static final CharSequence c(Context context) {
        ClipData.Item itemAt;
        ClipData primaryClip = ((ClipboardManager) context.getSystemService("clipboard")).getPrimaryClip();
        if (primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null) {
            return null;
        }
        return itemAt.getText();
    }
}
