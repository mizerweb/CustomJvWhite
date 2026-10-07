package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class hrb extends AtomicInteger implements rrb, ko5 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Serializable d;
    public final Serializable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [iag[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Serializable, java.lang.Object[]] */
    public hrb(s8g s8gVar, int i, sf7 sf7Var) {
        super(i);
        this.a = 1;
        this.b = s8gVar;
        this.c = sf7Var;
        ?? r2 = new iag[i];
        for (int i2 = 0; i2 < i; i2++) {
            r2[i2] = new iag(this, i2);
        }
        this.d = r2;
        this.e = new Object[i];
    }

    public void a(int i, Throwable th) {
        if (getAndSet(0) <= 0) {
            tre.s0(th);
            return;
        }
        iag[] iagVarArr = (iag[]) this.d;
        int length = iagVarArr.length;
        for (int i2 = 0; i2 < i; i2++) {
            iag iagVar = iagVarArr[i2];
            iagVar.getClass();
            oo5.a(iagVar);
        }
        while (true) {
            i++;
            if (i >= length) {
                ((s8g) this.b).onError(th);
                return;
            } else {
                iag iagVar2 = iagVarArr[i];
                iagVar2.getClass();
                oo5.a(iagVar2);
            }
        }
    }

    @Override // defpackage.rrb
    public void b() {
        oo5.a((drb) this.d);
        j0m.b((rrb) this.b, this, (j40) this.e);
    }

    @Override // defpackage.rrb
    public void c(ko5 ko5Var) {
        oo5.e((AtomicReference) this.c, ko5Var);
    }

    @Override // defpackage.rrb
    public void d(Object obj) {
        j0m.c((rrb) this.b, obj, this, (j40) this.e);
    }

    @Override // defpackage.ko5
    public final void dispose() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                oo5.a((AtomicReference) this.c);
                oo5.a((drb) obj);
                break;
            default:
                if (getAndSet(0) > 0) {
                    for (iag iagVar : (iag[]) obj) {
                        iagVar.getClass();
                        oo5.a(iagVar);
                    }
                }
                break;
        }
    }

    public void e() {
        oo5.a((AtomicReference) this.c);
        j0m.b((rrb) this.b, this, (j40) this.e);
    }

    @Override // defpackage.rrb
    public void onError(Throwable th) {
        oo5.a((drb) this.d);
        rrb rrbVar = (rrb) this.b;
        j40 j40Var = (j40) this.e;
        if (j40Var.b(th) && getAndIncrement() == 0) {
            j40Var.c(rrbVar);
        }
    }

    public hrb(rrb rrbVar) {
        this.a = 0;
        this.b = rrbVar;
        this.c = new AtomicReference();
        this.d = new drb(this, 1);
        this.e = new j40();
    }
}
