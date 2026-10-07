package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class tw6 extends xtb {
    public final qpa i;
    public final ns2 j;
    public final mjg k;

    public tw6(long j, float f, eg8 eg8Var, eg8 eg8Var2, qpa qpaVar, jsa jsaVar, msa msaVar) {
        super(f, eg8Var, eg8Var2);
        this.i = qpaVar;
        mjg mjgVarA = p90.a(new ylc(0L, 0L));
        this.k = mjgVarA;
        this.j = new ns2(j, qpaVar, jsaVar, msaVar, mjgVarA);
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        ns2 ns2Var = this.j;
        if (i == 0 || i == 1) {
            if (ns2Var.h.isActive()) {
                return;
            }
            ns2Var.a();
        } else {
            if (i != 2) {
                return;
            }
            ns2Var.h.b(null);
        }
    }

    @Override // defpackage.xtb
    public final boolean c(View view, int i) {
        mjg mjgVar;
        Object value;
        MessageModel messageModelQ = this.i.Q(i);
        if (messageModelQ == null) {
            return false;
        }
        do {
            mjgVar = this.k;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new ylc(Long.valueOf(messageModelQ.c), ((ylc) value).b)));
        return true;
    }

    @Override // defpackage.xtb
    public final boolean d(View view, int i) {
        mjg mjgVar;
        Object value;
        MessageModel messageModelQ = this.i.Q(i);
        if (messageModelQ == null) {
            return false;
        }
        do {
            mjgVar = this.k;
            value = mjgVar.getValue();
        } while (!mjgVar.h(value, new ylc(((ylc) value).a, Long.valueOf(messageModelQ.c))));
        return true;
    }
}
