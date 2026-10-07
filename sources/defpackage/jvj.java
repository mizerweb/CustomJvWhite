package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class jvj {
    public static final jvj a;
    public static final jvj b;
    public static final jvj c;
    public static final jvj d;
    public static final jvj e;
    public static final jvj f;
    public static final /* synthetic */ jvj[] g;

    static {
        jvj jvjVar = new jvj("ADAPTIVE_ICON", 0);
        a = jvjVar;
        jvj jvjVar2 = new jvj("PICTURE", 1);
        b = jvjVar2;
        jvj jvjVar3 = new jvj("TITLE_BIG", 2);
        c = jvjVar3;
        jvj jvjVar4 = new jvj("TITLE_STANDARD", 3);
        d = jvjVar4;
        jvj jvjVar5 = new jvj("DESCRIPTION", 4);
        e = jvjVar5;
        jvj jvjVar6 = new jvj("FILE", 5);
        jvj jvjVar7 = new jvj("KEYBOARD", 6);
        f = jvjVar7;
        g = new jvj[]{jvjVar, jvjVar2, jvjVar3, jvjVar4, jvjVar5, jvjVar6, jvjVar7};
    }

    public static jvj valueOf(String str) {
        return (jvj) Enum.valueOf(jvj.class, str);
    }

    public static jvj[] values() {
        return (jvj[]) g.clone();
    }
}
