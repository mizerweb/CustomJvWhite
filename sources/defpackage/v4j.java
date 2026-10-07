package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class v4j {
    public static final v4j a;
    public static final v4j b;
    public static final v4j c;
    public static final v4j d;
    public static final v4j e;
    public static final /* synthetic */ v4j[] f;

    static {
        v4j v4jVar = new v4j("VIDEO", 0);
        a = v4jVar;
        v4j v4jVar2 = new v4j("SCREEN_CAPTURE", 1);
        b = v4jVar2;
        v4j v4jVar3 = new v4j("ANIMOJI", 2);
        c = v4jVar3;
        v4j v4jVar4 = new v4j("MOVIE", 3);
        d = v4jVar4;
        v4j v4jVar5 = new v4j("STREAM", 4);
        e = v4jVar5;
        f = new v4j[]{v4jVar, v4jVar2, v4jVar3, v4jVar4, v4jVar5};
    }

    public static v4j valueOf(String str) {
        return (v4j) Enum.valueOf(v4j.class, str);
    }

    public static v4j[] values() {
        return (v4j[]) f.clone();
    }
}
