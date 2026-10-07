package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class es6 extends IllegalStateException {
    public es6(String str, d9i d9iVar, String str2, vw2 vw2Var, Throwable th) {
        String str3 = (String) vw2Var.d;
        int i = vw2Var.c;
        long j = vw2Var.b;
        long j2 = vw2Var.a;
        String str4 = (String) vw2Var.e;
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(": error in: ");
        sb.append(str);
        sb.append(":");
        sb.append(d9iVar);
        sb.append(";processed=");
        sb.append(str2);
        sb.append(";f_kv=");
        sb.append(i);
        qt4.z(j, ";f_rem=", ";f_sz=", sb);
        sb.append(j2);
        sb.append(";f_path=");
        sb.append(str4);
        super(sb.toString(), th);
    }

    public es6(String str, IOException iOException) {
        super(str, iOException);
    }
}
