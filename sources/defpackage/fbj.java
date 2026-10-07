package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class fbj {
    public static final fbj a;
    public static final fbj b;
    public static final /* synthetic */ fbj[] c;

    static {
        fbj fbjVar = new fbj("ENABLED", 0);
        a = fbjVar;
        fbj fbjVar2 = new fbj("DISABLED", 1);
        b = fbjVar2;
        c = new fbj[]{fbjVar, fbjVar2};
    }

    public static fbj valueOf(String str) {
        return (fbj) Enum.valueOf(fbj.class, str);
    }

    public static fbj[] values() {
        return (fbj[]) c.clone();
    }
}
