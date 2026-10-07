package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class ew3 extends tea {
    public final /* synthetic */ int Z;
    public final cf7 n1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew3(Context context, ny8 ny8Var, e5d e5dVar, fz7 fz7Var, int i) {
        super(ny8Var, context, new k8g(context, ((Boolean) e5dVar.b4.a(e5d.S6[263]).i()).booleanValue()));
        this.Z = i;
        switch (i) {
            case 3:
                super(ny8Var, context, new l8g(context, ((Boolean) e5dVar.b4.a(e5d.S6[263]).i()).booleanValue()));
                this.n1 = fz7Var;
                break;
            default:
                this.n1 = fz7Var;
                break;
        }
    }

    @Override // defpackage.s7g
    public final void G() throws IllegalAccessException, InvocationTargetException {
        int i = this.Z;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                dw3 dw3Var = (dw3) viewGroup;
                yfj yfjVar = dw3Var.o;
                if (yfjVar != null) {
                    yfjVar.o(dw3Var);
                }
                break;
            case 1:
                jw3 jw3Var = (jw3) viewGroup;
                yfj yfjVar2 = jw3Var.y;
                if (yfjVar2 != null) {
                    yfjVar2.o(jw3Var);
                }
                break;
            case 2:
                k8g k8gVar = (k8g) viewGroup;
                k8gVar.v.e(true);
                k8gVar.removeOnAttachStateChangeListener(k8gVar.t);
                sgg sggVar = k8gVar.u;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                k8gVar.u = null;
                break;
            default:
                l8g l8gVar = (l8g) viewGroup;
                l8gVar.F.e(true);
                l8gVar.removeOnAttachStateChangeListener(l8gVar.D);
                sgg sggVar2 = l8gVar.E;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                l8gVar.E = null;
                break;
        }
    }

    @Override // defpackage.tea
    public final void Q(MessageModel messageModel) {
        int i = this.Z;
        int i2 = 2;
        int i3 = 3;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                t50 t50Var = messageModel.j.b;
                yv3 yv3Var = t50Var instanceof yv3 ? (yv3) t50Var : null;
                if (yv3Var != null) {
                    dw3 dw3Var = (dw3) viewGroup;
                    dw3Var.a(yv3Var);
                    dw3Var.setOnFinalImageSetCallback(new os1(this, yv3Var, messageModel, i2));
                    break;
                }
                break;
            case 1:
                t50 t50Var2 = messageModel.j.b;
                yv3 yv3Var2 = t50Var2 instanceof yv3 ? (yv3) t50Var2 : null;
                if (yv3Var2 != null) {
                    jw3 jw3Var = (jw3) viewGroup;
                    jw3Var.a(yv3Var2);
                    jw3Var.setOnFinalImageSetCallback(new os1(this, yv3Var2, messageModel, i3));
                    break;
                }
                break;
            case 2:
                t50 t50Var3 = messageModel.j.b;
                h8g h8gVar = t50Var3 instanceof h8g ? (h8g) t50Var3 : null;
                if (h8gVar != null) {
                    k8g k8gVar = (k8g) viewGroup;
                    k8gVar.F(h8gVar);
                    k8gVar.o.setOnFinalImageSetCallback(new i8f(this, h8gVar, messageModel, i2));
                    break;
                }
                break;
            default:
                t50 t50Var4 = messageModel.j.b;
                h8g h8gVar2 = t50Var4 instanceof h8g ? (h8g) t50Var4 : null;
                if (h8gVar2 != null) {
                    l8g l8gVar = (l8g) viewGroup;
                    l8gVar.F(h8gVar2);
                    l8gVar.y.setOnFinalImageSetCallback(new i8f(this, h8gVar2, messageModel, i3));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.tea
    public void R(xac xacVar) {
        int i = this.Z;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 1:
                ((jw3) viewGroup).K(xacVar);
                break;
            case 3:
                ((l8g) viewGroup).K(xacVar);
                break;
        }
    }

    @Override // defpackage.tea
    public final void S(kbc kbcVar) {
        int i = this.Z;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                dw3 dw3Var = (dw3) viewGroup;
                dw3Var.d(kbcVar);
                dw3Var.n.o();
                break;
            case 1:
                jw3 jw3Var = (jw3) viewGroup;
                jw3Var.L(kbcVar);
                jw3Var.x.o();
                break;
            case 2:
                ((k8g) viewGroup).d(kbcVar);
                break;
            default:
                ((l8g) viewGroup).L(kbcVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ew3(Context context, ny8 ny8Var, ny8 ny8Var2, fz7 fz7Var, int i) {
        super(ny8Var, context, new dw3(context, ny8Var2));
        this.Z = i;
        switch (i) {
            case 1:
                super(ny8Var, context, new jw3(context, ny8Var2));
                this.n1 = fz7Var;
                break;
            default:
                this.n1 = fz7Var;
                break;
        }
    }
}
