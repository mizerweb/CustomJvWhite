package defpackage;

import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class pza {
    public final ny8 a;
    public final AtomicReference b = new AtomicReference(r66.a);
    public final ifh c = new ifh(new ap9(3, this));
    public byte[] d = new byte[1];

    public pza(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final Object a(k3c k3cVar) {
        this.b.set(r66.a);
        Object objK0 = yab.K0(((n0c) ((xhh) this.a.getValue())).b(), new awa(this, (lq4) null, 1), k3cVar);
        return objK0 == hu4.a ? objK0 : sbi.a;
    }

    public abstract Object b();

    public abstract f40 c();

    public final String d() {
        return (String) this.c.getValue();
    }

    public abstract boolean e(byte[] bArr);

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(nq4 nq4Var) {
        oza ozaVar;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof oza) {
            ozaVar = (oza) nq4Var;
            int i = ozaVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ozaVar.f = i - Integer.MIN_VALUE;
            } else {
                ozaVar = new oza(this, nq4Var);
            }
        } else {
            ozaVar = new oza(this, nq4Var);
        }
        Object objB = ozaVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = ozaVar.f;
        try {
            if (i2 == 0) {
                ch3.d0(objB);
                ozaVar.f = 1;
                objB = b();
                if (objB == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            sia siaVar = (sia) objB;
            int serializedSize = siaVar.getSerializedSize();
            if (serializedSize == 0) {
                f40 f40VarC = c();
                if (f40VarC.c.delete() && f40VarC.d.delete()) {
                    f40VarC.e.delete();
                }
                return sbiVar;
            }
            if (this.d.length < serializedSize) {
                this.d = new byte[serializedSize];
            }
            sia.toByteArray(siaVar, this.d, 0, serializedSize);
            String strD = d();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, strD, "saveProtoToFile " + ((List) this.b.get()).size() + ", " + serializedSize + "bytes", null);
                }
            }
            f40 f40VarC2 = c();
            FileOutputStream fileOutputStreamF = f40VarC2.f();
            if (fileOutputStreamF == null) {
                gm0.Y(f40.class.getName(), "Early return in tryWrite cuz of startWrite() is null");
                return sbiVar;
            }
            try {
                fileOutputStreamF.write(this.d, 0, serializedSize);
                f40VarC2.b(fileOutputStreamF);
                return sbiVar;
            } catch (Throwable th) {
                f40VarC2.a(fileOutputStreamF);
                throw th;
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            gm0.V(d(), "failed to save state", th2);
            return sbiVar;
        }
    }
}
