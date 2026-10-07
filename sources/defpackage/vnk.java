package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class vnk {
    public static final vnk a;
    public static final /* synthetic */ vnk[] b;

    static {
        vnk vnkVar = new vnk("DEFAULT", 0);
        a = vnkVar;
        b = new vnk[]{vnkVar, new vnk("SIGNED", 1), new vnk("FIXED", 2)};
    }

    public static vnk[] values() {
        return (vnk[]) b.clone();
    }
}
