package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class pm4 extends aq implements qih, btc {
    public final long f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public pm4(int i, long j, long j2, String str, String str2, String str3, String str4) {
        super(j);
        this.f = j2;
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = str3;
        this.k = str4;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return false;
    }

    @Override // defpackage.qih
    public final void b(kih kihVar) {
        qm4 qm4Var = (qm4) kihVar;
        if (qm4Var.c != null) {
            q().n(Collections.singletonList(qm4Var.c), ji4.a);
        }
        int i = this.g;
        if (i == 6 || i == 7) {
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            ij4 ij4Var = (ij4) bqVar.k0.getValue();
            yab.i0(ij4Var.b, null, 0, new c03(ij4Var, this.f, i == 6, null, 4), 3);
            return;
        }
        qw2 qw2VarP = p();
        long j = this.f;
        rt2 rt2VarQ = qw2VarP.Q(j);
        if (rt2VarQ == null) {
            return;
        }
        nx2 nx2Var = rt2VarQ.b;
        long j2 = rt2VarQ.a;
        switch (qt4.D(i)) {
            case 0:
                o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j2)), true, false, (mg5) null, (cid) null, (Set) null, 124));
                break;
            case 1:
                w(qm4Var);
                qw2 qw2VarP2 = p();
                qw2VarP2.getClass();
                StringBuilder sb = new StringBuilder("changeDialogStatus, contactId = ");
                sb.append(j);
                sb.append(", status = ");
                kx2 kx2Var = kx2.a;
                sb.append(kx2Var);
                gm0.n("qw2", sb.toString());
                rt2 rt2VarQ2 = qw2VarP2.Q(j);
                if (rt2VarQ2 != null) {
                    long j3 = rt2VarQ2.a;
                    qw2VarP2.w(j3, kx2Var);
                    qw2VarP2.o.c(new wo3(Collections.singletonList(Long.valueOf(j3)), true));
                }
                n().f(nx2Var.a);
                o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j2)), true, false, (mg5) null, (cid) null, (Set) null, 124));
                break;
            case 2:
            case 5:
            case 6:
                break;
            case 3:
            case 4:
                w(qm4Var);
                n().f(nx2Var.a);
                o().c(new wo3((Collection) Collections.singletonList(Long.valueOf(j2)), true, false, (mg5) null, (cid) null, (Set) null, 124));
                break;
            default:
                ore.o();
                break;
        }
    }

    @Override // defpackage.btc
    public final void d() {
    }

    @Override // defpackage.qih
    public final void f(yhh yhhVar) {
        if (!p90.C(yhhVar.b)) {
            v().d(this.a);
        }
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        yab.i0(bqVar.l(), null, 0, new qh4(yhhVar, this, null, 4), 3);
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ContactUpdate contactUpdate = new Tasks.ContactUpdate();
        contactUpdate.requestId = this.a;
        contactUpdate.contactId = this.f;
        String str = this.h;
        if (str != null) {
            contactUpdate.oldName = str;
        }
        String str2 = this.i;
        if (str2 != null) {
            contactUpdate.oldLastName = str2;
        }
        String str3 = this.j;
        if (str3 != null) {
            contactUpdate.newName = str3;
        }
        String str4 = this.k;
        if (str4 != null) {
            contactUpdate.lastName = str4;
        }
        contactUpdate.action = tt2.c(this.g);
        return sia.toByteArray(contactUpdate);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CONTACT_UPDATE;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1000000;
    }

    @Override // defpackage.aq
    public final Object m() {
        wy2 wy2Var = new wy2((kfc) null, 23);
        wy2Var.f(this.f, "contactId");
        int i = this.g;
        if (i != 0) {
            wy2Var.h("action", tt2.c(i));
        }
        String str = this.j;
        if (!ch3.r(str)) {
            wy2Var.h("firstName", str);
        }
        String str2 = this.k;
        if (ch3.s(str2)) {
            wy2Var.h("lastName", str2);
        }
        return wy2Var;
    }

    public final void w(qm4 qm4Var) {
        if (qm4Var.c != null) {
            int i = this.g;
            if (i == 4 || i == 5) {
                bq bqVar = this.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                yfd yfdVar = (yfd) bqVar.Q.getValue();
                yab.i0(yfdVar.m, null, 0, new l0d(yfdVar, Collections.singletonList(Long.valueOf(qm4Var.c.a)), null, 8), 3);
            }
        }
    }
}
