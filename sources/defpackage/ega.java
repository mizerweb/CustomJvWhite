package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ega {
    public static final ega a;
    public static final ega b;
    public static final ega c;
    public static final ega d;
    public static final ega e;
    public static final ega f;
    public static final ega g;
    public static final ega h;
    public static final ega i;
    public static final ega j;
    public static final ega k;
    public static final ega l;
    public static final ega m;
    public static final /* synthetic */ ega[] n;

    static {
        ega egaVar = new ega("UNKNOWN", 0);
        a = egaVar;
        ega egaVar2 = new ega("USER_MENTION", 1);
        b = egaVar2;
        ega egaVar3 = new ega("GROUP_MENTION", 2);
        c = egaVar3;
        ega egaVar4 = new ega("MONOSPACED", 3);
        d = egaVar4;
        ega egaVar5 = new ega("STRONG", 4);
        e = egaVar5;
        ega egaVar6 = new ega("EMPHASIZED", 5);
        f = egaVar6;
        ega egaVar7 = new ega("LINK", 6);
        g = egaVar7;
        ega egaVar8 = new ega("STRIKETHROUGH", 7);
        h = egaVar8;
        ega egaVar9 = new ega("UNDERLINE", 8);
        i = egaVar9;
        ega egaVar10 = new ega("HEADING", 9);
        j = egaVar10;
        ega egaVar11 = new ega("CODE", 10);
        k = egaVar11;
        ega egaVar12 = new ega("ANIMOJI", 11);
        l = egaVar12;
        ega egaVar13 = new ega("QUOTE", 12);
        m = egaVar13;
        n = new ega[]{egaVar, egaVar2, egaVar3, egaVar4, egaVar5, egaVar6, egaVar7, egaVar8, egaVar9, egaVar10, egaVar11, egaVar12, egaVar13};
    }

    public static ega valueOf(String str) {
        return (ega) Enum.valueOf(ega.class, str);
    }

    public static ega[] values() {
        return (ega[]) n.clone();
    }
}
