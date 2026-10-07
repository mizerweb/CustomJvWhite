package defpackage;

import android.view.View;
import one.me.profile.ProfileScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bud implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ dud b;

    public /* synthetic */ bud(dud dudVar, hqd hqdVar) {
        this.a = 8;
        this.b = dudVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        dud dudVar = this.b;
        switch (i) {
            case 0:
                dudVar.f.v1().I();
                break;
            case 1:
                ProfileScreen profileScreen = dudVar.f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    profileScreen.getClass();
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "ProfileInviteFlow", "[section-click] InviteLink section tapped", null);
                    }
                }
                profileScreen.v1().I();
                break;
            case 2:
                dvd dvdVarV1 = dudVar.f.v1();
                Long lJ = dvdVarV1.p1.j();
                if (lJ != null) {
                    a8j.x(dvdVarV1.C, new yrd(lJ.longValue(), p63.ADMIN));
                }
                break;
            case 3:
                dvd dvdVarV2 = dudVar.f.v1();
                dvdVarV2.D.B(dvdVarV2, dvd.u1[0], yab.i0(dvdVarV2.b, ((n0c) dvdVarV2.F()).b(), 0, new zud(dvdVarV2, null, 0), 2));
                break;
            case 4:
                dvd dvdVarV3 = dudVar.f.v1();
                Long lJ2 = dvdVarV3.p1.j();
                if (lJ2 != null) {
                    a8j.x(dvdVarV3.C, new zrd(lJ2.longValue()));
                }
                break;
            case 5:
                dvd dvdVarV4 = dudVar.f.v1();
                Long lJ3 = dvdVarV4.p1.j();
                if (lJ3 != null) {
                    a8j.x(dvdVarV4.C, new yrd(lJ3.longValue(), p63.MEMBER));
                }
                break;
            case 6:
                dvd dvdVarV5 = dudVar.f.v1();
                Long lJ4 = dvdVarV5.p1.j();
                if (lJ4 != null) {
                    a8j.x(dvdVarV5.C, new fsd(lJ4.longValue()));
                }
                break;
            case 7:
                dvd dvdVarV6 = dudVar.f.v1();
                Long lJ5 = dvdVarV6.p1.j();
                if (lJ5 != null) {
                    a8j.x(dvdVarV6.C, new asd(lJ5.longValue()));
                }
                break;
            case 8:
                dudVar.f.getClass();
                break;
            case 9:
                a8j.x(dudVar.f.v1().B, oud.a);
                break;
            default:
                dvd dvdVarV7 = dudVar.f.v1();
                long jLongValue = ((Number) ((g5d) ((gjf) dvdVarV7.o.getValue())).a.E2.a(e5d.S6[186]).i()).longValue();
                Long lJ6 = dvdVarV7.p1.j();
                if (lJ6 != null) {
                    ic6 ic6Var = dvdVarV7.C;
                    trd trdVar = trd.b;
                    bdj bdjVar = bdj.CHAT_PROFILE;
                    trdVar.getClass();
                    a8j.x(ic6Var, trd.q(jLongValue, bdjVar, lJ6, null));
                }
                break;
        }
    }

    public /* synthetic */ bud(dud dudVar, int i) {
        this.a = i;
        this.b = dudVar;
    }
}
