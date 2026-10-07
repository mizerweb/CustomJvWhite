package defpackage;

import android.widget.TextView;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes4.dex */
public final class w8d extends tea {
    @Override // defpackage.tea
    public final void Q(MessageModel messageModel) {
        t50 t50Var = messageModel.j.b;
        e7d e7dVar = t50Var instanceof e7d ? (e7d) t50Var : null;
        if (e7dVar == null) {
            return;
        }
        ((q8d) this.y).setModel(e7dVar);
    }

    @Override // defpackage.tea
    public final void R(xac xacVar) {
        q8d q8dVar = (q8d) this.y;
        u35 u35Var = q8dVar.k;
        wac wacVar = xacVar.b;
        ny8 ny8Var = q8dVar.f;
        if (ny8Var.d()) {
            ((dka) ny8Var.getValue()).setTextColors(xacVar);
        }
        TextView textView = q8dVar.g;
        int i = wacVar.d;
        int i2 = wacVar.g;
        textView.setTextColor(i);
        q8dVar.h.setTextColor(wacVar.e);
        q8dVar.j.setBubbleColors(xacVar);
        q8dVar.i.setBubbleColors(xacVar);
        u35Var.setTextColor$message_list(i2);
        u35Var.setDateViewStatusColor(i2);
    }
}
