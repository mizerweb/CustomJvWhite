package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class uqk {
    public static final uqk a;
    public static final /* synthetic */ uqk[] b;

    static {
        uqk uqkVar = new uqk("DEFAULT", 0);
        a = uqkVar;
        b = new uqk[]{uqkVar, new uqk("SIGNED", 1), new uqk("FIXED", 2)};
    }

    public static uqk[] values() {
        return (uqk[]) b.clone();
    }
}
