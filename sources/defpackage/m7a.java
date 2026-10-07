package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m7a {
    public static final m7a a;
    public static final m7a b;
    public static final m7a c;
    public static final m7a d;
    public static final m7a e;
    public static final /* synthetic */ m7a[] f;
    public static final /* synthetic */ ma6 g;

    static {
        m7a m7aVar = new m7a("GALLERY", 0);
        a = m7aVar;
        m7a m7aVar2 = new m7a("LOCATION", 1);
        b = m7aVar2;
        m7a m7aVar3 = new m7a("CONTACT", 2);
        c = m7aVar3;
        m7a m7aVar4 = new m7a("FILE", 3);
        d = m7aVar4;
        m7a m7aVar5 = new m7a("POLL", 4);
        e = m7aVar5;
        m7a[] m7aVarArr = {m7aVar, m7aVar2, m7aVar3, m7aVar4, m7aVar5};
        f = m7aVarArr;
        g = new ma6(m7aVarArr);
    }

    public static m7a valueOf(String str) {
        return (m7a) Enum.valueOf(m7a.class, str);
    }

    public static m7a[] values() {
        return (m7a[]) f.clone();
    }
}
