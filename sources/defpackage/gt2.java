package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gt2 implements ddd {
    public static String a(char c) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static gt2 b(String str) {
        int length = str.length();
        if (length == 0) {
            return at2.f;
        }
        if (length != 1) {
            return length != 2 ? new bt2(str) : new et2(str.charAt(0), str.charAt(1));
        }
        return new dt2(str.charAt(0), 0);
    }

    public abstract boolean c(char c);

    public gt2 d() {
        return new bt2(this);
    }
}
