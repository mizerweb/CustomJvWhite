package defpackage;

import android.view.View;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class mmd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileDeletionInfoScreen b;

    public /* synthetic */ mmd(ProfileDeletionInfoScreen profileDeletionInfoScreen, int i) {
        this.a = i;
        this.b = profileDeletionInfoScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileDeletionInfoScreen profileDeletionInfoScreen = this.b;
                zv8[] zv8VarArr = ProfileDeletionInfoScreen.g;
                rmd rmdVar = (rmd) profileDeletionInfoScreen.d.getValue();
                sgg sggVar = rmdVar.k;
                int i = 1;
                if (sggVar == null || !sggVar.isActive()) {
                    rmdVar.k = a8j.t(rmdVar, ((n0c) ((xhh) rmdVar.f.getValue())).b(), new qmd(rmdVar, null, i), 2);
                }
                break;
            default:
                this.b.getRouter().D();
                break;
        }
    }
}
