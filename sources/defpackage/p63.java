package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum p63 {
    MEMBER("MEMBER"),
    ADMIN("ADMIN"),
    BLOCKED_MEMBER("BLOCKED_MEMBER"),
    JOIN_REQUEST("JOIN_REQUEST"),
    COMMENTS_BLACKLIST("COMMENTS_BLACKLIST");

    public final String a;

    p63(String str) {
        this.a = str;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static p63 a(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -2024440166:
                if (str.equals("MEMBER")) {
                    b = 0;
                }
                break;
            case -1437847443:
                if (str.equals("BLOCKED_MEMBER")) {
                    b = 1;
                }
                break;
            case -94228390:
                if (str.equals("JOIN_REQUEST")) {
                    b = 2;
                }
                break;
            case 62130991:
                if (str.equals("ADMIN")) {
                    b = 3;
                }
                break;
            case 745087090:
                if (str.equals("COMMENTS_BLACKLIST")) {
                    b = 4;
                }
                break;
        }
        p63 p63Var = MEMBER;
        switch (b) {
            case 0:
                return p63Var;
            case 1:
                return BLOCKED_MEMBER;
            case 2:
                return JOIN_REQUEST;
            case 3:
                return ADMIN;
            case 4:
                return COMMENTS_BLACKLIST;
            default:
                return p63Var;
        }
    }
}
