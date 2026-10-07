package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class gq9 {
    public final rig a;
    public final esh b;
    public final y3e c;
    public long d;
    public final eq9 e;
    public vpc f;
    public int g;
    public bq9 h;
    public final CopyOnWriteArrayList i;

    public gq9(rig rigVar, eq9 eq9Var, esh eshVar, CidLogger cidLogger) {
        rigVar.getClass();
        eshVar.getClass();
        cidLogger.getClass();
        this.a = rigVar;
        this.b = eshVar;
        this.c = cidLogger;
        eq9Var = eq9Var == null ? new eq9() : eq9Var;
        this.e = eq9Var;
        this.g = 1;
        this.h = new bq9(0.0d, 0.0d);
        this.i = new CopyOnWriteArrayList();
        cidLogger.log("MediaAdaptation", "Media adaptation control enabled. Configuration is " + eq9Var);
        CopyOnWriteArrayList copyOnWriteArrayList = rigVar.j;
        if (copyOnWriteArrayList.contains(this)) {
            return;
        }
        copyOnWriteArrayList.add(this);
    }

    public final vpc a(int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        ypc ypcVar;
        vpc vpcVar = this.f;
        if (vpcVar == null) {
            i2 = 1280;
            i3 = 1280;
            str = "maintain-framerate";
            i4 = 1000;
            i5 = 30;
            ypcVar = null;
        } else {
            int i6 = vpcVar.a;
            int i7 = vpcVar.b;
            int i8 = vpcVar.c;
            int i9 = vpcVar.d;
            ypc ypcVar2 = vpcVar.f;
            String str2 = vpcVar.e;
            str = str2 == null ? "maintain-framerate" : str2;
            i2 = i6;
            i3 = i7;
            i4 = i8;
            i5 = i9;
            ypcVar = ypcVar2;
        }
        int i10 = fq9.$EnumSwitchMapping$0[qt4.D(i)];
        eq9 eq9Var = this.e;
        if (i10 == 1) {
            cq9 cq9Var = eq9Var.a;
            return new vpc(i2, i3, i4, i5, str, ypcVar, 2, 2, mw7.j(i));
        }
        if (i10 != 2) {
            vpc vpcVar2 = this.f;
            return vpcVar2 == null ? new vpc(i2, i3, i4, i5, str, ypcVar, 1, 0, mw7.j(i)) : new vpc(vpcVar2.a, vpcVar2.b, vpcVar2.c, vpcVar2.d, "maintain-framerate", vpcVar2.f, 1, vpcVar2.h, mw7.j(i));
        }
        cq9 cq9Var2 = eq9Var.a;
        return new vpc(i2, i3, i4, i5, str, ypcVar, 4, 3, mw7.j(i));
    }

    public final void b(int i, bq9 bq9Var) {
        this.c.log("MediaAdaptation", "Update network condition. Current condition is " + mw7.n(this.g) + ", new one is " + mw7.n(i) + ", state is " + bq9Var);
        this.g = i;
        this.h = bq9Var;
        c();
    }

    public final void c() {
        Iterator it = this.i.iterator();
        it.getClass();
        while (it.hasNext()) {
            zp9 zp9Var = (zp9) it.next();
            int i = this.g;
            bq9 bq9Var = this.h;
            vpc vpcVarA = a(i);
            boolean z = true;
            if (this.g != 1) {
                cq9 cq9Var = this.e.a;
            } else {
                z = false;
            }
            zp9Var.f(new aq9(i, bq9Var, vpcVarA, z));
        }
    }
}
