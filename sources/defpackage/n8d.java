package defpackage;

import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class n8d extends f83 {
    public final /* synthetic */ int c;
    public final /* synthetic */ o8d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n8d(o8d o8dVar, int i) {
        super(4, null);
        this.c = i;
        this.d = o8dVar;
    }

    @Override // defpackage.f83
    public final void a(Object obj, Object obj2) {
        int i = this.c;
        o8d o8dVar = this.d;
        switch (i) {
            case 0:
                if (!cqk.d(obj, obj2)) {
                    xac xacVar = (xac) obj2;
                    if (xacVar != null) {
                        ny8 ny8Var = o8dVar.b;
                        if (n7j.o(ny8Var)) {
                            ((TextView) ny8Var.getValue()).setTextColor(xacVar.b.e);
                        }
                        ny8 ny8Var2 = o8dVar.d;
                        if (n7j.o(ny8Var2)) {
                            ((uxb) ny8Var2.getValue()).a(xacVar);
                        }
                    }
                }
                break;
            default:
                if (!cqk.d(obj, obj2)) {
                    o8d.a(o8dVar, (a7d) obj2);
                }
                break;
        }
    }
}
