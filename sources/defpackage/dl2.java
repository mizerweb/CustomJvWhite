package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class dl2 {
    public static final dl2 a;
    public static final dl2 b;
    public static final dl2 c;
    public static final /* synthetic */ dl2[] d;

    static {
        dl2 dl2Var = new dl2("COLLAPSED", 0);
        a = dl2Var;
        dl2 dl2Var2 = new dl2("EXPANDED", 1);
        b = dl2Var2;
        dl2 dl2Var3 = new dl2("MAX_EXPANDED", 2);
        c = dl2Var3;
        d = new dl2[]{dl2Var, dl2Var2, dl2Var3};
    }

    public static dl2 valueOf(String str) {
        return (dl2) Enum.valueOf(dl2.class, str);
    }

    public static dl2[] values() {
        return (dl2[]) d.clone();
    }
}
