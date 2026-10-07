package defpackage;

import org.apache.http.client.methods.HttpDelete;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jo3 {
    public static final jo3 a;
    public static final jo3 b;
    public static final /* synthetic */ jo3[] c;

    static {
        jo3 jo3Var = new jo3("READ", 0);
        a = jo3Var;
        jo3 jo3Var2 = new jo3("EDIT", 1);
        jo3 jo3Var3 = new jo3(HttpDelete.METHOD_NAME, 2);
        b = jo3Var3;
        c = new jo3[]{jo3Var, jo3Var2, jo3Var3};
    }

    public static jo3 valueOf(String str) {
        return (jo3) Enum.valueOf(jo3.class, str);
    }

    public static jo3[] values() {
        return (jo3[]) c.clone();
    }
}
