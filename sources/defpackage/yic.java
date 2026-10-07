package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class yic {
    public static final yic a;
    public static final yic b;
    public static final /* synthetic */ yic[] c;

    static {
        yic yicVar = new yic("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = yicVar;
        yic yicVar2 = new yic("DROP_WORK_REQUEST", 1);
        b = yicVar2;
        c = new yic[]{yicVar, yicVar2};
    }

    public static yic valueOf(String str) {
        return (yic) Enum.valueOf(yic.class, str);
    }

    public static yic[] values() {
        return (yic[]) c.clone();
    }
}
