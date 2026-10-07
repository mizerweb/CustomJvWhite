package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jnf {
    public static final jnf a;
    public static final jnf b;
    public static final jnf c;
    public static final /* synthetic */ jnf[] d;

    static {
        jnf jnfVar = new jnf("PENDING", 0);
        a = jnfVar;
        jnf jnfVar2 = new jnf("CREATING", 1);
        b = jnfVar2;
        jnf jnfVar3 = new jnf("CREATED", 2);
        c = jnfVar3;
        d = new jnf[]{jnfVar, jnfVar2, jnfVar3};
    }

    public static jnf valueOf(String str) {
        return (jnf) Enum.valueOf(jnf.class, str);
    }

    public static jnf[] values() {
        return (jnf[]) d.clone();
    }
}
