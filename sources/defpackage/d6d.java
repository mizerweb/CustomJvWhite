package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import one.me.polls.screens.create.PollCreateScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class d6d extends w7d implements sn8 {
    public q7d u;
    public a3 v;
    public uik w;

    @Override // defpackage.s7g
    public final void G() {
        z5d z5dVar = (z5d) this.a;
        z5dVar.setShowLengthLimitWhileFocused(false);
        jac jacVar = z5dVar.b;
        jacVar.b.setOnFocusChangeListener(null);
        z5dVar.setOnEditorActionListener(null);
        z5dVar.setOnRemoveListener(null);
        this.u = null;
        this.w = null;
        a3 a3Var = this.v;
        if (a3Var != null) {
            jacVar.b.removeTextChangedListener(a3Var);
        }
        this.v = null;
        z5dVar.setText("");
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(l7d l7dVar) {
        z5d z5dVar = (z5d) this.a;
        z5dVar.setOnEditorActionListener(null);
        z5dVar.setOnRemoveListener(null);
        a3 a3Var = this.v;
        if (a3Var != null) {
            z5dVar.b.b.removeTextChangedListener(a3Var);
        }
        this.v = null;
        this.u = null;
        z5dVar.setLengthLimit(100);
        z5dVar.setShowLengthLimitWhileFocused(true);
        CharSequence charSequenceB = l7dVar.a.b(z5dVar.getContext());
        String string = charSequenceB != null ? charSequenceB.toString() : null;
        if (string == null) {
            string = "";
        }
        z5dVar.setHint(string);
        if (!cqk.d(z5dVar.getText(), l7dVar.d)) {
            z5dVar.setText(l7dVar.d);
        }
        z5dVar.setImeOptions(Integer.valueOf(l7dVar.b));
    }

    @Override // defpackage.sn8
    public final void d() {
        int iK;
        Object value;
        ((z5d) this.a).animate().translationZ(0.0f);
        uik uikVar = this.w;
        if (uikVar == null || (iK = k()) == -1) {
            return;
        }
        PollCreateScreen pollCreateScreen = (PollCreateScreen) uikVar.b;
        zv8[] zv8VarArr = PollCreateScreen.n;
        y7d y7dVarP1 = pollCreateScreen.p1();
        long j = this.e;
        int i = ((x8d) y7dVarP1.d.getValue()).a.isEmpty() ? -1 : 1;
        Iterator it = ((x8d) y7dVarP1.d.getValue()).a.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (((l7d) it.next()).c == j) {
                break;
            } else {
                i2++;
            }
        }
        if (i != -1 && i2 != -1) {
            ArrayList arrayList = new ArrayList(((x8d) y7dVarP1.d.getValue()).a);
            p90.H(i2, oc9.v(iK - i, 0, arrayList.size() - 1), arrayList);
            mjg mjgVar = y7dVarP1.d;
            do {
                value = mjgVar.getValue();
            } while (!mjgVar.h(value, x8d.a((x8d) value, arrayList, false, 2)));
            return;
        }
        String str = y7dVarP1.j;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "onStopDrag can't update model cuz can't find swap items in list", null);
        }
    }

    @Override // defpackage.sn8
    public final void e() {
        ((z5d) this.a).animate().translationZ(yl5.d().getDisplayMetrics().density * 20.0f);
    }
}
