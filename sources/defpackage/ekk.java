package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ekk {
    public static final ekk a;
    public static final ekk b;
    public static final /* synthetic */ ekk[] c;

    static {
        ekk ekkVar = new ekk("FG", 0);
        a = ekkVar;
        ekk ekkVar2 = new ekk("BG", 1);
        b = ekkVar2;
        c = new ekk[]{ekkVar, ekkVar2};
    }

    public static ekk valueOf(String str) {
        return (ekk) Enum.valueOf(ekk.class, str);
    }

    public static ekk[] values() {
        return (ekk[]) c.clone();
    }
}
