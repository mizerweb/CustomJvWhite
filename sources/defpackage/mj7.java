package defpackage;

import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mj7 implements Cloneable {
    public final d a;
    public d b;
    public boolean c = false;

    public mj7(d dVar) {
        this.a = dVar;
        this.b = (d) dVar.d(4);
    }

    public static void d(d dVar, d dVar2) {
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        pwdVar.a(dVar.getClass()).f(dVar, dVar2);
    }

    public final d a() {
        d dVarB = b();
        if (dVarB.g()) {
            return dVarB;
        }
        throw new UninitializedMessageException();
    }

    public final d b() {
        boolean z = this.c;
        d dVar = this.b;
        if (z) {
            return dVar;
        }
        dVar.getClass();
        pwd pwdVar = pwd.c;
        pwdVar.getClass();
        pwdVar.a(dVar.getClass()).a(dVar);
        this.c = true;
        return this.b;
    }

    public final void c() {
        if (this.c) {
            d dVar = (d) this.b.d(4);
            d(dVar, this.b);
            this.b = dVar;
            this.c = false;
        }
    }

    public final Object clone() {
        mj7 mj7Var = (mj7) this.a.d(5);
        d dVarB = b();
        mj7Var.c();
        d(mj7Var.b, dVarB);
        return mj7Var;
    }
}
