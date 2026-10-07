package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.BitSet;
import java.util.List;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class z91 extends s7g {
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z91(View view, int i) {
        super(view);
        this.u = i;
    }

    private final void I(k79 k79Var) {
    }

    private final void J(k79 k79Var) {
    }

    private final void K(k79 k79Var) {
    }

    private final void L(k79 k79Var) {
    }

    private final void M(k79 k79Var) {
    }

    private final void N(k79 k79Var) {
    }

    private final void O(k79 k79Var) {
    }

    private final void P(k79 k79Var) {
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 0:
                if (k79Var instanceof eb1) {
                    v0h.i((TextView) view, ((eb1) k79Var).a);
                    break;
                }
                break;
            case 1:
                if (k79Var instanceof db1) {
                    v0h.i((TextView) view, ((db1) k79Var).a);
                    break;
                }
                break;
            case 2:
                if (k79Var instanceof zf1) {
                    v0h.i((TextView) view, ((zf1) k79Var).a);
                }
                break;
            case 3:
                ((fj1) view).setOpponents(((gr1) k79Var).b);
                break;
            case 4:
                break;
            case 5:
                if (k79Var instanceof iv1) {
                    jac jacVar = (jac) view;
                    iv1 iv1Var = (iv1) k79Var;
                    ynh ynhVar = iv1Var.a;
                    CharSequence charSequenceB = ynhVar != null ? ynhVar.b(jacVar.getContext()) : null;
                    if (charSequenceB == null || charSequenceB.length() == 0) {
                        jacVar.j();
                    } else {
                        jacVar.m(String.valueOf(charSequenceB), gac.a);
                    }
                    ynh ynhVar2 = iv1Var.b;
                    CharSequence charSequenceB2 = ynhVar2 != null ? ynhVar2.b(jacVar.getContext()) : null;
                    if (charSequenceB2 == null) {
                        charSequenceB2 = "";
                    }
                    if (!z5h.E0(jacVar.getText(), charSequenceB2)) {
                        jacVar.setText(charSequenceB2);
                    }
                    break;
                }
                break;
            case 6:
                H((ir1) k79Var);
                break;
            case 7:
                a76 a76Var = (a76) view;
                a76Var.setTitle(R.string.oneme_empty_search_title);
                a76Var.setDescription(R.string.oneme_empty_search_subtitle);
                a76Var.setIsButtonVisible(false);
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                if (k79Var instanceof unb) {
                    v0h.i((TextView) view, ((unb) k79Var).a);
                    break;
                }
                break;
            case 12:
                break;
            case 13:
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                break;
            case 14:
                break;
            case 15:
                if (k79Var instanceof zaf) {
                    v0h.i((TextView) view, ((zaf) k79Var).a);
                    break;
                }
                break;
            case 16:
                if (k79Var instanceof abf) {
                    v0h.i((TextView) view, ((abf) k79Var).a);
                    break;
                }
                break;
            case 17:
                break;
            case 18:
                if (k79Var instanceof laf) {
                    v0h.i((TextView) view, ((laf) k79Var).a);
                    break;
                }
                break;
            case 19:
                if (k79Var instanceof maf) {
                    v0h.i((TextView) view, ((maf) k79Var).a);
                    break;
                }
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
                break;
            case 22:
                if (k79Var instanceof zaf) {
                    v0h.i((TextView) view, ((zaf) k79Var).a);
                    break;
                }
                break;
            case 23:
                if (k79Var instanceof abf) {
                    v0h.i((TextView) view, ((abf) k79Var).a);
                    break;
                }
                break;
            case 24:
                break;
            case 25:
                if (k79Var instanceof qaf) {
                    v0h.i((TextView) view, ((qaf) k79Var).a);
                    break;
                }
                break;
            case 26:
                if (k79Var instanceof saf) {
                    TextView textView = (TextView) view;
                    textView.setText(((saf) k79Var).a.b(textView.getContext()));
                    break;
                }
                break;
            case 27:
                break;
            case 28:
                if (k79Var instanceof hbf) {
                    v0h.i((TextView) view, ((hbf) k79Var).a);
                    break;
                }
                break;
            default:
                if (k79Var instanceof ibf) {
                    v0h.i((TextView) view, ((ibf) k79Var).a);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s7g
    public void C(k79 k79Var, Object obj) {
        f83 f83Var;
        int i = this.u;
        View view = this.a;
        switch (i) {
            case 3:
                List<wgc> list = ((gr1) k79Var).b;
                f83Var = obj instanceof fr1 ? (fr1) obj : null;
                if (f83Var == null) {
                    ((fj1) view).setOpponents(list);
                } else if (((BitSet) f83Var.b).get(0)) {
                    ((fj1) view).setOpponents(list);
                }
                break;
            case 6:
                ir1 ir1Var = (ir1) k79Var;
                vy1 vy1Var = ir1Var.c;
                f83Var = obj instanceof hr1 ? (hr1) obj : null;
                if (f83Var == null) {
                    H(ir1Var);
                } else {
                    BitSet bitSet = (BitSet) f83Var.b;
                    if (bitSet.get(0)) {
                        view.setVisibility(vy1Var.a() ? 0 : 8);
                        r12 r12Var = (r12) view;
                        boolean z = vy1Var.e;
                        if (r12Var.t != z) {
                            r12Var.t = z;
                            r12Var.v.setEndView(new ksf(z, true));
                        }
                    }
                    if (bitSet.get(1)) {
                        ((r12) view).setTitle(ir1Var.b);
                    }
                }
                break;
            default:
                super.C(k79Var, obj);
                break;
        }
    }

    public void H(ir1 ir1Var) {
        vy1 vy1Var = ir1Var.c;
        int i = vy1Var.a() ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        r12 r12Var = (r12) view;
        boolean z = vy1Var.e;
        if (r12Var.t != z) {
            r12Var.t = z;
            r12Var.v.setEndView(new ksf(z, true));
        }
        r12Var.setTitle(ir1Var.b);
    }
}
