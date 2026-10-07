package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class x7j {
    public static final x7j a;
    public static final x7j b;
    public static final x7j c;
    public static final /* synthetic */ x7j[] d;

    static {
        x7j x7jVar = new x7j("SPEAKER", 0);
        a = x7jVar;
        x7j x7jVar2 = new x7j("SHARING", 1);
        b = x7jVar2;
        x7j x7jVar3 = new x7j("GRID", 2);
        c = x7jVar3;
        d = new x7j[]{x7jVar, x7jVar2, x7jVar3};
    }

    public static x7j valueOf(String str) {
        return (x7j) Enum.valueOf(x7j.class, str);
    }

    public static x7j[] values() {
        return (x7j[]) d.clone();
    }
}
