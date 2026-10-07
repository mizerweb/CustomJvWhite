package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class jpk {
    private final String a;
    private final dpk b;
    private dpk c;

    public /* synthetic */ jpk(String str, fpk fpkVar) {
        dpk dpkVar = new dpk();
        this.b = dpkVar;
        this.c = dpkVar;
        str.getClass();
        this.a = str;
    }

    public final jpk a(Object obj) {
        dpk dpkVar = new dpk();
        this.c.b = dpkVar;
        this.c = dpkVar;
        dpkVar.a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.a);
        sb.append('{');
        dpk dpkVar = this.b.b;
        String str = "";
        while (dpkVar != null) {
            Object obj = dpkVar.a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            dpkVar = dpkVar.b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
