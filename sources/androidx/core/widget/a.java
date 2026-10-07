package androidx.core.widget;

import android.graphics.Paint;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bdd;
import defpackage.co5;
import defpackage.ixl;
import defpackage.kxl;
import defpackage.ore;
import defpackage.p21;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static bdd a(AppCompatTextView appCompatTextView) {
        TextDirectionHeuristic textDirectionHeuristic;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new bdd(co5.i(appCompatTextView));
        }
        p21 p21Var = new p21(new TextPaint(appCompatTextView.getPaint()));
        p21Var.e(ixl.a(appCompatTextView));
        p21Var.h(ixl.c(appCompatTextView));
        if (appCompatTextView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (appCompatTextView.getInputType() & 15) != 3) {
            boolean z = appCompatTextView.getLayoutDirection() == 1;
            switch (appCompatTextView.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    textDirectionHeuristic = !z ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(co5.a(kxl.a(appCompatTextView.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        p21Var.i(textDirectionHeuristic);
        return p21Var.b();
    }

    public static void b(TextView textView, int i) {
        if (i < 0) {
            ore.a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            co5.l(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void c(TextView textView, int i) {
        if (i < 0) {
            ore.a();
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void d(TextView textView, int i) {
        if (i < 0) {
            ore.a();
            return;
        }
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static ActionMode.Callback e(ActionMode.Callback callback) {
        return callback instanceof TextViewCompat$OreoCallback ? ((TextViewCompat$OreoCallback) callback).getWrappedCallback() : callback;
    }

    public static ActionMode.Callback f(ActionMode.Callback callback, TextView textView) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof TextViewCompat$OreoCallback) || callback == null) ? callback : new TextViewCompat$OreoCallback(callback, textView);
    }
}
