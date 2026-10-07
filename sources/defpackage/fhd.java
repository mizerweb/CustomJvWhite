package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fhd {
    public static final fhd a;
    public static final fhd b;
    public static final /* synthetic */ fhd[] c;

    static {
        fhd fhdVar = new fhd("IDLE", 0);
        a = fhdVar;
        fhd fhdVar2 = new fhd("STREAMING", 1);
        b = fhdVar2;
        c = new fhd[]{fhdVar, fhdVar2};
    }

    public static fhd valueOf(String str) {
        return (fhd) Enum.valueOf(fhd.class, str);
    }

    public static fhd[] values() {
        return (fhd[]) c.clone();
    }
}
