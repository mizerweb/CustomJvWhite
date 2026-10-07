package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class bga {
    public static final bga a;
    public static final bga b;
    public static final bga c;
    public static final bga d;
    public static final bga e;
    public static final bga f;
    public static final bga g;
    public static final bga h;
    public static final bga i;
    public static final bga j;
    public static final bga k;
    public static final bga l;
    public static final /* synthetic */ bga[] m;

    static {
        bga bgaVar = new bga("USER_MENTION", 0);
        a = bgaVar;
        bga bgaVar2 = new bga("GROUP_MENTION", 1);
        b = bgaVar2;
        bga bgaVar3 = new bga("MONOSPACED", 2);
        c = bgaVar3;
        bga bgaVar4 = new bga("STRONG", 3);
        d = bgaVar4;
        bga bgaVar5 = new bga("EMPHASIZED", 4);
        e = bgaVar5;
        bga bgaVar6 = new bga("LINK", 5);
        f = bgaVar6;
        bga bgaVar7 = new bga("STRIKETHROUGH", 6);
        g = bgaVar7;
        bga bgaVar8 = new bga("CODE", 7);
        h = bgaVar8;
        bga bgaVar9 = new bga("UNDERLINE", 8);
        i = bgaVar9;
        bga bgaVar10 = new bga("HEADING", 9);
        j = bgaVar10;
        bga bgaVar11 = new bga("ANIMOJI", 10);
        k = bgaVar11;
        bga bgaVar12 = new bga("QUOTE", 11);
        l = bgaVar12;
        m = new bga[]{bgaVar, bgaVar2, bgaVar3, bgaVar4, bgaVar5, bgaVar6, bgaVar7, bgaVar8, bgaVar9, bgaVar10, bgaVar11, bgaVar12};
    }

    public static bga valueOf(String str) {
        return (bga) Enum.valueOf(bga.class, str);
    }

    public static bga[] values() {
        return (bga[]) m.clone();
    }
}
