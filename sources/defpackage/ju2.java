package defpackage;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class ju2 extends x23 {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ju2(View view, int i) {
        super(view);
        this.u = i;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                s7a s7aVar = (s7a) k79Var;
                n13 n13Var = (n13) view;
                n13Var.setId((int) s7aVar.a);
                n13Var.setupAudio(s7aVar);
                break;
            case 1:
                v7a v7aVar = (v7a) k79Var;
                w33 w33Var = (w33) view;
                w33Var.setId((int) v7aVar.a);
                w33Var.setItem(v7aVar);
                break;
            default:
                w7a w7aVar = (w7a) k79Var;
                j43 j43Var = (j43) view;
                j43Var.setId((int) w7aVar.a);
                j43Var.setupVideo(w7aVar);
                break;
        }
    }

    @Override // defpackage.s7g
    public void G() throws IllegalAccessException, InvocationTargetException {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                n13 n13Var = (n13) view;
                n13Var.removeOnAttachStateChangeListener(n13Var.v);
                n13Var.removeOnAttachStateChangeListener(n13Var.w);
                sgg sggVar = n13Var.x;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                n13Var.x = null;
                sgg sggVar2 = n13Var.y;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                n13Var.y = null;
                n13Var.z = null;
                break;
            case 2:
                j43 j43Var = (j43) view;
                j43Var.removeOnAttachStateChangeListener(j43Var.v);
                sgg sggVar3 = j43Var.w;
                if (sggVar3 != null) {
                    sggVar3.b(null);
                }
                j43Var.w = null;
                j43Var.x = null;
                break;
        }
    }

    @Override // defpackage.x23
    public final void H(x7a x7aVar, cf7 cf7Var, qf7 qf7Var) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                s7a s7aVar = (s7a) x7aVar;
                n13 n13Var = (n13) view;
                n13Var.setId((int) s7aVar.a);
                n13Var.setupAudio(s7aVar);
                super.H(s7aVar, cf7Var, qf7Var);
                break;
            case 1:
                v7a v7aVar = (v7a) x7aVar;
                w33 w33Var = (w33) view;
                w33Var.setId((int) v7aVar.a);
                w33Var.setItem(v7aVar);
                super.H(v7aVar, cf7Var, qf7Var);
                break;
            default:
                w7a w7aVar = (w7a) x7aVar;
                j43 j43Var = (j43) view;
                j43Var.setId((int) w7aVar.a);
                j43Var.setupVideo(w7aVar);
                super.H(w7aVar, cf7Var, qf7Var);
                break;
        }
    }
}
