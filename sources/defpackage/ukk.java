package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ukk {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final eo7 a;

    public ukk(eo7 eo7Var) {
        this.a = eo7Var;
    }

    public final til a(til tilVar) {
        tilVar.f();
        eo7 eo7Var = this.a;
        jo7 jo7Var = eo7Var.j;
        jo7Var.getClass();
        blk blkVar = new blk(new ilk(tilVar), jo7Var.i.get(), eo7Var);
        bmk bmkVar = jo7Var.m;
        bmkVar.sendMessage(bmkVar.obtainMessage(4, blkVar));
        return tilVar;
    }
}
