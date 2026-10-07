package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yn3 {
    public final yfd a;
    public final yfd b;
    public final ny8 c;

    public yn3(yfd yfdVar, yfd yfdVar2, ny8 ny8Var) {
        this.a = yfdVar;
        this.b = yfdVar2;
        this.c = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e2  */
    public final ek4 a(vg4 vg4Var) {
        ynh ynhVar;
        ynh tnhVar;
        String strK;
        boolean zB;
        boolean z;
        ny8 ny8Var = this.c;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2);
        qfd qfdVarB = this.a.B(vg4Var.v());
        String string = zD ? ((jcd) ny8Var.getValue()).a().toString() : vg4Var.z(us0.b);
        if (!zD) {
            if (!vg4Var.B() || vg4Var.I()) {
                ynhVar = null;
            } else if (vg4Var.f) {
                tnhVar = new tnh(R.string.tt_you_in_subtitle);
            } else if (vg4Var.E() && vg4Var.H()) {
                tnhVar = new tnh(R.string.service_notifications);
            } else {
                tnhVar = vg4Var.E() ? new tnh(R.string.bot) : new xnh(this.b.y(vg4Var));
            }
            long jV = vg4Var.v();
            strK = vg4Var.k();
            if (strK == null) {
                strK = "";
            }
            String str = strK;
            String strA = xoh.a(vg4Var.o());
            List listSingletonList = Collections.singletonList(Long.valueOf(vg4Var.w()));
            Uri uri = string != null ? Uri.parse(string) : null;
            if (zD) {
                zB = false;
            } else {
                zB = qfdVarB.b();
            }
            boolean zG = vg4Var.G();
            CharSequence charSequenceU = vg4Var.u();
            boolean zE = vg4Var.E();
            if ((vg4Var.a.b.z.b & 64) != 0) {
                z = true;
            } else {
                z = false;
            }
            return new ek4(jV, str, strA, listSingletonList, ynhVar, null, uri, zB, zG, charSequenceU, false, null, 0, zE, z, vg4Var.F(), false, vg4Var.B(), 584704);
        }
        tnhVar = new tnh(jcd.b((jcd) ny8Var.getValue(), null, 1));
        ynhVar = tnhVar;
        long jV2 = vg4Var.v();
        strK = vg4Var.k();
        if (strK == null) {
            strK = "";
        }
        String str2 = strK;
        String strA2 = xoh.a(vg4Var.o());
        List listSingletonList2 = Collections.singletonList(Long.valueOf(vg4Var.w()));
        Uri uri2 = string != null ? Uri.parse(string) : null;
        if (zD) {
            zB = false;
        } else {
            zB = qfdVarB.b();
        }
        boolean zG2 = vg4Var.G();
        CharSequence charSequenceU2 = vg4Var.u();
        boolean zE2 = vg4Var.E();
        if ((vg4Var.a.b.z.b & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        return new ek4(jV2, str2, strA2, listSingletonList2, ynhVar, null, uri2, zB, zG2, charSequenceU2, false, null, 0, zE2, z, vg4Var.F(), false, vg4Var.B(), 584704);
    }

    public final s9e b(vg4 vg4Var) {
        ny8 ny8Var = this.c;
        boolean zD = jcd.d((jcd) ny8Var.getValue(), vg4Var, null, 2);
        qfd qfdVarB = this.a.B(vg4Var.v());
        return new s9e(vg4Var.v(), vg4Var.m(), zD ? ((jcd) ny8Var.getValue()).a().toString() : vg4Var.z(us0.c), vg4Var.u(), zD ? false : qfdVarB.b(), vg4Var.G(), 192);
    }
}
