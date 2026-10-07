package defpackage;

import android.content.ActivityNotFoundException;
import android.widget.TextView;
import one.me.login.avatar.RegistrationAvatarScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class rge extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ RegistrationAvatarScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rge(lq4 lq4Var, RegistrationAvatarScreen registrationAvatarScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = registrationAvatarScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        RegistrationAvatarScreen registrationAvatarScreen = this.g;
        switch (i) {
            case 0:
                rge rgeVar = new rge(lq4Var, registrationAvatarScreen, 0);
                rgeVar.f = obj;
                return rgeVar;
            case 1:
                rge rgeVar2 = new rge(lq4Var, registrationAvatarScreen, 1);
                rgeVar2.f = obj;
                return rgeVar2;
            case 2:
                rge rgeVar3 = new rge(lq4Var, registrationAvatarScreen, 2);
                rgeVar3.f = obj;
                return rgeVar3;
            default:
                rge rgeVar4 = new rge(lq4Var, registrationAvatarScreen, 3);
                rgeVar4.f = obj;
                return rgeVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((rge) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((rge) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((rge) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((rge) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2 = null;
        boolean z = false;
        switch (this.e) {
            case 0:
                RegistrationAvatarScreen registrationAvatarScreen = this.g;
                Object obj3 = this.f;
                ch3.d0(obj);
                eef eefVar = ((fef) obj3).a;
                z = eefVar != null;
                boolean z2 = eefVar instanceof cef;
                j8e j8eVar = registrationAvatarScreen.j;
                zv8[] zv8VarArr = RegistrationAvatarScreen.q;
                ((TextView) j8eVar.m(registrationAvatarScreen, zv8VarArr[4])).setText((!z || z2) ? R.string.oneme_registration_neuro_avatars_choose_photo : R.string.oneme_registration_neuro_avatars_change_photo);
                oj ojVar = (oj) registrationAvatarScreen.g.m(registrationAvatarScreen, zv8VarArr[1]);
                ojVar.c = true;
                ojVar.setEnabled(z);
                return sbi.a;
            case 1:
                Object obj4 = this.f;
                ch3.d0(obj);
                hk0 hk0Var = (hk0) obj4;
                if (!cqk.d(hk0Var, ek0.a)) {
                    if (hk0Var instanceof fk0) {
                        try {
                            this.g.startActivityForResult(((fk0) hk0Var).a, 555);
                            tbb.g((tbb) this.g.l.getValue(), y3f.AVATAR_PICKER_CAMERA);
                        } catch (ActivityNotFoundException unused) {
                            String name = RegistrationAvatarScreen.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                            }
                            qdb qdbVar = this.g.o1().c;
                            qdbVar.n = null;
                            h8c h8cVar = (h8c) qdbVar.e.getValue();
                            h8cVar.m(new tnh(R.string.cant_open_camera));
                            h8cVar.h(new w8c(R.drawable.icon_warning));
                            h8cVar.p();
                        }
                    } else {
                        if (!(hk0Var instanceof gk0)) {
                            ore.o();
                            return null;
                        }
                        gk0 gk0Var = (gk0) hk0Var;
                        c1a.b.j(gk0Var.a, gk0Var.b, false);
                    }
                    break;
                } else {
                    RegistrationAvatarScreen registrationAvatarScreen2 = this.g;
                    zv8[] zv8VarArr2 = RegistrationAvatarScreen.q;
                    ((wsc) registrationAvatarScreen2.k.getValue()).n(new svj(this.g, 1));
                }
                return sbi.a;
            case 2:
                RegistrationAvatarScreen registrationAvatarScreen3 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                if (obj5 instanceof yf9) {
                    kzi kziVar = new kzi(((yf9) obj5).c, obj2, z);
                    registrationAvatarScreen3.a.getClass();
                    ku6.C(registrationAvatarScreen3, kziVar);
                } else if (obj5 instanceof zf9) {
                    zf9 zf9Var = (zf9) obj5;
                    int i = zf9Var.e;
                    zv8[] zv8VarArr3 = RegistrationAvatarScreen.q;
                    vv vvVar = registrationAvatarScreen3.m;
                    zv8 zv8Var = RegistrationAvatarScreen.q[5];
                    if (((xge) vvVar.a(registrationAvatarScreen3)) != null) {
                        ((pd0) registrationAvatarScreen3.e.getValue()).a(new nd0(i));
                    }
                    kzi kziVar2 = new kzi(zf9Var.c, zf9Var.d, z);
                    registrationAvatarScreen3.a.getClass();
                    ku6.C(registrationAvatarScreen3, kziVar2);
                }
                zv8[] zv8VarArr4 = RegistrationAvatarScreen.q;
                registrationAvatarScreen3.p1(false);
                return sbi.a;
            default:
                sbi sbiVar = sbi.a;
                Object obj6 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj6;
                if (rbbVar instanceof feb) {
                    lg9 lg9Var = lg9.b;
                    lg9Var.getClass();
                    o65.c(lg9Var.b(), ":chat-list", null, null, 6);
                } else if (rbbVar instanceof i65) {
                    lg9.b.e((i65) rbbVar);
                } else if (rbbVar instanceof rt3) {
                    this.g.getRouter().D();
                }
                return sbiVar;
        }
    }
}
