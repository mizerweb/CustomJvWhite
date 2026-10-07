package defpackage;

import one.me.login.neuroavatars.NeuroAvatarsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class jeb implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ jeb(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        NeuroAvatarsScreen neuroAvatarsScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = NeuroAvatarsScreen.B;
                neuroAvatarsScreen.s1().B();
                return sbiVar;
            case 1:
                zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                ((kwb) neuroAvatarsScreen.g.m(neuroAvatarsScreen, NeuroAvatarsScreen.B[1])).setCloseBadgeVisibility(neuroAvatarsScreen.s1().E());
                return sbiVar;
            case 2:
                zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                return neuroAvatarsScreen.q1() != null ? y3f.AUTH_AVATARS : y3f.SETTINGS_PROFILE_AVATARS;
            case 3:
                zv8[] zv8VarArr4 = NeuroAvatarsScreen.B;
                return neuroAvatarsScreen.q1() != null ? new lmc(null, 0, null, null, 0L, null, 111) : lmc.h;
            case 4:
                yeb yebVar = (yeb) neuroAvatarsScreen.b.getAccessor().c(812);
                vv vvVar = neuroAvatarsScreen.u;
                zv8 zv8Var = NeuroAvatarsScreen.B[10];
                return yebVar.a((Long) vvVar.a(neuroAvatarsScreen), neuroAvatarsScreen.q1(), new ifh(new jeb(neuroAvatarsScreen, 6)));
            case 5:
                zv8[] zv8VarArr5 = NeuroAvatarsScreen.B;
                return neuroAvatarsScreen.getContext().getDrawable(R.drawable.icon_camera_open_fill);
            default:
                eeb eebVar = (eeb) neuroAvatarsScreen.b.getAccessor().c(813);
                vv vvVar2 = neuroAvatarsScreen.t;
                zv8 zv8Var2 = NeuroAvatarsScreen.B[9];
                return new deb((fgd) vvVar2.a(neuroAvatarsScreen), eebVar.a, eebVar.b);
        }
    }
}
