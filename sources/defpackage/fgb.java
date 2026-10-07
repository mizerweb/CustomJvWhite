package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fgb {
    static {
        Arrays.sort(new char[]{'A', 'O', 'U', 'I', 'E', 1040, 1054, 1059, 1067, 1048, 1069, 1045, 1070, 1071, 1025});
    }

    public static boolean a(StringBuilder sb, int i, char c) {
        int i2 = i + 1;
        return i2 < sb.length() && sb.charAt(i2) == c;
    }
}
