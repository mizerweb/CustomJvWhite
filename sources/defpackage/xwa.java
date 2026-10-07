package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xwa extends ks0 implements Handler.Callback {
    public lwa A;
    public long B;
    public final j85 s;
    public final vwa t;
    public final Handler u;
    public final rwa v;
    public nql w;
    public boolean x;
    public boolean y;
    public long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwa(vwa vwaVar, Looper looper) {
        Handler handler;
        super(5);
        j85 j85Var = j85.i;
        this.t = vwaVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = vqi.a;
            handler = new Handler(looper, this);
        }
        this.u = handler;
        this.s = j85Var;
        this.v = new rwa(1);
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.ks0
    public final int D(b87 b87Var) {
        if (this.s.x(b87Var)) {
            return ks0.b(b87Var.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return ks0.b(0, 0, 0, 0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    public final void G(lwa lwaVar, ArrayList arrayList) {
        for (int i = 0; i < lwaVar.e(); i++) {
            b87 b87VarA = lwaVar.d(i).a();
            if (b87VarA != null) {
                j85 j85Var = this.s;
                if (j85Var.x(b87VarA)) {
                    nql nqlVarJ = j85Var.j(b87VarA);
                    byte[] bArrC = lwaVar.d(i).c();
                    bArrC.getClass();
                    rwa rwaVar = this.v;
                    rwaVar.q();
                    rwaVar.s(bArrC.length);
                    rwaVar.d.put(bArrC);
                    rwaVar.t();
                    lwa lwaVarA = nqlVarJ.a(rwaVar);
                    if (lwaVarA != null) {
                        G(lwaVarA, arrayList);
                    }
                } else {
                    arrayList.add(lwaVar.d(i));
                }
            } else {
                arrayList.add(lwaVar.d(i));
            }
        }
    }

    public final long H(long j) {
        lvb.b0(j != -9223372036854775807L);
        lvb.b0(this.B != -9223372036854775807L);
        return j - this.B;
    }

    @Override // defpackage.ks0
    public final String h() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            c.t();
            return false;
        }
        this.t.j((lwa) message.obj);
        return true;
    }

    @Override // defpackage.ks0
    public final boolean j() {
        return this.y;
    }

    @Override // defpackage.ks0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.ks0
    public final void m() {
        this.A = null;
        this.w = null;
        this.B = -9223372036854775807L;
    }

    @Override // defpackage.ks0
    public final void p(long j, boolean z, boolean z2) {
        this.A = null;
        this.x = false;
        this.y = false;
    }

    @Override // defpackage.ks0
    public final void u(b87[] b87VarArr, long j, long j2, x4a x4aVar) {
        this.w = this.s.j(b87VarArr[0]);
        lwa lwaVar = this.A;
        if (lwaVar != null) {
            this.A = lwaVar.c((lwaVar.b + this.B) - j2);
        }
        this.B = j2;
    }

    @Override // defpackage.ks0
    public final void y(long j, long j2) {
        boolean z = true;
        while (z) {
            if (!this.x && this.A == null) {
                rwa rwaVar = this.v;
                rwaVar.q();
                v2a v2aVar = this.c;
                v2aVar.k();
                int iW = w(v2aVar, rwaVar, 0);
                if (iW == -4) {
                    if (rwaVar.d(4)) {
                        this.x = true;
                    } else if (rwaVar.f >= this.l) {
                        rwaVar.i = this.z;
                        rwaVar.t();
                        nql nqlVar = this.w;
                        String str = vqi.a;
                        lwa lwaVarA = nqlVar.a(rwaVar);
                        if (lwaVarA != null) {
                            ArrayList arrayList = new ArrayList(lwaVarA.e());
                            G(lwaVarA, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.A = new lwa(H(rwaVar.f), arrayList);
                            }
                        }
                    }
                } else if (iW == -5) {
                    b87 b87Var = (b87) v2aVar.c;
                    b87Var.getClass();
                    this.z = b87Var.s;
                }
            }
            lwa lwaVar = this.A;
            if (lwaVar == null || lwaVar.b > H(j)) {
                z = false;
            } else {
                lwa lwaVar2 = this.A;
                Handler handler = this.u;
                if (handler != null) {
                    handler.obtainMessage(1, lwaVar2).sendToTarget();
                } else {
                    this.t.j(lwaVar2);
                }
                this.A = null;
                z = true;
            }
            if (this.x && this.A == null) {
                this.y = true;
            }
        }
    }
}
