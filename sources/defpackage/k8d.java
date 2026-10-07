package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class k8d extends a8j {
    public final long c;
    public final long d;
    public final h8d e;
    public final ny8 f;
    public final ny8 g;
    public final String h = k8d.class.getName();
    public sgg i;
    public final mjg j;
    public final r8e k;
    public final ic6 l;

    public k8d(long j, long j2, h8d h8dVar, ny8 ny8Var, ny8 ny8Var2) {
        this.c = j;
        this.d = j2;
        this.e = h8dVar;
        this.f = ny8Var;
        this.g = ny8Var2;
        mjg mjgVarA = p90.a(Boolean.FALSE);
        this.j = mjgVarA;
        this.k = new r8e(mjgVarA);
        this.l = new ic6(null);
    }

    public static final void B(k8d k8dVar, Throwable th) throws Throwable {
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        if (th instanceof TimeoutCancellationException) {
            String str = k8dVar.h;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var2)) {
                long j = k8dVar.c;
                long j2 = k8dVar.d;
                StringBuilder sbS = qt4.s(j, "finish poll cancelled for chat(", ") and message(");
                sbS.append(j2);
                sbS.append(") cuz ");
                sbS.append(th);
                a4cVar.c(je9Var2, str, sbS.toString(), null);
            }
            C(k8dVar, new tnh(R.string.oneme_poll_finish__error_snackbar_title), new tnh(R.string.snack_network_error_description), 4);
            return;
        }
        boolean z = th instanceof CancellationException;
        String str2 = k8dVar.h;
        if (z) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null || !a4cVar2.b(je9Var2)) {
                throw th;
            }
            long j3 = k8dVar.c;
            long j4 = k8dVar.d;
            StringBuilder sbS2 = qt4.s(j3, "finish poll cancelled for chat(", ") and message(");
            sbS2.append(j4);
            sbS2.append(") cuz ");
            sbS2.append(th);
            a4cVar2.c(je9Var2, str2, sbS2.toString(), null);
            throw th;
        }
        if (!(th instanceof TamErrorException)) {
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                long j5 = k8dVar.c;
                long j6 = k8dVar.d;
                StringBuilder sbS3 = qt4.s(j5, "finish poll cancelled for chat(", ") and message(");
                sbS3.append(j6);
                sbS3.append(") cuz ");
                sbS3.append(th);
                a4cVar3.c(je9Var, str2, sbS3.toString(), th);
            }
            C(k8dVar, new tnh(R.string.common_service_error), null, 6);
            return;
        }
        a4c a4cVar4 = gm0.f;
        if (a4cVar4 != null && a4cVar4.b(je9Var)) {
            long j7 = k8dVar.c;
            long j8 = k8dVar.d;
            StringBuilder sbS4 = qt4.s(j7, "finish poll cancelled for chat(", ") and message(");
            sbS4.append(j8);
            sbS4.append(") cuz ");
            sbS4.append(th);
            a4cVar4.c(je9Var, str2, sbS4.toString(), th);
        }
        dih dihVarA = svl.a(((TamErrorException) th).a);
        if (dihVarA instanceof cih) {
            C(k8dVar, new xnh(((cih) dihVarA).a), null, 6);
            return;
        }
        if (dihVarA instanceof aih) {
            C(k8dVar, new tnh(R.string.snack_network_error_title), new tnh(R.string.snack_network_error_description), 4);
            return;
        }
        if (dihVarA instanceof bih) {
            C(k8dVar, new tnh(R.string.common_service_error), null, 6);
        } else if (dihVarA instanceof zhh) {
            C(k8dVar, new tnh(R.string.common_service_error), null, 6);
        } else {
            ore.o();
        }
    }

    public static void C(k8d k8dVar, ynh ynhVar, tnh tnhVar, int i) {
        if ((i & 2) != 0) {
            tnhVar = null;
        }
        a8j.x(k8dVar.e.c, new e8d(ynhVar, tnhVar));
    }
}
