package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class od4 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public od4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public final wd4 a() {
        return (wd4) this.e.getValue();
    }

    public final boolean b() {
        boolean z = false;
        boolean z2 = ((gue) ((r77) this.c.getValue())).d > 0;
        if (!a().e() && ((!d() || !((gue) this.b.getValue()).e() || !z2) && c())) {
            z = true;
        }
        gm0.m("od4", "isBackgroundDataDisabledAndOnMobileNetwork: %b, isOnline=%b, appIsVisible=%b, hasForegroundServicesAlive=%b, isOnMobileNetwork=%b", Boolean.valueOf(z), Boolean.valueOf(d()), Boolean.valueOf(((gue) this.b.getValue()).e()), Boolean.valueOf(z2), Boolean.valueOf(c()));
        return z;
    }

    public final boolean c() {
        return (a().a() == we4.TYPE_WIFI || a().a() == we4.TYPE_UNKNOWN) ? false : true;
    }

    public final boolean d() {
        return ((rnf) ((onf) this.f.getValue())).q == 3;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00ad  */
    public final boolean e() {
        String str;
        boolean zE = ((gue) this.b.getValue()).e();
        boolean z = false;
        boolean z2 = ((gue) ((r77) this.c.getValue())).d > 0;
        boolean zE2 = ((oqg) this.d.getValue()).e();
        boolean z3 = !zE2;
        we4 we4VarA = a().a();
        xb9 xb9Var = ((zed) this.a.getValue()).a;
        gvb gvbVar = xb9Var.x;
        zv8[] zv8VarArr = s7f.j0;
        boolean zBooleanValue = ((Boolean) gvbVar.m(xb9Var, zv8VarArr[20])).booleanValue();
        xb9 xb9Var2 = ((zed) this.a.getValue()).a;
        boolean zBooleanValue2 = ((Boolean) xb9Var2.e0.m(xb9Var2, zv8VarArr[53])).booleanValue();
        if (zE || z2 || !zE2 || zBooleanValue || zBooleanValue2) {
            z = true;
        } else {
            boolean zH = a().h();
            int iIntValue = ((Number) ((zed) this.a.getValue()).b.b().a.C.a(e5d.S6[20]).i()).intValue();
            if (iIntValue == 0) {
                z = zH;
            } else if (iIntValue == 1 && we4VarA == we4.TYPE_WIFI && zH) {
                z = true;
            }
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbB = zo5.B("shouldConnect: ", z, "\nappVisible: ", zE, "\nhasForegroundServicesAlive: ");
                qt4.B("\nnoServices: ", "\nforceConnection: ", sbB, z2, z3);
                qt4.B("\nbackgroundWakeEnabled: ", "\nconnectionType: ", sbB, zBooleanValue, zBooleanValue2);
                sbB.append(we4VarA.a());
                sbB.append("\nkeepAlive: ");
                int iIntValue2 = ((Number) ((zed) this.a.getValue()).b.b().a.C.a(e5d.S6[20]).i()).intValue();
                if (iIntValue2 == 0) {
                    str = "always";
                } else if (iIntValue2 != 1) {
                    str = iIntValue2 != 2 ? "unknown" : "never";
                } else {
                    str = "wifi";
                }
                sbB.append(str);
                a4cVar.c(je9Var, "od4", sbB.toString(), null);
            }
        }
        return z;
    }
}
