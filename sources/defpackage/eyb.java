package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class eyb {
    public static final eyb a;
    public static final /* synthetic */ eyb[] b;

    static {
        eyb eybVar = new eyb("IDLE", 0);
        a = eybVar;
        b = new eyb[]{eybVar, new eyb("LOADING", 1)};
    }

    public static eyb valueOf(String str) {
        return (eyb) Enum.valueOf(eyb.class, str);
    }

    public static eyb[] values() {
        return (eyb[]) b.clone();
    }
}
