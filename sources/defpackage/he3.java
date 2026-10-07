package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum he3 {
    ACTIVE("ACTIVE"),
    LEFT("LEFT"),
    REMOVED("REMOVED"),
    BLOCKED("BLOCKED"),
    REMOVING("REMOVING"),
    CLOSED("CLOSED"),
    HIDDEN("HIDDEN");

    public final String a;

    he3(String str) {
        this.a = str;
    }

    public static he3 a(String str) {
        str.getClass();
        switch (str) {
            case "LEFT":
                return LEFT;
            case "REMOVING":
                return REMOVING;
            case "BLOCKED":
                return BLOCKED;
            case "REMOVED":
                return REMOVED;
            case "ACTIVE":
                return ACTIVE;
            case "CLOSED":
                return CLOSED;
            case "HIDDEN":
                return HIDDEN;
            default:
                ore.p(c0a.o("No such value ", str, " for ChatStatus"));
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zo5.w(new StringBuilder("ChatStatus{value='"), this.a, "'}");
    }
}
