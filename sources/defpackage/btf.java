package defpackage;

import android.view.View;
import java.util.BitSet;

/* JADX INFO: loaded from: classes3.dex */
public final class btf extends dtf {
    public qsf u;

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        ((atf) this.a).setModelItem((psf) k79Var);
    }

    @Override // defpackage.s7g
    public final void C(k79 k79Var, Object obj) {
        psf psfVar = (psf) k79Var;
        nsf nsfVar = obj instanceof nsf ? (nsf) obj : null;
        View view = this.a;
        if (nsfVar == null) {
            ((atf) view).setModelItem(psfVar);
            return;
        }
        BitSet bitSet = (BitSet) nsfVar.b;
        bitSet.get(0);
        if (bitSet.get(1)) {
            ((atf) view).o(psfVar.getTitle(), psfVar.v());
        }
        if (bitSet.get(8)) {
            ((atf) view).p(psfVar.t());
        }
        if (bitSet.get(2)) {
            ((atf) view).setType(psfVar.getType());
        }
        if (bitSet.get(3)) {
            ((atf) view).setDescription(psfVar.f());
        }
        if (bitSet.get(4)) {
            atf atfVar = (atf) view;
            atfVar.setOnSwitchListener(null);
            atfVar.setEndView(psfVar.d());
            if (psfVar.d() instanceof ksf) {
                atfVar.setOnSwitchCheckedListener(new s81(20, this));
            }
        }
        if (bitSet.get(5)) {
            ((atf) view).setCounter(psfVar.b());
        }
        if (bitSet.get(6)) {
            ((atf) view).setUpperText(psfVar.c());
        }
        if (bitSet.get(7)) {
            ((atf) view).setStartView(psfVar.e());
        }
    }

    @Override // defpackage.s7g
    public final void G() {
        this.u = null;
        ((atf) this.a).setOnLongClickListener(null);
    }
}
