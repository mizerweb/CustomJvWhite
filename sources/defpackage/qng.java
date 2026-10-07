package defpackage;

import android.os.Bundle;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class qng implements h65 {
    public static final qng a = new qng();
    public static final rng b = rng.c;

    @Override // defpackage.h65
    public final u65 a(String str, m65 m65Var, Bundle bundle) {
        if (!((LinkedHashSet) b.b).contains(m65Var)) {
            return null;
        }
        rng.c.getClass();
        if (m65Var.equals(rng.d)) {
            return new u65(str, m65Var, bundle, 1, null, false, new yj1(11, bundle), 48);
        }
        ore.k(qt4.m("invalid route ", m65Var));
        return null;
    }

    @Override // defpackage.h65
    public final f83 b() {
        return b;
    }
}
