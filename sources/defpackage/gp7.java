package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* JADX INFO: loaded from: classes.dex */
public final class gp7 implements oqg {
    public final Context a;
    public final ny8 c;
    public final ifh d;
    public final String b = gp7.class.getName();
    public int e = -1;
    public int f = -1;
    public final String g = "Google Play Services";
    public final i64 h = new i64();

    public gp7(Context context, ny8 ny8Var, ny8 ny8Var2, ite iteVar, xhh xhhVar) {
        this.a = context;
        this.c = ny8Var;
        this.d = new ifh(new z5(this, ny8Var2, ny8Var, 5));
        yab.i0(iteVar, ((n0c) xhhVar).a(), 0, new qob(this, ny8Var2, null, 29), 2);
    }

    public static final boolean j(gp7 gp7Var, Exception exc) {
        int i = 0;
        for (Throwable cause = exc; i <= 4 && cause != null; cause = cause.getCause()) {
            String message = cause.getMessage();
            if (message != null && r5h.L0(message, "SERVICE_NOT_AVAILABLE", false)) {
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // defpackage.oqg
    public final String a() throws StoreServicesInfo$ServicesException {
        ov6 ov6Var;
        if (!e()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        ifh ifhVar = this.d;
        kam kamVarC = null;
        if (ifhVar.d() && (ov6Var = (ov6) ifhVar.getValue()) != null) {
            try {
                kamVarC = sv6.d(ov6Var).c();
            } catch (Exception e) {
                gm0.V(this.b, "getInstanceIdTask: failed to get FirebaseInstanceId", new fp7(e));
            }
        }
        if (kamVarC == null) {
            throw new StoreServicesInfo$ServicesException("failed to get instance id task");
        }
        try {
            return (String) gwl.a(kamVarC);
        } catch (Exception e2) {
            throw new StoreServicesInfo$ServicesException("getServiceInstanceId: getInstanceId failed", e2);
        }
    }

    @Override // defpackage.oqg
    public final String b() {
        return this.g;
    }

    @Override // defpackage.oqg
    public final int c() {
        if (this.f == -1) {
            Object obj = fo7.c;
            this.f = go7.a(this.a);
        }
        return this.f;
    }

    @Override // defpackage.oqg
    public final Object d(lq4 lq4Var) throws StoreServicesInfo$ServicesNotAvailableException {
        if (!e()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        FirebaseMessaging.d().g().c(((a2c) this.c.getValue()).c(), new xp9(this, 2, ek2Var));
        return ek2Var.s();
    }

    @Override // defpackage.oqg
    public final boolean e() {
        return i() == 0;
    }

    @Override // defpackage.oqg
    public final syd f() {
        return syd.GCM;
    }

    @Override // defpackage.oqg
    public final Object g(lq4 lq4Var) {
        this.d.getValue();
        i64 i64Var = this.h;
        sbi sbiVar = sbi.a;
        i64Var.Q(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.oqg
    public final Object h(lq4 lq4Var) throws StoreServicesInfo$ServicesNotAvailableException {
        if (!e()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        ek2 ek2Var = new ek2(1, p90.B(lq4Var));
        ek2Var.u();
        FirebaseMessaging.d().b().b(new ih(ek2Var, this));
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbi.a;
    }

    @Override // defpackage.oqg
    public final int i() {
        if (this.e == -1) {
            this.e = fo7.d.c(this.a, go7.a);
        }
        return this.e;
    }
}
