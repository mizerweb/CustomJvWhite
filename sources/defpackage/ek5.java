package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ek5 {
    public final Context a;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final String b = ek5.class.getName();
    public final AtomicReference f = new AtomicReference(null);

    public ek5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.a = context;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final String a() {
        Object poeVar;
        Object poeVar2;
        Throwable thA;
        String str;
        xb9 xb9Var = (xb9) ((et3) this.d.getValue());
        ry8 ry8Var = xb9Var.d;
        ry8 ry8Var2 = xb9Var.d;
        String str2 = null;
        if (ry8Var.contains("device.id")) {
            String string = ry8Var2.getString("device.id", null);
            n3 n3Var = ((aue) ((zte) xb9Var.k0.getValue())).g;
            zv8 zv8Var = aue.h[2];
            ((m3) n3Var.g).setValue(string);
            zr6 zr6Var = (zr6) ry8Var2.edit();
            zr6Var.remove("device.id");
            zr6Var.apply();
        }
        ny8 ny8Var = this.c;
        n3 n3Var2 = ((aue) ((zte) ny8Var.getValue())).g;
        zv8 zv8Var2 = aue.h[2];
        String str3 = (String) ((m3) n3Var2.g).f();
        if (str3 != null && str3.length() != 0) {
            return str3;
        }
        String str4 = this.b;
        gm0.n(str4, "Generating new device id");
        try {
            poeVar = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA2 = roe.a(poeVar);
        if (thA2 != null) {
            gm0.V(str4, "Can't get hardware device id", thA2);
        }
        if (poeVar instanceof poe) {
            poeVar = null;
        }
        String string2 = (String) poeVar;
        if (string2 == null) {
            try {
                poeVar2 = ((oqg) this.e.getValue()).a();
            } catch (Throwable th2) {
                poeVar2 = new poe(th2);
            }
            thA = roe.a(poeVar2);
            if (thA != null) {
                gm0.V(str4, "Can't get service instance id", thA);
            }
            if (poeVar2 instanceof poe) {
                poeVar2 = null;
            }
            str = (String) poeVar2;
            if (str != null && str.length() > 0) {
                str2 = str;
            }
            if (str2 == null) {
                string2 = UUID.randomUUID().toString();
            } else {
                string2 = str2;
            }
        } else {
            if (string2.length() <= 0) {
                string2 = null;
            }
            if (string2 == null) {
                poeVar2 = ((oqg) this.e.getValue()).a();
                thA = roe.a(poeVar2);
                if (thA != null) {
                    gm0.V(str4, "Can't get service instance id", thA);
                }
                if (poeVar2 instanceof poe) {
                    poeVar2 = null;
                }
                str = (String) poeVar2;
                if (str != null) {
                    str2 = str;
                }
                if (str2 == null) {
                    string2 = UUID.randomUUID().toString();
                } else {
                    string2 = str2;
                }
            }
        }
        n3 n3Var3 = ((aue) ((zte) ny8Var.getValue())).g;
        zv8 zv8Var3 = aue.h[2];
        ((m3) n3Var3.g).setValue(string2);
        return string2;
    }
}
