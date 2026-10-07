package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class p68 {
    public static final /* synthetic */ p68[] a = {new p68("UNKNOWN", 0), new p68("REQUESTED", 1), new p68("INTERMEDIATE_AVAILABLE", 2), new p68("SUCCESS", 3), new p68("ERROR", 4), new p68("EMPTY_EVENT", 5), new p68("RELEASED", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    p68 EF5;

    static {
        values();
    }

    public static p68 valueOf(String str) {
        return (p68) Enum.valueOf(p68.class, str);
    }

    public static p68[] values() {
        return (p68[]) a.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i = o68.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "requested";
        }
        if (i == 2) {
            return "success";
        }
        if (i == 3) {
            return "intermediate_available";
        }
        if (i != 4) {
            return i != 5 ? "unknown" : "released";
        }
        return "error";
    }
}
