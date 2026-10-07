package defpackage;

import android.app.Notification;
import android.app.NotificationManager;

/* JADX INFO: loaded from: classes2.dex */
public final class hs1 {
    public final String a = hs1.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public volatile boolean i;

    public hs1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = rx8.P(3, new w40(ny8Var6, 5));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r14 == r0) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r11, defpackage.dz4 r12, defpackage.be1 r13, defpackage.nq4 r14) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hs1.a(java.lang.String, dz4, be1, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, dz4 dz4Var, be1 be1Var, nq4 nq4Var) {
        gs1 gs1Var;
        if (nq4Var instanceof gs1) {
            gs1Var = (gs1) nq4Var;
            int i = gs1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                gs1Var.f = i - Integer.MIN_VALUE;
            } else {
                gs1Var = new gs1(this, nq4Var);
            }
        } else {
            gs1Var = new gs1(this, nq4Var);
        }
        Object objA = gs1Var.d;
        int i2 = gs1Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objA);
                gs1Var.f = 1;
                objA = a(str, dz4Var, be1Var, gs1Var);
                Object obj = hu4.a;
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objA);
            }
            es1 es1Var = (es1) objA;
            int i3 = es1Var.a;
            Notification notification = es1Var.b;
            NotificationManager notificationManager = (NotificationManager) this.h.getValue();
            if (notificationManager != null) {
                notificationManager.notify(i3, notification);
            }
            if (!((b95) this.d.getValue()).h()) {
                ((c95) this.c.getValue()).c(i3);
            }
            return new es1(i3, notification);
        } catch (Exception e) {
            gm0.V(this.a, "postCallNotification failed", e);
            return null;
        }
    }
}
