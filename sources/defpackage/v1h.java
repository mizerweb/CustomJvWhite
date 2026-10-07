package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class v1h {
    public final int a;

    public /* synthetic */ v1h(int i) {
        this.a = i;
    }

    public static final /* synthetic */ v1h a(int i) {
        return new v1h(i);
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public static final boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static int d(int i) {
        return Integer.hashCode(i);
    }

    public static String e(int i) {
        StringBuilder sbY = zo5.y(i, "StorySettingsModel{", "|SETTINGS_ALL=");
        sbY.append(c(i, 1));
        sbY.append("SETTINGS_CONTACTS_ONLY=");
        sbY.append(c(i, 2));
        sbY.append('}');
        return sbY.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1h) {
            return this.a == ((v1h) obj).a;
        }
        return false;
    }

    public final /* synthetic */ int f() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return e(this.a);
    }
}
