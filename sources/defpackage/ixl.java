package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ixl {
    public static int a(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getBreakStrategy();
    }

    public static final String b(String str, Map map) {
        String strD = d(str);
        if (strD != null) {
            return (String) map.get(strD);
        }
        return null;
    }

    public static int c(AppCompatTextView appCompatTextView) {
        return appCompatTextView.getHyphenationFrequency();
    }

    public static final String d(String str) {
        k28 k28VarC;
        Object poeVar;
        try {
            try {
                t84 t84Var = new t84();
                t84Var.n(null, str);
                k28VarC = t84Var.c();
            } catch (IllegalArgumentException unused) {
                k28VarC = null;
            }
            poeVar = k28VarC != null ? k28VarC.d : null;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        return (String) (poeVar instanceof poe ? null : poeVar);
    }

    public static final boolean e(int i, boolean z, f8b f8bVar) {
        return (500 <= i && i < 600) || (z && (!f8bVar.d(i) && 400 <= i && i < 500));
    }

    public static void f(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setBreakStrategy(i);
    }

    public static void g(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void h(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    public static void i(AppCompatTextView appCompatTextView, int i) {
        appCompatTextView.setHyphenationFrequency(i);
    }
}
