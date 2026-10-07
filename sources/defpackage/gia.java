package defpackage;

import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class gia extends sr implements mia {
    public qf7 c;
    public qf7 d;
    public fia e;
    public Boolean f;

    public gia() {
        super(new s9a(7));
    }

    @Override // defpackage.mia
    public final void A() {
        this.e = null;
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((lia) ny8Var.getValue()).setVisibility(8);
        }
    }

    @Override // defpackage.sr
    public final void W(View view) {
        qe7.H((lia) view, 300L, new o37(21, this));
    }

    public final void Z(boolean z) {
        this.f = Boolean.valueOf(z);
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((lia) ny8Var.getValue()).setIsFloating(z);
        }
    }

    @Override // defpackage.mia
    public final void p(xac xacVar) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((lia) ny8Var.getValue()).a(xacVar);
        }
    }

    @Override // defpackage.mia
    public final void setForwardClickListener(qf7 qf7Var) {
        this.d = qf7Var;
    }

    @Override // defpackage.mia
    public final void setLink(fia fiaVar) {
        Layout layout = fiaVar.c;
        wha whaVar = fiaVar.e;
        cia ciaVar = fiaVar.d;
        this.e = fiaVar;
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (!viewGroup.isLaidOut() || viewGroup.isLayoutRequested()) {
            viewGroup.addOnLayoutChangeListener(new xc0(10, this));
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.a;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            int iD = zo5.D(10.0f, yl5.d().getDisplayMetrics().density, viewGroup2.getMeasuredWidth()) - L();
            int i = iD < 0 ? 0 : iD;
            ViewGroup viewGroup3 = (ViewGroup) this.a;
            qyj.A(viewGroup3 != null ? viewGroup3 : null, Q(), 0, 0, i, 0, 22);
        }
        lia liaVar = (lia) Q();
        Boolean bool = this.f;
        liaVar.setIsFloating(bool != null ? bool.booleanValue() : fiaVar.f);
        boolean z = ciaVar != null;
        boolean z2 = whaVar != null;
        if (z2 && !z) {
            ((lia) Q()).setSingleForward(whaVar);
        } else if (z2 && (ciaVar instanceof aia)) {
            ((lia) Q()).m(whaVar.a(), ((aia) ciaVar).a);
        } else if (ciaVar instanceof yha) {
            ((lia) Q()).setDeletedLayout(((yha) ciaVar).a);
        } else if (ciaVar instanceof aia) {
            lia liaVar2 = (lia) Q();
            if (layout == null) {
                ore.p("Required value was null.");
                return;
            }
            liaVar2.n(layout, ((aia) ciaVar).a);
        } else if (z2 && (ciaVar instanceof zha)) {
            ((lia) Q()).k((zha) ciaVar, whaVar.a());
        } else if (ciaVar instanceof zha) {
            lia liaVar3 = (lia) Q();
            if (layout == null) {
                ore.p("Required value was null.");
                return;
            }
            liaVar3.l((zha) ciaVar, layout);
        } else if (z2 && (ciaVar instanceof bia)) {
            ((lia) Q()).o(whaVar.a(), (bia) ciaVar);
        } else if (ciaVar instanceof bia) {
            lia liaVar4 = (lia) Q();
            if (layout == null) {
                ore.p("Required value was null.");
                return;
            }
            liaVar4.o(layout, (bia) ciaVar);
        } else if (ciaVar instanceof xha) {
            lia liaVar5 = (lia) Q();
            if (layout == null) {
                ore.p("Required value was null.");
                return;
            }
            liaVar5.j(layout, (xha) ciaVar);
        }
        ((lia) Q()).setAccentSourceId(fiaVar.g);
        r();
    }

    @Override // defpackage.mia
    public final void setReplyClickListener(qf7 qf7Var) {
        this.c = qf7Var;
    }
}
