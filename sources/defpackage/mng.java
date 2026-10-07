package defpackage;

import android.view.View;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class mng implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ StickersScreen b;

    public /* synthetic */ mng(StickersScreen stickersScreen, int i) {
        this.a = i;
        this.b = stickersScreen;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        StickersScreen stickersScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = StickersScreen.m;
                spg spgVarR1 = stickersScreen.r1();
                spgVarR1.q.B(spgVarR1, spg.y[4], yab.h0(spgVarR1.b, ((n0c) spgVarR1.g).b(), 2, new lpg(spgVarR1, null, 0)));
                break;
            case 1:
                zv8[] zv8VarArr2 = StickersScreen.m;
                spg spgVarR2 = stickersScreen.r1();
                spgVarR2.p.B(spgVarR2, spg.y[3], yab.h0(spgVarR2.b, ((n0c) spgVarR2.g).b(), 2, new lpg(spgVarR2, null, 1)));
                break;
            default:
                zv8[] zv8VarArr3 = StickersScreen.m;
                stickersScreen.r1().C();
                break;
        }
    }
}
