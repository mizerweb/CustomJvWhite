package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class gyb {
    public static final gyb a;
    public static final gyb b;
    public static final /* synthetic */ gyb[] c;

    static {
        gyb gybVar = new gyb("PRIMARY", 0);
        a = gybVar;
        gyb gybVar2 = new gyb("SECONDARY", 1);
        b = gybVar2;
        c = new gyb[]{gybVar, gybVar2};
    }

    public static gyb valueOf(String str) {
        return (gyb) Enum.valueOf(gyb.class, str);
    }

    public static gyb[] values() {
        return (gyb[]) c.clone();
    }
}
