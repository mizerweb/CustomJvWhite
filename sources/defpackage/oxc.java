package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class oxc extends g6g {
    public final nxc f;
    public final int g;

    public oxc(nxc nxcVar, ExecutorService executorService, int i) {
        super(executorService);
        this.f = nxcVar;
        this.g = i;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(rxc rxcVar, int i) {
        qxc qxcVar = (qxc) ((k79) F(i));
        rea reaVar = new rea(2, this.f, nxc.class, "onItemClick", "onItemClick(Lone/me/chats/picker/PickerEntity;Z)V", 0, 5);
        rea reaVar2 = new rea(2, this.f, nxc.class, "onItemLongClick", "onItemLongClick(Lone/me/chats/picker/PickerEntity;Z)Z", 0, 6);
        rxcVar.B(qxcVar);
        View view = rxcVar.a;
        int i2 = 7;
        qe7.H(view, 300L, new aeb(reaVar, i2, qxcVar));
        ((izb) view).setOnLongClickListener(new ro2(reaVar2, i2, qxcVar));
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        return R.id.oneme_picker_chat_item_view_type;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        izb izbVar = new izb(viewGroup.getContext(), false);
        rxc rxcVar = new rxc(izbVar);
        int i2 = this.g;
        if (i2 > 0) {
            izbVar.setPaddingRelative(gm0.K(i2 * yl5.d().getDisplayMetrics().density), izbVar.getPaddingTop(), izbVar.getPaddingEnd(), izbVar.getPaddingBottom());
        }
        return rxcVar;
    }
}
