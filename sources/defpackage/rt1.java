package defpackage;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;
import java.util.ArrayList;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class rt1 implements TextWatcher {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rt1(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(Editable editable) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void e(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void f(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void g(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void h(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void i(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void j(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void k(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void l(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void m(int i, int i2, int i3, CharSequence charSequence) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        String string;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) obj;
                ny8 ny8Var = callOpponentsListWidget.g;
                p1c p1cVar = (p1c) this.b;
                int i2 = 2;
                lq4 lq4Var = null;
                if (editable == null || r5h.X0(editable)) {
                    ArrayList arrayList = soh.a;
                    p1cVar.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                } else if (!cqk.d(p1cVar.getCompoundDrawablesRelative()[2], (Drawable) ny8Var.getValue())) {
                    Drawable drawable = (Drawable) ny8Var.getValue();
                    ArrayList arrayList2 = soh.a;
                    p1cVar.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
                }
                zv8[] zv8VarArr = CallOpponentsListWidget.v;
                kt1 kt1VarP1 = callOpponentsListWidget.p1();
                if (editable == null || (string = editable.toString()) == null) {
                    string = "";
                }
                yab.i0(kt1VarP1.b, ((n0c) kt1VarP1.c).f(), 0, new in1(kt1VarP1, string, lq4Var, i2), 2);
                break;
            case 1:
                ((cf7) this.b).invoke(String.valueOf(editable));
                ei5 ei5Var = (ei5) obj;
                int maxCount = ei5Var.getMaxCount() - (editable != null ? editable.length() : 0);
                ei5Var.k.setText(String.valueOf(maxCount));
                ei5Var.setShowLimitError(maxCount <= 0);
                break;
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                ((p7d) this.b).invoke(((tha) obj).getText());
                break;
            default:
                if (((j1g) this.b).w.isFocused()) {
                    ((nld) obj).invoke(String.valueOf(editable));
                }
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
        lq4 lq4Var = null;
        Object obj = this.c;
        switch (i4) {
            case 0:
            case 1:
                break;
            case 2:
                ((qod) this.b).invoke(String.valueOf(charSequence));
                ((hw6) obj).H(null);
                break;
            case 3:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                String strValueOf = String.valueOf(charSequence);
                if (!cqk.d((String) this.b, strValueOf)) {
                    zv8[] zv8VarArr = InviteByPhoneScreen.p;
                    gm8 gm8VarR1 = inviteByPhoneScreen.r1();
                    gm8VarR1.getClass();
                    gm8VarR1.r.B(gm8VarR1, gm8.v[1], a8j.t(gm8VarR1, null, new qy3(gm8VarR1, lq4Var, 29), 1));
                    this.b = strValueOf;
                    gm8 gm8VarR2 = inviteByPhoneScreen.r1();
                    gm8VarR2.d.c(inviteByPhoneScreen.q1().getCode(), strValueOf);
                }
                break;
            case 4:
                ((qod) this.b).invoke(String.valueOf(charSequence));
                ((zx8) obj).H(null);
                break;
            case 5:
                break;
            default:
                j1g j1gVar = (j1g) this.b;
                if (j1gVar.u instanceof f1g) {
                    ImageView imageView = j1gVar.A;
                    if (charSequence != null && charSequence.length() != 0) {
                        j1gVar.w.isFocused();
                    }
                    imageView.setVisibility(8);
                }
                break;
        }
    }

    public rt1(InviteByPhoneScreen inviteByPhoneScreen) {
        this.a = 3;
        this.c = inviteByPhoneScreen;
    }
}
