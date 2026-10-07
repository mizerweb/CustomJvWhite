package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class me4 {
    public boolean a = true;
    public String[] b;
    public String[] c;
    public boolean d;

    public final ne4 a() {
        return new ne4(this.a, this.d, this.b, this.c);
    }

    public final void b(ar3... ar3VarArr) {
        if (!this.a) {
            ore.p("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(ar3VarArr.length);
        for (ar3 ar3Var : ar3VarArr) {
            arrayList.add(ar3Var.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void c(String... strArr) {
        if (!this.a) {
            ore.p("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.b = (String[]) strArr.clone();
        } else {
            ore.p("At least one cipher suite is required");
        }
    }

    public final void d(quh... quhVarArr) {
        if (!this.a) {
            ore.p("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(quhVarArr.length);
        for (quh quhVar : quhVarArr) {
            arrayList.add(quhVar.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void e(String... strArr) {
        if (!this.a) {
            ore.p("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
        } else {
            ore.p("At least one TLS version is required");
        }
    }
}
