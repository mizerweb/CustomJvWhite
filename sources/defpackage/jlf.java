package defpackage;

import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class jlf extends ilf {
    public final Queue l;
    public ilf m;

    /* JADX WARN: Illegal instructions before constructor call */
    public jlf(clf clfVar) {
        long j = clfVar.a;
        Queue queue = (Queue) clfVar.i;
        eia eiaVar = ((ilf) queue.peek()).d;
        ((ilf) queue.peek()).getClass();
        long j2 = clfVar.c;
        boolean z = clfVar.d;
        ((ilf) queue.peek()).getClass();
        String str = clfVar.e;
        ((ilf) queue.peek()).getClass();
        ((ilf) queue.peek()).getClass();
        super(j, eiaVar, j2, z, str, clfVar.f, clfVar.g);
        this.l = queue;
        ilf ilfVar = (ilf) queue.poll();
        this.m = ilfVar;
        this.j = ilfVar.j;
    }

    @Override // defpackage.ilf, defpackage.mjf
    public final void B() {
        super.B();
        h4b h4bVarG = this.a.g();
        String str = this.k;
        h4bVarG.getClass();
        h4bVarG.h(p90.O(1, "queued"), str);
        Queue queue = this.l;
        if (queue.isEmpty()) {
            return;
        }
        clf clfVar = new clf(this.c, queue, 1);
        clfVar.c = this.h;
        clfVar.d = this.f;
        clfVar.e = this.g;
        clfVar.f = this.i;
        x().c(new jlf(clfVar));
    }

    @Override // defpackage.ilf
    public final rfa C() {
        ilf ilfVar = this.m;
        ilfVar.a = this.a;
        rfa rfaVarC = ilfVar.C();
        if (rfaVarC != null) {
            rfaVarC.F = this.m.i;
        }
        return rfaVarC;
    }

    @Override // defpackage.ilf
    public final String D() {
        return "ServiceTaskSendMessageQueue";
    }

    @Override // defpackage.ilf
    public final long G(rt2 rt2Var, long j, String str) {
        long j2 = rt2Var.a;
        ilf ilfVar = this.m;
        ilfVar.a = this.a;
        if (!(ilfVar instanceof glf)) {
            if (!(ilfVar instanceof nlf)) {
                return super.G(rt2Var, j, str);
            }
            nlf nlfVar = (nlf) ilfVar;
            mlf mlfVar = new mlf(j2, nlfVar.l, nlfVar.m);
            mlfVar.b = nlfVar.d;
            mlfVar.d = nlfVar.f;
            mlfVar.e = nlfVar.g;
            mlfVar.c = nlfVar.e;
            mlfVar.j = nlfVar.n;
            mlfVar.f = this.i;
            mlfVar.g = nlfVar.j;
            nlf nlfVar2 = new nlf(mlfVar);
            this.m = nlfVar2;
            nlfVar2.a = this.a;
            return nlfVar2.G(rt2Var, j, str);
        }
        glf glfVar = (glf) ilfVar;
        flf flfVar = new flf(j2, glfVar.n);
        String str2 = glfVar.l;
        List list = glfVar.m;
        flfVar.i = str2;
        flfVar.j = list;
        flfVar.b = glfVar.d;
        flfVar.d = glfVar.f;
        flfVar.k = glfVar.o;
        flfVar.e = glfVar.g;
        flfVar.c = glfVar.e;
        flfVar.f = this.i;
        flfVar.g = glfVar.j;
        glf glfVar2 = new glf(flfVar);
        this.m = glfVar2;
        glfVar2.a = this.a;
        return glfVar2.G(rt2Var, j, str);
    }
}
