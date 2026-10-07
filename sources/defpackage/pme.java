package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class pme {
    public final int a;

    public static final String a(int i) {
        switch (i) {
            case 1:
                return "TEMPLATE_PREVIEW";
            case 2:
                return "TEMPLATE_STILL_CAPTURE";
            case 3:
                return "TEMPLATE_RECORD";
            case 4:
                return "TEMPLATE_VIDEO_SNAPSHOT";
            case 5:
                return "TEMPLATE_ZERO_SHUTTER_LAG";
            case 6:
                return "TEMPLATE_MANUAL";
            default:
                return zo5.h(i, "UNKNOWN-");
        }
    }

    public static String b(int i) {
        return nbh.t("RequestTemplate(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pme) {
            return this.a == ((pme) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
