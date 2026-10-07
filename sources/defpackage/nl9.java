package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nl9 {
    public static volatile us7 a;
    public static final gt6 b = new gt6();
    public static volatile c7k c;

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }

    public static final void b(Activity activity) {
        View currentFocus;
        if (activity == null || (currentFocus = activity.getWindow().getCurrentFocus()) == null) {
            return;
        }
        currentFocus.clearFocus();
        try {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static final void c(View view) {
        if (view == null) {
            return;
        }
        Context context = view.getContext();
        view.clearFocus();
        try {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        } catch (Throwable unused) {
        }
    }

    public static final boolean d(View view, boolean z) {
        boolean z2;
        if (view == null) {
            return false;
        }
        if (!z || view.requestFocus()) {
            z2 = true;
        } else {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "Keyboard", "showKeyboard for " + view + ": requestFocus ignored!", null);
                }
            }
            z2 = false;
        }
        view.post(new qw8(view, 0));
        return z2;
    }
}
