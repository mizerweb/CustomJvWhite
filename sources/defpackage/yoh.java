package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yoh {
    public static final Pattern a = Pattern.compile("#(?i)([\\p{L}0-9_]+)");

    public static void a(Spannable spannable, t59 t59Var, boolean z, int i) {
        vf6 vf6Var = new vf6(spannable, t59Var, i, 5);
        if (t59Var == t59.d) {
            c(spannable.toString(), b(t59Var, z), soc.a, soc.d, false, vf6Var);
        } else {
            c(spannable.toString(), b(t59Var, z), soc.a, null, false, vf6Var);
        }
    }

    public static Pattern b(t59 t59Var, boolean z) {
        int iOrdinal = t59Var.ordinal();
        if (iOrdinal == 1) {
            return a;
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? xoh.a : xoh.a;
        }
        return z ? xoh.e : xoh.c;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void c(CharSequence charSequence, Pattern pattern, Pattern pattern2, Pattern pattern3, boolean z, tg4 tg4Var) {
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            Matcher matcher2 = pattern2.matcher(charSequence);
            while (true) {
                if (!matcher2.find()) {
                    if (!z && pattern == xoh.a) {
                        Matcher matcher3 = xoh.e.matcher(charSequence);
                        while (true) {
                            if (matcher3.find() && matcher.start() >= matcher3.start() && matcher.end() <= matcher3.end()) {
                                if (matcher3.group().contains(matcher.group())) {
                                    break;
                                }
                            }
                        }
                    }
                    if (pattern3 == null) {
                        try {
                            tg4Var.accept(new voh(matcher.start(), matcher.end(), matcher.group()));
                            break;
                        } catch (Throwable th) {
                            gm0.V("yoh", th.getMessage(), th);
                            break;
                        }
                    }
                    Matcher matcher4 = pattern3.matcher(charSequence);
                    while (true) {
                        if (!matcher4.find() || matcher.start() < matcher4.start() || matcher.end() > matcher4.end()) {
                            tg4Var.accept(new voh(matcher.start(), matcher.end(), matcher.group()));
                            break;
                            break;
                        } else if (matcher4.group().contains(matcher.group())) {
                            break;
                        }
                    }
                } else if ((matcher.start() >= matcher2.start() && matcher.end() <= matcher2.end()) || ((matcher.end() <= matcher2.end() && matcher.end() >= matcher2.start()) || (matcher.start() <= matcher2.end() && matcher.end() >= matcher2.end()))) {
                    break;
                }
            }
        }
    }

    public static Spannable d(CharSequence charSequence) {
        return charSequence instanceof Spannable ? (Spannable) charSequence : SpannableString.valueOf(charSequence);
    }
}
