package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fie {
    private static final Map e = new EnumMap(yr0.class);
    public static final Map f = new EnumMap(yr0.class);
    private final String a;
    private final yr0 b;
    private final u0b c;
    private String d;

    public fie(String str, yr0 yr0Var, u0b u0bVar) {
        yab.n("One of cloud model name and base model cannot be empty", TextUtils.isEmpty(str) == (yr0Var != null));
        this.a = str;
        this.b = yr0Var;
        this.c = u0bVar;
    }

    public boolean a(String str) {
        yr0 yr0Var = this.b;
        if (yr0Var == null) {
            return false;
        }
        return str.equals(e.get(yr0Var));
    }

    public String b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        return (String) f.get(this.b);
    }

    public u0b e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fie)) {
            return false;
        }
        fie fieVar = (fie) obj;
        return f55.h(this.a, fieVar.a) && f55.h(this.b, fieVar.b) && f55.h(this.c, fieVar.c);
    }

    public String f() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        return "COM.GOOGLE.BASE_".concat(String.valueOf((String) f.get(this.b)));
    }

    public boolean g() {
        return this.b != null;
    }

    public void h(String str) {
        this.d = str;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public String toString() {
        dc9 dc9Var = new dc9("RemoteModel", 23);
        dc9Var.O(this.a, "modelName");
        dc9Var.O(this.b, "baseModel");
        dc9Var.O(this.c, "modelType");
        return dc9Var.toString();
    }
}
