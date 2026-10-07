package defpackage;

import androidx.media3.common.ParserException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gxl {
    public static void a(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.a(null, str);
        }
    }

    public static int b(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return BuildConfig.FILE_LENGTH_TO_UPLOAD;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    public static final String c(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (tre.l0(cCharAt)) {
                sb.append(cCharAt);
            } else {
                sb.append('*');
            }
        }
        return sb.toString();
    }

    public static final String d(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (Character.isHighSurrogate(cCharAt)) {
                int i2 = i + 1;
                if (i2 < str.length() && Character.isLowSurrogate(str.charAt(i2))) {
                    sb.append(cCharAt);
                    sb.append(str.charAt(i2));
                    i = i2;
                }
            } else if (!Character.isLowSurrogate(cCharAt)) {
                sb.append(cCharAt);
            }
            i++;
        }
        return sb.toString();
    }
}
