package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f57 extends g6g implements kn8 {
    public final n61 f;
    public final i41 g;
    public final ks9 h;

    public f57(ExecutorService executorService, n61 n61Var, i41 i41Var, ks9 ks9Var) {
        super(executorService);
        this.f = n61Var;
        this.g = i41Var;
        this.h = ks9Var;
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void u(cni cniVar, int i) {
        zmi zmiVar = (zmi) ((k79) F(i));
        View view = cniVar.a;
        bni bniVar = (bni) view;
        ymi ymiVar = zmiVar.b;
        bniVar.setType(ymiVar);
        CharSequence charSequenceA = zmiVar.c.a(cniVar);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        bniVar.setTitle(charSequenceA);
        cniVar.u = this.h;
        if (ymiVar == ymi.a) {
            ((bni) view).setOnClickListener(null);
        } else {
            qe7.H(view, 300L, new x37(this.f, zmiVar, 1));
        }
        if (ymiVar == ymi.b) {
            bni bniVar2 = (bni) view;
            bniVar2.setOnDragIconTouchListener(new s81(26, cniVar));
            bniVar2.setActionMenuIconClickListener(new os1(this.g, zmiVar, cniVar, 24));
        }
    }

    @Override // defpackage.kn8
    public final void S0(int i, int i2) {
        if (i2 <= 0 || i2 >= l() || ((zmi) ((k79) F(i2))).b != ymi.b) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.d.f);
        p90.H(i, i2, arrayList);
        I(arrayList, new uc2(this, i, i2, arrayList));
    }

    @Override // defpackage.g6g, defpackage.nee
    public final int n(int i) {
        int iOrdinal = ((zmi) ((k79) F(i))).b.ordinal();
        if (iOrdinal == 0) {
            return R.id.oneme_folders_list_all_folder_view_type;
        }
        if (iOrdinal == 1) {
            return R.id.oneme_folders_list_user_folder_view_type;
        }
        if (iOrdinal == 2) {
            return R.id.oneme_folders_list_create_folder_view_type;
        }
        if (iOrdinal == 3) {
            return R.id.oneme_folders_list_recommended_folder_view_type;
        }
        ore.o();
        return 0;
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        ymi ymiVar;
        if (i == R.id.oneme_folders_list_all_folder_view_type) {
            ymiVar = ymi.a;
        } else if (i == R.id.oneme_folders_list_user_folder_view_type) {
            ymiVar = ymi.b;
        } else if (i == R.id.oneme_folders_list_create_folder_view_type) {
            ymiVar = ymi.c;
        } else {
            if (i != R.id.oneme_folders_list_recommended_folder_view_type) {
                ore.k(zo5.h(i, "Unknown viewtype in "));
                return null;
            }
            ymiVar = ymi.d;
        }
        return new cni(new bni(ymiVar, viewGroup.getContext()));
    }
}
