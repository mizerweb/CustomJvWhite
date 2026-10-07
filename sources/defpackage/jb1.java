package defpackage;

import android.media.metrics.LogSessionId;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;

/* JADX INFO: loaded from: classes2.dex */
public final class jb1 implements iu3 {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public jb1(CallAnalyticsSender callAnalyticsSender) {
        callAnalyticsSender.getClass();
        this.d = callAnalyticsSender;
        callAnalyticsSender.setIdle(this.c, !this.b);
    }

    @Override // defpackage.iu3
    public i95 c(b87 b87Var, LogSessionId logSessionId) {
        return ((ka5) this.d).c(b87Var, logSessionId);
    }

    @Override // defpackage.iu3
    public boolean f() {
        return this.b || ((ka5) this.d).f();
    }

    @Override // defpackage.iu3
    public boolean n() {
        return this.c || ((ka5) this.d).n();
    }

    @Override // defpackage.iu3
    public i95 p(b87 b87Var, LogSessionId logSessionId) {
        ka5 ka5Var = (ka5) this.d;
        if (!this.b) {
            return ka5Var.p(b87Var, logSessionId);
        }
        ex3 ex3Var = b87Var.D;
        if (ex3Var != null && ex3Var.b != 2) {
            a87 a87VarA = b87Var.a();
            dx3 dx3VarA = ex3Var.a();
            dx3VarA.b = 2;
            a87VarA.C = dx3VarA.a();
            b87Var = new b87(a87VarA);
        }
        return ka5Var.p(b87Var, logSessionId);
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("HandleConversationParticipantsResult{isMeRestricted=");
                sb.append(this.b);
                sb.append(", responders=");
                sb.append((List) this.d);
                sb.append(", callToGroup=");
                return c0a.p(sb, this.c, '}');
            default:
                return super.toString();
        }
    }

    public jb1(boolean z, ArrayList arrayList, boolean z2) {
        this.b = z;
        this.d = arrayList;
        this.c = z2;
    }

    public jb1(ka5 ka5Var, boolean z, boolean z2) {
        this.d = ka5Var;
        this.b = z;
        this.c = z2;
    }
}
