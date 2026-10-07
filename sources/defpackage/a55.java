package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum a55 {
    DISABLED(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOGS(1),
    /* JADX INFO: Fake field, exist only in values array */
    FILE_LOGS(2),
    DEV_OPTIONS_MENU(3);

    public static final a55[] d = values();
    public final int a;

    a55(int i) {
        this.a = i;
    }

    public static a55 a(int i) {
        for (a55 a55Var : d) {
            if (a55Var.a == i) {
                return a55Var;
            }
        }
        return DISABLED;
    }
}
