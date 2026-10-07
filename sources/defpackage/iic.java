package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class iic {
    public static final String a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return "JVM_STACKTRACE";
            case 9:
                return "MINIDUMP";
            case 10:
                return "ANDROID_ANR";
            default:
                throw null;
        }
    }

    public static final String b(int i) {
        switch (i) {
            case 1:
            case 9:
                return "CRASH";
            case 2:
                return "NON_FATAL";
            case 3:
                return "FATAL";
            case 4:
                return "ERROR";
            case 5:
                return "WARNING";
            case 6:
                return "NOTICE";
            case 7:
                return "INFO";
            case 8:
                return "DEBUG";
            case 10:
                return null;
            default:
                throw null;
        }
    }

    public static final float c(int i) {
        switch (i) {
            case 1:
                return 1.0f;
            case 2:
                return 2.0f;
            case 3:
                return 3.0f;
            case 4:
                return 4.0f;
            case 5:
                return 5.0f;
            case 6:
                return 6.0f;
            default:
                throw null;
        }
    }

    public static final String d(int i) {
        switch (i) {
            case 1:
                return "CRASH";
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return "NON_FATAL";
            case 9:
                return "MINIDUMP";
            case 10:
                return "ANR";
            default:
                throw null;
        }
    }

    public static final int e(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 8;
            case 3:
                return 16;
            case 4:
                return 1;
            case 5:
                return 4;
            case 6:
                return 32;
            case 7:
                return np0.m;
            default:
                throw null;
        }
    }

    public static final String f(int i) {
        return l(i);
    }

    public static final int g(String str) {
        int i = 0;
        for (int i2 : qt4.H(5)) {
            if (l(i2).equals(str)) {
                i = i2;
                break;
            }
        }
        if (i == 0) {
            return 5;
        }
        return i;
    }

    public static int h(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        ore.p(c0a.k(i, "unknown value ", " for PhoneType"));
        return 0;
    }

    public static int i(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("CRASH")) {
            return 1;
        }
        if (str.equals("NON_FATAL")) {
            return 2;
        }
        if (str.equals("FATAL")) {
            return 3;
        }
        if (str.equals("ERROR")) {
            return 4;
        }
        if (str.equals("WARNING")) {
            return 5;
        }
        if (str.equals("NOTICE")) {
            return 6;
        }
        if (str.equals("INFO")) {
            return 7;
        }
        if (str.equals("DEBUG")) {
            return 8;
        }
        if (str.equals("MINIDUMP")) {
            return 9;
        }
        if (str.equals("ANR")) {
            return 10;
        }
        ore.p("No enum constant ru.ok.tracer.crash.report.ReportType.".concat(str));
        return 0;
    }

    public static /* synthetic */ int j(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return np0.m;
            case 9:
                return np0.n;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String k(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static /* synthetic */ String l(int i) {
        if (i == 1) {
            return "message";
        }
        if (i == 2) {
            return "image";
        }
        if (i == 3) {
            return "contact";
        }
        if (i == 4) {
            return "location";
        }
        if (i == 5) {
            return "unknown";
        }
        throw null;
    }

    public static String m(Long l, String str, String str2) {
        return str + l + str2;
    }

    public static /* synthetic */ String n(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "LOCAL";
        }
        if (i == 3) {
            return "EXP";
        }
        if (i == 4) {
            return "SERVER";
        }
        if (i == 5) {
            return "DEFAULT";
        }
        throw null;
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "CRASH";
            case 2:
                return "NON_FATAL";
            case 3:
                return "FATAL";
            case 4:
                return "ERROR";
            case 5:
                return "WARNING";
            case 6:
                return "NOTICE";
            case 7:
                return "INFO";
            case 8:
                return "DEBUG";
            case 9:
                return "MINIDUMP";
            case 10:
                return "ANR";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String p(int i) {
        if (i == 1) {
            return "REVERSED_LANDSCAPE";
        }
        if (i == 2) {
            return "LANDSCAPE";
        }
        if (i != 3) {
            return i != 4 ? "null" : "REVERSED_PORTRAIT";
        }
        return "PORTRAIT";
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "INITIALIZING";
            case 2:
                return "IDLING";
            case 3:
                return "DISABLED";
            case 4:
                return "ENABLED";
            case 5:
                return "ERROR_ENCODER";
            case 6:
                return "ERROR_SOURCE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i) {
        switch (i) {
            case 1:
                return "TOUCH";
            case 2:
                return "PAGE_SCROLL";
            case 3:
                return "WRITE_BAR";
            case 4:
                return "NOT_CURRENT_PAGE";
            case 5:
                return "OVERLAY";
            case 6:
                return "CONTENT_LOADING";
            case 7:
                return "BACKGROUND";
            case 8:
                return "DETACHED";
            case 9:
                return "LOCAL_STORY";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "SUCCESS";
        }
        if (i != 2) {
            return i != 3 ? "null" : "CANCEL";
        }
        return "FAIL";
    }

    public static /* synthetic */ String t(int i) {
        if (i == 1) {
            return "None";
        }
        if (i == 2) {
            return "Translate";
        }
        if (i == 3) {
            return "Padding";
        }
        if (i != 4) {
            return i != 5 ? "null" : "Margin";
        }
        return "ReplaceablePadding";
    }

    public static /* synthetic */ String u(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "PHONE_BINDING";
        }
        if (i != 3) {
            return i != 4 ? "null" : "PHONE_CONFIRM";
        }
        return "PHONE_REBINDING";
    }

    public static /* synthetic */ String v(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i != 2) {
            return i != 3 ? "null" : "INVALID";
        }
        return "VALID";
    }

    public static /* synthetic */ String w(int i) {
        if (i == 1) {
            return "FROM_NUMBER_WITH_PLUS_SIGN";
        }
        if (i == 2) {
            return "FROM_NUMBER_WITH_IDD";
        }
        if (i == 3) {
            return "FROM_NUMBER_WITHOUT_PLUS_SIGN";
        }
        if (i != 4) {
            return i != 5 ? "null" : "UNSPECIFIED";
        }
        return "FROM_DEFAULT_COUNTRY";
    }

    public static /* synthetic */ int x(String str) {
        if (str == null) {
            ore.n("Name is null");
            return 0;
        }
        if (str.equals("UNKNOWN")) {
            return 1;
        }
        if (str.equals("PHONE_BINDING")) {
            return 2;
        }
        if (str.equals("PHONE_REBINDING")) {
            return 3;
        }
        if (str.equals("PHONE_CONFIRM")) {
            return 4;
        }
        ore.p("No enum constant ru.ok.tamtam.api.commands.base.PhoneBindTokenType.".concat(str));
        return 0;
    }
}
