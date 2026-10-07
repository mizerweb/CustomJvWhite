package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class kug {
    public static final kug a;
    public static final kug b;
    public static final kug c;
    public static final kug d;
    public static final /* synthetic */ kug[] e;

    static {
        kug kugVar = new kug("INPUT", 0);
        a = kugVar;
        kug kugVar2 = new kug("VIEWS", 1);
        b = kugVar2;
        kug kugVar3 = new kug("PUBLISHING", 2);
        c = kugVar3;
        kug kugVar4 = new kug("HIDDEN", 3);
        d = kugVar4;
        e = new kug[]{kugVar, kugVar2, kugVar3, kugVar4};
    }

    public static kug valueOf(String str) {
        return (kug) Enum.valueOf(kug.class, str);
    }

    public static kug[] values() {
        return (kug[]) e.clone();
    }
}
