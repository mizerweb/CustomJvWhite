package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class lvj {
    public static final lvj[] a;
    public static final lvj b;
    public static final lvj c;
    public static final lvj d;
    public static final /* synthetic */ lvj[] e;

    static {
        lvj lvjVar = new lvj("PARENT", 0);
        b = lvjVar;
        lvj lvjVar2 = new lvj("PARENT_OR_TARGET", 1);
        c = lvjVar2;
        lvj lvjVar3 = new lvj("EVERYWHERE", 2);
        d = lvjVar3;
        e = new lvj[]{lvjVar, lvjVar2, lvjVar3};
        a = new lvj[]{lvjVar, lvjVar2, lvjVar3};
    }

    public static lvj valueOf(String str) {
        return (lvj) Enum.valueOf(lvj.class, str);
    }

    public static lvj[] values() {
        return (lvj[]) e.clone();
    }
}
