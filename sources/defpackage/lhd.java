package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class lhd {
    public static final lhd a;
    public static final lhd b;
    public static final /* synthetic */ lhd[] c;

    static {
        lhd lhdVar = new lhd("Gallery", 0);
        a = lhdVar;
        lhd lhdVar2 = new lhd("Permissions", 1);
        b = lhdVar2;
        c = new lhd[]{lhdVar, lhdVar2};
    }

    public static lhd valueOf(String str) {
        return (lhd) Enum.valueOf(lhd.class, str);
    }

    public static lhd[] values() {
        return (lhd[]) c.clone();
    }
}
