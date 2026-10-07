package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes4.dex */
public final class yvj extends uka {
    public final r59 y;
    public ewj z;

    public yvj(Context context) {
        xvj xvjVar = new xvj(context);
        super(xvjVar);
        this.y = new r59(null, new twf(context, 21), 7);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
        marginLayoutParams.setMarginEnd(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        xvjVar.setLayoutParams(marginLayoutParams);
        xvjVar.setBackground(new ip7(context));
        b6h b6hVar = new b6h(context);
        b6hVar.b((int[]) ((t84) pq3.j.e(context).m().f().c).d);
        xvjVar.setForeground(b6hVar);
    }

    @Override // defpackage.s7g
    public final void G() {
        CharSequence charSequenceA;
        ewj ewjVar = this.z;
        if (ewjVar == null || (charSequenceA = ewjVar.a()) == null) {
            return;
        }
        this.y.getClass();
        r59.a(charSequenceA);
    }

    @Override // defpackage.uka
    public final void H(MessageModel messageModel, List list) {
        ewj ewjVar;
        this.x = new vka(messageModel.F);
        ewj ewjVar2 = messageModel.p;
        this.z = ewjVar2;
        View view = this.a;
        if (ewjVar2 != null) {
            xvj xvjVar = (xvj) view;
            TextView textView = xvjVar.c;
            TextView textView2 = xvjVar.b;
            t58 t58Var = xvjVar.a;
            ng8 ng8Var = xvjVar.d;
            xvjVar.l = ewjVar2;
            Iterator it = ewjVar2.b.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                awj awjVar = (awj) it.next();
                Iterator it2 = it;
                if (awjVar instanceof bwj) {
                    long j = ewjVar2.a;
                    yab.e(xvjVar, ng8Var, -1);
                    float f = xvjVar.k;
                    ng8Var.a = f;
                    ng8Var.b = f;
                    ng8Var.a(j, ((bwj) awjVar).a, true);
                    ewjVar = ewjVar2;
                    z4 = true;
                } else {
                    boolean z5 = awjVar instanceof cwj;
                    a8g a8gVar = pq3.j;
                    if (z5) {
                        cwj cwjVar = (cwj) awjVar;
                        Size size = cwjVar.a;
                        ViewGroup.LayoutParams layoutParams = t58Var.getLayoutParams();
                        if (layoutParams == null) {
                            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                            return;
                        }
                        ewjVar = ewjVar2;
                        String str = cwjVar.b;
                        layoutParams.width = size.getWidth();
                        layoutParams.height = size.getHeight();
                        t58Var.setLayoutParams(layoutParams);
                        if (str != null && str.length() != 0) {
                            if (cwjVar.c) {
                                t58Var.setColorFilter(a8gVar.h(xvjVar).getIcon().h);
                            } else {
                                t58Var.setColorFilter((ColorFilter) null);
                            }
                            w78 w78VarD = w78.d(Uri.parse(str));
                            w78VarD.f = xvjVar.e;
                            l1c.j(t58Var, w78VarD.a(), null, 6);
                        }
                        z = true;
                    } else {
                        ewjVar = ewjVar2;
                        if (!(awjVar instanceof dwj)) {
                            ore.o();
                            return;
                        }
                        dwj dwjVar = (dwj) awjVar;
                        boolean z6 = dwjVar.c;
                        if (z6) {
                            z3 = true;
                        } else {
                            z2 = true;
                        }
                        CharSequence charSequence = dwjVar.a;
                        if (z6) {
                            textView.setText(dll.a(charSequence));
                            xvjVar.a(a8gVar.h(xvjVar));
                        } else {
                            textView2.setText(charSequence);
                            noh nohVar = q9i.a;
                            q9i.a(dwjVar.b, textView2);
                        }
                    }
                }
                it = it2;
                ewjVar2 = ewjVar;
            }
            t58Var.setVisibility(z ? 0 : 8);
            textView2.setVisibility(z2 ? 0 : 8);
            textView.setVisibility(z3 ? 0 : 8);
            ng8Var.setVisibility(z4 ? 0 : 8);
        }
        I(messageModel, view);
    }

    @Override // defpackage.ff3
    public final void h(kbc kbcVar) {
        xvj xvjVar = (xvj) this.a;
        Drawable background = xvjVar.getBackground();
        ip7 ip7Var = background instanceof ip7 ? (ip7) background : null;
        if (ip7Var != null) {
            ip7Var.h(kbcVar);
        }
        Drawable foreground = xvjVar.getForeground();
        b6h b6hVar = foreground instanceof b6h ? (b6h) foreground : null;
        if (b6hVar != null) {
            b6hVar.b((int[]) ((t84) kbcVar.f().c).g);
            b6hVar.h(kbcVar);
        }
    }
}
