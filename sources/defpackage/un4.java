package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class un4 {
    public final gu4 a;
    public final f2 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final AtomicBoolean g;
    public volatile List h;
    public final String i;

    public un4(gu4 gu4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        pfh pfhVar = new pfh(0);
        this.a = gu4Var;
        this.b = pfhVar;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = new AtomicBoolean(false);
        this.h = r66.a;
        this.i = un4.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(un4 un4Var, nq4 nq4Var) {
        tn4 tn4Var;
        v44 v44Var;
        v44 v44Var2;
        v44 v44Var3;
        ArrayList arrayList;
        String str;
        a4c a4cVar;
        je9 je9Var;
        if (nq4Var instanceof tn4) {
            tn4Var = (tn4) nq4Var;
            int i = tn4Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                tn4Var.i = i - Integer.MIN_VALUE;
            } else {
                tn4Var = new tn4(un4Var, nq4Var);
            }
        } else {
            tn4Var = new tn4(un4Var, nq4Var);
        }
        Object obj = tn4Var.g;
        hu4 hu4Var = hu4.a;
        int i2 = tn4Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.x(un4Var.i, "updateData: start", null);
            v44 v44VarA = un4Var.b.a();
            no4 no4Var = (no4) un4Var.e.getValue();
            tn4Var.d = v44VarA;
            tn4Var.i = 1;
            List listH = no4Var.a.h();
            if (listH != hu4Var) {
                v44Var = v44VarA;
                obj = listH;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            v44Var = tn4Var.d;
            ch3.d0(obj);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v44Var2 = tn4Var.f;
            arrayList = tn4Var.e;
            v44Var3 = tn4Var.d;
            ch3.d0(obj);
        }
        un4Var.h = arrayList;
        un4Var.g.set(true);
        str = un4Var.i;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                int size = arrayList.size();
                String strT = ew5.t(v44Var2.j());
                String strT2 = ew5.t(v44Var3.j());
                StringBuilder sbA = nbh.A(size, "updateData update ", " fetchTime=", strT, " alltime=");
                sbA.append(strT2);
                a4cVar.c(je9Var, str, sbA.toString(), null);
            }
        }
        return sbi.a;
        ArrayList arrayList2 = new ArrayList((Collection) obj);
        v44 v44VarA2 = un4Var.b.a();
        mm4 mm4Var = (mm4) un4Var.f.getValue();
        tn4Var.d = v44Var;
        tn4Var.e = arrayList2;
        tn4Var.f = (e2) v44VarA2;
        tn4Var.i = 2;
        if (mm4Var.a(arrayList2, tn4Var) != hu4Var) {
            v44Var2 = v44VarA2;
            v44Var3 = v44Var;
            arrayList = arrayList2;
            un4Var.h = arrayList;
            un4Var.g.set(true);
            str = un4Var.i;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                je9Var = je9.e;
                if (a4cVar.b(je9Var)) {
                    int size2 = arrayList.size();
                    String strT3 = ew5.t(v44Var2.j());
                    String strT4 = ew5.t(v44Var3.j());
                    StringBuilder sbA2 = nbh.A(size2, "updateData update ", " fetchTime=", strT3, " alltime=");
                    sbA2.append(strT4);
                    a4cVar.c(je9Var, str, sbA2.toString(), null);
                }
            }
            return sbi.a;
        }
        return hu4Var;
    }
}
