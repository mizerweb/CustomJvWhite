package defpackage;

import android.view.ViewGroup;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vfb extends tea {
    public zj7 Z;
    public ft0 n1;

    @Override // defpackage.tea
    public final void Q(MessageModel messageModel) {
        t50 t50Var = messageModel.j.b;
        o37 o37Var = null;
        zj7 zj7Var = t50Var instanceof zj7 ? (zj7) t50Var : null;
        if (zj7Var == null) {
            return;
        }
        this.Z = zj7Var;
        ufb ufbVar = (ufb) this.y;
        ufbVar.a(zj7Var);
        if (this.n1 != null) {
            o37Var = new o37(23, new iaa(this, 17, zj7Var));
        }
        ufbVar.setExternalMapButtonClickListener(o37Var);
        ufbVar.setExternalMapButtonText(ufbVar.getResources().getString(R.string.messages_list_new_geo_external_map));
    }

    @Override // defpackage.tea
    public final void R(xac xacVar) {
        zj7 zj7Var = this.Z;
        ViewGroup viewGroup = this.y;
        if (zj7Var != null) {
            ((ufb) viewGroup).a(zj7Var);
        }
        ufb ufbVar = (ufb) viewGroup;
        u35 u35Var = ufbVar.t;
        int i = xacVar.b.g;
        u35Var.setTextColor$message_list(i);
        u35Var.setDateViewStatusColor(i);
        ufbVar.r.a(xacVar);
        ufbVar.v(xacVar);
    }
}
