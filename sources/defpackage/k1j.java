package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k1j {
    public static final k1j a;
    public static final k1j b;
    public static final k1j c;
    public static final k1j d;
    public static final k1j e;
    public static final k1j f;
    public static final /* synthetic */ k1j[] g;

    static {
        k1j k1jVar = new k1j("PREPARE", 0);
        a = k1jVar;
        k1j k1jVar2 = new k1j("PLAY", 1);
        b = k1jVar2;
        k1j k1jVar3 = new k1j("IN_PROGRESS", 2);
        c = k1jVar3;
        k1j k1jVar4 = new k1j("PAUSE", 3);
        d = k1jVar4;
        k1j k1jVar5 = new k1j("STOP", 4);
        e = k1jVar5;
        k1j k1jVar6 = new k1j("END", 5);
        f = k1jVar6;
        g = new k1j[]{k1jVar, k1jVar2, k1jVar3, k1jVar4, k1jVar5, k1jVar6};
    }

    public static k1j valueOf(String str) {
        return (k1j) Enum.valueOf(k1j.class, str);
    }

    public static k1j[] values() {
        return (k1j[]) g.clone();
    }
}
