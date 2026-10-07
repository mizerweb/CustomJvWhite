package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes2.dex */
public final class a14 {
    public static final /* synthetic */ zv8[] m;
    public final q24 a;
    public final gu4 b;
    public final ft0 c;
    public final String d;
    public final ny8 e;
    public final ny8 f;
    public final ifh g;
    public final ny8 h;
    public final p3c i;
    public volatile long j;
    public final AtomicBoolean k;
    public final ifh l;

    static {
        z8b z8bVar = new z8b(a14.class, "subscribeJob", "getSubscribeJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        m = new zv8[]{z8bVar};
    }

    public a14(q24 q24Var, dq4 dq4Var, ft0 ft0Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = q24Var;
        this.b = dq4Var;
        this.c = ft0Var;
        String name = a14.class.getName();
        this.d = name;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = new ifh(new oe3(ny8Var, ny8Var2, 1));
        this.h = ny8Var3;
        this.i = qyj.S();
        ghb ghbVar = ew5.b;
        this.j = 0L;
        this.k = new AtomicBoolean(true);
        this.l = new ifh(new pe3(7, this));
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, name, "init #" + q24Var, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x0091  */
    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:52:0x0116  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:63:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0133, code lost:
    
        if (defpackage.rx8.u(r8, r5) == r2) goto L61;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0133 -> B:62:0x0136). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.a14 r18, defpackage.gu4 r19, defpackage.nq4 r20) throws ru.ok.tamtam.errors.TamErrorException {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.a(a14, gu4, nq4):java.lang.Object");
    }

    public final boolean b() {
        ny8 ny8Var = this.h;
        b5d b5dVar = ((e5d) ny8Var.getValue()).r5;
        zv8[] zv8VarArr = e5d.S6;
        return ((Boolean) b5dVar.a(zv8VarArr[331]).i()).booleanValue() || ((Boolean) ((e5d) ny8Var.getValue()).s5.a(zv8VarArr[332]).i()).booleanValue() || ((Boolean) ((e5d) ny8Var.getValue()).t5.a(zv8VarArr[333]).i()).booleanValue() || ((Boolean) ((e5d) ny8Var.getValue()).u5.a(zv8VarArr[334]).i()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object c(nq4 nq4Var) throws TamErrorException {
        y04 y04Var;
        Object obj = sbi.a;
        je9 je9Var = je9.d;
        if (nq4Var instanceof y04) {
            y04Var = (y04) nq4Var;
            int i = y04Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                y04Var.f = i - Integer.MIN_VALUE;
            } else {
                y04Var = new y04(this, nq4Var);
            }
        } else {
            y04Var = new y04(this, nq4Var);
        }
        y04 y04Var2 = y04Var;
        Object objD = y04Var2.d;
        Object obj2 = hu4.a;
        int i2 = y04Var2.f;
        if (i2 == 0) {
            ch3.d0(objD);
            String str = this.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "unsubscribe() #" + this.a, null);
            }
            ghb ghbVar = ew5.b;
            this.j = 0L;
            y04Var2.f = 1;
            objD = d(y04Var2);
            if (objD != obj2) {
            }
            return obj2;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objD);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objD);
        if (((Boolean) objD).booleanValue()) {
            ne3 ne3Var = (ne3) this.g.getValue();
            q24 q24Var = this.a;
            y04Var2.f = 2;
            ne3Var.getClass();
            Object objA = ne3Var.a(q24Var.a, false, q24Var.b, y04Var2);
            if (objA != obj2) {
                objA = obj;
            }
            if (objA == obj2) {
                return obj2;
            }
        } else {
            String str2 = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "unsubscribe on invalid comments", null);
                return obj;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        if (r12 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.nq4 r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a14.d(nq4):java.lang.Object");
    }
}
