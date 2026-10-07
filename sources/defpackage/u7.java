package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u7 {
    public static final /* synthetic */ u7[] a;
    public static final /* synthetic */ ma6 b;

    /* JADX INFO: Fake field, exist only in values array */
    u7 EF5;

    static {
        u7[] u7VarArr = {new u7("INITIALIZE", 0), new u7("INIT_COMPLETED", 1), new u7("INIT_FAILED", 2), new u7("DOWNLOAD", 3), new u7("CANCEL", 4), new u7("CANCEL_ALL", 5), new u7("REMOVE", 6), new u7("REMOVE_ALL", 7), new u7("PROCESS_NEXT_TASK", 8), new u7("ON_TASK_FINISHED", 9), new u7("REFRESH_DASH_MANIFEST", 10)};
        a = u7VarArr;
        b = new ma6(u7VarArr);
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) a.clone();
    }
}
