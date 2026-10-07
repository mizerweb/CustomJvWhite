package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class j3j {
    public static final /* synthetic */ j3j[] a = {new j3j("LOWEST", 0), new j3j("HIGHEST", 1), new j3j("MAX_QVGA", 2), new j3j("MAX_480P", 3), new j3j("MAX_720P", 4), new j3j("MAX_1080P", 5), new j3j("MAX_2160P", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    j3j EF5;

    public static j3j valueOf(String str) {
        return (j3j) Enum.valueOf(j3j.class, str);
    }

    public static j3j[] values() {
        return (j3j[]) a.clone();
    }
}
