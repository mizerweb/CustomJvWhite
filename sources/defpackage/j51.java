package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class j51 {
    public static final j51 a;
    public static final /* synthetic */ j51[] b;

    static {
        j51 j51Var = new j51("GOOGLE", 0);
        a = j51Var;
        b = new j51[]{j51Var, new j51("HUAWEI", 1)};
    }

    public static j51 valueOf(String str) {
        return (j51) Enum.valueOf(j51.class, str);
    }

    public static j51[] values() {
        return (j51[]) b.clone();
    }
}
