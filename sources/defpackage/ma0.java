package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.reflect.InvocationTargetException;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class ma0 extends tea {
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(Context context, ny8 ny8Var, fz7 fz7Var) {
        super(ny8Var, context, new xdi(context, fz7Var));
        this.Z = 11;
    }

    @Override // defpackage.s7g
    public void G() throws IllegalAccessException, InvocationTargetException {
        int i = this.Z;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                ha0 ha0Var = (ha0) viewGroup;
                ha0Var.removeOnAttachStateChangeListener(ha0Var.K);
                sgg sggVar = ha0Var.J;
                if (sggVar != null) {
                    sggVar.b(null);
                }
                ha0Var.J = null;
                eu9 eu9Var = ha0Var.m;
                eu9Var.n.cancel();
                eu9Var.k = 0;
                eu9Var.l = 0;
                eu9.g(eu9Var, eu9Var.d, null, null, 124);
                break;
            case 5:
                ((wr6) viewGroup).P();
                break;
            case 10:
                hag hagVar = (hag) viewGroup;
                hagVar.removeOnAttachStateChangeListener(hagVar.I);
                sgg sggVar2 = hagVar.J;
                if (sggVar2 != null) {
                    sggVar2.b(null);
                }
                hagVar.J = null;
                break;
            case 12:
                izi iziVar = (izi) viewGroup;
                iziVar.removeOnAttachStateChangeListener(iziVar.G);
                sgg sggVar3 = iziVar.I;
                if (sggVar3 != null) {
                    sggVar3.b(null);
                }
                iziVar.I = null;
                sgg sggVar4 = iziVar.J;
                if (sggVar4 != null) {
                    sggVar4.b(null);
                }
                iziVar.J = null;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.tea
    public void Q(MessageModel messageModel) {
        ga0 ga0Var;
        vn2 vn2Var;
        int i = this.Z;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                t50 t50Var = messageModel.j.b;
                y90 y90Var = t50Var instanceof y90 ? (y90) t50Var : null;
                if (y90Var != null) {
                    ((ha0) viewGroup).j(y90Var, z21.b(messageModel.F & 2080374784));
                    break;
                }
                break;
            case 2:
                t50 t50Var2 = messageModel.j.b;
                yb1 yb1Var = t50Var2 instanceof yb1 ? (yb1) t50Var2 : null;
                if (yb1Var != null) {
                    ((cr1) viewGroup).c(yb1Var);
                    break;
                }
                break;
            case 3:
                t50 t50Var3 = messageModel.j.b;
                jh4 jh4Var = t50Var3 instanceof jh4 ? (jh4) t50Var3 : null;
                if (jh4Var != null) {
                    ((jl4) viewGroup).g(jh4Var);
                    break;
                }
                break;
            case 5:
                t50 t50Var4 = messageModel.j.b;
                aq6 aq6Var = t50Var4 instanceof aq6 ? (aq6) t50Var4 : null;
                if (aq6Var != null) {
                    ((wr6) viewGroup).setFileInfo(aq6Var);
                    break;
                }
                break;
            case 6:
                t50 t50Var5 = messageModel.j.b;
                zj7 zj7Var = t50Var5 instanceof zj7 ? (zj7) t50Var5 : null;
                if (zj7Var != null) {
                    ((bk7) viewGroup).c(zj7Var, z21.b(messageModel.F & 2080374784));
                    break;
                }
                break;
            case 7:
                t50 t50Var6 = messageModel.j.b;
                mxf mxfVar = t50Var6 instanceof mxf ? (mxf) t50Var6 : null;
                if (mxfVar != null) {
                    ((zyf) viewGroup).q(mxfVar, z21.b(messageModel.F & 2080374784));
                    break;
                }
                break;
            case 8:
                t50 t50Var7 = messageModel.j.b;
                plg plgVar = t50Var7 instanceof plg ? (plg) t50Var7 : null;
                if (plgVar != null) {
                    nlg nlgVar = viewGroup instanceof nlg ? (nlg) viewGroup : null;
                    if (nlgVar != null) {
                        nlgVar.a(plgVar.a);
                    }
                    rlg rlgVar = viewGroup instanceof rlg ? (rlg) viewGroup : null;
                    if (rlgVar != null) {
                        rlgVar.setIncomingAlignment(messageModel.z);
                    }
                    break;
                }
                break;
            case 10:
                t50 t50Var8 = messageModel.j.b;
                eag eagVar = t50Var8 instanceof eag ? (eag) t50Var8 : null;
                if (eagVar != null) {
                    hag hagVar = (hag) viewGroup;
                    hagVar.setModel(eagVar);
                    hagVar.I = new ga0(hagVar, 12, eagVar);
                    if (hagVar.isAttachedToWindow() && (ga0Var = hagVar.I) != null) {
                        ga0Var.onViewAttachedToWindow(hagVar);
                    }
                    hagVar.addOnAttachStateChangeListener(hagVar.I);
                    break;
                }
                break;
            case 11:
                final xdi xdiVar = (xdi) viewGroup;
                final long j = messageModel.b;
                qe7.H(xdiVar.u, 300L, new View.OnClickListener() { // from class: wdi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        xdiVar.s.invoke(new hna(j));
                    }
                });
                break;
            case 12:
                t50 t50Var9 = messageModel.j.b;
                oxi oxiVar = t50Var9 instanceof oxi ? (oxi) t50Var9 : null;
                if (oxiVar != null) {
                    ((izi) viewGroup).S(oxiVar, messageModel.z);
                    break;
                }
                break;
            case 13:
                t50 t50Var10 = messageModel.j.b;
                eag eagVar2 = t50Var10 instanceof eag ? (eag) t50Var10 : null;
                if (eagVar2 != null) {
                    gag gagVar = (gag) viewGroup;
                    gagVar.setModel(eagVar2);
                    gagVar.w = new vn2(6, gagVar);
                    if (gagVar.isAttachedToWindow() && (vn2Var = gagVar.w) != null) {
                        vn2Var.onViewAttachedToWindow(gagVar);
                    }
                    gagVar.addOnAttachStateChangeListener(gagVar.w);
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
            case 0:
                ha0 ha0Var = (ha0) viewGroup;
                cs csVar = ha0Var.n;
                csVar.setBackground(qyj.O(Integer.valueOf(xacVar.a.b)));
                int i2 = xacVar.c.a;
                csVar.setColorFilter(i2);
                ha0Var.m.c(i2);
                ha0Var.r.setIncomingMessage(ha0Var.x);
                AppCompatTextView appCompatTextView = ha0Var.s;
                wac wacVar = xacVar.b;
                appCompatTextView.setTextColor(wacVar.b);
                u35 u35Var = ha0Var.o;
                int i3 = wacVar.g;
                u35Var.setTextColor$message_list(i3);
                u35Var.setDateViewStatusColor(i3);
                break;
            case 2:
                ((cr1) viewGroup).a(xacVar);
                break;
            case 3:
                ((jl4) viewGroup).d(xacVar);
                break;
            case 4:
                ((ap4) viewGroup).a(xacVar);
                break;
            case 5:
                ((wr6) viewGroup).O(xacVar);
                break;
            case 6:
                ((bk7) viewGroup).d(xacVar);
                break;
            case 7:
                ((zyf) viewGroup).n(xacVar);
                break;
            case 9:
                ((gnh) viewGroup).K(xacVar);
                break;
            case 10:
                ((hag) viewGroup).K(xacVar);
                break;
            case 11:
                ((xdi) viewGroup).K(xacVar);
                break;
            case 12:
                izi iziVar = (izi) viewGroup;
                u35 u35Var2 = iziVar.r;
                wac wacVar2 = xacVar.b;
                int i4 = wacVar2.g;
                if (iziVar.g.d) {
                    u35Var2.setTextColor$message_list(i4);
                    u35Var2.setDateViewStatusColor(i4);
                    iziVar.o.setTextColor(wacVar2.b);
                }
                break;
        }
    }

    @Override // defpackage.tea
    public void S(kbc kbcVar) {
        int i = this.Z;
        a8g a8gVar = pq3.j;
        ViewGroup viewGroup = this.y;
        switch (i) {
            case 0:
                ((ha0) viewGroup).o.setBackgroundColor(kbcVar.t().b);
                break;
            case 1:
                dw0 dw0Var = viewGroup instanceof dw0 ? (dw0) viewGroup : null;
                if (dw0Var != null) {
                    u35 u35Var = dw0Var.g;
                    u35Var.setTextColor$message_list(-1);
                    u35Var.setDateViewStatusColor(-1);
                    u35Var.setBackgroundColor(kbcVar.t().b);
                }
                break;
            case 5:
                ((wr6) viewGroup).L(kbcVar);
                break;
            case 7:
                zyf zyfVar = (zyf) viewGroup;
                ny8 ny8Var = zyfVar.D;
                if (ny8Var.d()) {
                    ImageView imageView = (ImageView) ny8Var.getValue();
                    imageView.setBackgroundTintList(ColorStateList.valueOf(kbcVar.b().g));
                    imageView.setImageTintList(ColorStateList.valueOf(-1));
                }
                ny8 ny8Var2 = zyfVar.E;
                if (ny8Var2.d()) {
                    TextView textView = (TextView) ny8Var2.getValue();
                    textView.setBackgroundTintList(ColorStateList.valueOf(-871625458));
                    textView.setTextColor(-1);
                }
                break;
            case 8:
                rlg rlgVar = viewGroup instanceof rlg ? (rlg) viewGroup : null;
                if (rlgVar != null) {
                    u35 u35Var2 = rlgVar.h;
                    u35Var2.setTextColor$message_list(-1);
                    u35Var2.setDateViewStatusColor(-1);
                    u35Var2.setBackgroundColor(kbcVar.t().b);
                }
                break;
            case 9:
                ((gnh) viewGroup).L(kbcVar);
                break;
            case 10:
                hag hagVar = (hag) viewGroup;
                hagVar.z.onThemeChanged(a8gVar.e(hagVar.getContext()).m());
                hagVar.L(kbcVar);
                break;
            case 12:
                ((izi) viewGroup).Y(kbcVar);
                break;
            case 13:
                gag gagVar = (gag) viewGroup;
                gagVar.d(kbcVar);
                gagVar.p.onThemeChanged(a8gVar.e(gagVar.getContext()).m());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma0(Context context, ny8 ny8Var, ViewGroup viewGroup, int i) {
        super(ny8Var, context, viewGroup);
        this.Z = i;
    }
}
