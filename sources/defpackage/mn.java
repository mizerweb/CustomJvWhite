package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mn {
    public static final mn a;
    public static final mn b;
    public static final mn c;
    public static final mn d;
    public static final mn e;
    public static final /* synthetic */ mn[] f;

    static {
        mn mnVar = new mn("EMPTY", 0);
        a = mnVar;
        mn mnVar2 = new mn("STATIC_LOAD", 1);
        b = mnVar2;
        mn mnVar3 = new mn("STATIC_SET", 2);
        c = mnVar3;
        mn mnVar4 = new mn("LOTTIE_LOAD", 3);
        d = mnVar4;
        mn mnVar5 = new mn("LOTTIE_SET", 4);
        e = mnVar5;
        f = new mn[]{mnVar, mnVar2, mnVar3, mnVar4, mnVar5};
    }

    public static mn valueOf(String str) {
        return (mn) Enum.valueOf(mn.class, str);
    }

    public static mn[] values() {
        return (mn[]) f.clone();
    }
}
