package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.List;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class la8 implements otb, ttb, ntb {
    public final /* synthetic */ int a;
    public final /* synthetic */ ma8 b;

    public /* synthetic */ la8(ma8 ma8Var, int i) {
        this.a = i;
        this.b = ma8Var;
    }

    @Override // defpackage.ntb
    public void c() {
        c7k c7kVar = this.b.d;
        if (c7kVar != null) {
            c7kVar.y();
        }
    }

    @Override // defpackage.otb
    public void j(Task task) {
        ia8 ia8VarE;
        int i = this.a;
        ma8 ma8Var = this.b;
        switch (i) {
            case 0:
                if (task.j()) {
                    ma8Var.c = (wpe) task.h();
                }
                break;
            default:
                c7k c7kVar = ma8Var.d;
                if (c7kVar != null && (ia8VarE = ((MainActivity) c7kVar.b).z.e()) != null) {
                    List list = ia8.l;
                    ia8VarE.c(1, null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ttb
    public void onFailure(Exception exc) {
        c7k c7kVar = this.b.d;
        if (c7kVar != null) {
            c7kVar.y();
        }
    }
}
