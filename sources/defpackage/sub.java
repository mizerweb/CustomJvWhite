package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sub {
    public static final sub a;
    public static final sub b;
    public static final sub c;
    public static final /* synthetic */ sub[] d;

    static {
        sub subVar = new sub("START", 0);
        a = subVar;
        sub subVar2 = new sub("CENTER", 1);
        b = subVar2;
        sub subVar3 = new sub("END", 2);
        c = subVar3;
        d = new sub[]{subVar, subVar2, subVar3};
    }

    public static sub valueOf(String str) {
        return (sub) Enum.valueOf(sub.class, str);
    }

    public static sub[] values() {
        return (sub[]) d.clone();
    }
}
