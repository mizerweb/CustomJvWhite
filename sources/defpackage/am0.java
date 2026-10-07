package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class am0 extends s7g {
    public static final /* synthetic */ int w = 0;
    public final /* synthetic */ int u;
    public Object v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(oo6 oo6Var, Context context) {
        super(new b7a(context));
        this.u = 9;
        this.v = oo6Var;
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        v78 v78VarA;
        v78 v78VarA2;
        int i = this.u;
        u78 u78Var = u78.FULL_FETCH;
        View view = this.a;
        switch (i) {
            case 0:
                zl0 zl0Var = (zl0) k79Var;
                gx3 gx3Var = (gx3) view;
                gx3Var.setGradientColors(zl0Var.b);
                gx3Var.setChosen(zl0Var.a);
                qe7.H(view, 300L, new ee(this, 2, zl0Var));
                ViewPropertyAnimator viewPropertyAnimator = gx3Var.k;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                gx3Var.k = null;
                gx3Var.setScaleX(1.0f);
                gx3Var.setScaleY(1.0f);
                break;
            case 1:
                o47 o47Var = (o47) k79Var;
                ew0 ew0Var = (ew0) view;
                CharSequence charSequence = o47Var.b;
                CharSequence charSequence2 = o47Var.c;
                String str = o47Var.d;
                t6g t6gVar = ew0Var.f;
                dpe dpeVar = ew0Var.a;
                ew0Var.d.setText(charSequence);
                ew0Var.e.setText(charSequence2);
                ew0Var.setBackground(ew0Var.c);
                deh dehVar = new deh(4);
                int iK = gm0.K(yl5.d().getDisplayMetrics().density * 32.0f);
                int iK2 = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
                dehVar.d = iK;
                dehVar.e = iK2;
                eeh eehVar = new eeh(dehVar);
                if (str != null) {
                    w78 w78VarD = w78.d(Uri.parse(str));
                    w78VarD.f = eehVar;
                    w78VarD.d = ew0Var.b;
                    v78VarA = w78VarD.a();
                } else {
                    v78VarA = null;
                }
                if (v78VarA != null) {
                    b78 b78VarA = vd7.A();
                    b78VarA.getClass();
                    dpeVar.a(new z68(b78VarA, v78VarA, null, u78Var));
                    if (t6gVar.getController() == null) {
                        t1d t1dVar = vd7.a.get();
                        t1dVar.e = dpeVar;
                        t1dVar.i = true;
                        t6gVar.setController(t1dVar.a());
                    }
                    t6gVar.setVisibility(0);
                } else {
                    t6gVar.setController(null);
                    t6gVar.setVisibility(8);
                }
                qe7.H(ew0Var, 300L, new ee(this, 3, o47Var));
                break;
            case 2:
                ((nh1) this.v).setLabel(((mh1) k79Var).b);
                break;
            case 3:
                ((y62) this.v).setTitle(((ip1) k79Var).a ? R.string.call_item_join_waiting_room_no_admin_title : R.string.call_item_join_waiting_room_title);
                break;
            case 4:
                this.v = k79Var;
                H(pq3.j.h(view));
                if (k79Var instanceof p27) {
                    noh nohVar = q9i.a;
                    TextView textView = (TextView) view;
                    q9i.a(q9i.k.g(), textView);
                    v0h.i(textView, ((p27) k79Var).a);
                } else if (k79Var instanceof j27) {
                    noh nohVar2 = q9i.a;
                    TextView textView2 = (TextView) view;
                    q9i.a(q9i.i, textView2);
                    v0h.i(textView2, ((j27) k79Var).a);
                }
                break;
            case 5:
                o47 o47Var2 = (o47) k79Var;
                p47 p47Var = (p47) view;
                CharSequence charSequence3 = o47Var2.b;
                CharSequence charSequence4 = o47Var2.c;
                String str2 = o47Var2.d;
                t6g t6gVar2 = p47Var.f;
                dpe dpeVar2 = p47Var.a;
                p47Var.d.setText(charSequence3);
                p47Var.e.setText(charSequence4);
                p47Var.setBackground(p47Var.c);
                deh dehVar2 = new deh(4);
                int iK3 = gm0.K(yl5.d().getDisplayMetrics().density * 20.0f);
                int iK4 = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
                dehVar2.d = iK3;
                dehVar2.e = iK4;
                eeh eehVar2 = new eeh(dehVar2);
                if (str2 != null) {
                    w78 w78VarD2 = w78.d(Uri.parse(str2));
                    w78VarD2.f = eehVar2;
                    w78VarD2.d = p47Var.b;
                    v78VarA2 = w78VarD2.a();
                } else {
                    v78VarA2 = null;
                }
                if (v78VarA2 != null) {
                    b78 b78VarA2 = vd7.A();
                    b78VarA2.getClass();
                    dpeVar2.a(new z68(b78VarA2, v78VarA2, null, u78Var));
                    if (t6gVar2.getController() == null) {
                        t1d t1dVar2 = vd7.a.get();
                        t1dVar2.e = dpeVar2;
                        t1dVar2.i = true;
                        t6gVar2.setController(t1dVar2.a());
                    }
                    t6gVar2.setVisibility(0);
                } else {
                    t6gVar2.setController(null);
                    t6gVar2.setVisibility(8);
                }
                qe7.H(p47Var, 300L, new z36(this, 4, o47Var2));
                break;
            case 6:
                q47 q47Var = (q47) k79Var;
                v47 v47Var = view instanceof v47 ? (v47) view : null;
                if (v47Var != null) {
                    x47 x47Var = q47Var instanceof x47 ? (x47) q47Var : null;
                    if (x47Var != null) {
                        ArrayList arrayList = x47Var.a;
                        v47Var.setVisibility(arrayList.isEmpty() ? 8 : 0);
                        v47Var.j2.H(arrayList);
                        v47Var.setListener((t47) this.v);
                    }
                    break;
                }
                break;
            case 7:
                pd8 pd8Var = (pd8) k79Var;
                zrf zrfVar = (zrf) view;
                String str3 = pd8Var.a;
                String str4 = pd8Var.b;
                zrfVar.t.setText(str3);
                zrfVar.u.setText(str4);
                qe7.H(view, 300L, new o37(8, this));
                zrfVar.setOnLongClickListener(new cw0(4, this));
                break;
            case 8:
                wj9 wj9Var = (wj9) k79Var;
                this.v = wj9Var;
                ((TextView) view).setText(wj9Var.b);
                break;
            default:
                n7a n7aVar = (n7a) k79Var;
                b7a b7aVar = (b7a) view;
                b7aVar.setState(n7aVar);
                b7aVar.setIsSelected(n7aVar.d);
                qe7.H(b7aVar, 300L, new z36(this, 19, n7aVar));
                break;
        }
    }

    @Override // defpackage.s7g
    public void F() {
        switch (this.u) {
            case 0:
                gx3 gx3Var = (gx3) this.a;
                ViewPropertyAnimator viewPropertyAnimator = gx3Var.k;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                }
                gx3Var.k = null;
                break;
        }
    }

    public void H(kbc kbcVar) {
        k79 k79Var = (k79) this.v;
        boolean z = k79Var instanceof p27;
        View view = this.a;
        if (z) {
            ((TextView) view).setTextColor(kbcVar.getText().d);
        } else if (k79Var instanceof j27) {
            ((TextView) view).setTextColor(kbcVar.getText().e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am0(View view, int i) {
        super(view);
        this.u = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(nh1 nh1Var) {
        super(nh1Var);
        this.u = 2;
        this.v = nh1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(Context context, g47 g47Var) {
        super(new p47(context));
        this.u = 5;
        this.v = g47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(Context context, g47 g47Var, byte b) {
        super(new ew0(context));
        this.u = 1;
        this.v = g47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am0(Context context, ExecutorService executorService, gve gveVar) {
        super(new v47(context, executorService));
        this.u = 6;
        this.v = gveVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am0(int i, View view, Object obj) {
        super(view);
        this.u = i;
        this.v = obj;
    }
}
