package defpackage;

import android.net.Uri;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class l23 implements o18 {
    public final /* synthetic */ n23 a;

    public l23(n23 n23Var) {
        this.a = n23Var;
    }

    @Override // defpackage.o18
    public final Object b(nq4 nq4Var) throws IllegalAccessException, InvocationTargetException {
        n23.H(this.a, false, 3);
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object c(nq4 nq4Var, String str, boolean z, boolean z2) throws IllegalAccessException, InvocationTargetException {
        this.a.G(str, z2);
        return sbi.a;
    }

    @Override // defpackage.o18
    public final Object e(float f, long j, long j2, nq4 nq4Var) {
        Object value;
        mjg mjgVar = this.a.q;
        do {
            value = mjgVar.getValue();
            ((Number) value).floatValue();
        } while (!mjgVar.h(value, new Float(f)));
        return sbi.a;
    }

    @Override // defpackage.o18
    public final String f() {
        e23 e23Var = (e23) this.a.t.get();
        if (e23Var == null) {
            return "empty";
        }
        long j = e23Var.a;
        long j2 = e23Var.b;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }

    @Override // defpackage.o18
    public final Object g(File file, nq4 nq4Var) {
        sbi sbiVar = sbi.a;
        e23 e23Var = (e23) this.a.t.getAndUpdate(new g23(1));
        n23 n23Var = this.a;
        if (e23Var == null) {
            qrc.o(n23Var.F(), ls5.EMPTY_DOWNLOAD_DATA, this.a.u, null, null, 28);
            return sbiVar;
        }
        if (file == null) {
            qrc.o(n23Var.F(), ls5.EMPTY_DATA_ON_COMPLETE, this.a.u, null, null, 28);
            return sbiVar;
        }
        h4c h4cVar = (h4c) ((c2a) n23Var.k.getValue());
        yab.i0(h4cVar.k, null, 0, new g4c(h4cVar, file, null, 1), 3);
        this.a.F().B(this.a.u);
        n23 n23Var2 = this.a;
        pzf pzfVar = n23Var2.o;
        Uri uriFromFile = Uri.fromFile(file);
        if (!uriFromFile.toString().startsWith("content://")) {
            uriFromFile = ((ju6) ((rs6) n23Var2.j.getValue())).i(n23Var2.c, u1m.b(uriFromFile));
        }
        pzfVar.a(new iq5(uriFromFile, e23Var.d));
        return sbiVar;
    }
}
