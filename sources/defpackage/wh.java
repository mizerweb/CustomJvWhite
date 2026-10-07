package defpackage;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;

/* JADX INFO: loaded from: classes.dex */
public abstract class wh {
    public static final lge a = new lge("[\\n\\r]");
    public static final lge b = new lge("\\s{2,}");

    public static final CharSequence a(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = false;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            boolean z2 = cCharAt == '\n' || cCharAt == '\r';
            boolean zL0 = tre.l0(cCharAt);
            if (z2 || zL0) {
                if (!z && i > 0 && i < charSequence.length() - 1) {
                    spannableStringBuilder.append(' ');
                }
                z = true;
            } else {
                spannableStringBuilder.append(cCharAt);
                z = false;
            }
        }
        if (!(charSequence instanceof Spanned)) {
            return SpannableString.valueOf(spannableStringBuilder);
        }
        Spanned spanned = (Spanned) charSequence;
        int length = 0;
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            int spanFlags = spanned.getSpanFlags(obj);
            String strD = b.d(" ", a.d(" ", spanned.subSequence(spanStart, spanEnd).toString()));
            int iV0 = r5h.V0(spannableStringBuilder, strD, length, false, 4);
            if (iV0 >= 0) {
                length = strD.length() + iV0;
                spannableStringBuilder.setSpan(obj, iV0, length, spanFlags);
            }
        }
        return SpannableString.valueOf(spannableStringBuilder);
    }

    public static Spannable b(Spannable spannable) {
        int i;
        int i2;
        if (spannable.length() == 0) {
            return spannable;
        }
        if (r5h.y1(spannable).length() == 0) {
            return new SpannableString("");
        }
        SpannableString spannableString = new SpannableString(spannable);
        int length = spannableString.length();
        char[] cArr = new char[length];
        spannableString.getChars(0, length, cArr, 0);
        if (Character.isSpaceChar(cArr[0]) || cArr[0] == '\n') {
            i = 0;
            while (i < length && (Character.isSpaceChar(cArr[i]) || cArr[i] == '\n')) {
                i++;
            }
        } else {
            i = 0;
        }
        int i3 = length - 1;
        if (Character.isSpaceChar(cArr[i3]) || cArr[i3] == '\n') {
            i2 = length;
            while (i2 > 1) {
                int i4 = i2 - 1;
                if (!Character.isSpaceChar(cArr[i4]) && cArr[i4] != '\n') {
                    break;
                }
                i2--;
            }
        } else {
            i2 = length;
        }
        if (i == 0 && i2 == length) {
            return spannableString;
        }
        SpannableString spannableString2 = (SpannableString) spannableString.subSequence(i, i2);
        for (Object obj : spannableString2.getSpans(0, spannableString2.length(), Object.class)) {
            if (obj != null) {
                int spanStart = spannableString2.getSpanStart(obj);
                int spanEnd = spannableString2.getSpanEnd(obj);
                if (spanStart == -1 || spanStart > spannableString2.length()) {
                    spannableString2.removeSpan(obj);
                } else if (spanEnd == -1 || spanEnd > spannableString2.length()) {
                    spannableString2.removeSpan(obj);
                }
            }
        }
        return spannableString2;
    }
}
