package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class jc4 {
    public final Bundle a;

    public jc4(ynh ynhVar, Bundle bundle, y3f y3fVar) {
        Bundle bundle2 = new Bundle();
        this.a = bundle2;
        bundle2.putParcelable("title", ynhVar);
        bundle2.putBundle(ApiProtocol.PARAM_PAYLOAD, bundle);
        if (y3fVar != null) {
            bundle2.putString("stat_screen", y3fVar.name());
        }
    }

    public final void a(kc4... kc4VarArr) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        cx3.a1(parcelableArrayList, kc4VarArr);
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void b(int i, ynh ynhVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new kc4(i, ynhVar, 1, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void c(int i, ynh ynhVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new kc4(i, ynhVar, 2, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final void d(int i, ynh ynhVar) {
        Bundle bundle = this.a;
        ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
        if (parcelableArrayList == null) {
            parcelableArrayList = new ArrayList<>();
        }
        parcelableArrayList.add(new kc4(i, ynhVar, 3, 56));
        bundle.putParcelableArrayList("buttons", parcelableArrayList);
    }

    public final ConfirmationBottomSheet e(ha9 ha9Var) {
        int i = ha9Var.a;
        Bundle bundle = this.a;
        bundle.putInt(Widget.ARG_ACCOUNT_ID_OVERRIDE, i);
        return new ConfirmationBottomSheet(bundle);
    }

    public final ConfirmationBottomSheet f(Widget widget) {
        return e(widget.getB().b());
    }

    public final void g(ynh ynhVar) {
        Bundle bundle = this.a;
        if (ynhVar == null) {
            bundle.remove("description");
        } else {
            bundle.putParcelable("description", ynhVar);
        }
    }

    public final void h(pc4 pc4Var) {
        Bundle bundle = this.a;
        if (pc4Var == null) {
            bundle.remove("icon");
        } else {
            bundle.putParcelable("icon", pc4Var);
        }
    }

    public final void i(Integer num) {
        h(new oc4(num.intValue(), 1, 2));
    }

    public final void j(String str) {
        this.a.putString("theme_key", str);
    }
}
