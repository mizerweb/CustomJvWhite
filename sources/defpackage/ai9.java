package defpackage;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes2.dex */
public final class ai9 extends a8j {
    public static final /* synthetic */ zv8[] l;
    public final a4c c;
    public final xhh d;
    public final ifh e;
    public final LinkedBlockingQueue f = new LinkedBlockingQueue(1);
    public final mjg g;
    public final LinkedBlockingQueue h;
    public final mjg i;
    public final p3c j;
    public up8 k;

    static {
        z8b z8bVar = new z8b(ai9.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        l = new zv8[]{z8bVar};
    }

    public ai9(a4c a4cVar, xhh xhhVar) {
        this.c = a4cVar;
        this.d = xhhVar;
        int i = 0;
        this.e = new ifh(new oh9(this, i));
        r66 r66Var = r66.a;
        this.g = p90.a(r66Var);
        this.h = new LinkedBlockingQueue(1);
        this.i = p90.a(r66Var);
        this.j = qyj.S();
        wo8 wo8VarA = vd7.a();
        wo8VarA.j0();
        this.k = wo8VarA;
        a8j.t(this, ((n0c) xhhVar).b(), new th9(this, null, i), 2);
        C();
    }

    public final ra1 B() {
        List listK1;
        a4c a4cVar = this.c;
        int iD = qt4.D(a4cVar.e);
        int i = 11;
        if (iD == 0) {
            File[] fileArrListFiles = a4cVar.h.f().toFile().listFiles();
            if (fileArrListFiles == null) {
                fileArrListFiles = new File[0];
            }
            listK1 = a.k1(fileArrListFiles, new xa8(10));
        } else {
            if (iD != 1) {
                ore.o();
                return null;
            }
            listK1 = a.k1(((Path) a4cVar.i.c.getValue()).toFile().listFiles(), new xa8(i));
        }
        return new ra1(12, new ra1(11, new ra1(9, listK1)));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0035  */
    public final void C() {
        sgg sggVarI0;
        if (this.k.W()) {
            vo8 vo8Var = (vo8) this.j.m(this, l[0]);
            int i = 2;
            lq4 lq4Var = null;
            xhh xhhVar = this.d;
            dq4 dq4Var = this.b;
            if (vo8Var != null) {
                int i2 = 1;
                if (vo8Var.isActive()) {
                    sggVarI0 = yab.i0(dq4Var, ((n0c) xhhVar).b(), 0, new th9(this, lq4Var, i2), 2);
                } else {
                    sggVarI0 = yab.i0(dq4Var, ((n0c) xhhVar).b(), 0, new th9(this, lq4Var, i), 2);
                }
            } else {
                sggVarI0 = yab.i0(dq4Var, ((n0c) xhhVar).b(), 0, new th9(this, lq4Var, i), 2);
            }
            this.k = sggVarI0;
        }
    }
}
