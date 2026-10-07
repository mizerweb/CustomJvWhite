package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class whd {
    public static final whd a;
    public static final whd b;
    public static final whd c;
    public static final /* synthetic */ whd[] d;

    static {
        whd whdVar = new whd("LOW", 0);
        a = whdVar;
        whd whdVar2 = new whd("MEDIUM", 1);
        b = whdVar2;
        whd whdVar3 = new whd("HIGH", 2);
        c = whdVar3;
        d = new whd[]{whdVar, whdVar2, whdVar3};
    }

    public static whd valueOf(String str) {
        return (whd) Enum.valueOf(whd.class, str);
    }

    public static whd[] values() {
        return (whd[]) d.clone();
    }
}
