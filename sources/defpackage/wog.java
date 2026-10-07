package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class wog implements h65 {
    public static final wog a = new wog();
    public static final xog b = xog.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        xog.c.getClass();
        if (m65Var.equals(xog.d)) {
            return new u65(str, m65Var, bundle, 1, null, false, new yj1(12, bundle), 48);
        }
        ore.k(qt4.m("invalid route ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
