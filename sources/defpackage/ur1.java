package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ur1 extends g6g {
    public final due f;
    public final ade g;
    public final ee1 h;

    public ur1(due dueVar, ade adeVar, ee1 ee1Var, ExecutorService executorService) {
        super(executorService);
        this.f = dueVar;
        this.g = adeVar;
        this.h = ee1Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: K */
    public final void u(s7g s7gVar, int i) {
        boolean z = s7gVar instanceof tr1;
        final int i2 = 2;
        final due dueVar = this.f;
        if (z) {
            tr1 tr1Var = (tr1) s7gVar;
            View view = tr1Var.a;
            k79 k79Var = (k79) F(i);
            if (k79Var instanceof r91) {
                tr1Var.B(k79Var);
                atf atfVar = (atf) view;
                final r91 r91Var = (r91) k79Var;
                boolean z2 = r91Var.i;
                atfVar.setEnabled(z2);
                if (z2) {
                    qe7.H(view, 300L, new View.OnClickListener() { // from class: qr1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i3 = i2;
                            r91 r91Var2 = r91Var;
                            due dueVar2 = dueVar;
                            switch (i3) {
                                case 0:
                                    dueVar2.A(r91Var2.c);
                                    break;
                                case 1:
                                    dueVar2.A(r91Var2.c);
                                    break;
                                default:
                                    dueVar2.A(r91Var2.c);
                                    break;
                            }
                        }
                    });
                } else {
                    view.setOnClickListener(null);
                }
                CharSequence charSequence = tr1Var.u.b;
                atfVar.setDescription(charSequence != null ? new xnh(charSequence) : r91Var.e);
                return;
            }
            return;
        }
        if (s7gVar instanceof rr1) {
            rr1 rr1Var = (rr1) s7gVar;
            View view2 = rr1Var.a;
            k79 k79Var2 = (k79) F(i);
            if (k79Var2 instanceof r91) {
                rr1Var.B(k79Var2);
                final r91 r91Var2 = (r91) k79Var2;
                boolean z3 = r91Var2.i;
                ((atf) view2).setEnabled(z3);
                if (!z3) {
                    view2.setOnClickListener(null);
                    return;
                } else {
                    final int i3 = 0;
                    qe7.H(view2, 300L, new View.OnClickListener() { // from class: qr1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            int i4 = i3;
                            r91 r91Var3 = r91Var2;
                            due dueVar2 = dueVar;
                            switch (i4) {
                                case 0:
                                    dueVar2.A(r91Var3.c);
                                    break;
                                case 1:
                                    dueVar2.A(r91Var3.c);
                                    break;
                                default:
                                    dueVar2.A(r91Var3.c);
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(s7gVar instanceof sr1)) {
            s7gVar.B((k79) F(i));
            return;
        }
        sr1 sr1Var = (sr1) s7gVar;
        View view3 = sr1Var.a;
        k79 k79Var3 = (k79) F(i);
        if (k79Var3 instanceof r91) {
            sr1Var.B(k79Var3);
            final r91 r91Var3 = (r91) k79Var3;
            boolean z4 = r91Var3.i;
            ((atf) view3).setEnabled(z4);
            if (z4) {
                final int i4 = 1;
                qe7.H(view3, 300L, new View.OnClickListener() { // from class: qr1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view4) {
                        int i5 = i4;
                        r91 r91Var4 = r91Var3;
                        due dueVar2 = dueVar;
                        switch (i5) {
                            case 0:
                                dueVar2.A(r91Var4.c);
                                break;
                            case 1:
                                dueVar2.A(r91Var4.c);
                                break;
                            default:
                                dueVar2.A(r91Var4.c);
                                break;
                        }
                    }
                });
            } else {
                view3.setOnClickListener(null);
            }
            int i5 = sr1Var.u.b;
            ((atf) view3).setCounter(i5 > 0 ? new dsf(i5, 2) : null);
        }
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: M */
    public final void B(s7g s7gVar) {
        s7gVar.G();
        tr1 tr1Var = s7gVar instanceof tr1 ? (tr1) s7gVar : null;
        if (tr1Var != null) {
            tr1Var.u.a.remove(tr1Var);
        }
        sr1 sr1Var = s7gVar instanceof sr1 ? (sr1) s7gVar : null;
        if (sr1Var != null) {
            sr1Var.u.a.g(sr1Var);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.call_more_actions_vh) {
            atf atfVar = new atf(viewGroup.getContext());
            rr1 rr1Var = new rr1(atfVar);
            atfVar.setThemeDepended(usf.b);
            return rr1Var;
        }
        if (i == R.id.call_more_action_record_vh) {
            return new tr1(viewGroup.getContext(), this.g);
        }
        if (i == R.id.call_more_action_call_chat_vh) {
            return new sr1(viewGroup.getContext(), this.h);
        }
        String name = ur1.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, zo5.h(i, "unknown item viewType: "), null);
            }
        }
        return new z91(new View(viewGroup.getContext()), 4);
    }
}
