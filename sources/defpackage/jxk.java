package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class jxk implements lnk {
    public final /* synthetic */ int a;
    public final v56 b;

    public /* synthetic */ jxk(v56 v56Var, int i) {
        this.a = i;
        this.b = v56Var;
    }

    @Override // defpackage.lnk
    public final Object zza() {
        int i = this.a;
        v56 v56Var = this.b;
        switch (i) {
            case 0:
                Context context = ((c1k) v56Var.b).a;
                nbh.u("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
                new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
                ntk ntkVar = new ntk();
                new HashSet();
                context.getApplicationContext();
                return ntkVar;
            default:
                return new r6m(((c1k) v56Var.b).a);
        }
    }
}
