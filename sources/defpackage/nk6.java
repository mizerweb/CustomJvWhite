package defpackage;

import android.net.Uri;
import android.view.View;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public final class nk6 extends s7g {
    public n61 u;
    public n61 v;

    @Override // defpackage.s7g
    public final void C(k79 k79Var, Object obj) {
        lk6 lk6Var = (lk6) k79Var;
        ynh ynhVar = lk6Var.f;
        kk6 kk6Var = obj instanceof kk6 ? (kk6) obj : null;
        if (kk6Var != null) {
            BitSet bitSet = (BitSet) kk6Var.b;
            boolean z = bitSet.get(0);
            View view = this.a;
            if (z) {
                izb izbVar = (izb) view;
                long j = lk6Var.a;
                CharSequence charSequence = lk6Var.h;
                Uri uri = lk6Var.b;
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                izbVar.j(j, charSequence, uri.toString());
            }
            if (bitSet.get(2)) {
                ((izb) view).setTitle(lk6Var.e);
            }
            if (bitSet.get(3)) {
                ((izb) view).setSubtitle(ynhVar != null ? ynhVar.a(this) : null);
            }
            if (bitSet.get(4)) {
                izb izbVar2 = (izb) view;
                if (lk6Var.g) {
                    qe7.H(izbVar2, 300L, new mk6(this, lk6Var, 2));
                    izbVar2.setSubtitle(ynhVar != null ? ynhVar.b(izbVar2.getContext()) : null);
                    izbVar2.i();
                    return;
                }
                qe7.H(izbVar2, 300L, new mk6(this, lk6Var, 3));
                CharSequence charSequenceB = ynhVar != null ? ynhVar.b(izbVar2.getContext()) : null;
                if (charSequenceB == null) {
                    ore.p("Required value was null.");
                } else {
                    izbVar2.k(charSequenceB, new dx4(this, 10, lk6Var));
                    izbVar2.setSubtitle(null);
                }
            }
        }
    }

    @Override // defpackage.s7g
    public final void G() {
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(lk6 lk6Var) {
        izb izbVar = (izb) this.a;
        long j = lk6Var.a;
        izbVar.setId((int) (j >> 32));
        if (lk6Var.g) {
            ynh ynhVar = lk6Var.f;
            izbVar.setSubtitle(ynhVar != null ? ynhVar.b(izbVar.getContext()) : null);
        } else {
            izbVar.setSubtitle(null);
        }
        izbVar.setTitle(lk6Var.e);
        CharSequence charSequence = lk6Var.h;
        Uri uri = lk6Var.b;
        if (uri == null) {
            uri = Uri.EMPTY;
        }
        izbVar.j(j, charSequence, uri.toString());
    }
}
